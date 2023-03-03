package edu.java.swing05;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain05 {
    // field
    // 이미지 파일들의 경로를 저장한 (문자열) 배열.
    private static final String[] IMAGES = {
            "images/flower1.jpg",
            "images/flower2.jpg",
            "images/flower3.jpg",
            "images/flower4.jpg",
            "images/flower5.jpg",
    };
    
    private int index; // 현재 화면에 보여지는 이미지의 인덱스.
    private JFrame frame;
    private JLabel lblImage;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AppMain05 window = new AppMain05();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public AppMain05() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        
        lblImage = new JLabel(new ImageIcon(IMAGES[index]));
        lblImage.setBounds(12, 10, 640, 640);
        frame.getContentPane().add(lblImage);
        
        JButton btnPrev = new JButton("Prev");
        btnPrev.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showPrevImage();
            }
        });
        btnPrev.setFont(new Font("D2Coding", Font.PLAIN, 28));
        btnPrev.setBounds(12, 660, 200, 72);
        frame.getContentPane().add(btnPrev);
        
        JButton btnNext = new JButton("Next");
        btnNext.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showNextImage(); // 내부 클래스에서는 외부 클래스의 메서드도 사용 가능.
            }
        });
        btnNext.setFont(new Font("D2Coding", Font.PLAIN, 28));
        btnNext.setBounds(452, 660, 200, 72);
        frame.getContentPane().add(btnNext);
    }

    private void showPrevImage() {
        // 현재 보여지는 이미지가 첫번째 이미지가 아니면 인덱스 1 감소 -> 새로운 이미지를 보여줌.
        // 현재 보여지는 이미지가 첫번째 이미지이면 마지막 이미지(index = length - 1)를 보여줌.
        if (index > 0) {
            index--;
        } else {
            index = IMAGES.length - 1;
        }
        lblImage.setIcon(new ImageIcon(IMAGES[index]));
    }

    private void showNextImage() {
        // 현재 보여지는 이미지가 마지막 이미지가 아니면 인덱스를 1 증가 -> 새로운 이미지를 보여줌.
        // 현재 보여지는 이미지가 마지막 이미지이면 첫번째 이미지(index = 0)를 보여줌.
        if (index < IMAGES.length - 1) {
            index++;
        } else {
            index = 0;
        }
        lblImage.setIcon(new ImageIcon(IMAGES[index]));
    }

}

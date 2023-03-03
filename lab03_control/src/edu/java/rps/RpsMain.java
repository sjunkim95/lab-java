package edu.java.rps;

import java.util.Random;
import java.util.Scanner;
        
public class RpsMain {

    public static void main(String[] args) {
        // 0 - 가위, 1 - 바위, 2 - 보
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        int x = random.nextInt(3); // 컴퓨터의 난수
        System.out.println("가위(0) 바위(1) 보(2)!! 입력해주세요 >>>");
        int y = sc.nextInt(); // 유저의 플레이
        System.out.println("컴퓨터의 플레이 = " +x);
        System.out.println("유저의 플레이 = " +y);
        
        if (x == 0) {
            if (y == 0) {
                System.out.println("비겼습니다!!");
            } else if (y == 1) {
                System.out.println("유저의 승리!!");
            } else if (y == 2) {
                System.out.println("유저의 패배!!");
            }
            
        } else if (x == 1) {
            if (y == 0) {
                System.out.println("유저의 패배!!");
            } else if (y == 1) {
                System.out.println("비겼습니다!!");
            } else if (y == 2) {
                System.out.println("유저의 승리!!");
            }
        } else if (x == 2) {
            if (y == 0) {
                System.out.println("유저의 승리!!");
            } else if (y == 1) {
                System.out.println("유저의 패배!!");
            } else if (y == 2) {
                System.out.println("비겼습니다!!");
            }
        
        }
        
        // 강사님이랑 1
        if (y == x) {
            // 비기는 경우
            System.out.println("Tie");
            
        } else if ((y == 0 && x == 2) || (y == 1 && x == 0) || (y == 2 && x == 1)) {
            System.out.println("User Win!!");
        } else {
          System.out.println("Computer Win!");  
        }
        
        //강사님이랑 2
        int diff = y - x; //알아보기 힘듬, 간단하다고 좋은건 아니다
        if (diff == 0) {
            System.out.println("Tie");
        } else if (diff == 1 || diff == -2) {
            System.out.println("User Win");
        } else {
            System.out.println("Computer Win");
        }

    }
}
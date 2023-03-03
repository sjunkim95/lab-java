package edu.java.homework0824;

import java.util.Scanner;

public class HW0824 {

    public static void main(String[] args) {
        // 201pg 6번문제
        
        boolean run = true; // 프로그램을 계속 실행할 지, 종료할 지를 결정하기 위한 변수.
        int studentNum = 0; // 입력받은 학생수를 저장할 변수.
        int[] scores = null; // 학생들의 점수들을 저장할 배열.
        // null: 배열이 만들어지지 않음.
        Scanner scanner = new Scanner(System.in);
        
        while(run) {
            // 프로그램 메뉴(기능) 보여줌.
            System.out.println("-------------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력|3.점수리스트|4.분석|5.종료");
            System.out.println("-------------------------------------------------");
            System.out.print("선택>  ");
            
            // 콘솔창에서 문자열을 입력받아서 int로 변환.
            int selectNo = Integer.parseInt(scanner.nextLine());
            
            if (selectNo == 1) {
                System.out.print("학생수>  ");
                //학생 수 입력받기!
                studentNum = Integer.parseInt(scanner.nextLine());
                //입력 받은 학생수 크기의 배열을 생성
                scores = new int[studentNum];

                System.out.println("scores length = " +scores.length);
                
            } else if (selectNo == 2) {
                if(scores==null) {
                    System.out.println("학생수를 먼저 입력하세요...");
                    continue; // while 반복문을 처음부터 다시 시작.
                }
                
                for (int i = 0; i < scores.length; i++) { 
                    System.out.printf("scores[%d]> ", i);
                    scores[i] = Integer.parseInt(scanner.nextLine());
                }
                        
                        
            } else if (selectNo == 3) { // 점수리스트
                if(scores==null) {
                    System.out.println("학생수를 먼저 입력하세요...");
                    continue; // while 반복문을 처음부터 다시 시작.
                }
                
                // 배열 scores에 저장된 모든 점수 출력.
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores["+ i+"]> " +scores[i]);
                }
                
            } else if (selectNo == 4) {
                // 최댓값, 평균 찾기.
                /* 삼항연산자로
                 * int max = scores[0];
                 * for(int x: scores){
                 *      max = (x > max) ? x : max;
                 * }
                 */
                
                if(scores==null) {
                    System.out.println("학생수를 먼저 입력하세요...");
                    continue; // while 반복문을 처음부터 다시 시작.
                }
                
                int sum = 0;
                int count = 0;
                int max = scores[0];
                
                for (int x:scores) {
                        sum += x;
                        count++;
                    }
                for (int i = 0; i < scores.length; i++) {
                    if(max < scores[i]) {
                        max = scores[i];
                    }
                }
                System.out.println("최고 점수: " +max);
                System.out.println("평균 점수: "+ (double)sum/count);
            } else if (selectNo == 5) {
                run = false;
            } else {
                System.out.println("메뉴를 다시 선택해주세요, 1번~5번 사이의 숫자!!");
            }
        }
        
        System.out.println("프로그램 종료");

    }
}

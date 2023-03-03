package edu.java.loop13;

import java.util.Scanner;

public class LoopMain13 {

    public static void main(String[] args) {
        // EX 4-7
        boolean run = true; // 프로그램을 계속 실행할 지, 종료할 지를 결정할 변수.
        int balance = 0; // 은행 계좌의 잔고를 저장할 변수.
        Scanner scanner = new Scanner(System.in); // 콘솔창에서 키보드로 입력받기 위한 도구.
        
        while(run) {
            System.out.println("---------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택> ");
            
            int menu = scanner.nextInt(); // 1 ~ 4 정수 입력
            
            switch(menu) {
            case 1:
                System.out.print("예금액> ");
                int deposit = scanner.nextInt();
                balance += deposit; // 잔고에 예금액만큼 추가.
                break; //여기 case들 밑에 있는 break는 switch 반복문을 끝내고 가장 가까운 while 반복문으로 간다
                // 만약에 switch 문을 사용 안하고 if-else를 사용했다면, 거기서 break를 사용하면 while문이 종료되는것.
            case 2:
                System.out.print("출금액> ");
                int withdraw = scanner.nextInt();
                balance -= withdraw;
                break;
            case 3:
                System.out.println("잔고> " +balance);
                break;
            case 4:
                run = false;
                break;
            default:
                System.out.println("잘못 입력했습니다, 메뉴를 다시 선택해주세요!");
            }
            
        }
        
        System.out.println("프로그램 종료");
 
    }

}

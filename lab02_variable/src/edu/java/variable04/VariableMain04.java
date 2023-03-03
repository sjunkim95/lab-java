package edu.java.variable04;

import java.util.Scanner;

public class VariableMain04 {

    public static void main(String[] args) {
        // 콘솔 창에서 키보드로 숫자를 입력받아서 변수에 저장.
        // 1. Scanner 타입의 변수를 선언하고 초기화. -> Scanner 타입후 ctrl+space 그러면 3번줄에 import 생김
        Scanner scanner = new Scanner(System.in);

        System.out.println("정수를 입력>>>");

        // 2. Scanner 객체를 사용해서 콘솔 창에서 정수를 입력받고 저장.
        int number = scanner.nextInt(); // 입력받을려고 대기하고 있는것
        System.out.println("number = " + number);

        // 시험점수에 대한 총점과 평균을 계산하는 프로그램.

        // 1.Java시험 점수(정수) 입력
        System.out.println("Java 점수를 입력>>>");
        int javaScore = scanner.nextInt(); // 입력받을려고 대기하고 있는것
        System.out.println("Java Score = " + javaScore);

        // 2.SQL시험 점수(정수) 입력
        System.out.println("SQL 점수를 입력>>>");
        int sqlScore = scanner.nextInt(); // 입력받을려고 대기하고 있는것
        System.out.println("SQL Score = " + sqlScore);

        // 3.JSP시험 점수(정수) 입력
        System.out.println("JSP 점수를 입력>>>");
        int jspScore = scanner.nextInt(); // 입력받을려고 대기하고 있는것
        System.out.println("JSP Score = " + jspScore);

        // 4. 세 과목 총점 계산 출력
        int total = javaScore + sqlScore + jspScore; // javaScore를 선택하고 (alt + <-화살표) 누르면 거기로 가진다.
        System.out.println(total);

        // 5. 세 과목 평균을 계산하고 출력 (평균은 실수로)
            double average = (total / (double) 3); // 아니면 앞에 double 안붙이고 3.0을 붙인다
        // double을 어디다 붙이든 상관이 없나??
        System.out.println("평균은" + average);

        int avg = total / 3;
        System.out.println(avg); // 요러면 평균이 소숫점 제거하고 나온다.
        
        //ctrl + shift + F : 소스 코드 포맷팅(자동정렬)
    }

}

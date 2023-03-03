package edu.java.array09;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        // 시스템의 입력장치(콘솔창)를 이용하는 Scanner 객체를 만듦.
        Scanner sc = new Scanner(System.in);
        
        System.out.print("정수 입력> ");
        int n = sc.nextInt(); // 시스템 입력장치(콘솔창)에서 정수를 읽음.
        // nextInt(): 토큰(공백, 탭, 줄바꿈으로 구분되는 문자열) 단위로 읽어서 정수로 변환.
        System.out.println("n = "+n);

        System.out.print("다시 한번 정수입력> ");
        n = sc.nextInt();
        // 대신 밑에 sc.nextLine하나 더 넣어서 밑에 발생하는 문제를 없애야함
        sc.nextLine(); // 버퍼를 지워주기 위해서 넣는다
        System.out.println("n = "+n);
        
        System.out.println("문자열 입력> ");
        String s = sc.next();
        // next(): 토큰(공백, 탭, 줄바꿈으로 구분되는 문자열) 단위로 읽어서 문자열을 반환.
        // 즉, 여기에 입력값을 'Hello Java'로 한다면, Hello 토큰단위 하나 반환이된것, 나머지 Java는 밑에로 가서 프린트된다.
        
        sc.nextLine();
        System.out.println("s = "+s);
        
        // 위에 "123 456" 이라고 정수 입력을 했으면, 밑에서 자연적으로 456을 출력함
        // 반대로 123뒤에 enter를 입력하면 밑에까지 안가고 프로그램이 끝남, 
        // why? 밑에 nextLine()이 enter를 읽어드림.
        System.out.print("문자열 입력> ");
        s = sc.nextLine(); 
        // nextLine(): 줄바꿈까지 읽음. 입력 버퍼를 비움.
        System.out.println("s = " +s);
        
        System.out.println("================");
        
        // 입력버퍼에서는 줄바꿈까지 문자열로 읽고, 
        // 읽어들인 문자열을 원하는 타입(int, double, ...)으로 변환.
        System.out.println("정수 입력> ");
        s = sc.nextLine(); // 줄바꿈까지 문자열 읽음.
        n = Integer.parseInt(s); // 문자열을 정수(int)로 변환.
        System.out.println("n = " +n);
        
    }

}

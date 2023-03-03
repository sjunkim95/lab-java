package edu.java.condition03;

import java.util.Scanner;

public class ConditionMain03 {

    public static void main(String[] args) {
        //90 A 80 B 70 C 60 D 미만이면 F
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력해주세요 >>>");

        int score = scanner.nextInt(); // 입력받을려고 대기하고 있는것
        System.out.println("점수는 = " + score);
        if (score >= 90) {      
            System.out.println("성적은 A");
        } else if (score >= 80) {
            System.out.println("성적은 B");                                    
        } else if (score >= 70) {
            System.out.println("성적은 C");
        } else if (score >= 60) {
            System.out.println("성적은 D");
        } else {
            System.out.println("성적은 F");
        }


    }

}

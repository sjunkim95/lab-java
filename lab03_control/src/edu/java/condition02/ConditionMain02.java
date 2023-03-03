package edu.java.condition02;

public class ConditionMain02 {

    public static void main(String[] args) {
        
        double x = 3.14;        
        if (x > 0) {
            System.out.println("양수");
        } else if (x == 0) {
            System.out.println("빵");
        } else {
            System.out.println("음수");
        }
        
        if (x > 0) {
            //TODO, FIXME -> 자바에서 쓰는 나중에 할 일
            System.out.println("Positive");
        } else {
            //중첩 조건문!!!
            if (x < 0) {
                System.out.println("Neagtive");
            } else {
                System.out.println("Zero");
            }
        }

    }

}

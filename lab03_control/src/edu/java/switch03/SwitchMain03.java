package edu.java.switch03;

public class SwitchMain03 {

    public static void main(String[] args) {
        // enum을 사용한 switch-case
        Season s = Season.FALL;
        System.out.println(s.ordinal()); //인덱스 가져오듯이 그 위치를 가져오는거.
        
        switch (s) {
        case SPRING:
            System.out.println("봄");
            break;
        case SUMMER:
            System.out.println("여름");
            break;
        case FALL:
            System.out.println("가을");
            break;
        case WINTER:
            System.out.println("겨울");
            break;
        }
        
    }

}

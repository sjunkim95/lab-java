package edu.java.class03;

public class ClassMain03 {
    

    public static void main(String[] args) {

        // Rectangle 타입 변수 선언, Rectangle 객체 생성 저장.
        
        // 1) 기본 생성자 이용
        Rectangle rect1 = new Rectangle();
        
        System.out.println("rect1의 저장소는 : " +rect1);
        System.out.println("가로는 : " +rect1.width + ", 세로는 : " +rect1.height);
        
        // Rectangle 객체의 메서드 테스트.        
        System.out.println("둘레의 길이는 : " +rect1.perimeter());
        System.out.println("넓이는 : " +rect1.area());
        
        
        System.out.println("==============");
        
        // 2) argument 2개를 갖는 생성자를 이용
        Rectangle rect2 = new Rectangle(3, 4);
        System.out.println("rect2의 저장소는 : " +rect2);
        System.out.println("가로는 : " +rect2.width + ", 세로는 : " +rect2.height);
        System.out.println("둘레의 길이는 : " +rect2.perimeter());
        System.out.println("넓이는 : " +rect2.area());
    }

}

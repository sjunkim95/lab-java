package edu.java.class04;

public class ClassMain04 {

    public static void main(String[] args) {

        Circle circle1 = new Circle();       
        System.out.println("circle1의 저장소는 : " +circle1);
        System.out.println("반지름은 : " +circle1.r);  
        System.out.println("둘레의 길이는 : " +circle1.perimeter());
        System.out.println("넓이는 : " +circle1.area());
        
        System.out.println("--------------");
        
        Circle circle2 = new Circle(5);
        System.out.println("circle2의 저장소는 : " +circle2);
        System.out.println("반지름은 : " +circle2.r); 
        System.out.println("둘레의 길이는 : " +circle2.perimeter());
        System.out.println("넓이는 : " +circle2.area());
        
        
        System.out.println("--------------");
        
        //생성자를 호출할 때마다 메모리의 다른 주소에 다른 객체가 만들어짐. (즉, 메모리를 새로 확보한다)
        Circle c3 = new Circle(5);
        System.out.println("c3 = " +c3);
        // 똑같이 반지름이 5인 원이어도 메모리가 만들어진 위치는 다른거다.
        // ex) 쌍둥이가 두명이 있을 수 있는것 처럼.
        
            
    }

}

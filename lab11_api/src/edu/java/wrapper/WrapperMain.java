package edu.java.wrapper;

// Wrapper 클래스: 자바의 기본 데이터 타입의 값을 하나만 저장하는(감싸는) 클래스.
// 자바의 기본 타입: boolean, byte, short, int, long, char, float, double
// wrapper 클래스: Boolean, Byte, Short, Integer, Long, Character, Float, Double
// wrapper 클래스를 사용하는 목적:
//  1. 기본 타이 데이터들을 이용하는 메서드를 제공. 
//  2. 상속/다형성을 사용하기 위해서.
//  3. generic 클래스에서 사용하기 위해서.

public class WrapperMain {

    public static void main(String[] args) {
        // Integer 타입의 객체 생성
        Integer number1 = Integer.valueOf(100); // int --> Integer(wrapper 클래스) 객체로 바꿔준다.
        System.out.println(number1); // number1이 객체지만, 주소값이 아닌 100을 출력.
        
        Integer number2 = Integer.valueOf("100"); // String --> Integer
        System.out.println(number2);
        
        int x = Integer.parseInt("123"); // String --> int(기본 타입)
        System.out.println(x); 
        // wrapper 클래스처럼, 참조 타입으로 저장하면 ".+ ctrl space로 메서드 사용 가능하다
        // 하지만, 변수로 저장하면 불 가능.
        
        // auto-boxing, auto-unboxing
        Integer number3 = 1; // auto-boxing: int 타입의 값을 Integer 타입의 객체로 자동 변환.
        System.out.println(number3.toString());
        
        int add = number1 + number2; // auto-unboxing: Integer 타입 객체를 int 타입으로 자동 변환.
        System.out.println(add);
        
        // git헙 따라하ㅈ
        
        //Double 
    }

}

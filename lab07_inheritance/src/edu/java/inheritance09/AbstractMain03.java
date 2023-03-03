package edu.java.inheritance09;

public class AbstractMain03 {

    public static void main(String[] args) {
        // Rectangle, Circle 클래스를 구현
        // Rectangle, Circle 타입의 객체에서 draw() 메서드 동작 여부 테스트.
        
        Shape circle1 = new Circle("Circle", 4);
        circle1.draw();
        
        Shape rect1 = new Rectangle("Rectangle", 5, 4);
        rect1.draw();
        
        // Shape타입을 엘리먼트로 갖는배열
//       Shape[] shapes = {
 //               new Rectangle(4, 3),
  //              new Circle(10),
        // mew square(3)
   //     };
        
   //     for (Shape s: shapes) {
   //         s.draw();
    //    }
    }

}

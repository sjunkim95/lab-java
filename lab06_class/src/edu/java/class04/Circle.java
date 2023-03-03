package edu.java.class04;

public class Circle {
    
    // field - 반지름
    double r;
    
    // constructor - 기본 생성자, argument를 갖는 생성자
    public Circle() {
        // 기본 생성자
    }
    
    public Circle(double r) {
        this.r = r;
        
    }
    
    
    
    // method - 둘레 길이 ( 2* 3.14 * r), 넓이 ( 3.14 * r * r)
    public double perimeter() {
        return 2 *3.14 * r;
    }
    
    public double area() {
        return this.r * this.r * 3.14;
    }
    

}

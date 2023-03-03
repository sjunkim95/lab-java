package edu.java.inheritance09;

public class Circle extends Shape {
    
    private double radius;

    protected Circle(String type, double radius) {
        super(type);
        this.radius = radius;
    }
    
    @Override
    public double area() {
        // TODO Auto-generated method stub
        return this.radius * this.radius * 3.14;
    }

    @Override
    public double perimeter() {
        // TODO Auto-generated method stub
        return 2 *3.14 * this.radius;
    }
    
    

}

package edu.java.inheritance09;

    public class Square extends Rectangle{
        
        public Square(String type, double side) {
            super("Square", side, side); //rectangle로 생성할때는 argument 3개 가져가야함.
            
        }
}

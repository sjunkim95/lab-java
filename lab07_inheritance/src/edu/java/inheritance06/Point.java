package edu.java.inheritance06;

public class Point {
    private int x;
    private int y;
    
    public Point() {}

    public Point(int x, int y) {
        
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    // Object 클래스의 toString()은 "패키지이름.클래스이름@참조값" 형식의 문자열을 리턴.
    @Override // Object 클래스의 toString()을 재정의
    public String toString() {
        String point = String.format("Point(x=%d, y=%d)", this.x, this.y);
        return point;
    }
    
    // Object 클래스의 equals()는 두 객체의 해쉬코드 값이 같으면 true, 그렇지 않으면 false.
    @Override // Object 클래스의 equals() 메서드를 재정의.
    public boolean equals(Object obj) {
        boolean result = false;
        
        if (obj instanceof Point) {
            Point pt = ((Point) obj); //부모타입의 변수를 자식 타입의 변수로 변환시키는것?
            result = (this.x == pt.x) && (this.y == pt.y);
        }
        
        return result;
    }
    
    // equals 만들때, 여기서만 끝나는게 아니라 밑에를 추가 해줘야.. hashCode() 또한 override해주는게 좋아.
    
    // Object 클래스의 hashCode()는 객체의 주소(참조)값을 리턴.
    @Override // Object이 hashCode()를 재정의
    public int hashCode() {
        // equals()가 true를 리턴하는 두 객체의 hashCode값은 같아야 함!
        return Integer.valueOf(x).hashCode() * 10 + Integer.valueOf(y).hashCode();
    }
  
    

}

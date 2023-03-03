package edu.java.modifier07;

public class FinalTest {
    
    public static final int VERSION_CONST = 1; // -> 이런 변수는 대문자로 변수 이름 지정.
    
    // (1) final 멤버 변수는 선언과 동시에 초기화까지 해야 함.
    
    // private final int number = 200;
    
    private final int number;
    
  //  public FinalTest() {} // 기본 생성자 -> final 일때는 기본 생성자 X
    
    // (2) final 멤버 변수를 선언과 동시에 초기화하지 않을 때에는,
    // 반드시 argument를 갖는 생성자를 정의해서 final 멤버 변수를 초기화해야 함.
    public FinalTest(int number) {
        this.number = number;
    }
    
    public int getNumber() {
        return this.number;
    }  
    
}

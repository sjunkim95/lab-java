package edu.java.exception06;

public class Calculator {
    
    // 예외를 던질(throws) 수 있는 메서드 선언.
    public int divide(int x, int y) throws Exception {//IllegalArgumentException
        if( y!= 0) {
            return x / y; // 메서드를 호출한 곳으로 값을 반환.
        }
        
        // 메서드를 호출한 곳으로 예외를 던짐.
        throw new Exception("y는 0이 될 수 없음.");
        // -> 메서드 선언부에 반드시 throws 선언이 있어야 함.
        // throw new를 사용하고 싶으면 반드시 위에서 선언을 해야한다.
    }

}

package edu.java.exception06;

// Java의 예외(Exception) 클래스:
// 1) 반드시 예외 처리를 해야 하는 예외 클래스
//      -> try-catch 문장 또는 throws 선언을 반드시 사용해야 하는 예외.
//      -> try-catch 문장 또는 throws 선언을 하지 않으면 컴파일 에러가 발생함.
//      (예) Exception
// 2) 예외 처리를 하지 않아도 괜찮은 클래스(unchecked exception)
//      -> try-catch 문장 또는 throws 선언이 없어도 컴파일 에러가 발생하지 않음.
//      (예) IllegalArgumentException

public class ExceptionMain06 {

    public static void main(String[] args) { // 메서드 선언부분. 
        Calculator calc = new Calculator();
        
        try {
            int result = calc.divide(1000, 10);
            // -> 반드시 예외 처리를 해야 하는 exception을 throws한다고 선언된 메서드를 호출할 때는,
            // try-catch 구문을 사용하거나 throws 선언문을 메서드 선언에 추가해야 함.
            // 이걸 해보려면, calculator에서 IllegalArgumentException대신 Exception 사용해야.
            System.out.println(result);
            } catch (Exception e) {
            e.printStackTrace();
            // 예외가 발생한 이유와 예외가 발생되기 까지의 코드 호출 순서를 출력해줌.
            }
        
        System.out.println("정상 종료");
        
    }

}

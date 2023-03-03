package edu.java.method04;

public class MethodMain04 {

    public static void main(String[] args) {
        // 메서드 오버로딩(method overloading)
        System.out.println();
        // println이 할 수 있는 역할은 여러가지다, int float등 여러가지 출력가능
        // ctrl + space 누르면 나온다, overloading이 있기에 여러가지 역할이 하나로 통합가능.
        // 즉, println은 받는값 출력이랑 줄바꿈까지.
        
        
        
        // 매서드 오버로딩(method overloading)
        // 매서드의 파라미터 타입, 개수가 다르면 같은 이름으로 메서드를 여러개 정의할 수 있음.
        // (주의) 파라미터는 동일하고 리턴 타입만 다르게 오버로딩할 수는 없음!
        
        // 밑에 만든 메서드가 내가 만든 overloading의 예시.
        newLine();
        newLine(3);
    }
    
    public static void newLine() {
        System.out.println("*");
    }
    
    public static void newLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("#");
        }
    }

}

package edu.java.inheritance05;

// final: 변경할 수 없는.
// final 지역 변수: 값이 한 번 초기화되면 그 값을 변경할 수 없는 지역 변수.
// final 필드 (멤버 변수): 반드시 한 번 값을 초기화해야 하고, 초기화된 이후에는 값을 변경할 수 없는 필드.
// (1) final 멤버 변수를 선언과 동시에 초기화하거나,
// (2) final 멤버 변수를 초기화할 수 있는 생성자가 반드시 있어야 함.
// final 메서드: 재정의할 수 없는 메서드. override할 수 없는 메서드.
// final 클래스: 확장할 수 없는 클래스. 상속할 수 없는 클래스.
// (예) java.lang.System, java.lang.String, ...

//class T extends System{} -> 안되는 코드, final 클래스 System을 상속하는 클래스를 정의할 수 없다!
//class T extends String{} -> String은 final 이라 T가 subclass 못 된다


class A {  // 메서드를 변경한다는것은, 메서드의 body를 바꾸는것, 어디서 상속받은 클래스에서 부모 클래스 재정의.
    public final void test1() {
        System.out.println("A1");
    }
    public void test2() {
        System.out.println("A2");
    }
}

class B extends A{
    // ctrl + space 누르면 test2() -> override라고 뜬다. test1()은 안 떠.
//    public final void test1() {} -> 안되는 코드임
    // 부모(상위) 클래스의 final 메서드는 자식(하위) 클래스에서 재정의(override)할 수 없다!
    
    @Override
    public void test2() {
        super.test2(); // (필요한 경우) 상위 클래스의 override 전 메서드 기능을 사용.
        // 하위 클래스에서 필요한 기능 작성.
    }
}


public class InheritanceMain05 {
    
    private static final int MAX = 3; // 선언과 동시에 초기화하는 final 필드.
    
    private final int x; // 선언과 동시에 초기화하지 않은 final 필드.
    private int y;// final이 아닌 필드는 명시적인 초기화가 필수는 아님.
    
    public InheritanceMain05(int x) {
        this.x = x; // 반드시 생성자에서 초기화하는 코드가 있어야 함!
    }
    
    
    public static void main(String[] args) {
        final int n = 10; // final 지역 변수.
//        n = 100; // final 지역 변수에는 새로운 값을 할당할 수 없음.

    }

}

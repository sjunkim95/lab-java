package edu.java.modifier01;

// 클래스 맴버(필드, 생성자, 메서드)의 접근제한 수식어(access modifier)
// 1. private: 선언된 클래스 내부에서만 직접 접근(사용) 가능.
// 2. (package): 수식어가 없는 경우. 같은 패키지에 있는 클래스에서 직접 접근(사용) 가능.
// 3. protected: 같은 패키지에 있거나 또는 상속을 받는 하위 클래스에서 직접 접근(사용) 가능.
// 4. public: 어디서든 직접 접근(사용) 가능.
// 가시성(visibility) 범위: private < (package) < protected < public

public class ModifierMain01 {

    public static void main(String[] args) {
        // AccessTest 타입 변수 선언, AccessTest 객체 생성.
        AccessTest test = new AccessTest(1, 2, 3, 4);
        //test.(ctrl+space)후에 a는 안보인다. AccessTest가 가지고 있지만, a는 private이기 때문에.      
        test.printMembers(); // 이걸 통해서는 a도 프린트가 가능하다.
        // a가 직접 사용은 안되지만, 이런식으로는 사용가능하다.
        // test.a = 10; 이런식으로는 안된다, the field AccessTest a is not visible.
        // private은 다른 클래스에서 보이지 않음. 직접 접근이 안된다.
        
        System.out.println("-------");
        
        test.b = 20; // package 멤버는 같은 패키지의 클래스에서 보임. 직접 접근 가능.
        test.printMembers(); // 이러면 b값이 바뀌었을것.
    }

}

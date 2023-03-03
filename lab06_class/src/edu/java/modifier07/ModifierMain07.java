package edu.java.modifier07;

// 객체(object): 프로그램에서 만들 대상. (비유) 붕어빵
// 클래스(class): 객체를 생성하기 위한 설계도. 데이터 타입. (비유) 붕어빵 틀
// 인스턴스(instance): 메모리에 생성된 객체. (비유) 만들어진 붕어빵

// 클래스 멤버 중 (instance, static)

// 인스턴스 멤버(변수/필드, 메서드)
// - static 수식어가 사용되지 않은 멤버.
// - 객체를 생성한 후에, 참조 변수를 이용해서 사용.
// - Java Runtime이 사용하는 메모리 공간 중 Heap(힙) 영역에 생성됨.

// static 멤버(변수/필드, 메서드)
// - static 수식어가 사용된 멤버.
// - 객체를 생성하지 않아도 사용할 수 있는 멤버.
// - 클래스 이름을 이용해서 사용. (예) Math.PI, Math.sqrt()
// - Java Runtime이 사용하는 메모리 공간 중 Method(메서드) 영역에 생성됨.
// - 프로그램 로딩 시점(main 메서드 시작 전)에 메모리에 생겨남.
// - static 맴버들은 static 맴버들만 접근(사용) 가능.
// - class 이름 앞에 static 못 붙인다.

// final 수식어: 클래스, 맴버(필드/변수, 생성자, 메서드), 지역 변수에 사용됨.
// final 지역 변수: 값이 한 번 저장되면 변경할 수 없는 변수.
// final 멤버 변수: 객체가 생성될 때 값이 초기화되면 변경할 수 없는 멤버 변수.

public class ModifierMain07 {

    
    public static void main(String[] args) {
        // static 멤버(변수, 메서드)는 클래스 이름으로 참조해서 사용.
        System.out.println(StaticTest.staticVariable);
        StaticTest.staticVariable = 100;
        StaticTest.printVariables2();
        
        System.out.println("--- 줄바꿈 ---");
        
        // 인스턴스 멤버(변수, 메서드)는, 객체 생성 후, 참조 변수를 이용해서 사용.
        StaticTest test1 = new StaticTest(); 
        // new 이후가 객체 생성.
        // test 가 참조 변수
        System.out.println(test1.instanceVariable);
        System.out.println(test1.staticVariable); // 기본값이 아닌, StaticTest가 갖고 있는 staticVariable.
        // static 변수를 참조 변수를 이용해서 사용할 수는 있지만,권장하지 않는 방법이다.
        // 노란줄은 보통 경고, 우리가 static처럼 사용하고 있지 않다. 즉, class이름으로 사용해라.
        
        // refactor + rename -> 변수 선언한 곳에서부터, 변수 모두 이름 바꿔준다.
        
        //static 변수는 클래스 이름으로 참조하는 것을 권장.
        
        test1.instanceVariable = 10;
        test1.printVariables();
        
        StaticTest test2 = new StaticTest();
        test2.printVariables();
        
        // static은 지역변수 이름 앞에 붙일 수 없다.
        // method은 그 블록이 끝나면 없어진다, 그 변수가 자동으로 없어짐 -> Stack 영역에서
        // 근데, static은 프로그램 시작부터 끝까지 계속 있는다, Method영역에서
        System.out.println("--- 줄 ---");
        
        
        final int number = 100;
//      number = 200; //final 지역 변수의 값은 변경할 수 없음.
        
        FinalTest ftest = new FinalTest(300);
        System.out.println(ftest.getNumber());
        
    }

}

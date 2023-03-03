package edu.java.interface01;

// import static 문장: static 필드 또는 메서드 이름을 import 할 때 사용
import static edu.java.interface01.DatabaseModule.DB_VERSION;

// 인터페이스(interface):
// 사용 목적: 팀/회사 간의 분업/협업을 하기 위해서 메서드(기능)들의 프로토타입(prototype, signature)를 약속하기 위한 규약.
// 인터페이스가 가질 수 있는 멤버들:
// 1) public static final 필드(멤버 변수). "public final static"은 보통 생략함.
// 2) public abstract 메서드. "public abstract"는 보통 생략함.
// 인터페이스를 선언할 떄는 interface 키워드를 사용
// 인터페이스는 객체를 생성할 수 없고, 인터페이스를 "구현"하는 클래스를 정의해서 객체를 생성함.
// - 구현 클래스: class 클래스이름 implements 인터페이스이름 {...}
// 클래스는 단일 상속만 가능하지만, 인터페이스 구현은 개수 제한이 없음.


public class InterfaceMain01 {

    public static void main(String[] args) {
        // 인터페이스의 필드는 public static final.
        System.out.println(DatabaseModule.DB_VERSION);
        // DatabasModule.DB_VERSION = 2;
        
        
        // OracleDatabaseModule 타입의 객체를 생성
        // OracleDatabaseModule oracle = new OracleDatabaseModule();
        // oracle.create(100, "가나다라");
        // oracle.read();
        
        // MariaDbModule 타입의 객체 생성
        // MariaDbModule db = new MariaDbModule(); 
        // db.create(100, "가나다라");
        // db.read();
       
        // 다형성: SuperType variable = new SubType(); -> 일반적인 개념이 Super, 특수한이 Sub.
        //DatabaseModule db = new MariaDbModule();
        DatabaseModule db = new OracleDatabaseModule();

        db.create(100, "가나다라");
        db.read();
    }

}

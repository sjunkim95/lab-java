package edu.java.inheritance01;

// 상속(inheritance)
// super class (상위 클래스), parent class (부모 클래스), base class (기본 클래스)
// sub class (하위 클래스), child class (자식 클래스), derived class (유도 클래스)
// class SubClass extends SuperClass { ... }

public class InheritanceMain01 {

    
    public static void main(String[] args) {
        // BasicTv 타입의 객체 생성
        BasicTv tv1 = new BasicTv(); // 공장에서 tv를 만들었다
        tv1.powerOnOff(); // TV 켬.
        tv1.powerOnOff(); // TV 끔.
        
        System.out.println("------");
        
        // SmartTv 타입의 객체 생성.
        SmartTv tv2 = new SmartTv(); 
        // 여기서 tv2.만해도, BasicTv의 메서드들을 사용할 수 있다.
        // 유지/보수가 쉬움.
        tv2.powerOnOff();
        tv2.setIp("127.0.0.1");
        System.out.println(tv2.getIp());
        tv2.powerOnOff();
        
    }

}

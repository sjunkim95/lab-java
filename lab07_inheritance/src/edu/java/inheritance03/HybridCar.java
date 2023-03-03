package edu.java.inheritance03;

public class HybridCar extends Car {
    
    // field
    private int battery;
    
    public HybridCar(double fuel, double speed, int battery) {
        super(fuel, speed);
        this.battery = battery;
        
    }
    
    // 메서드/생성자 overload:
    // 파라미터가 다르면 같은 이름으로 여러개의 메서드/생성자를 만드는 것.
    
    // 메서드 override
    // 상위 클래스의 메서드를 하위 클래스에서 재정의하는 것. (so, 상속이 전제되어있음)
    // 리턴 타입, 메서드 이름, 파라미터 선언이 모두 같아야 함.
    // 접근제한 수식어는 상위 클래스에서의 수식어보다 범위가 같거나 넓어질 수 있음.
    
    // @는 애너테이션(annotation)
    // 부모에 있는 메서드를 오버라이드 하고 있다고 선언해주는 역할(없어도 괜찮다)
    // @는 없어도 괜찮다, 자바가 컴파일 해줌.
    @Override
    public void drive() {
        System.out.println("speed: " +getSpeed()+ " fuel: "+getFuel()+ " battery: "+this.battery);
    }
    
}

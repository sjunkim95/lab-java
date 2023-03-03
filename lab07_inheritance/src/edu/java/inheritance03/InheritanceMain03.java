package edu.java.inheritance03;

public class InheritanceMain03 {

    public static void main(String[] args) {
        // Car 타입의 객체 생성
        Car sonata = new Car(100, 60);
        sonata.drive();
        
        // HybridCar 타입의 객체 생성
        HybridCar x3 = new HybridCar(50, 60, 100);
        x3.drive(); // 하위 클래스에서 override된 메서드를 호출
        
        // 다형성(polymorphism): 하나의 객체를 두 개 이상의 타입으로 부를 수 있는 것.
        
        // ex. 형태를 계속해서 바꿔가는 것. 과거 브라운관 티비가 스마트 티비가 된 듯이.
        // ex. Prius가 자동차, hybrid 자동차, 이렇게 두 가지 타입으로 부를 수 있듯이.
        
        Car k8 = new HybridCar(10, 10, 10); 
        // 이런 식으로 다형성, 하이브리드 자동차는 자동차다!!
        // HybridCar x = new Car(100, 100); <- 컴파일 에러!! // 자동차는 하이브리드 자동차다! 이건 안된다.
        
        k8.drive(); 
        
        // k8.drive메서드는 car에 있는것만 보인다, 하지만 hybrid 자동차로 실행된다.
        // 다형성을 적용하더라도 override되어 있는 drive() 메서드가 실행됨!
        
        // 다형성은 코드의 재사용성(reuse)을 높여줌
        // - 배열/리스트를 사용, 메서드 파리미터 선언.
        // 배열을 선언할 때 상위(super) 타입의 배열로 선언하면, 
        // 상위 타입은 물론, 그 하위 타입의 객체까지도 저장할 수 있음.
        Car[] cars = {sonata, x3};
        // "하이브리드 자동차는 -> 자동차다!" 때문에, 하이브리드 자동차가 자동차 배열에 입력 가능하다.
        
        // 또, println이 가장 가용성 있음, 다 프린트하잖아!!
        // println 의 파라미터 -> object("태초에 가장 먼저 태어난 클래스")
        // 즉 hybrid -> car -> object 인것.
        // so, object라서 어떤 타입이든지 다 넣을 수 있다.
        
    }

    public static void test(Car car) {
        // 테스트 코드 작성
    }
    
    public static void test(HybridCar hcar) { 
        // 이럴 필요가 없음, 바로 위에서 Car에서 그냥 테스트하면 되니까!    
    }
    
}

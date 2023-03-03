package edu.java.inheritance07;

//추상 메서드 (abstract method)
// 메서드의 signature (수식어, 리턴 타입, 파라미터 선언)만 선언되어 있고, 본체({...})가 정의되지 않은 메서드.
// 추상 메서드는 반드시 abstract 수식어를 사용해야 함.
// 추상 메서드의 선언은 반드시 세미콜론(;)으로 끝나야 함.

//추상 클래스 (abstract class)
// abstract 수식어가 사용된 클래스.
// 대부분의 경우, 추상 클래스는 1개 이상의 추상 메서드를 가지고 있음.
// 추상 메서드를 가지고 있는 경우는 abstract를 반드시 사용해야 한다.
// 추상 클래스는 객체를 생성할 수 없음.
// 근데 왜 사용하지?

// 추상 메서드와 추상 클래스는 상속하는 하위 클래스에서 구현을 목적으로 함.

abstract class Animal{
    public abstract void move(); // 뭐가 들어올 줄 몰라서 body가 없는 메서드, so {}가 없음. -> abstract라고 한다.
    
}

class Dog extends Animal{
    @Override // 추상 메서드를 재정의해서 메서드 본체를 작성 -> 구현(implement)
    public void move() {
        System.out.println("강아지 총총총..."); // 바디가 없는 메서드를 가져와서 바디를 만드는것.
    }
}

class Fish extends Animal{
    @Override
    public void move() {
        System.out.println("물고기 스윔스윔...");        
    }    
}

class Bird extends Animal{
    @Override
    public void move() {
        System.out.println("새는 훨훨~~~");
    }    
}

public abstract class AbstractMain01 {

    public static void main(String[] args) {
        Animal dog = new Dog(); // Super <- Sub , 다형성!!
        dog.move(); 
        
        Animal fish = new Fish();
        fish.move();
        
        Animal bird = new Bird();
        bird.move();
        
        Animal[] animals = {dog, fish, bird};
        for(Animal a : animals) {
            a.move();
            
        }
    }

}

package edu.java.modifier03;

public class Person {
    // field(멤버 변수)
    private String name;
    private int age;
    
    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // method
    public String getName() {
        return this.name; // get 메서드는 리턴값으로, 파라미터는 필요없다.
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) { // setter method는 리턴 타입이 void이고, 무엇을 리턴할까는 파라미터 안에.
        if (age < 0) {
            System.out.println("나이는 0보다 작을 수 없음.");
        } else {
            this.age = age;
        }
    }
    
    
}

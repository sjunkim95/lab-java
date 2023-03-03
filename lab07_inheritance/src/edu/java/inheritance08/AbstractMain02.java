package edu.java.inheritance08;

abstract class Vehicle {
    public abstract void run();
}

class Bus extends Vehicle {

    @Override
    public void run() {
        System.out.println("버스 run...");
    }    
}

class Taxi extends Vehicle {
    
    @Override
    public void run() {
        System.out.println("Taxi run...");
    }  
}

class Driver {
    public void drive(Vehicle v) { // 바디 없는 Vehicle에 v라는 객체를 줬다? 아마 객체가 구현이 됐을것이다!
        v.run();
    }
}

public class AbstractMain02 {

    public static void main(String[] args) {
        Driver busDriver = new Driver();
        Bus bus = new Bus();
        busDriver.drive(bus);
        
        Driver taxiDriver = new Driver();
        taxiDriver.drive(new Taxi());
    }

}

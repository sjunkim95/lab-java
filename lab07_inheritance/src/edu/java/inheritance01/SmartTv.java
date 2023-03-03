package edu.java.inheritance01;

// 스마트 TV는 TV이다. (Smart TV "IS A" TV)
// 'IS A' 관계라고 함, TV가 부모, SmartTV가 자식클래스가 된다.

// BasicTv : super/parent/base 클래스
// SmartTV : sub/child/derived 클래스
public class SmartTv extends BasicTv{
    // field (속성)
    private String ip;
    
    // getters/setter
    public String getIp() {
        return ip;
    }
    
    public void setIp(String ip) {
        this.ip = ip;
    }
    
    
    
}

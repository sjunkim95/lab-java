package edu.java.inheritance02;

//superclass에 기본 생성자가 없으면, subclass가 상속을 받을려고 할 때 error가 난다.
//그럴 떄 어떻게 해결하느냐

public class SubClass extends SuperClass {
    
    public SubClass() {
        super(0);
        // superclass가 기본 생성자를 갖고 있지 않기 때문에,
        // 명시적으로(explicitly) superclass의 argument를 갖는 생성자를 호출해야만 함!!
    }
    
    public SubClass(int a) {
        super(a);
    }
    

}

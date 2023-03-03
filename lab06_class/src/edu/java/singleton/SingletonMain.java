package edu.java.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        // Captain 타입 객체 생성
        Captain captain1 = Captain.getInstance();
        System.out.println(captain1);
        System.out.println(captain1.getName());
        
        Captain captain2 = Captain.getInstance();
        System.out.println(captain2); // 주소 값이 위와 같다, 즉 생성자가 새로 만들어진 것이 아니다.
        System.out.println(captain2.getName());
        
        captain2.setName("아이언맨");
        System.out.println(captain1.getName());
        System.out.println(captain2.getName());
        // captain1, captain2 둘다 아이언맨을 가르킴.
    }

}

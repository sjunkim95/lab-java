package edu.java.class02;


// 클래스의 맴버들:
// 1. 필드(field) - 클래스의 객체들이 가질 수 있는 속성들(데이터). 변수.
// 2. 생성자(constructor) - 객체를 생성하고 초기화.
// 3. 메서드(method) - 클래스의 객체들이 갖는 기능(함수).

public class Product {
    // field
    // 여기서 밑에서 정보를 저장할 메모리를 확보하는 것.
    int productId; // 상품 아이디
    String productName; // 상품 이름
    int price; //상품 가격

    // constructor -> 여기서 이제 초기화
    /*
    public Product(int id, String name, int price) {
        productId = id; // 이런 경우에서는 this. 생략 가능하다.
        productName = name; //this.를 안붙여서 이런 경우가 편리할 수 있지만, 변수 이름이 고민이다.    
        this.price = price
    }
    */
    //그래서 id나 name을 뭘로 초기화 해줄거냐? 그게 constructor, 하지만, 그 기능은 METHOD에. 
    public Product(int productId, String productName, int price) {
        this.productId = productId; 
        this.productName = productName; 
        this.price = price;
    }
    
    // method
    public void setPrice(int price) {
        this.price = price;
        
    }
    
}

package edu.java.inheritance02;

// 학생은 사람이다. -> Person: Superclass, Student: Subclass
public class Student extends Person{
    // field
    private String school;
    
    // 생성자
    public Student() {
        // 자식 클래스에서는 부모 클래스의 생성자가 먼저 생성된다
        // super(); 이런식으로 먼저 불러온 느낌. 안 써도 된다! 생성자에서 제일먼저 써야함, 쓸거라면.
        // superclass의 기본 생성자 호출 - 생략 가능
        System.out.println("Student() 생성자 호출");   
    }

    public Student(String school) {
        // super();
        // superclass의 생성자를 명시적으로 호출하지 않은 경우에는 "기본 생성자"가 자동으로 호출
        this.school = school;
        System.out.println("Student(school) 생성자 호출");
    }
    
    public Student(String name, String school) { // 학생 만들때, 이름과 학교 다 초기화 하고싶다.
        super.setName(name);
        //super(name) 도 가능. <- 부모클래스에서 argument 가진 생성자 호출할때, argument 길이 만큼.
        this.school = school;
        System.out.println("Student(name, school) 생성자 호출");
    }
    
    // getter/setter
    public String getSchool() {
        return school;
    }
    
    public void setSchool(String school) {
        this.school = school;
        System.out.println("Student(school) 생성자 호출");
    }
    
    
}

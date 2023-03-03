package edu.java.class05;

public class ClassMain05 {

    public static void main(String[] args) {
        // Score 타입의 객체 생성, 메서드들을 테스트.
        Score noScore = new Score();
        System.out.println("기본 생성자 테스트: " +noScore.total());
        System.out.println("----Score 객체 테스트----");
        
        Score score = new Score(8, 8, 9);
        score.printScore();
        System.out.println("총점은: " +score.total());
        System.out.println("평균은: "+score.avg());
        
        System.out.println("----student1----");
        
        // Student 타입의 객체 생성, 메서드를 테스트.
        Student student1 = new Student();
        student1.printStuInfo();

        System.out.println("----student2----");
        Student student2 = new Student(23, "김상준", score);
        student2.printStuInfo();
        
        System.out.println("----student3----");
        Student student3 = new Student(23, "김상준", null); // 이것도 가능함.
        student3.printStuInfo();
        
        System.out.println("----student4----");
        Student student4 = new Student(23, "김상준", new Score()); 
        // 여기서 Score()를 직접 호출해도 괜찮다, 어차피 Score 객체가 들어가는 자리이기 때문에.
        // argument 전달하는 위치에서, 생성자를 집어넣어도 괜찮다.
        student4.printStuInfo();
        
        System.out.println("----student5----");
        Student student5 = new Student(23, "김상준", 3, 3, 5);
        student5.printStuInfo();
        
    }

}

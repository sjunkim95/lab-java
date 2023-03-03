package edu.java.class05;

public class Student {
    // field
    int stuNo; // 학번(학생 아이디)
    String stuName; // 학생 이름
    Score score; // 국어/영어/수학 점수.
    
    // constructor
    // (1) 기본 생성자
    public Student() {}
    
    // (2) arguement : int, String, Score
    public Student(int stuNo, String stuName, Score score) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.score = score;
    }
    
    // (3) argument : int, String, int, int, int
    public Student(int stuNo, String stuName, int korean, int english, int math) {
//        this.stuNo = stuNo;
//        this.stuName = stuName;
        // this.score.korean = korean; -> null pointer exception. 주소값을 가르켰는데 null인거다. 
        // 객체가 아직 생성 안된 것.
        // 바로 위에는, 문법적으로는 오류가 없지만, score.이 null을 가르키고 있을만하다.
//        this.score = new Score(korean, english, math);
        
        
        //위에 3줄 방법도 있지만, 밑에처럼 한줄로 정리 가능하다, 위에 생성자를 불러오면서.
        this(stuNo, stuName, new Score(korean, english, math));
        
    }
    
    // method - 학생 정보(학번, 이름, 국/영/수 과목 점수, 총점, 평균)을 출력하는 메서드.
    public void printStuInfo() {
        System.out.println("학번: " +this.stuNo);
        System.out.println("이름: " +this.stuName);
        //System.out.println("국어는 : " + score.korean + " 영어는: " + score.english + " 수학은 : "+ score.math);
        if (score != null) { // null 타입 error를 잡기 위해.
            this.score.printScore(); //국/영/수 점수 출력
            System.out.println("총점: "+this.score.total());
            System.out.println("평균: "+this.score.avg());
        } else {
            System.out.println("점수 :  null");  
        }
        

        
    }    
}

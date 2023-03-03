package edu.java.class05;

public class Score {
    // field
    
    int korean; // 국어 점수 저장
    int english; // 영어 점수 저장
    int math; // 수학 점수 저장
    
    
    
    // constructor - 기본 생성자, argument를 갖는 생성자.
    public Score() {}
    
    public Score(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
    
    // 세 과목의 점수를 출력하는 메서드.
    // 클래스 이름과 생성자 이름만 겹치게 만들지, 메서드는 그러지 말아라.
    public void printScore() {
        System.out.println("한국어 점수는: "+ this.korean);
        System.out.println("영어 점수는: "+this.english);
        System.out.println("수학 점수는: "+this.math);
    }
    
    // 세 과목의 총점을 리턴하는 메서드.
    public int total() {
        int tot = this.korean + this.english + this.math;
        return tot;
    }
    
    // 세 과목의 평균 (소수점까지 계산)을 리턴하는 메서드.
    public double avg() {
        return (double)total()/3;
    }
}

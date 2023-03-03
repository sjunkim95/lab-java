package edu.java.condition05;

// Ctrl + Shift + O : optimize import (import문 최적화)
// 필요한 import문 자동으로 넣어주고, 필요없으면 지워줌. 
import java.util.Random;

public class ConditionMain05 {

    public static void main(String[] args) {
        //Random 타입 변수를 선언하고, 초기화
        Random random = new Random();
        //Java 과목 점수를 0~100 난수로 저장
        int scoreJava = random.nextInt(101);
        System.out.println("Java 점수는 "+scoreJava);
        
        //SQL 과목 점수를 0~100 난수로 저장
        int scoreSql = random.nextInt(101);
        System.out.println("SQL 점수는 "+scoreSql);
        
        //JSP 과목 점수를 0~100 난수로 저장
        int scoreJsp = random.nextInt(101);
        System.out.println("JSP 점수는 "+scoreJsp);
        
        //3과목의 평균을 계산
        double avg = ((scoreJava+scoreSql+scoreJsp)/(double)3);
        System.out.println("평균은 "+avg);
        
        //모든 과목의 점수가 40점 이상이고, 평균이 60점 이상이면 "합격",
        //그렇지 않으면 "불합격" 출력.
        String result = (avg > 40 && scoreJava > 40 && scoreSql > 40 && scoreJsp > 40) ? ("합격") : ("불합격"); 
        System.out.println(result);
    
        //다른 방법으로는 드모르강 부호법칙
        //if (java < 40 || sql < || jsp < 40 || avg < 60){ sysout(불합격)} else { (합격)}
        
        
    }

}

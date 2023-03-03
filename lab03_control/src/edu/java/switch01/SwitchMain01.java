package edu.java.switch01;

public class SwitchMain01 {

    //break; 는 자기가 속해있는, switch for while같은 블록을 빠져나가는 키워드
    
    public static void main(String[] args) {
        String weekday = "월";
        switch (weekday) {
        case "월":
            System.out.println("회사 가기 싫어...");
            break;
        case "화":
        case "수":
        case "목":
            System.out.println("어떻게든 버텨야지...");
            break;
        case "금":
            System.out.println("야호, 불금...");
            break;
        case "토":
        case "일":
            System.out.println("휴일...");
            break;
        default:
            System.out.println("???");
        
        }
        
        // switch - case 구문은 해당 케이스 위치로 이동해서 break를 만날 때까지 실행.
        // case에서 사용가능한 값의 타입은
        // (1) 정수: byte, short, int, long, char
        // (2) 문자열: String
        // (3) enum
        // (주의) 실수 타입(float, double)은 switch - case에서 사용할 수 없음.
        
        /*
         * 안되는 코드임. 왜냐, x는 실수이니까.
        double x = 1.0;
        switch (x) {
        case 0.0:
            break;
        case 1.0:
            break;
        case 2.0:
            break;
        default:
        }
        */

    }

}

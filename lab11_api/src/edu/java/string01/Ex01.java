package edu.java.string01;

public class Ex01 {

    public static void main(String[] args) {
        // String 클래스의 메서드들을 사용
        
        System.out.println("1번 문제");
        // ex-1. 아래의 주민번호 문자열에서 성별을 표시하는 위치의 문자만 출력.
        String ssn = "991231-1234567";
        
        System.out.println("주민번호 뒷자리 첫 번호는: " +ssn.substring(7, 8));
        System.out.println(ssn.charAt(7)); // 강사님 예시
        System.out.println("--------------");
        
 
        System.out.println("2번 문제");
        // ex-2. 아래의 문자열 배열에서 "홍길동"의 인덱스를 출력하세요.
        // 만약에 "홍길동"이 배열에 없는 경우에는 -1을 출력.
        String[] names = {"오쌤", "홍길동", "John", "Jane"};
        
        int index = -1;
        for(int i = 0; i < names.length; i++) {
            if(names[i].equals("홍길동")) {
                index = i;
                break;
            }
        }
        System.out.println("홍길동 인덱스는: " +index);
        System.out.println("--------------");
        
        
        
        System.out.println("3번 문제");
        // ex-3. 아래의 문자열 배열에서 5글자 이상인 문자열들만 출력.
        String[] languages = {"Java", "SQL", "JavaScript", "Python"}; //자바스크립트, 파이썬만 출력인거.
        
        //강사님 예시
        for (String s: languages) {
            if(s.length()>=5) {
                System.out.print(s + ", ");
            }
        }
        
        System.out.println("\n내 예시");
        for(int i = 0; i < languages.length; i++) {
            if(languages[i].length()>=5) {
                System.out.println(languages[i]);
            }
        }
        System.out.println("--------------");
        
        
        System.out.println("4번 문제");
        //ex-4. 아래의 문자열 배열에서 대소문자 구별없이 "est"를 포함하는 문자열들을 출력.        
        String[] tests = {"TEST", "test", "TeSt", "tEsT", "테스트"};
        
        //강사님 예시
        for (String s: tests) {
            if(s.toLowerCase().contains("est")) {
                System.out.print(s + ", ");
            }
        }
        System.out.println();
        
        //나의 예시
        for(int i = 0; i < tests.length; i++) {
            String a = tests[i].toUpperCase();
            if(a.contains("EST")) {
                System.out.print(tests[i] +", ");
            }
        }
        System.out.println("\n--------------");
        
        System.out.println("5번 문제");
        // ex-5. 아래의 "YYYY-MM-DD" 형식의 날짜 문자열에서 년/월/일 정보를
        // int 타입 변수에 저장하고 출력.
        String date = "2022-09-07";
        
        String[] array = date.split("-");
        
        //강사님 예시
        int y =Integer.parseInt(array[0]);
        int m =Integer.parseInt(array[1]);
        int d =Integer.parseInt(array[2]);
        System.out.println(y + "년 " + m + "월 "+ d + "일");
        
        // 내 예시
        int Year = Integer.valueOf(array[0]).intValue();
        int month = Integer.valueOf(array[1]).intValue();
        int day = Integer.valueOf(array[2]).intValue();
        
        System.out.println(Year + "년 " + month + "월 "+ day + "일");
        
    }

}

package edu.java.loop09;

public class LoopMain09 {

    public static void main(String[] args) {
        // 1부터 100까지 자연수들의 합: sum = 1+2+3+....+99+100
        
        int sum = 0;
        
        for (int n = 1; n <= 100; n++) {
            sum += n; // sum = sum + n;
            System.out.println("sum = "+sum);
        }
        
        //연습 문제 2번에서 3의 배수합.
        sum = 0;
        for (int n = 3; n <= 100; n+=3) {
            sum += n; // sum = sum + n;
            System.out.println("sum = "+sum);
        }
        
        //if문 사용해서
        sum = 0;
        for(int n = 1; n <= 100; n++) {
            if(n%3==0) {
                sum+=n;
            }
        }
        System.out.println("3의 배수들의 합2 = "+sum);
        
        //While문 사용해서
        sum = 0; // 3의 배수들을 저장할 변수
        int n = 1; // 시작은 1
        while(n<=100) { // 100 이하의 자연수들 중에서
            if(n%3==0) {//3의 배수이면
                sum+=n;
            }
        n++;        
        }
       System.out.println("3의 배수들의 합3 = " +sum);
        
    }
}

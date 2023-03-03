package edu.java.homework0822;

import java.util.Random;

public class HW0822 {

    public static void main(String[] args) {
        // 1. 반복문의 종류를 빈 칸에 넣어보세요 -> for문, while문, do-while문.
        
        // 2. for문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해보세요.
        int x;
        int y = 0;
        System.out.println("2번문제");
        for(x=1; x<34; x++) {
            //System.out.println(3*x);
            y += 3*x;
            if(x==33) {
                System.out.println("누적값은:  " +y);
            }
            
        }
        System.out.println("--------");
        
        // 3. While문과 Math.random() 메소드를 이용해서 2개의 주사위를 던질때 나오는 눈1, 눈2 형태로 출력력.
        // 눈1, 눈2의 합이 5가 아니면면계속 던져, 5면 실행을 멈춰라.
        
        Random random = new Random();
        //변수 x는 nextInt사용
        //x = random.nextInt(6) +1; // 0 <= x < 6 임으로, 1~6까지 숫자가 출력되기위해 +1 작성
        //x = random.nextInt(1,7); 이것도 가능한 방법임.
        //y = random.nextInt(6) +1;
        
        double r = Math.random(); //여기는 근데 int가 아닌 double을 만들어준다.
        // 0 <= r < 1
        // 0 <= 6 x r < 6
        // 즉, r = 1 <= 6 x r + 1 < 7
        // 그리고, 소숫점을 짤라야하는데, 방법은 여러가지.
        //강제 타입변환, int z = (int) r
        
        System.out.println("3번문제");

        int z;
        while(true) {
            x = random.nextInt(6) +1;
            y = random.nextInt(6) +1;
            z = x +y;
            if(z!=5) {
                System.out.println("눈1은 " + x + ", 눈2는 " + y +", 합은 "+z);
                System.out.println("계속 던집니다");
            }else {
                System.out.println("눈1은 " + x + ", 눈2는 " + y +", 합은 "+z);
                System.out.println("합이 5임으로 종료");
                break;
            }
        }
        
        
        System.out.println("--------");
        
        // 4. 중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x,y) 형태로 출력해보세요.
        // 단, x와 y는 10 이하의 자연수입니다.
        System.out.println("4번문제");
        for(x = 1; x <= 10; x++){
            for(y = 1; y <= 10; y++){
                if(4*x + 5*y == 60) {
                    System.out.println("(" +x+", "+y+")");
                }
            }
        }
        System.out.println("--------");
        
        //5. for문을 이용해서 *을 출력
        /*
         * 
         **
         ***
         ****
         */
        System.out.println("5번문제");
        for(x = 1; x <= 4; x++) {
            for(y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("--------");
        //6. for문을 이용해서 *을 출력
        /*
            *
           ** 
          ***
         ****
         */
        System.out.println("6번문제");
        for (x = 1; x <= 4; x++)    {   
            for (y = 1; y <= 4; y++ )   { 
                if (y <= (x-1) )   {         
                    System.out.print(" ");
                } else {                    
                    System.out.print("*");
                }
            } 
            System.out.println();       
        } 
        System.out.println("--------");
    }
}

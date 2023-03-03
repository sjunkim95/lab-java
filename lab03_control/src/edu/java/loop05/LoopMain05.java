package edu.java.loop05;            

public class LoopMain05 {

    public static void main(String[] args) {
        // 3, 6, 9 게임!!
        for(int n = 1; n <= 100; n++) {
            // 강사님 예시
            // 1의 자릿수 - 10 으로 나눈 나머지.
            int n1 = n % 10;
            // 10의 자릿수 - 10으로 나눈 몫
            int n10 = n / 10;
            
            boolean b1 = (n1 == 3)||(n1 == 6)||(n1 == 9); // 1의 자릿수가 3, 6, 9이면 TRUE
            boolean b10 = (n10 == 3)||(n10 == 6)||(n10 == 9); // 10의 자릿수가 3, 6, 9이면
            
            /*
            if(b1 && b10) {
                //만약에 1의 자릿수가 3,6,9이고, 10의 자릿수가 3,6,9 이면... -> 짝짝하는 부분
                //이렇게 해야지 밑에 ||랑 순서가 바뀌면 안된다
                System.out.print("**\t");
            } else if(b1 || b10) {
                //만약에 1의 자릿수 또는 10의 자릿수가 3,6,9이라면.
                System.out.print("*\t");
            } else {
                System.out.print(n + "\t");
            }
            if(n%10 == 0) {
                System.out.println();
            }
           */
            
            //이게 정석!! 짝짝 없는거
            if(n1 == 3 || n1 == 6 || n1 == 9 || n10 == 3 || n10 == 6 || n10 == 9) {
                System.out.print("*\t");
            } else {
                System.out.print(n + "\t");
            }
            
            // 10 마다 줄을 바꿔주는 코드
            // 즉, *를 출력하든, n인 숫자를 출력하든 10개가 되었으면 줄을 바꾸어주라
            if (n % 10 == 0) {
                System.out.println("\n");
            }
            
          
            
            /* 내가 한것, 3,6,90번대가 에러
            if (n % 10 == 3) {
                System.out.print("*\t");
                continue;                
            } else if (n % 10 == 6) {
                System.out.print("*\t");
                continue; 
            } else if (n % 10 == 9) {
                System.out.print("*\t");
                continue; 
            } else if (n / 10 == 3) {
                System.out.print("*\t");
                continue; 
            } else if (n / 10 == 6) {
                System.out.print("*\t");
                continue; 
            } else if (n / 10 == 9) {
                System.out.print("*\t");
                continue; 
            }

            
            System.out.print(n + "\t");
            
            if (n % 10 == 0) {
                System.out.print("\n");
            }
            */
        }

    }

}

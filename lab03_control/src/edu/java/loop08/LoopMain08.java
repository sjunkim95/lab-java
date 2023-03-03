package edu.java.loop08;

public class LoopMain08 {

    public static void main(String[] args) {
        // 중첩 반복문
        for(int i = 1; i < 10; i++){
            System.out.println("----" + i + "단----");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        //    System.out.println("----------");
        }
        
        int x = 1;
        
        while (x < 10) {
            
            System.out.println("----" + x + "단----");
            int y = 1;
            while (y < 10) {
                System.out.println(x + " x " + y + " = " + (x*y));
                y++;
            }
            x++;
        }
        
        System.out.println();
        
        //2단은 2*2까지, 3단은 3*3까지!!!!!!
        
        System.out.println("FOR LOOP 사용해서!!");
        for(int a = 1; a < 10; a++) {
            System.out.println("----" + a + "단----");
            for (int b = 1; b < 10; b++) {
                System.out.println(a + " x " + b + " = " + (a*b));
                if (a==b) {
                    break; // 안쪽 for 문을 종료. 즉, 자기가 속해있는 for문을
                }
            }
                
        }
      
        System.out.println("While Loop 사용해서");
        int c = 1;
         
        while (c < 10) {  
                    
            System.out.println("----" + c + "단----");
            int d = 1;
            while (d <= c) {
                System.out.println(c + " x " + d + " = " + (c*d));
                d++;
            }
            c++;
        }
        
        System.out.println("Break 사용한 while문!!");
        int f = 1;
        while (f < 10) {
            
            System.out.println("----" + f + "단----");
            int e = 1;
            while (e < 10) {
                System.out.println(f + " x " + e + " = " + (f*e));
                if (f==e) {
                    break; // 안쪽 for 문을 종료. 즉, 자기가 속해있는 for문을
                }
                e++;
            }
            f++;
        }
            
    }

}

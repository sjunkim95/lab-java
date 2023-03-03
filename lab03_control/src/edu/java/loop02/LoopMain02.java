package edu.java.loop02;

public class LoopMain02 {
// 복합 할당 연산자: +=, -=, *=, /=, ...
    
    public static void main(String[] args) {
        // 0 2 4 6 8 10 을 한 줄씩 출력
        
        for (int i = 0; i < 11; i++)
            if (i % 2 == 0) {
                System.out.println(i);
        }
        System.out.println("==============");
        
        
        for (int i = 0; i < 6; i++)
            System.out.println(i*2);
        
        
        System.out.println("==============");
        
        for (int n = 0; n < 11; n+=2)
            System.out.println(n);            

    }

}

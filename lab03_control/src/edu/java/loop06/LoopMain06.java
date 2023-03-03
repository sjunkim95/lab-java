package edu.java.loop06;

public class LoopMain06 {

    public static void main(String[] args) {
        // for 반복문
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        
        System.out.println("-------");
        
        // while 반복문
        int n = 1;
        while (n <= 5) {
            System.out.println(n);
            n++;
        }
        
        System.out.println("--------------");
        // 10부터 1까지 정수들을 내림차순으로 한 줄에 출력하세요. (10 9 8 7 .... 3 2 1)
        int a = 10;
        while (a>0) {
            System.out.print(a +" ");
            a--;
        }
        System.out.println();
        
        
        for(n=10; n>0; n--) {
            System.out.print(n +" ");
        }
        System.out.println(); //줄바꿔주는것
        
    
        System.out.println("\n--------------");
        // 10 이햐의 양의 홀수들을 한 줄에 출력하세요 (1 3 5 7 9)
        int b = 0;
        while (b < 10) {
            if (b%2 == 1) {
                System.out.print(b +" ");
                b++;
            }
            else {
                b++;
            }
        }
        
        System.out.println();
        
        for (n=1; n<10; n+=2) {
            System.out.print(n+" ");
        }
        
        System.out.println();
        
        n = 1;
        while(n<10) {
            if(n%2==1) {// n이 홀수이면,
                System.out.println(n + " ");                
            }
            n++; //아 이걸 while문 바깥에다가 써야하네!
            //만약 이게 if문 안에있다 한다면, 1에서 2가되고 무한으로 루프가 돌아감.
        }
        
        
    }
}
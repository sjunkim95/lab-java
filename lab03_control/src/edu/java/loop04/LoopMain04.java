package edu.java.loop04;

public class LoopMain04 {

    public static void main(String[] args) {
        // 반복문에서 break vs continue
        
        // break: 반복문 블록을 실행 중에 break를 만나면, 
        // break가 포함된 가장 가까운 반복문 블록을 종료.
        
        // continue: 반복문 블록을 실행 중에 continue를 만나면, 
        // continue 아래의 코드는 무시하고 그 다음 반복 과정을 계속 수행.
        
        for(int n = 1; n <= 5; n++) {
            System.out.println(n);
            if (n == 3) {
                break;
            }
        } // 위 코드는 break를 설명하기 위한 코드. 3까지 프린트하고 break에서 반복문이 종료된다.
        
        System.out.println("=========");
        
        for(int n = 1; n <= 5; n++) {
            if (n == 3) {
                continue;
            }
            System.out.println(n);
        } // 위 코드는 continue 설명, 3을뺀 5까지 반복해서 출력.
    }

}

package edu.java.loop12;

public class LoopMain12 {

    public static void main(String[] args) {
        
        //4-5,6
        
        for (int i = 1; i <= 4; i++) { //4번 반복하면서.
            for (int j = 1; j <= i; j++) { // i번 반복하면서.
                System.out.print("*"); // "*"를 (줄바꿈 없이) 옆으로 출력.
            }
            
            System.out.println(); //i번째 줄의 "*:들을 출력 후 줄 바꿈.
        }
        
        System.out.println();
        
        for(int i = 1; i <= 4; i++){
            int spaces = 4 - i; // 그 라인에서 출력하는 공백의 갯수이다.
            // i가 4일때는 spaces가 0이 되는데, j가 최소 1로 선언이라, 바로 건너뛴다.
            
            for(int j = 1; j <= spaces; j++) {// spaces 갯수만큼 반복하면서 공백 출력
                System.out.print("#"); // 이게 공간인거.
            }
            for(int j = 1; j <= i; j++) { // 라인 수만큼 반복하면서
                System.out.print("*");  // "*" 출력
            }
            System.out.println(); // 줄바꿈
        }
        
        System.out.println();
        for(int i = 1; i <= 4; i++) { //라인 수가 1~4까지
            for(int j = 4; j >= 1; j--) { //각 줄에서 자릿수가 4~1까지
                if (j>i) { //출력할 자릿수가 라인 숫자보다 크면
                    System.out.print(" "); //그때는 공백이다.
                } else { // 출력 위치가 라인 숫자보다 작거나 같으면
                    System.out.print("*"); // "*"
                }
            }
            System.out.println();
        }
        
        
        
        
        
        
    }
}

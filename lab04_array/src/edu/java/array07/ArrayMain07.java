package edu.java.array07;

import java.lang.reflect.Array;
import java.util.Random;

public class ArrayMain07 {

    public static void main(String[] args) {
        // Chapter 5-2 ex.4 (200pg)
        // 정수 (int) 10개를 저장하는 배열(array)을 선언.
        Random random = new Random();
        int[] number = new int[10];
        
        int max = number[0];
        
        for(int i = 0; i < number.length; i++) {
            int x = random.nextInt(11);
            number[i] = x;
            System.out.print(number[i] + ", ");            
        }
        
        for (int i = 0; i < number.length; i++) {
            if(max < number[i]) {
                max = number[i];
            }
        }
        
        System.out.println("가장 큰 숫자는: " +max);
        
        
        //강사님 예시
        // 배열에 0이상 10 이하의 정수 난수 10개를 저장.
        int[] array = new int[10];
        for(int i=0; i<array.length;i++) {
            array[i]=random.nextInt(11);
        }

        // 배열의 내용 출력.
        for(int n:array) {
            System.out.print(n + " ");
        }
        System.out.println();
        // 배열에서 최댓값을 찾으세요. -> 14번째 줄. int max!
        
        // max = array[0] 가정
        
        
        for (int i = 0; i <array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            } 

        }
        System.out.println("MAX: "+max);
        
        //위 for문, 아니면
        for (int x:array) { //배열 array에서 원소를 하나씩 꺼내면서
//            if(max<x) { //배열에서 꺼낸 원소 x가 max보다 크다면
//                max = x; // 최댓값을 더 큰 값으로 설정.
//             }
            max = (max<x) ? x : max; //위에 if문은 이렇게 삼항 연산자로 쓸 수 있다.
        }
        System.out.println("for-each 돌렸을때 출력문은: "+max);
        // for (array의 모든 원소들):
        //     if(max < array):
        //         max = array 원소    
        
    }

}

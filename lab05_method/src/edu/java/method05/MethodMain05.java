package edu.java.method05;

public class MethodMain05 {

    public static void main(String[] args) {
        // 메서드 작성 연습.
        
        int[] scores = {70, 60, 100, 50, 81, 100};
        
        int sum = sum(scores);
        System.out.println("총점 = " +sum); //360
        
        double avg = mean(scores);
        System.out.println("평균 = " +avg); //72.0
        
        int max = max(scores);
        System.out.println("최댓값 = " +max); //100

        int min = min(scores);
        System.out.println("최솟값 = " +min); //50
        
        double   
        variance = variance(scores);
        System.out.println("분산값 = " +variance);

        double standev = standev(scores);
        System.out.println("표준편차 = "+standev);
    }
    
    public static int sum(int[] scores) {
        int sum = 0;
//        for(int i=0; i < scores.length; i++) {           
//            sum += scores[i];      
        // 위 방법도 있지만,
        // 밑에는 강사님 방법
        for (int x : scores){
            sum += x;
        }
        return sum;        
    }
    
    public static double mean(int[] scores) {
//        int total = 0;
//        int count = 0;
//        for(int i=0; i < scores.length; i++) {           
//            total += scores[i];  
//            count++;
//        }
//        return (double)total/count;
        // 밑에가 강사님 예시.
        int total = sum(scores);
        double avg = (double) total / scores.length; // 3 -> 3.0
        
        return avg;
    }
    
    public static int max(int[] scores) {
        int max = scores[0];
      //  for (int i = 0; i < scores.length; i++) {
      //      if(max < scores[i]) {
      //          max = scores[i];
      //      }
      //  }
        for (int x : scores) { //점수들에서 꺼낸 점수들, 순서대로.
            max = (max < x) ? x: max;
            // 간단하게 if 문으로 쓴다면
            // if (max < x){max = x;}
        }
        return max;  
    }
    
    public static int min(int[] scores) {
        int min = scores[0];    
//        for (int i = 0; i < scores.length; i++) {
//            if(min > scores[i]) {
//                min = scores[i];
//            }
//        }
        for (int x : scores){
            min = (min > x) ? x : min;
        }
        return min;  
    }
    
    public static double variance(int[] scores) {
        // 데이터: {x1, x2, ..., xn)
        // 평균 : mu = (x1 + x2 + ... + xn) / n
        // 분산 : var = ((x1 - mu)^2 + (x2 -mu)^2 + ... + (xn - mu)^2) / n
        // 표준편차 : std = sqrt(var)
        
        /* 나의 예시
        int tot = 0;
        for (int i = 0; i < scores.length; i++) {
            tot += (scores[i] - mean(scores))*(scores[i] - mean(scores));           
        } */
        
        // 강사님 예시
        double mu = mean(scores);
        double tot = 0;
        for (int x: scores) {
            tot += (x - mu)*(x - mu);
        }
        double var = tot/scores.length; 
        
        return var;     
    }
    
    public static double standev(int[] scores) {
        return Math.sqrt(variance(scores));
    }
    
}    
    


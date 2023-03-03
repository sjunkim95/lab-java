//주석 (comment) : 프로그램에 대한 설명을 작성.
// 컴파일할 때 제외됨. (즉, 실행되지 않는 코드) -> inline comment
/*
 * 여러줄 주석 (block comment)
 * 목적은: 문서화 주석(documentation comment)를 만들 때 주로 사용.
 */ 

package edu.java.intro1; //패키지 선언문 즉, AppMain1이 이 패키지 안에 있습니다 설명해주는것. 
//자바 파일의 첫번째 줄은 무조건 패키지 선언문, 이클립스가 자동으로 만들어줌
//패키지 선언의 목적은??
//자바의 모든 문장은 세미콜론(;)으로 끝남. 안써있고 특히 {이 써있는 부분은 아직 문장이 안끝난것이다.

//클래스 선언(정의) 
public class AppMain1 {

	//main 메서드 (method): 자바 프로그램의 시작점이자 끝.
	public static void main(String[] args) {
		System.out.println("Hello, 자바!");

	} //end of main 메서드, 즉 프로그램이 끝나는 부분.

} //end class

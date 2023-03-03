package edu.java.intro2;
//Public Static Void 체크 안했음. 또 main이 없으니까 당장 run으로 실행이 안된다.
//so, main을 만들어줘야함
public class AppMain2 {
	
	public static void main(String[] args) {
		System.out.println("자바 프로그램 실행 방법, 우클릭");
		System.out.println("Menu -> Run -> Run");
		System.out.println("Ctrl + F11");
		//문자열(String): 문자들의 집합(sequence). 큰 따음표("")를 사용.
		
		// Ctrl + Space: 코드 추천 및 자동 완성. sysout 타입 후에 사용.
		System.out.println("문자열" + "합치기"); // +: 문자열을 이어주는 연산자.
		System.out.println(1+2); // +: 덧셈 연산자.
		System.out.println("1"+"2");
		System.out.println("1 + 2 = 3");
		System.out.println("1 + 2 = " + (1+2));
		System.out.println("1 + 2 = " + 1+2);
		
		
		System.out.print("프린트"); 
		//print 이거 사용하면 여기가 끝줄, 밑에 작성 불가능.
		System.out.print("print"); 
		//프린트에 줄에 이어서 옆에 출력이 됨. 그래서 줄 바꿔주는  println을 사용해라.

		
	}

}
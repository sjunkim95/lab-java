package edu.java.variable01; //package는 폴더 설정에 대한 설명.
//이 파일은 변수에 대한 설명.

public class VariableMain01 {

	public static void main(String[] args) {
		//변수(variable): 프로그램에서 필요한 데이터를 저장하는 메모리 공간. -> RAM을 사용하는것
		
		//변수 선언: 변수의 데이터 타입과 변수의 이름을 선언.
		int age; //빈 공간에 정수(integer)를 저장할 수 있을만큼 공간을 찾아서 age라는 변수를 선언한거.
		
		//변수 초기화: 변수에 값을 할당(저장).
		age = 16; //변수 age에 값 16을 저장한다.
		
		
		//sysout하고 ctrl + space
		System.out.println(age); //변수 age가 저장한 값을 출력해라.
		
		age =17;
		System.out.println(age);
		//변수 선언과 초기화를 나눌필요없고 한문장으로 사용해도 가능.
		int salary = 100;
		System.out.println(salary); //ctrl 누른채로 변수를 누르면 선언으로 링크된다. 그 변수 타입이나 등등.
		
		/* 자바의 기본 데이터 타입 
		 * 정수 타입: byte, short, int, long, char
		 * 실수 타입: float, double
		 * 논리 타입: boolean
		 */
		
		//한번 새롭게 long이라는거는 8바이트, int는4바이트이니까 100억저장불가능 long 뒤에 L붙여
		long won = 10000000000L;
		System.out.println(won);
		
		//변수 이름을 만드는 문법/관습:
		/* 1. 변수 이름은 알파벳과 숫자, _를 사용할 수 있음.
		 * 2. 변수 이름은 숫자로 시작할 수 없음. -> int 1n은 안되지만, int n1은 가능하다.
		 * 3. 변수 이름은 소문자로 시작하는 것이 좋음.
		 * 4. 변수 이름이 2개 이상의 단어로 이루어질 때는 camel 표기법을 사용하는 것을 권장.
		 * 5. 같은 이름으로 변수를 2번 이상 선언할 수 없음.
		 * 예를들어)
		 * int x =1;
		 * int x =2; -> 여기서 error가 발생한다
		 * but,
		 * x = 3; 이런식으로 값 변경하는거는 가능. 다만 선언을 하면 안되는것.
		 */
		int phoneNumber; // <<-- camel 표기법, 읽기 편하게 변수 중간에 대문자 넣는것.
		int personalPhoneNumber;
		
		//정수 2개의 사칙연산 결과를 출력
		int x = 4;
		int y = 2;
		int result = x + y;
		System.out.println(result);
		result = x - y;
		System.out.println(result);
		result = x * y;
		System.out.println(result);
		result = x / y;
		System.out.println(result); 
		//자바는 나누기 몫만 계산한다.
		System.out.println(y/x);
		//(정수) / (정수) 결과는 나누는 몫.
		result = 5%x; //(정수)%(정수) 결과는 나눈 나머지.
		System.out.println(result);
		
		//나누기 연산자(/)가 실수에서 사용되면 실수 계산을 수행.
		double z = 123.0; //float은 안됨, 숫자가 8바이트인데, 4바이트 float이니까
		//result = z/y; //이런식이면 z/y에서 type mismatch.
		
		double div = z/y;
		System.out.println(div);
		
		
	}

}

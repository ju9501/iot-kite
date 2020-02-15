package iot.java;

public class App {
	public static void main(String[] args) {
		int score;
		score = 10 + 20;
		String cmd = "exit";
		
	}
	
/**	public static void main(String[] args) {
		// 표현식 : expression : 연산자가 사용된 하나의 문장
		int score;
		score = 10 + 20;
		// 제어문()
		if(score < 10) // 조건식 == boolean
		{// 구문: 구간 statement
			System.out.println(score);
		}
		if(score > 10) // 조건식 == boolean
		{
			System.out.println(score);
		} //의미를 가지고 구간을 쪼갬
		else {
			//score >= 10
		}	
	}
**/
	
	
/**	public static void main(String[] args) {
		// 제어 문장 : 분기, 반복(분기 포함)
		int score; // 변수 생성 값이 저장되지 않았다...
		score = 10;
		System.out.println(score+10); //연산의 결과 출력
		int total = score + 10;
		System.out.println(total+10);
	// 모든 연산은 반드시 자료형을 일치시켜야 한다...
	// 형변환 : 자료형 변환	
	}
**/	
	
	
/**	public static void main(String[] args) {
		// 하나라도 거짓이면 결과는 거짓이다.
		// 둘 다 참일 때 결과는 참이다.
		System.out.println(true && false); // AND 연산
		// 하나라도 참이면 결과는 참이다.
		// 둘 다 거짓일 때 결과는 거짓이다.
		System.out.println(true || false); // OR 연산
	}
**/


/**	public static void main(String[] args) {
		//연산자 : 산술, 관계(대소비교), 논리연산, 비트연산
		//제어문
		//덧셈, 뺄셈 - offset, 방향
		System.out.println(10 > 20); // 이면 T F
		System.out.println(10 >= 20); // 이면 T F
		System.out.println(10 < 20); // 이면 T F
		System.out.println(10 <= 20); // 이면 T F
		
		// equals
		System.out.println(10==20); // 이면 T F
		System.out.println(3+7==10); // 이면 T F
		System.out.println(3==20-17); // 이면 T F
		System.out.println(10!=20); // 이면 T F
	}
**/


/**	public static void main(String[] args) {
		//연산자 : 산술, 관계(대소비교), 논리연산, 비트연산
		//제어문
		//덧셈, 뺄셈 - offset, 방향 
		System.out.println(10 + 5);
		System.out.println("abc"+"efg");
		System.out.println(10 - 5);
		System.out.println(10 * 5);
		System.out.println(10 / 5);
		System.out.println(10 % 5);
//		System.out.println(10**5); 자바는 지원하지 않음
	}
**/	
	
	
/**	public static void main(String[] args) {
		// 변수 선언 : {자료형} {변수명};
		byte ascii; // 1~255byte
		short score; // 2byte 16bits
		int number; // 4byte
		long in;
		double lf; // 실수형, 부동소수
		char unicode; // 2byte
		boolean state = true ; //false
	}
**/	
	
	
/**	public static void main(String[] args) {
		// 각 자료형에 따라 동작할 수 있도록 
		System.out.println(100);
		int bak = 100;
		System.out.println(bak);
	// 함수는 같지만 전달하는 type이 다르다.	
	}
**/
	
}

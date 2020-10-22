
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 산술 연산자 ( +, -, *, /, %)
		 * - 기본 사칙연산(+, -, /, %)과 나머지 연산자로 구성
		 * - 나눗셈 연산자(/)는 나눗셈 결과 중 몫만 계산하고
		 * 	 나머지 연산자(%)는 나눗셈 결과 중 나머지만 계산한다.
		 * - 덧셈연산자의 경우 일반적인 덧셈 기능외에
		 *   문자열에 사용 시 문자열 결합 연산자로 동작함
		 *   (문자열과 특정 데이터타입간에 덧셈연산시 두 데이터를
		 *   결합하여 하나의 문자열로 만들어준다.)
		 *   ex) "문자열" + 정수 = "문자열"정수
		 *    	 실수 + "문자열" = 실수"문자열"
		 *     
		 */
		int a = 10, b = 3, c;
		c = a + b;
		System.out.println(a + " + " + b + " = " + c);
		
		c = a - b;
		System.out.println(a + " - " + b + " = " + c);
		
		c = a * b;
		System.out.println(a + " * " + b + " = " + c);
		
		c = a / b;
		System.out.println(a + " / " + b + " = " + c);
		
		c = a % b;
		System.out.println(a + " % " + b + " = " + c);
		
		System.out.println("-----------------------------------");
		
		//덧셈연산자(+)의 다른 사용법 = 문자열 결합
		String s1 = "Java";
		String s2 = "Programming";
		String s3 = s1 + s2; // 두 문자열을 겹합하여 하나의 문자열을 생성
		System.out.println(s3);
		
		String s4 = s1 + 111;	// "Java" + 111 = "java111" 문자열이 생성됨
		System.out.println(s4);
		
		System.out.println(1 + 1 + "1");
		// => 정수 1+1 산술연산을 먼저 수행하여 2가 된 후
		// 	  다시 문자열 "1"과 결합하여 "21"이 출력됨
		System.out.println(1 + "1" + 1);
		// => 정수 1과 문자열 "1"을 결합하여 "11"이 되고
		// 	  다시 문자열 "1"과 결합하여 "111"이 출력됨
		
		
	}

}

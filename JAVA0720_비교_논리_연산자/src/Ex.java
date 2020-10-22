
public class Ex {

	public static void main(String[] args) {
/*
 * 비교(관계)연산자
 * - 두 피연산자 간의 대소 관계 비교를 수행하는 연산자
 * - 연산 수행 결과는 true 또는 false 값으로 나타냄
 *  => 연산 결과를 출력문에서 출력하거나, boolean 타입 변수에 저장
 * 	1) == (동등비교연산자) : 두 피연산자가 같은지를 비교
 * 	2) != (Not Equal) : 두 피연산자가 같지않은지(다른지) 비교
 * 	3) <, <=, >, >= : 두 피연산자의 대소 관계 비교
 * 
 */
		
		int a= 10, b = 4;
		
		System.out.println(a == b);	// a와 b가 같은지 판별 결과를 출력
		// => a 와 b는 같지 않으므로 false가 리턴되어 나온다.
		
		System.out.println(a != b);	// a와 b가 다른지 판별 결과를 출력
		// => a 와 b는 같지 않으므로 true가 리턴되어 나온다.
			
		System.out.println(a > b);	// a가 b가 큰지 판별 결과를 출력
		// => a 가 b는 크므로 true가 리턴되어 나온다.
		
		System.out.println(a >= b);	// a가 b가 크거나 같은지 판별 결과를 출력
		// => a 가 b보다 크거나 같지않으므로 true 가 리턴되어 나온다.
		
		System.out.println(a <= b);	// a가 b보다 작거나 같은지 판별 결과를 출력
		// => a 가 b보다 작거나 같으므로 false가 리턴되어 나온다.
		
		System.out.println(a < b);	// a가 b보다 작은지 판별 결과를 출력
		// => a 가 b보다 작으므로 false가 리턴되어 나온다.

		// 대소 관계 비교 결과를 boolean 타입 변수에 저장할 수 있다.
		boolean result = a > b; // a, b 판별 결과가 result에 저장됨
		System.out.println("result = " + result);
		
		// 산술 연산자 등과 결합하여 사용할 수도 있다.
		// => 두 연산 결과를 비교연산자로 비교 가능
//		boolean result2 = a + b > a -b;
		// => 산술연산자가 비교연산자보다 우선순위가 높으므로
		// 	  별도의 괄호를 표시하지 않아도 산술연산을 먼저 수행함
		
		// 만약, 명확하게 산술연산을 먼저 수행하도록 하려면 괄호 표시 !
		boolean result2 = (a + b) > (a - b);
		System.out.println("result2 = " + result2);
		
		// char 타입도 정수이므로 비교연산자 사용 가능
		char ch = 'C';
		System.out.println("ch가 대문자 A보다 큰가? " + (65 < ch));
		System.out.println("ch가 대문자 A보다 큰가? " + ('A' < ch));
		
		// 비교연산자도 피연산자 타입이 다르면 일치시킨 후 연산 수행
		System.out.println(10 == 10.0);
		// => int == double => double == double로 변환 후 수행( 10.0 == 10.0 )
		
		// 주의 사항 !
		// 실수( 특히 double) 0.1의 유효자릿수 문제때문에
		// float 0.1f와 double 0.1 비교 시 문제 발생! (= 부정확)
		float f = 0.1f;
		double d = 0.1;
		System.out.println(d == f);
		
		// => float, double 타입 비교시 반드시 float 타입으로 일치시킨후
		// 	  비교 연산을 수행해야 한다.
		System.out.println((float)d == f);
		
	}

}

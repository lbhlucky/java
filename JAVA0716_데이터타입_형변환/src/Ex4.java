
public class Ex4 {

	public static void main(String[] args) {
		/*
		 * char 타입(2Byte = 16bit)
		 * - 문자 데이터 1개(1글자)를 저장할 수 있는 데이터 타입
		 * - 문자 데이터는 작은따옴표 사이에 1개의 문자를 지정하여 표현
		 *   ex) 'A', 'r', '1'등
		 *   => 주의 ! 작은따옴표 사이에 2개 이상의 무자가 올 수 없으며
		 *      반드시 1개의 문자가 포함되거나 공백문자가 있어야 함
		 *   	ex) ''는 사용 불가
		 * - 문자 데이터를 2Byte 정수 형태로 저장
		 *   => 표현 가능 범위 : 2^16 = 0 ~ 65535
		 *   => 표현 범위의 차이떄문에 byte 또는 short 타입과
		 *   	상호 강제 형변환 필수 ! (최소 int타입에 저장시 자동 형변환)
		 * - 실제 사용되는 문자 데이터들은 유니코드 방식을 사용하여
		 * 	 전 세계의 모든 문자 표기
		 */
		
		char ch = 'A';	// 대문자 A를 변수 ch에 저장
		System.out.println(ch);
		
//		ch = '';	//오류 발생 : 작은따옴표 사이에는 반드시 1글자 필수!
		ch = ' ';	//공백 가능
		
//		ch = 'ab'; // 오류 발생 : 작은따옴표 사이에 2글자 이상 사용 불가!
		// => 2글자 이상 문자는 문자열 형태로 큰따옴표""를 사용해야함
	
		char ch2 = 97;
		System.out.println(ch2);
		
		char ch3 = '\uac00';	// 유니코드를 사용하는 방법
		//	=> '\u0000'형식으로 u 뒤에 16진수 4자리 표기
		System.out.println(ch3);
	
		// char 타입은 정수형태로 관리되므로 정수 데이터처럼 연산 가능
		System.out.println('A'+ 3);	// 65 + 3 = 68 출력됨
		
		System.out.println("----------------------------");
		
		/*
		 * 문자열
		 * - 큰 따옴표("")로 둘러써서 표기하는 문자
		 * - 1개 이상의 문자를 사용할 수 있으며, 
		 * 	 아무것도 없는 빈 문자("" = 널스트링)도 표현 가능하다.
		 * - 문자열을 저장할 수 있는 데어터타입은 String 타입
		 * 	 => String 타입은 기본 데이터타입이 아닌 참조형데이터타입이다.
		 */
		//String 타입 변수 str 에 문자열 "Hello, World!" 저장
		String str = "Hello, World!";
		System.out.println(str);
		
		str = "A";	// 1글자 표기도 가능
		System.out.println(str);
		
		str = "";	// 큰따옴표 사이에 아무 문자도 없는 널스트링(Null String)도 사용 가능
		System.out.println(str);
		
		
	}
	
}

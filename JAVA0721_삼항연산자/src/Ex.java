
public class Ex {

	public static void main(String[] args) {
/*
 * 비교연산자와 논리연산자를 활용한 char 타입 연산
 * - char 타입은 주로 비교연산자와 논리연산자를 활용하여
 * 	 특정 범위 내의 문자인지를 판별하는 용도로 사용
 * 	 ex) 대문자 판별, 소문자 판별, 영문자 판별, 숫자 판별 등
 */
		
		char ch = '1';
		
		boolean result = ch >= 'A';	// ch >= 65 사용 가능
		System.out.println(ch + "이(가) 대문자 A(65) 이상인가? " + result);
		
		result = ch <= 'Z' ;	// ch >= 90 사용 가능
		System.out.println(ch + "이(가) 대문자 Z(90) 이하인가? " + result);
		
		// 문자 ch 가 대문자인지 판별
		// => 대문자란? 'A' (65) 보다 크거나 같고 'Z'(90)보다 작거나 같음
		// => 같'고'의 조건은 AND연산자 && 사용하여 결함
		result = ch <= 'Z' && ch >= 'A' ;	// ch <= 90 && ch >= 65 사용 가능
		System.out.println(ch + "이(가) 대문자인가? " + result);

		// 문자 ch가 소문자인지 판별
		// => 소문자란? 'a'(97) 보다 크거나 같고, 'z'(122)보다 작거나 같음
		result = ch <= 'z' && ch >= 'a' ;	// ch <= 122 && ch >= 97 사용 가능
		System.out.println(ch + "이(가) 소문자인가? " + result);
		
		// 문자 ch가 영문자인지 판별
		result = (ch <= 'Z' && ch >= 'A') ||  (ch <= 'z' && ch >= 'a');
//		result = ch >= 'A' && ch <= 'z' ;	// 사이에 특수문자가 끼어있으므로 부정확함.
		System.out.println(ch + "이(가) 영문자인가? " + result);

		// 문자 ch가 숫자인지 판별
		// => 숫자란? '0'(48) ~ '9'(57)
		result = ch >= '0' && ch <= '9' ;	// ch >= 48 && ch <= 57 사용 가능
//		result = !(ch <= '0') && !(ch >= '9') ;
		System.out.println(ch + "이(가) 숫자인가? " + result);
		
	}

}

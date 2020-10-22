
public class Ex2 {

	public static void main(String[] args) {

		/*
		 * 정수형 숫자에 별도의 표시(접두사)가 없을 경우 10진수 (0~9)로 취급됨
		 * 2진수 표기법 : 숫자 앞에 접두사 0b를 붙여서 표기 
		 * 8진수(0~7)표기법 : 접두사 0을 붙여서 표기 
		 * 16진수 (0~9 그리고 A~F) : 접두사 0x 붙여서 표기
		 */

		System.out.println(255); // 10진수
		System.out.println(0b11111111); // 2진수
//System.out.println(0b1234);		//오류 발생 : 2진수에서는 0 또는 1외에는 표기 불가
		System.out.println(0377); // 8진수
//System.out.println(0378);		//오류 발생 : 8진수에서는 0 ~ 7외에는 표기 불가
		System.out.println(0xff);
//		System.out.println(0xfg);		//오류 발생 : 16진수에서는 0~9 그리고 A~F외에는 표기 불가

	}

}

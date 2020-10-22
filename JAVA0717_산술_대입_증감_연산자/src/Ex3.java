
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 산술 연산에서의 자동 형변환
		 * - 산술 연산 수행시 두 피연산의 타입이 다를 경우
		 * 	 연산 수행 전에 두 피연산의 타입을 일치시킨 후 연산을 수행함
		 * 
		 * <타입을 일치시키는 규칙>
		 * 1. int 보다 작은 타입끼리의 연산 시
		 * 	  모든 피연산자를 int로 변환
		 * 		 ex) byte + byte = int + int = int
		 * 		 short + short = int + int = int
		 * 2. int 이상의 타입이 피연산자로 있을 경우
		 * 	  두 피연산자 중 큰 타입으로 일치시킨 후 연산을 진행
		 * 	  ex) int + long = (long)int + long = long
		 */
		
		byte b1 = 10, b2 =3;
//		byte b3 = b1+b2;
		// b1 과 b2 모두 byte 타입이므로 연산 전 int 타입으로 자동 변환됨
		// 따라서, 연산 결과가 int 타입이 되어 byte 타입에 저장 불가능
//		byte b3 = (byte)b1+(byte)b2;
		// => 최종적으로 연산 시점에서 다시 int로 변환 후 연산 수행함
		
		// 연산 결과(int)를 다시 byte타입으로 변환해야한다.
		byte b3 =(byte)(b1+b2);
		System.out.println(b3);
		
		short s1 = 10;
//		short s2 = s1+b1; // byte + short = int + int = int
		short s2 = (short)(s1 + b1);	// int -> short로 강제형변환
		System.out.println(s2);
		
		char ch1 = 'A';
//		char ch2 = ch1 + 3; // char + int = int + int = int
		char ch2 = (char)(ch1+3);	// int -> char로 강제형변환
		System.out.println(ch2);
		
		int i1 = 100;
		long l1 = 200;
//		int i2 = i1 + l1;	// int + long = long + long = long
		int i2 = (int)(i1 + l1); // long -> int로 강제형변환
		System.out.println(i2);
		
		float f1 = 1.0f;
//		long l2 = f1 + l1;	// float + long = float + float = float
		long l2 = (long)(f1 + l1); // float -> long로 강제형변환
		System.out.println(l2);
		
		System.out.println("------------------------------");
		
		System.out.println(10 / 3);	// int / int = int
		// 나눗셈 연산자는 몫만 계산하지만 
		// 정수 연산에서 연산 결과와
		// 실수가 포함된 나눗셈 연산 결과가 달라짐
		System.out.println(10 / 3.0);	// int / double = double / double = double	
		// => 10 / 3과 달리 3.0은 double 타입이므로
		// 	  실수 나눗셈을 수행하여 소수점 자리까지 계산함
		System.out.println(10 / (double)3);	// 위의 연산과 동일하지만
		// 일반적으로 정수 -> 실수 변환하여 표현 시 .0을 붙여서 표기
		
		//-----------------------------------------
		
		// byte 타입 변수에 int형 리터럴 가느이 연산 결과를 저장할 때
		// 연산 결과를 최정적으로 변수에 할당하므로 별도의 형변환 필요없음
		byte b4 = 10 + 10;
		// byte b4 = 20, 코드를 실행한 결과와 같다. 따라서 오류 X
		System.out.println(b4);
		
//		byte b5 = 10 + 120; //오류 발생
		// 연산 결과가 byte 범위를 벗어나므로 int형으로 취급되어
		// byte 타입 변수에 저장 불가능 => 이 때는 강제형변환 필요함
		
		//---------------------------------------------
		
		float f10 = 2.0f ,f11 = 1.1f;
		float f12 = f10 - f11;
		System.out.println(f12);
		
		double d10 = 2.0, d11 = 1.1;
		double d12 = d10 - d11;
		System.out.println(d12);
		
	}

}


public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 대입 연산자(=)
		 * - 우변의 피연산자 데이터를 좌변의 변수에 대입(저장)
		 * 
		 * 확장(복합)대입 연산자(+=, -=, *=, /=, %=)
		 * - 산술연산자와 대입연산자를 결합한 연산자
		 * - 두 피연산자의 산술 연산 결과를 좌변의 변수에 대입
		 */
		
		int a = 10;

		// a + 10의 연산 결과를 다시 변수 a에 저장
//		a = a + 10;	// 10 + 10 = 20
		// 확장대입연산자를 사용한 a + 10
		a += 10;
		System.out.println(a);
		
		// a - 10의 연산 결과를 다시 변수 a에 저장
//		a = a - 10;	// 20 - 10 = 10
		// 확장대입연산자를 사용한 a - 10
		a -= 10;
		System.out.println(a);
		
//		a = a * 10;	// 10 * 10 = 100
		// 확장대입연산자를 사용한 a * 10
		a *= 10;
		System.out.println(a);
		
//		a = a / 10;	// 100 / 10 = 10
		// 확장대입연산자를 사용한 a / 10
		a /= 10;
		System.out.println(a);
				
//		a = a % 10; // 10 % 10 = 0
		// 확장대입연산자를 사용한 a % 10
		a %= 10;
		System.out.println(a);
		
		System.out.println("---------------------------------------------");
		
		a = 10;
		int b = 10;
		
		// a 와 b를 더한 결과를 a 에 저장
		a += b;
		System.out.println(a);
		
		System.out.println("-----------------------------------------------");
		
		
		char ch = 'A';
//		ch = ch + 3; // 오류 발생 ! char + int = int 이므로 형변환 필수!
		ch = (char)(ch + 3);
		System.out.println(ch);
		
		//확장대입연산자를 사용하면 연산과정에서 자동형변환이 일어나지 않음
		ch += 3;	// 연산결과가 그대로 char이 되므로 형변환이 필요없음
		System.out.println(ch);
		

		
	}

}

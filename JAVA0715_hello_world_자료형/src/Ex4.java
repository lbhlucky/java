
public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 자바의 기본 데이터타입 8가지
		 * byte short int long float double char boolean
		 * 
		 * 1. 정수형
		 * - byte
		 * - short
		 * - int(기본형)
		 * - long
		 * 
		 * 2. 실수형
		 * - float
		 * - double(기본형)
		 * 
		 * 3. 문자형 - char
		 * 4. 논리형 - boolean
		 * 
		 * ---------------------------------------
		 * 상수(Literal, 리터럴)
		 * - 항상 같은 값을 같는 데이터
		 * - 실제 사용하는 데이터들을 리터럴이라고 함
		 *   (ex. 정수형 리터럴, 실수형 리터럴, 문자형 리터럴, 논리형 리터럴,
		 *        문자열형 리터럴)
		 */
		
		//기본 내장형 상수(리터럴)
		System.out.println(10); //정수형(int형) 데이터 10을 출력
		System.out.println(3.14); //실수형(double형) 데이터 3.14를 출력
		System.out.println('A'); //문자형(char형) 데이터 A를 출력
		System.out.println(true); //논리형(boolean형) 데이터 true 출력
		
		//확장형 상수(리터럴)
		//정수형 중에서 long 타입 데이터는 숫자 뒤에 접미사 L을 붙여서 사용
		System.out.println(100L); //정수형(long형) 데이터 100 출력
		// 접미사 L은 가급적 대문자 사용(소문자 l 은 숫자 1, 문자 ㅣ과 구별 안됨)
		
		//실수형 중에서 float타입 데이터는 숫자 뒤에 접미사F를 붙여서 사용
		System.out.println(1.5f); //실수형(float형) 데이터 1,5 출력
		// 접미사 F는 대 소문자 사용 가능
		
		// 큰 따옴표 사이에 1개 이상의 문자를 사용하느 경우 문자열이라고 함
		System.out.println("Hello, World!"); //문자열 데이터 " Hello, World! "출력
	}

}

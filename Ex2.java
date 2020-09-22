public class Ex2 {

	public static void main(String[] args) {
		/*
		 * java.lang String 클래스
		 * 
		 * - 다양한 생성자 및 메서드를 통해 문자열을 관리하는 클래스
		 * 
		 * - 문자열 생성하는 방법 2가지
		 *   1. new 연산자로 String 객체를 생성하여 문자열을 할당하는 방법
		 *      String str = new String("문자열");
		 * 
		 *   2. 리터럴을 사용하여 문자열을 할당하는 방법 (주로 사용하는 방법)
		 *      String str = "문자열";
		 *      => 상수 풀(Constant Pool)에 동일한 문자열이 존재할 경우
		 *         해당 문자열의 주소값만 리턴하므로, 메모리 낭비가 없음
		 * 
		 * - 문자열은 큰 따옴표("")를 사용하여 표기
		 * 
		 * - String 객체는 불변 객체이다!
		 *   => 문자열 변경시 기존에 저장된 문자열이 직접 변경되지 않고,
		 *      변경된 새로운 문자열을 다시 새로운 공간에 저장
		 *   => 문자열에 대한 조작이 빈번할 경우, 메모리 낭비가 커지므로
		 *      이 때는, StringBuilder 또는 StringBuffer 클래스를 활용해야한다
		 */
		
		// String 클래스를 사용하여 문자열을 생성하는 방법
		// 1. new 연산자로 String 객체를 생성하여 문자열을 할당하는 방법
		String str1 = new String("자바");
		String str2 = new String("자바");
		
		// str1 과 str2의 주소값
		// => new 연산자를 두 번 사용했으므로 주소값이 다르다!
		if(str1 == str2) {
			// 두 객체의 주소값 비교 : 동등비교연산자(==) 사용
			System.out.println("str1, str2 주소값이 같다!");
		} else {
			System.out.println("str1, str2 주소값이 다르다!");
		}
		
		// str1과 str2의 저장된 문자열 비교
		// => 객체가 달라도 문자열 내용이 같으므로 .equals() 비교 시 같다
		if(str1.equals(str2)) {
			System.out.println("str1, str2 문자열이 같다!");
		} else {
			System.out.println("str1, str2 문자열이 다르다!");
		}
				
		System.out.println("------------------------------------------------------------------------");
		
		// 2. 리터럴을 사용하여 문자열을 할당하는 방법 (주로 사용하는 방법)
		String str3 = "자바";
		String str4 = "자바";
		
		// str3 과 str4의 주소값
		// => 리터럴을 직접 할당할 경우 상수 풀(Constant Pool)에서 저장할 문자열이
		// 	  이미 존재하는지 판별한 후 존재하지 않으면 새로 생성하고,
		//	  존재할 경우 기존 문자열의 주소값만 리턴
		// => 즉, 동일한 문자열을 여러 변수에 할당해도 메모리 낭비가 없다!
		// => 따라서, 주소값이 같다!
		if(str3 == str4) {
			// 두 객체의 주소값 비교 : 동등비교연산자(==) 사용
			System.out.println("str1, str2 주소값이 같다!");
		} else {
			System.out.println("str1, str2 주소값이 다르다!");
		}
		
		// str3과 str4의 저장된 문자열 비교
		// => 객체가 달라도 문자열 내용이 같으므로 .equals() 비교 시 같다
		if(str3.equals(str4)) {
			System.out.println("str1, str2 문자열이 같다!");
		} else {
			System.out.println("str1, str2 문자열이 다르다!");
		}
				
		
	}

}






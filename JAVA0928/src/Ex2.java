public class Ex2 {

	public static void main(String[] args) {
		/*
		 * Character 클래스를 활용한 문자 처리
		 * - Character 클래스의 메서드를 활용하여
		 *   문자데이터에 대한 다양한 처리 가능
		 * - isxxx() 메서드를 활용하여 문자에 대한 판별을 수행하고
		 *   isxxx() 메서드를 활용하여 문자에 대한 변환을 수행할 수 있다.
		 */
		
		char ch = ' ';
		
		System.out.println("ch는 대문자인가?" +Character.isUpperCase(ch));
		System.out.println("ch는 소문자인가?" +Character.isLowerCase(ch));
		System.out.println("ch는 문자인가?" +Character.isLetter(ch));		// 한글 한자 등등 OtherLetter
		System.out.println("ch는 숫자인가?" +Character.isDigit(ch));
		
		System.out.println("ch는 공백문자 인가?" +Character.isSpace(ch));	// deprecated : 사용을 권하지 않음
		// => deprecated 처리된 메서드로 다른 메서드 제공 또는 보안상 사용 금지
		System.out.println("ch는 공백문자 인가?" +Character.isWhitespace(ch));
		
		System.out.println("===============================================================================");
		
		char ch2 = 'a';
		
		System.out.println(ch2+ "를 대문자로 변환 : " +Character.toUpperCase(ch2));
		
		ch2 = 'A';
		System.out.println(ch2+ "를 소문자로 변환 : " +Character.toLowerCase(ch2));
		
		
		
	}

}





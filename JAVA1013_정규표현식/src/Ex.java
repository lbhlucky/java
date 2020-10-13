import java.util.regex.Pattern;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 정규 표현식(Regular Expression = Regex)
		 * 
		 * - 패턴을 기반으로 특정 조건에 맞는 문자를 검색, 치환 등 수행
		 *   ex) 패스워드 복잡도(안정도) 검사, 전화번호 양식 검사 등
		 *   	 => Validation 체크(입력값 검증)
		 *   
		 * - 언어 등 도구와 관계없이 동일한 패턴을 사용
		 *   ex) 자바, 자바스크립트, SQL, 네트워크 프로그래밍(방화벽) 등
		 *
		 *  정규 표현식에 사용되는 클래스
		 * 
		 * - java.util.regex.Pattern, java.util.regex.Matcher
		 * 
		 * - Pattern 클래스는 정규표현식을 컴파일해서 관리
		 *   입력 문자열에 대한 전체 일치 여부 검사 등을 수행
		 *   => matches() 메서드 : 문자열이 정규표현식에 부합되는지 검사
		 * 
		 * - Mathcer 클래스는 패턴을 해석하고,
		 *   입력 문자열에 대한  부분 또는 전체 일치 여부 등 검사
		 */
		
		// 정규 표현식 작성
		// 1. 알파벳(대소문자) 2 ~ 4 글자
//		String regex = "^[a-zA-Z]{2,4}$";
//		String input = "abcde";
		
		// 2. 영문자 또는 숫자 또는 한글 4자리
		String regex = "^[a-zA-Z0-9가-힣]{4}$";
		String input = "aA0가";
		
		// Pattern 클래스의 static 메서드 matches()를 호출하여
		// 정규표현식 문자열과 검사할 문자열을 파라미터로 전달
		// => 해당 문자열이 정규표현식에 부합되는지를 boolean 타입으로 리턴
		boolean checkRegex = Pattern.matches(regex, input);
		System.out.println(input + "검사 결과 : " + checkRegex);
		
		
		
	}

}

















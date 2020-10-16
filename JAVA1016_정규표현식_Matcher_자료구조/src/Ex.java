import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex {

	public static void main(String[] args) {
		/*
		 * Matcher 클래스
		 * - 패턴을 해석하고, 입력 문자열에 대한 일치 여부 판별 기능 제공
		 * - 별도의 생정자가 없고, Pattern 클래스의 matcher() 메서드를 통해
		 *   Matcher 객체를 얻어와서 사용
		 * - Pattern 클래스는 문자열이 정규표현식 부합 여부만 판별하지만,
		 *   Matcher 클래스는 정규표현식 내용이 포함되는지 여부와 위치 등
		 *   좀 더 복잡한 판별을 수행 가능
		 */
		
		String sourceStr = "Java and Javascript has no relation";
		String regex = "Java";
		
		// Pattern.compile() 메서드는 정규표현식을 갖는 Pattern 객체 리턴
		Pattern pattern = Pattern.compile(regex);
		
		// Pattern 객체를 사용하여 matcher() 메서드를 호출하면
		// Matcher 타입 객체를 얻어올 수 있음
		// => 파라미터로 검사에 사용될 대상 문자열 전달
		Matcher matcher = pattern.matcher(sourceStr);
		// => 이미 Pattern 객체에 정규표현식이 포함되어 있으므로
		//    Matcher 객체는 정규표현식과 검사할 문자열을 모두 포함하게 됨
		
		// Matcher 객체와 여러 메서드를 호출하여 원본문자열에 대한
		// 정규표현식을 통해 여러 작업 수행 가능
		// 1. matches() : Pattern 클래스의 matches()_메서드와 동일한지 검사
		System.out.println("정규표현식과 완전히 일치하는가?" +matcher.matches());
		
		// 2. lookingAt() : 정규표현식 문자열로 시작하는지 검사
		System.out.println("정규표현식을 시작하는가?" +matcher.lookingAt());
		
		// 3, find() : 정규표현식을 포함하는지 검사
		System.out.println("정규표현식을 포함하는가?" +matcher.find());
		
		// 4. replaceAll() : 정규표현식에 일치하는 문자열을 모두 치환
		// => String 클래스의 replaceAll()과 기능 동일함
		System.out.println(matcher.replaceAll("자바"));
		
		// 5. replaceFirst() : 정규표현식에 일치하는 첫 문자열만 치환
		// => String 클래스의 replaceFirst()과 기능 동일함
		System.out.println(matcher.replaceFirst("자바"));
		
		//==============================================================================================
		
		// Pattern 객체 생성 -> Matcher 객체 리턴 -> 메서드 호출 작업을
		// 하나의 문장으로 결합할 경우
		System.out.println("정규표현식을 포함하는가?" +
						Pattern.compile(regex).matcher(sourceStr).find());
		
	}

}





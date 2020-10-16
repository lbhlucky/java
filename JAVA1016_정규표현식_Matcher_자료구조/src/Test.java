import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		/*
		 * 패스워드 복잡도(유효성) 검사(Validation Check)
		 * 
		 *  < 패스워드 작성 규칙 >
		 *  1. 영문자, 숫자, 특수문자만을 사용하여 8 ~ 16 자리 내로 작성
		 *     => 패스워드 길이 규칙을 위반하면 "사용불가능한 패스워드"
		 *  2. 영문 대문자, 소문자, 숫자, 특수문자(!@#$%) 중
		 *     4가지를 조합하면 "안전도 우수"
		 *     3가지를 조합하면 "안전도 보통"
		 *     2가지를 조합하면 "안전도 위험"
		 *     1가지만 사용하면 "사용불가능한 패스워드"
		 */
		
		// 유효성 체크를 위한 패스워드 목록
		String[] passwordArr = {
				"admin123!",
				"Admin123!",
				"admin123",
				"adminroot",
				"admin123패스워드",
				"1234",
				"aaaaaaaaaaaaa"
		};
		
		// Pattern 클래스를 활용한 패스워드 길이 체크
		// => 영문자, 숫자, 특수문자(!@#$%)만을 사용하여 8~16자리
		String lengthRegex="[0-9a-zA-Z!@#$%]{8,16}";

		// 각 규칙에 따른 복잡도 검사를 위한 정규표현식 작성
		String engUppperRegex = "[A-Z]";	// 영문 대문자
		String engLowerRegex = "[a-z]";		// 영문 소문자
		String numberRegex = "[0-9]";		// 숫자
		String specRegex = "[!@#$%]";		// 특수문자(!@#$%)
		
		for(String str : passwordArr) {
				boolean lengthResult = Pattern.matches(lengthRegex, str);
//				System.out.println(lengthResult);
				// => Pattern.matches() 메서드는 전체 문자열에 대한
				//	  정규표현식 일치 여부만 체크 가능하므로
				// 	  대문자, 소문자 등 각각의 조건을 만족하는지는 검사 불가능
				// => 따라서, Matcher 클래스를 활용하여 각 조건을 따로 판별 수행
				
			// if문으로 갈이 체크를 통과한 패스워드만 복잡도 체크 수행하고,
			// 아니면, "오류 - 패스워드 길이 : 8 ~ 16자리 필수1" 출력
			if(lengthResult) {
				// Pattern 객체의 compile() 메서드를 통해 정규표현식 등록 후
				// matcher() 메서드를 호출하여 Matcher 객체를 리턴받은 뒤
				// find() 메서드를 호출하여 각 조건(영문, 숫자, 특수문자)을 판별
				int count = 0;
				
				// 1.  if문 사용하는 경우 => else if 가 아닌 각각의 if문 사용
				// 		=> 각각의 조건을 따로 판별하기 위해
//				if(Pattern.compile(engUppperRegex).matcher(str).find()) {
//					count++;
//				}
//				
//				if(Pattern.compile(engLowerRegex).matcher(str).find()) {
//					count++;
//				}
//				if(Pattern.compile(numberRegex).matcher(str).find()) {
//					count++;
//				}
//				if(Pattern.compile(specRegex).matcher(str).find()) {
//					count++;
//				}
				
				// 2. 삼항연산자 사용하는 경우
				count += Pattern.compile(engUppperRegex).matcher(str).find()? 1 : 0;
				count += Pattern.compile(engLowerRegex).matcher(str).find()? 1 : 0;
				count += Pattern.compile(numberRegex).matcher(str).find()? 1 : 0;
				count += Pattern.compile(specRegex).matcher(str).find()? 1 : 0;
				
				
				switch (count) {
				case 1:
					System.out.println(str+" - 패스워드 사용 불가");
					break;
				case 2:
					System.out.println(str+" - 안전도 위험");
					break;
				case 3:
					System.out.println(str+" - 안전도 보통");
					break;
				case 4:
					System.out.println(str+" - 안전도 우수");
					break;
				}
			} else {
				System.out.println(str + " - 패스워드 길이 : 8 ~ 16자리 필수1");
			}
		}
		
		System.out.println("===============================================");
		/*
		 * 식별자 작성 규칙 검사
		 * 1. 첫글자에 숫자 사용 불가(영문자,특수문자$_만 사용가능)
		 * 2. 특수문자($, _)만 사용 가능
		 * 3. 대소문자 조합 가능, 한글 사용 가능
		 * 4. 공백문자 사용 불가
		 * 5. 길이 제한 없음(1글자 이상)
		 */
		
		String[] variables = {
				"num","7eleven","seven11","MAX_NUM","$my_money",
				"자바","my name", "myName", "abc@com"
		};
		
		String variableRegex = "^[a-zA-z$_][a-zA-z0-9가-힣$_]{0,}$";
		// => 영문자, 한글, 특수문자($ _) 중 한글자로 시작하고
		//	  두번째 글자부터 영문자, 한글, 숫자, 특수문자($ _)가 0번 이상 반복
		
		for(String str : variables) {
			boolean result = Pattern.compile(variableRegex).matcher(str).find();
			System.out.println(str + " : " + result);
		}
		
	}
}































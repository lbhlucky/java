import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		/*
		 * 정규표현식을 사용한 전화번호 양식 검증
		 * - 배열에 전화번호 4개를 저장
		 * - 저장된 각 번호를 정규표현식과 비교하여 규칙 일치 여부 체크
		 * - 양식 : xxx-yyy-zzzz, xxx yyyy zzzz 등
		 * 	  => 앞자리 숫자 3자리로 시작(010 또는 011)
		 * 	  => 가운데 자리는 숫자 3자리 또는 4자리
		 * 	  => 뒷자리는 숫자 4자리로 끝
		 * 	  => 단, 각 자리 사이에는 - 기호 또는 공백이 올 수도 있고 안 올 수도 있음
		 * 
		 * 검사할 전화번호 목록
		 * 1) 010-123-4567 = true
		 * 2) 01112345678 = true
		 * 3) 010)1234 5678 = false(소괄호 사용 불가)
		 * 4) 010 1234 567a = false(숫자 외에 사용 불가)
		 * 
		 */
		
		String[] numbers = {
								"010-123-4567",
								"01112345678",
								"010)12345678",
								"010 1234 567a"
							};
		
		// 주의! 자바에서 예외 문자 "\"기호를 문자열 내에서 표현할 경우
		//		 반드시 "\\" 형태로 사용해야한다! (ex. \\s, \\, \\d 등)
		String regex = "^(010|011)[-\\s]?\\d{3,4}[-\\s]?\\d{4}$";
//		String regex = "^(010|011)[-\\s]?[0-9]{3,4}[-\\s]?[0-9]{4}$";
		/*
		 * ^(010|011) : 010 또는 011 로 시작
		 * [-\\s]? : - 와 공백이 올 수도 안 올 수도 있음
		 * \\d{3,4} : 0 ~ 9 까지의 숫자 3 ~ 4 자리
		 * [-\\s]? : - 와 공백이 올 수도 안 올 수도 있음
		 * \\d{4}$ : 0 ~ 9 까지의 숫자 4자리로 끝
		 */
		
		for(String str : numbers) {	// String 배열의 각 인덱스에 접근
			
			boolean numberCheck = Pattern.matches(regex, str); // 각 인덱스와 조건을 검사 후 numberCheck에 저장
			
			System.out.println(str+  "의 검사 결과 : " +numberCheck);	// numberCheck 결과 출력
		}

		System.out.println("----------------------------------");
		
		for(int i = 0 ; i < numbers.length ; i ++) {
			
			boolean numberCheck = Pattern.matches(regex, numbers[i]);
			
			System.out.println(numbers[i]+  "의 검사 결과 : " +numberCheck);
		}
		
		
		
		

		
	}

}

















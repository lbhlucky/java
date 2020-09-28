import java.io.CharConversionException;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * char[] 배열에 저장된 문자들을 각 타입에 따라 분류하기
		 * => 배열에 저장된 문자들에 따라 각각 다음과 같이 분류
		 *    대문자, 소문자, 숫자, 공백문자, 기타문자, 특수문자
		 */
		
		char[] chArr = {'A', 'r', '3', ' ', '#', '가'};
		
		// 향상된 for문 사용
		for(char a : chArr) {
			if(Character.isUpperCase(a)) {
				System.out.println(a+" 는 대문자이다");
			} else if(Character.isLowerCase(a)) {
				System.out.println(a+" 는 소문자이다");
			} else if(Character.isLetter(a)) {
				System.out.println(a+" 는 기타문자이다");
			} else if(Character.isDigit(a)) {
				System.out.println(a+" 는 숫자이다");
			} else if(Character.isWhitespace(a)) {
				System.out.println(a+" 는 공백문자이다");
			} else {
				System.out.println(a+" 는 특수문자이다");
			}
		}
		
		System.out.println();
		
		// 일반 for문 사용
		for(int c = 0; c <chArr.length ; c++) {	
			if(Character.isUpperCase(chArr[c])) {
				System.out.println(chArr[c]+" 는 대문자이다");
			} else if(Character.isLowerCase(chArr[c])) {
				System.out.println(chArr[c]+" 는 소문자이다");
			} else if(Character.isLetter(chArr[c])) {
				System.out.println(chArr[c]+" 는 기타문자이다");
			} else if(Character.isDigit(chArr[c])) {
				System.out.println(chArr[c]+" 는 숫자이다");
			} else if(Character.isWhitespace(chArr[c])) {
				System.out.println(chArr[c]+" 는 공백문자이다");
			} else {
				System.out.println(chArr[c]+" 는 특수문자이다");
			}
		}
		
		System.out.println("-----------------------------------------------------------------------------------");
		// String 문자열 char배열로 변환
		/*
		 * 입력받은 패스워드 복잡도(유효성)체크
		 * - 입력받은 패스워드를 char[] 타입으로 변환
		 * - 해당 배열 내의 각 문자를 판별하여 해당 되는 항목당 점수 증가
		 *   대문자	소문자	숫자	특수문자 항목당 +1점
		 *   => 단, 중복 항목에 대한 점수는 1점만 증가
		 *   -> 단, 전체 길이가 8자 미만이면 '8자 이상 필수' 출력 후 종료
		 * - 점수가 4점이면 패스워드 xxx : 사용 가능(안전) 출력
		 *          2~3점이면 패스워드 xxx : 사용가능(보통) 출력
		 *          1점이하면 패스워드 xxx : 사용불가 출력
		 */
		String password = "Abcd123!";
		
		char[] chPassword = password.toCharArray();
		
		// 패스워드 복잡도(유효성) 체크를 위한 점수를 저장하기 위한 변수
		int safetyPoint = 0;
		if(chPassword.length > 7) {
			
			for(char ch : chPassword) {
				if(Character.isUpperCase(ch)) {
					safetyPoint++;
				} else if(Character.isLowerCase(ch)) {
					safetyPoint++;
				} else if(Character.isLetter(ch)) {
					safetyPoint++;
				} else if(Character.isDigit(ch)) {
					safetyPoint++;
				} else if(Character.isWhitespace(ch)) {
					System.out.println("공백사용 불가");
					break;
				} else {
					safetyPoint++;
				}
			}
			
			if(safetyPoint == 4) {
				System.out.println("패스워드 : " +password+"사용가능(안전)");
			} else if(safetyPoint == 2 && safetyPoint ==3) {
				System.out.println("패스워드 : " +password+"사용가능(보통)");
			} else {
				System.out.println("패스워드 : " +password+"사용불가!");
			}
		} else {
			System.out.println("패스워드 8자 이상 필수!");
		}
		
	}

}

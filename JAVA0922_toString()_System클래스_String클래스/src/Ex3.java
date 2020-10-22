public class Ex3 {

	public static void main(String[] args) {
		/*
		 *  String 클래스의 다양한 메서드
		 */
		
		String s1 = "Java Programming!";
		String s2 = "       아이티윌       부산   교육센터       ";
		String s3 = "김태희/전지현/송혜교";
		
		// int length() : 문자열 길이 리턴
		System.out.println("s1.length() : " + s1.length());	// 공백을 포함한 문자열 전체 길이
		
		// boolean equals(Object obj) : 문자열 비교
		System.out.println("s1과 Java Programming는 같은 문자열인가 ? " +s1.equals("JAVA PROGRAMMING!"));
		
		// boolean equalsignoreCase(Object obj) : 문자열 비교(대소문자 구별 없음) => 로그인시 아이디 비교시 자주 사용
		System.out.println("s1과 Java Programming는 같은 문자열인가 ? " +s1.equalsIgnoreCase("JAVA PROGRAMMING!"));
		
		// char charAt(int index) : 인덱스(index) 위치의 문자 1개 리턴
		// => 인덱스 번호는 자동으로 부여되며, 0 ~ 문자열길이-1 까지 사용
		System.out.println("s1의 5번 인덱스 문자 : " +s1.charAt(5));
//		System.out.println("s1의 5번 인덱스 문자 : " +s1.charAt(17));	// 예외발생!
		// => 배열과 마찬가지로 존재하지 않는 인덱스일 경우
		//    StringindexOutOfBoundsException 발생함!
		
		// int indexOf(String str) : 특정 문자 또는 문자열의 인덱스 리턴
		// => 만약, 찾는 문자열이 없을 경우 -1 리턴
		// => 문자열의 처음(앞)에서 부터 탐색(정방향 탐색)
		System.out.println("s1의 문자열에 Program의 인덱스는 ? " +s1.indexOf("Program"));
		System.out.println("s1의 문자열에 Program의 인덱스는?" +s1.indexOf("program"));	// 없으면 -1
		
		// char 타입으로도 파라미터 전달가능(문자 1개)
		System.out.println("s1 문자열에 a가 존재하는가? " +s1.indexOf('a'));
		
		// int lastIndexOf(String str)
		// => 문자열의 마지막(뒤)부터 탐색(역방향 탐색) = 인덱스 번호는 동일
		System.out.println("s1 문자열에 a가 존재하는가? " +s1.lastIndexOf('a'));	// 원래는 -> last붙이면 <- 이 방향
		
		// boolean contains(CharSequence s) : 문자열 존재(포함) 여부 리턴
		System.out.println("s1 문자열에 Program이 존재하는가? " +s1.contains("Program"));
		System.out.println("s1 문자열에 JSP이 존재하는가? " +s1.contains("JSP"));
		
		// String replace(char, char) 또는 replace(String, String)
		// => 문자 또는 문자열 치환
		System.out.println("s1 문자열의 a를 @으로 치환 : " +s1.replace('a', '@'));
		System.out.println("s1 문자열의 Java를 JSP으로 치환 : " +s1.replace("Java", "JSP"));
		
		// substring() : 부분 문자열 추출
		// substring(int beginIndex) : beginIndex 부터 끝까지 추출
		System.out.println("s1의 5번 인덱스부터 끝까지 추출 : " +s1.substring(5));
		//substring(int beginIndex, int endIndex) : beginIndex - endIndex-1 까지 추출
		System.out.println("s1의 5번 인덱스부터 끝까지 추출 : " +s1.substring(5, 12));
		
		System.out.println("------------------------------------------------------------------------------");
		
		// toUpperCase() : 영문자를 모두 대문자로 변환
		System.out.println("s1.toUpperCase() : " +s1.toUpperCase());
		
		// toLowerCase() : 영문자를 모두 소문자로 변환
		System.out.println("s1.toLowerCase() : " +s1.toLowerCase());
		
		// concat() : 문자열을 결합하는 메서드 --> '+'연산자로 결합하는 것보다 연산 속도가 빠름
		System.out.println("s1.concat() : " +s1.concat(" ITWILL") );
		
		// trim() : 불필요한 앞뒤 공백들을 제거
		System.out.println("s2.trim() : " +s2.trim()+"!");
		
		// valueOf() : 기본 데이터 타입 데이터를 문자열로 변환!
		String str = String.valueOf(20);
		
		// toString은 기본 데이터 타입이 아닌 객체 타입에서 사용
		// String str = num.toString();	// 기본 타입 변수는 메서드 호출 불가
//		String str = num +"";	// 기본 데이터타입 -> 문자열 변환(널스트링 결합)
		
		// String[] split(String regex)
		// => 구분자(분리자 = Delimeter)를 사용하여 문자열 분리
		// => 구분자는 정규표현식 문법을 사용
		String[] tokens = s3.split("/");
		// => 슬래시 기호(/)를 기준으로 문자열 분리하여 String[] 배열에 저장
		// => 주의! 마침표(.)를 기준으로 지정하려면 "\\." 형태로 지정
		for(int i = 0 ; i <tokens.length ; i++) {
			System.out.println(tokens[i]);
		}	// 일반 for문
		
		for(String token : tokens) {
			System.out.println(token);
		}	// 향상된 for문
		
		
		System.out.println("====================================================================");
		
		// String 클래스는 불변 클래스이므로
		// 어떤 작업을 수행하더라도 원본 문자열은 변하지 않는다.
		// => 작업 결과가 대부분 새로운 문자열(String 타입)로 생성됨
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		// String 클래스의 리턴타입이 String 타입인 경우
		// 결과값에 이어서 바로 다른 메서드 호출 가능
		// = 빌더 패턴(Builder Pattern)와 비슷하다.
		System.out.println(s2.trim().indexOf("아이티윌"));
		// => trim() 메서드로 공백을 제거한 뒤, 바로 "아이티윌"을 검색하여
		//    0번 인덱스 리턴(꽁백이 제거됐으므로 아이티윌은 0번 인덱스부터 시작)
		System.out.println(s2.trim().indexOf("부산"));
		System.out.println(s2.trim().indexOf("교육센터"));
		
		
	}

}
























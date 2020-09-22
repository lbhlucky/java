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
		
	}

}
























import java.util.StringTokenizer;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * StringTokenizer 클래스
		 * - 특정 문자열을 구분자(Delimeter)를 통해 파싱하는 클래스
		 * 
		 * - 분리된 각각의 문자열을 토큰(Token)이라고 하며,
		 *   각각의 토큰들이 StringTokenizer 객체에 저장됨
		 *   => 이 때, 분리할 때 사용되는 문자열을 구분자(분리자)라고 함
		 *   
		 * - 파싱된 문자열에 접근하기 위한 메서드가 제공됨
		 * 
		 * - String 클래스의 split() 메서드와 기능적으로 유사함
		 *   => String형의 char 배열에 저장
		 */
		
		String str = "김태희/송혜교/전지현";
		
		// 1. String 클래스의 split()메서드를 사용하여 문자열 분리
		String[] strArr = str.split("/");
		
		for(String s : strArr) {
			
			System.out.println(s);
			
		}
		
		// 2. StringTokenizer 클래스를 사용하여 문자열 분리
		//	  => 분리를 위해 사용되는 문자를 구분자(분리자)라고 함
		StringTokenizer st = new StringTokenizer(str, "/");
		// 분리된 문자열은 StringTokenizer 객체에 저장되어 있음
		// => 객체내의 문자열에 접근하기 위해서는
		// 2-1 분리된 토큰 갯수 : countTokens()
		System.out.println("분리된 토근 캣수 : " +st.countTokens());
		// 2-2 StringTokenizer 객체에 분리된 토큰 존재 여부 확인
		//	   hasMoreTokens() = > 주로 while()문 내에서 사용
		while(st.hasMoreTokens()) {
			// 2-3 StringTokenizer 객체에 분리된 토큰 1개 꺼내기
			//     -> nextToken()
			String token = st.nextToken();
			System.out.println("토큰 : "+token);
		}
		
		System.out.println("=========================================================================");
		
		// 만약, Delimeter가 2종류 이상일 때
		String str2 = "자바&JSP/HTML5&CSS3.안드로이드";
		// => &기호와 /기호를 모두 Delimeter로 지정해서 분리할 경우
		//    문자열로 모든 Delimeter를 결합하면 하나씩 모두 구분자로 사용
		//	  이 때, 구분자 각각의 순서는 무관함
		// => String 클래스의 split() 메서드와 달리 마침표(.)도 사용 가능
		StringTokenizer st1 = new StringTokenizer(str2, "&./");
		
		while (st1.hasMoreTokens()) {
			
			String token1 = st1.nextToken();
			System.out.println(token1);
			
		}
		

		
		
	}

}
















public class Ex {

	public static void main(String[] args) {
		/*
		 * StringBuilder 클래스와 StringBuffer 클래스
		 * - java.lang 패키지에 위치
		 * 
		 * - String 클래스와 마찬가지로 문자열을 처리하는 클래스
		 * 
		 * - String 클래스는 문자열 변경 시 새로운 공간에 저장되지만
		 *   StirngBuilder 클래스 또는 StringBuffer 클래스는
		 *   버퍼라는 공간을 사용하여 문자열을 저장한 뒤
		 *   해당 버퍼에서 문자열을 직접 변경하므로
		 *   문자열 변경 시 메모리 낭비가 적어서, [문자열]조작이 빈번할 경우 유리함
		 * 
		 * - 문자열 생성할 때, String 클래스와 달리 무조건 new 연산자를 사용해야 함
		 * 
		 * - StringBuilder클래스와 StringBuffer 클래스는 기본적인 사용법은 거의 동일하며,
		 *   내부 구조에 따른 차이만 존재한다.(Thread 지원 유무에 따른 차이)
		 *   
		 * - String과 StringBuffer(StringBuilder)는 상속관계가 없으므로  
		 *   String -> StringBuffer(StringBuilder)로 변환 시
		 *   생성자에 문자열을 전달하여 변환하고,
		 *   StringBuffer(StringBuilder) -> String으로 변환시
		 *   toString() 메서드를 호출하여 변환
		 *   
		 *   ※ 문자열 결합시 연산 처리 속도
		 *      append() > concat() > "+"연산자
		 *   
		 */
		
		// StringBuffer(String str) : 문자열 str을 사용하여 객체 생성
//		StringBuffer sb = new StringBuffer("ITWILL");
		
		// StringBuffer() : 아무런 문자열을 갖지 않는 객체 생성
		StringBuffer sb = new StringBuffer();
		
		System.out.println("버퍼 크기 : " +sb.capacity());
		
		// append() 메서드를 사용하여 버퍼에 데이터 추가 가능
		// => 문자열 뿐만 아니라 거의 모든 데이터를 문자열로 변환하여 추가 가능
//		sb.append("정수 : ");
		sb.append(10);			// 정수도 문자열 결합을 통해 추가됨
		sb.append(20);
		// toString() 메서드가 오버라이딩되어 있으므로 저장된 문자열을
		// 문자열로 쉽게 변환하여 출력 가능
		System.out.println(sb.toString());	
		System.out.println(sb);	// 출력문에서는 .toString() 생략가능
		
		// insert() 메서드를 사용하여 원하는 위치에 문자열 삽입 가능
		// => append() 메서드는 문자열의 맨 뒤에 추가
		//    insert() 메서드는 원하는 위치에 끼워넣음
		sb.insert(2, "+");
		System.out.println("저장된 문자열 : " +sb);
		
		// 리턴타입이 항상 자기 자신일 때
		// 빌더 패턴(Builder Pattern을 활용하여 메서드 결과를 다시
		// 메서드 호출용으로 사용 가능 = 메서드의 연쇄적 호출 가능
		sb.append("+").append(30).append("+").append(40);
		System.out.println("저장된 문자열 : " +sb);
		
		sb.append("+").append(30).append("+").append(40);
		System.out.println("저장된 문자열 : " +sb);
		
		System.out.println("버퍼 크기 : " +sb.capacity());	// 일정크기가 넘어가면 자동적으로 용량 증가함
		
//		sb.delete(start, end) 메서드를 사용하여 원하는 범위의 문자열 삭제 가능
//	    => 시작 인덱스 - (끝인덱스 -1) 까지 삭제
		sb.delete(0, 3);
		System.out.println("저장된 문자열 : " +sb);
		
//		sb.indexOf(str);
		// reverse() : 문자열 반전
		sb.reverse();
		System.out.println("저장된 문자열 : " +sb);
		
		//ex.)만약, String 타입을 사용하여 문자열을 반전시킬 경우
		String str = "Hello";
		String str2 = "";	// 역순을 문자열을 저장할 변수
		for(int i = str.length()-1 ; i >= 0 ; i--) {
			str2 += str.charAt(i);
		}
		System.out.println(str + ", " +str2);
		
		// -----------------------------------------------------------------
		
		// String 타입 문자열을 수정을 위해 StringBuffer로 변환할 때
		StringBuffer sb2 = new StringBuffer(str2);
		System.out.println(sb2);
		// 만약, 문자열 조작이 끝난 후 String 타입으로 다시 변환할 경우
//		str2 = sb2;		// String 과 StringBuffer는 상속관계가 아니므로 오류 발생!
		str2 = sb2.toString();
		System.out.println(str2);


	}	// main() 메서드 끝

}	// Ex 클래스 끝








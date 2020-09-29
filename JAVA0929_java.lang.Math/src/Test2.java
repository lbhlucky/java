import java.text.DecimalFormat;

public class Test2 {

	public static void main(String[] args) {
//		for(int i = 0 ; i < 100; i++) {
//		switch (test.length()) {
//		case 1:
//			System.out.println("000" +test);
//			break;
//		case 2:
//			System.out.println("00" +test);
//			break;
//		case 3:
//			System.out.println("0" +test);
//			break;
//		default:
//			System.out.println(test);
//			break;
//			}
//		}
		
		// DecimalFormat 클래스(형식화 클래스)를 활용하여
		// 수치 데이터에 대한 형식을 지정한 뒤 문자열로 지정한 뒤 문자열로 리턴받아 사용하는 방법
		// 1. DecimalFormat 클래스 인스턴스 생성 시 형식 문자열 지정
		DecimalFormat df = new DecimalFormat("000000");	// 0 or # 가능
		// => 정수 4자리 형식 지정(단, 빈 자리는 0으로  지정)
		//    만약, 0 대신 # 사용 시 빈 자리는 0으로 채우지않고 비워둠
		// 2. 형식 지정문자열을 사용한 DecimalFormat 객체의
		//	  format() 메서드를 호출하여 변환하려는 정수 전달
		// 	  => 형식을 적용한 문자열이 리턴됨
		for(int i = 0; i<10; i++) {
		int num = ((int)(Math.random()*1e6));
		
		String test = df.format(num);
		
		System.out.println("인증 코드 : " +test);
		
		}
		
	}

}

public class Ex8 {

	public static void main(String[] args) {
		/*
		 * throw 키워드
		 * 
		 * - 개발자가 직접 예외를 발생 시킬 때 사용
		 * 
		 * - 자바 문법에서 위반되지 않는 코드라도 강제로 예외 발생 가능
		 * 
		 * - 예외를 발생시킬 위치에 throw 키워드 뒤에 발생시킬 예외 클래스의
		 *   객체를 생성하여 강제로 예외를 발생시켜 던점
		 */
		// 점수(0~100) 입력하여 전달
		// 만약, 예외를 강제로 발생시킨 후 throws를 사용하여 위임할 경우
		// 현재 호출한 곳에서 try-catch문을 통해 예외 처리를 수행
		try {
			score(150);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}try {
			score2(150);
		} catch (InvalidScoreException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료!");
		
		
	}
	
	public static void score(int score) throws Exception {
		// int 형 파라미터에 정수 150이 전달될 경우 문법적으로는 맞지만
		// 점수 범위(0~100) 기준으로 논리적으로 맞지 않은 값이 전달됨
		// 따라서, 이 때 개발자가 직접 강제로 예외를 발생시킬 수 있다!
		
		if(score >= 0 && score <= 100) {
			System.out.println("학점 계산!");
		} else {
//			System.out.println(score + "점수 입력 오류!");
			
//			try {
//				// 강제로 예외를 발생시키기 위해 throw 키워드 사용
//				// => throw 키워드 뒤에 예외 발생 클래스 객체 생성
//				//	  이 때, 파라미터로 예외 메세지 문자열을 전달 가능
//				throw new Exception(score + " : 점수 입력 예외 발생!");
//				// try-catch 를 통해 예외 처리 또는 throws를 통해 예외 위임
//			} catch (Exception e) {
//				// 예외 처리 시 전달받은 객체의 메서드를 통해 예외 정보 확인
//				// 1. e.getMessage() : 예외 객체의 메세지 정보를 문자열로 리턴
////				System.out.println(e.getMessage());
//				
//				// 2. e.printStackTrace() : 예외 클래스명, 메세지, 발생위치 등
//				//	  						예외에 대한 상세 정보를 출력
//				e.printStackTrace();
//			}
			
			// 외부로 예외를 떠넘길 경우
			throw new Exception(score + " : 점수 입력 예외 발생!");
			
		}
		
	}
	
	public static void score2(int score) throws InvalidScoreException {
		// 사용자 정의 예외 클래스를 사용하여 강제로 예외 발생시키기
		if(score < 0 || score > 100) {
			throw new InvalidScoreException(score + " : 점수 입력 예외 발생!");
		}
	}

}

/*
 * 사용자 정의 예외 클래스
 * - 기존에 자바 API에서 제공되는 예외가 아닌
 *   개발자가 직접 예외 클래스를 작성하는 경우
 *   Exception 클래스를 상속받는 클래스를 정의하여 예외 관련 코드를 기술
 */
class InvalidScoreException extends Exception {
	// 1. 생성자를 정의하여 예외 메세지를 전달받을 수 있는 
	//	  String 타입 파라미터 1개를 갖는 메서드 오버라이딩
	//	단축키 : Alt + Shift + S >> C
	public InvalidScoreException(String message) {
		// 전달받은 메세지를 Exception 클래스의 생성자에서 초기화 수행
		super(message);
	}
	
	
}

















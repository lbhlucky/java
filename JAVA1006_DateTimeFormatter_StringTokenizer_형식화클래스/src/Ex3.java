import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex3 {

	public static void main(String[] args) throws ParseException {
		/*
		 * 형식화 클래스
		 * 1. SimpleDateFormat 클래스
		 * 	  - 날짜/시간 정보에 대한 패턴을 사용하여 문자열로 파싱/포맷팅 처리
		 * 
		 *    - 파싱 : 문자열을 Date 타입으로 변환 => parse() 메서드 사용
		 *      포맷팅 : Date 타입을 문자열로 변환 => format()메서드 사용
		 *      
		 * 2. DecimalFormat 클래스
		 *    - 숫자에 대한 패턴을 사용하여 파싱/포맷팅 처리
		 *    
		 *    - 메서드는 SimpleDateFormat클래스와 동일
		 *    
		 *    - 형식 지정 문자(패턴)만 다름
		 *      0 : 0 ~ 9 사이 숫자 1자리(값이 없으면 0으로 채움)
		 *      # : 0과 동일하나 값이 없으면 0으로 채우지 않음
		 *      , : 천 단위 구분 기호
		 *      
		 * 3. MessageFormat 클래스
		 *    - 
		 */
		
		// 1. SimpleDateFormat 클래스
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E a KK:mm:ss");
		// 지정된 형식에 맞게 Date 타입을 문자열로 변환 = 포맷팅
		String strDate = sdf.format(d);
		System.out.println(strDate);
		
		// 지정된 형식에 맞게 문자열을 Date타입으로 변환 = 파싱
		Date parsedDate = sdf.parse(strDate);		
		System.out.println(parsedDate);
		
		System.out.println("=======================================================================");
		
		// 2. DecimalFormat 클래스
		double originalNum = 123.55;
		
		// DecimalFormat 클래스의 객체 생성 시 형식 지정문자(패턴) 설정
		DecimalFormat df = new DecimalFormat("￦#,###.#");
//		DecimalFormat df = new DecimalFormat("￦0,000.0");

		// => 맨 앞에 통화기호 뒤에 정수 4자리와 실수 1자리
		//    정수는 3자리마다 콤마(,) 실수는 1자리로 표기
		String formatNum = df.format(originalNum);
		System.out.println(formatNum);
		
		// 문자열로 된 숫자를 형식에 맞게 읽어들여 수치데이터타입으로 파싱
		// => 리턴타입이 Number 타입이므로 알맞은 데이터타입으로 형변환 필요
		double parsedNum = (double)df.parse(formatNum);
		System.out.println(parsedNum);
		
		System.out.println("=======================================================================");
		
		// 3. MessageFormat 클래스
		// 특정 패턴을 사용하여 데이터 변수처럼 지정한 후 연결에 사용
		// "이름 : 홍길동, Java : 90, JSP : 100, DB : 80"
		// "이름 : 이순신, Java : 50, JSP : 50, DB : 50"
		// "이름 : 강감찬, Java : 80, JSP : 70, DB : 100"
		
		String name = "홍길동";
		int java = 90, jsp = 100, db = 80;
		
		// 메세지 패턴 생성 => 패턴에 포함될 데이터가 들어갈 자리를
		// 중괄호{}로 지정하고, 중괄호 안에 패턴 데이터 번호(0부터) 지정
		String pattern = "이름 : {0}, Java : {1}, JSP : {2}, DB : {3}";
		// => 패턴 문자열 내부에 데이터가 들어갈 부분이 4군데
		
		String parsedStr = MessageFormat.format(pattern, name, java, jsp, db);
		System.out.println(parsedStr);
		
		System.out.println("-------------------------------------------------------------------------");
		
		String originStr = "홍길동:90:100:80,이순신:50:50:50,강감찬:80:70:100 ";
		
		
		String[] strArr = originStr.split(",");
		for(String s : strArr) {
//			System.out.println(s);
			System.out.println(MessageFormat.format(pattern, s.split(":")));
		}
		
	}

}














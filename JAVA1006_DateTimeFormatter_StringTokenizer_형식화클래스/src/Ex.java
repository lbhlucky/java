import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex {

	public static void main(String[] args) {
		/*
		 * 포맷팅(Formatting)
		 * - 특정 객체를 원하는 형식의 문자열로 변환
		 * 
		 * 파싱(Parsing)
		 * - 문자열을 객체로 변환
		 */
		
		// 문자열로 된 날짜를 LocalDate 객체로 변환(파싱 = Parsing)
		String strDate = "2020-10-06";	// "연도-월-일" 형식으로 반드시 해야함!
		LocalDate date1 = LocalDate.parse(strDate);
		System.out.println(date1);
		
		String strTime = "09:18:30";	//"시:분:초" 형식만으로 지정
		LocalTime time1 = LocalTime.parse(strTime);
		System.out.println(time1);

		System.out.println("----------------------------------------------------------------------------");
	
		/*
		 * DateTimeFormatter 클래스
		 * - 날짜 및 시간에 대한 형식 지정 클래스
		 * 
		 * - 사용자가 특정 형식을 지정하여 해당 형식에 맞게 문자열을 읽어옴
		 * 
		 * - 형식 지정문자는 SimpleDateFormat 클래스의 형식 문자와 동일 
		 */
		
		// 주의! 기본 형식에 맞지 않은 문자열을 파싱할 경우 오류 발생!
//		String strDate2 = "2020-10-06(화)";	// "연도-월-일" 형식으로 반드시 해야함!
//		LocalDate date2 = LocalDate.parse(strDate2);
		// =>java.time.format.DateTimeParseException 예외 발생!
//		System.out.println(date2);
		
		String strDate2 = "2020-10-06(화)";	// "연도-월-일" 형식으로 반드시 해야함!
		// 연도 4자리 : yyyy
		// 월 2자리 : MM (1~9월의 경우 01~09로 표기해야함)
		//			  만약, 0을 제외하고 싶으면 M을 한 글자만 표기
		// 일 2자리 : dd (1~9일의 경우 01~09로 표기해야함)
		//		 	  만약, 0을 제외하고 싶으면 d를 한 글자만 표기
		// 요일 1자리 : E (요일 3자리(ex. 화요일) : EEEE)
		String pattern = "yyyy-MM-dd(E)";
		// 지정된 형식문자열을 DateTimeFormatter의 ofPattern() 메서드에 전달
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		// LocalDate.parse() 메서드의 파라미터로 날짜와 패턴을 전달
		
		LocalDate date2 = LocalDate.parse(strDate2, dtf);
		System.out.println(date2);
		System.out.println(date2.getDayOfWeek());
		
		System.out.println("----------------------------------------------------------------------------");
		
		String strTime2 = "오전 09:18:30";	//"시:분:초" 형식만으로 지정
		// 시간 2자리 : HH(0 ~ 23시) 또는 KK(0 ~ 11시)
		// 분 2자리 : mm
		// 초 2자리 : ss
		// 초 2자리 : ss
		// => 시, 분, 초 2자리 표기를 위해 1자리 단위는 0 필요
		//    만약, 한자리에서 0을 제외할 경우 H 또는 K 등 한 글자 사용
		// 오전/오후 표기 : a
		String pattern2 = "a KK:mm:ss";
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern(pattern2);
		
		LocalTime time2 = LocalTime.parse(strTime2, dtf2);
		System.out.println(time2);

		System.out.println("----------------------------------------------------------------------------");
		
		String strDateTime = "2020년 10월 6일 화요일 오전 09시 38분 10초";
		
		String pattern3 = "yyyy년 MM월 d일 EEEE a KK시 mm분 ss초";
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern(pattern3);
		LocalDateTime dateTime1 = LocalDateTime.parse(strDateTime, dtf3);
		System.out.println(dateTime1);
		
	}

}















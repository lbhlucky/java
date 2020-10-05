import java.io.ObjectInputStream.GetField;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.text.AbstractDocument.BranchElement;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * Calendar 클래스
		 * - 날짜 및 시각 정보를 관리하는 클래스
		 * 
		 * - 추상클래스이므로 인스턴스 생성이 불가능하며
		 *   static 메서드인 getInstance() 메서드로 객체 리턴받아 사용
		 *   
		 * - get() 메서드 : Calendar 객체로부터 정보 가져오기
		 *   => 파라미터로 Calendar.XXX 상수를 사용하여 가져올 정보 지정
		 *      ex) get(Calendar.YEAR) = 연도 정보 리턴
		 *      
		 * - set() 메서드 : Calendar 객체의 정보 설정
		 *       
		 */
		
		// 객체 생성 대신 시스템으로부터 생성된 객체 정보 가져오기
		Calendar now = Calendar.getInstance();
		
		//get() 메서드를 호출하여 해당 정보 가져오기
		// Calendar.XXX 상수를 파라미터로 전달하여 정보의 종류 지정
		
		int year = now.get(Calendar.YEAR);			// 년도
		int month = now.get(Calendar.MONTH)+1;		// 월(0 ~ 11) => +1 필요
		int day = now.get(Calendar.DAY_OF_MONTH);	// 일
		
		int week = now.get(Calendar.DAY_OF_WEEK);	// 요일
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		default:
			System.out.println("ERROR");
		}
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.println(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
		
		System.out.println("=============================================================================");
		// =========================================================================================
//		Date d = new Date();	// Date 객체 생성
		Calendar cal2 = Calendar.getInstance();
		
		// Calendar 객체의 set() 메서드를 호출하면 날짜 및 시간 설정 가능
		// 1. set(필드명, 값) 
		// 	  => 필드명에 해당하는 정보를 전달받은 값으로 설정(변경)
		cal2.set(Calendar.YEAR, 2000);
		System.out.println(cal2.get(cal2.YEAR));
		
		// 2. set(년, 월, 일, 시, 분, 초) => 해당값으로 날짜 및 시간 변경
		cal2.set(1999, 11, 31, 23, 59, 59);
		
		// Calendar 객체 => Date 객체로 변환 후 날짜 및 시각 정보 출력
		Date d = cal2.getTime();	// Calendar 객체로부터 Date 객체 얻어오기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE hh시 mm분 ss초0");
		
		// SimpleDateFormat 클래스를 활용하여
		// XXXX년 XX월 XX일 X요일 XX시 XX분 XX초 형식으로 출력
		System.out.println(sdf.format(d));
	
		Date d0 = new Date(124, 4, 8, 10, 30);

		SimpleDateFormat sdf0 = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE hh시 mm분");

		System.out.println(sdf0.format(d0));

		//---------------------------------------------

		Calendar cal4 = Calendar.getInstance();

		cal4.set(2024, 4, 8, 10, 30);

		Date d4 = cal4.getTime();

		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy년 MM월 dd일 EEEE hh시 mm분");

		System.out.println(sdf4.format(d4));

		
		
	}

}









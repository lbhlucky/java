public class Test3 {

	public static void main(String[] args) {
		
		// charAt() 메서드 연습
		// 입력받은 주민번호(jumin)에 대한 성별 판별
		// => 뒷자리 첫번째 숫자가 1 또는 3이면 "남성!" 출력
		//                         2 또는 4이면 "여성!" 출력
		String jumin = "901010-1234567";
		
		// 1. 리턴되는 데이터를 직접 비교
		if(jumin.charAt(7) == '1' || jumin.charAt(7) == '3' ) {
			System.out.println("남성!");
		} else if (jumin.charAt(7) == '2' || jumin.charAt(7) == '4'  ) {
			System.out.println("여성");
		} else {
			System.out.println("자웅동체입니다");
		}
		
		// 2. char 타입으로 리턴받아 비교도 가능
//		char genderNum = jumin.charAt(7);
//		if(genderNum == '1' || genderNum == '3') {
//			System.out.println("남성!");
//		} else if(genderNum == '2' || genderNum == '4') {
//			System.out.println("여성!");
//		} else {
//			System.out.println("자웅동체입니다");
//		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		// substring() 메서드 연습
		// => 입력받은 전화번호(phone)의 가운데 4자리 추출 하여
		//    정보 보호를 위해 "****"로 대체
		// => 단, 전화번호 가운데 자리는 3자리 또는 4자리 이다
		// => 또한, 가운데 자리와 뒷자리 번호가 같은 경우에도
		//    가운데 자리만 "*" 기호로 처리해야함
		String phone = "010-1234-5678";
		
		
		String midnum = phone.substring(4,8);
		System.out.println("전화번호 가운데 4자리 : " +midnum);
		System.out.println("전화번호 : " +phone.replace(midnum, "****"));
		
		System.out.println("----------------------------------------------");
		
		phone = "010-123-4567";
		if(phone.length() == 13) {
			midnum = phone.substring(4,8);
			System.out.println(phone.replace(midnum, "****"));
		} else if(phone.length() == 12) {
			midnum = phone.substring(4, 7);
			System.out.println(phone.replace(midnum, "***"));
		}
		
		System.out.println("----------------------------------------------");
		
		// t_sol) 가운데 번호 추출 : 4번 인덱스부터 뒤의 '-' 기호 앞까지 추출
		// 2. 가운데 번호가 3자리 또는 4자리이고, 
				//    가운데 번호와 뒤의 번호가 같을 수도 있을 때
				 phone = "010-5678-5678";
				
				// 가운데 번호 추출 : 4번 인덱스부터 뒤의 '-' 기호 앞까지 추출
				String midNumber = phone.substring(4, phone.lastIndexOf('-'));
				System.out.println("가운데 자리 번호 : " + midNumber);
				
				// 가운데 번호를 * 처리하기 위해 * 갯수 결정
				String securityMark = "";
				if(midNumber.length() == 3) { // 가운데 번호가 3자리일 경우
					securityMark = "***";
				} else if(midNumber.length() == 4) { // 가운데 번호가 4자리일 경우
					securityMark = "****";
				}
				
				System.out.println("전화번호 : " + 
										phone.replace(midNumber, securityMark));
				
		// 만약, 가운데 번호와 뒷자리 번호가 같을 경우 가운데 번호만 변경
		// 1) 앞자리 번호와 '-' 기호 추출
		// 2) 뒷자리 번호와 '-' 기호 추출
		// 3) 1번과 2번 사이에 "*" 기호 끼워 넣어서 문자열 결합
			String securityNumber = phone.substring(0, 4) + securityMark +phone.substring(phone.lastIndexOf('-'));
			
			
			System.out.println("전화번호 : " +securityNumber);
			
			// split() 메서드를 활용하여 문자열 분리
			String s1 = "안녕하세요.아이티윌 부산교육센터입니다. 자바 수업 재밌습니다.";
			// . 으로 분리 그다음 $로 분리
			String[] st1 = s1.split("\\.");
			for(String s : st1) {
				System.out.println(s);
			}
			
			String s2 = "자바&JSP/HTML5&CSS3/안드로이드&스프링";
			// '/' 기준으로 분리 한뒤
			// 다시 & 기준으로 분리
			String[] str = s2.split("/");
			for(String s : str) {
				System.out.println(s);
			}
			System.out.println("==============================");

			String[] str2 = s2.split("/");
			for(String s : str2) {
				System.out.println(s);
				String[] str1 = s.split("&");
				for(String strr : str1) {
					System.out.printf("%s  ",strr);
				}
				System.out.println();
			}
			
			// --------------------------------------------------------------------------------------
			// format(String str, Object...args)
			// => 문자열 내에 형식 지정 문자를 사용하여 전달된 데이터를
			//    형식에 맞는 문자열로 포맷을 변환
			// => String str 파라미터에 형식 문자를 지정하고
			//    Object...args의 가변인자는 형식 지정문자 잦리에 전달될
			//    데이터를 형식 지정 문자 갯수에 맞춰 전달
			// => printf() 메서드와 동일한 역할을 수행하며,
			//    printf() 메서드는 출력용으로만 사용 가능하지만
			//    format() 메서드는 String 타입 변수에 문자열 저장이 가능하다
			String formatString = String.format("이름 : %s, 나이%d, 키 : %f", "홍길동",20,180.5);
			System.out.println(formatString);
			System.out.printf("이름 : %s, 나이%d, 키 : %f", "홍길동",20,180.5);
			
	}

}



















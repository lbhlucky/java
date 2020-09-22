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
				
	}

}



















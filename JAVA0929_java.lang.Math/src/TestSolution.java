
public class TestSolution {

	public static void main(String[] args) {
		// PI 값의 소수점 넷째자리에서 반올림하기
		// 3.141592.... => 3.141"5" 를 반올림하면 => 3.14"2"
		// 따라서, 4번째 자리 숫자 5가 소수점 첫번째자리로 오도록 해야함
		double num = Math.PI;
		
		// 원하는 자리 숫자가 소수점 첫번째에 오도록 가중치 곱함
		System.out.println(num * 1000); // 3141."5"92....
		// 가중치를 곱한 값을 반올림 수행
		System.out.println(Math.round(num * 1000)); // 314"2"
		// 가중치를 곱한 값의 반올림 계산 후 원래자리로 되돌리기 위해
		// 다시 가중치로 나눔 
		// => 단, 정수끼리 나눗셈이 되지 않도록 실수로 변환하여 나누기
		System.out.println(Math.round(num * 1000) / 1000.0); // 3.14"2"
		
		System.out.println("-----------------------");
		
		// Math.pow() 메서드를 활용하여 자릿수를 변경하면서 반올림 수행
		int roundPosition = 4; // 반올림을 수행할 자릿수 지정
		// 입력받은 자릿수 -1 값을 10의 승수로 계산하면 표현할 자릿수 계산
		// ex) 4 입력 시 소수점 4번째자리에서 반올림하여 3번째 자리까지 표기
		//     => 10^3 = 1000 을 가중치로 사용해야함
		int weight = (int)Math.pow(10, roundPosition - 1);
		
		System.out.println((double)Math.round(num * weight) / weight);
		
		System.out.println("====================================");
		
		/*
		 * 로또 번호 생성기
		 * - 정수 1 ~ 45 범위의 난수 6개를 배열(myLotto)에 저장 후 출력
		 * - 단, 배열에 저장되는 난수는 중복되는 숫자가 없어야 함
		 * - 1등 당첨번호(35, 3, 1, 7, 9, 15)를 배열(thisWeekLotto)로 생성하여, 
		 *   자신의 로또번호와 비교한 뒤 일치하는 숫자 갯수를 출력
		 *   
		 * < 실행 예시 >
		 * 나의 로또 번호 : 40, 15, 10, 25, 7, 32
		 * 1등 당첨 번호 : 35, 3, 1, 7, 9, 15
		 * 일치하는 숫자 갯수 : 2개
		 */
		// 자신의 로또 번호를 저장할 배열 생성
		int[] myLotto = new int[6];
		
		// ----------------------------------------------------
		// 1. for문을 사용하여 중복 처리 수행
		for(int i = 0; i < myLotto.length; i++) {
			int rNum = (int)(Math.random() * 45) + 1; // 난수 생성 및 저장
			myLotto[i] = rNum; // 배열에 난수 저장
			
			// 중복 제거를 위해 배열 내의 저장된 숫자와 난수(myLotto[i]) 비교
			// => 현재 인덱스(i) 앞 까지만 비교
			for(int j = 0; j < i; j++) {
				if(myLotto[i] == myLotto[j]) { // 중복되는 번호가 존재할 경우
					System.out.println("중복번호 발생 - " + myLotto[i]);
					i--; // 현재 인덱스 i를 1만큼 감소시켜 다시 새 번호 저장
					break; // 안쪽 for문(j) 종료
				}
			}
			
		}
		
		// 2. 현재 저장되는 로또 번호 갯수 카운팅 변수를 하나 선언한 뒤
		//    while 문을 사용하여 중복 제거 작업을 수행
//		int count = 0; // 현재 저장된 로또 번호 갯수를 카운팅하는 변수
//		DUPLICATE_LOOP_POINT:
//		while(count < 6) { // 저장 갯수가 6보다 작을 동안 반복
//			int rNum = (int)(Math.random() * 45) + 1; // 난수 생성 및 저장
//			// count 변수를 제어변수 역할로도 활용 가능
//			
//			// for문을 사용하여 현재까지 저장된 숫자 중에서 중복 숫자 체크
//			// => 0부터 현재 인덱스 앞까지 반복하면서 체크
//			// -------------------------------------------------------
//			// 1. 중복 체크 변수를 활용할 경우
////			boolean isDuplicate = false; // 중복 여부 체크할 변수
////			for(int i = 0; i < count; i++) {
////				if(rNum == myLotto[i]) { // 중복되는 숫자가 존재할 경우
////					isDuplicate = true; // 중복 표시
////					break;
////				}
////			}
////			
////			if(!isDuplicate) { // 중복이 없을 경우에만 저장 및 카운팅 증가
////				myLotto[count] = rNum; // 배열에 난수 저장
////				count++;
////			}
//			// -------------------------------------------------------
//			// 2. continue 문과 label 을 활용할 경우
//			for(int i = 0; i < count; i++) {
//				if(rNum == myLotto[i]) { // 중복되는 숫자가 존재할 경우
//					System.out.println(rNum + " = 중복");
//					continue DUPLICATE_LOOP_POINT;
//				}
//			}
//			
//			myLotto[count] = rNum; // 배열에 난수 저장
//			count++;
//		}
		// ----------------------------------------------------
		
		System.out.print("나의 로또 번호 : ");
		for(int i = 0; i < myLotto.length; i++) {
			System.out.print(myLotto[i] + " ");
		}
		
	}

}








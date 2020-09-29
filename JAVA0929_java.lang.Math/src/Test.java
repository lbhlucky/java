import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		// 소수점 넷째자리 반올림하기
		// 3.141592... -> 3.141"5"를 반올림하면 => 3.142
		// 따라서, 4번째 자리 숫자 5가 소수점 첫번째자리로 오도록 해야함
		double num = Math.PI;
		System.out.println("반올림 전 num : " +num);
		System.out.println("반올림 후 num : " +Math.round(num*1e3)/1e3);
		// sol) 
		// 1. 원하는 자리가 소수점 첫번째에 오도록 가중치 곱하기
		// 2. 가중치를 곱한 값을 반올림 수행
		// 3. 가중치를 곱한 값의 반올림 계산 후 원래자리로 되롤리기 위해
		// 	  다시 가중치로 나눔
		//    => 단, 정수끼리 나눗셈이 되지 않도록 실수로 변환하여 나누기
		
		System.out.println("---------------------------------------------------");
		
		// Math.pow() 메서드를 활용하여 자릿수를 변경하면서 반올림 수행
		int roundPosition = 4;	// 반올림을 수행할 자릿수 지정
		// 입력받은 자릿수-1 값을 10의 승수로 계산하면 표현할 자릿수 계산
		// ex) 4 입력시 소수점 4번째 자리에서 반올림하여 3번째자리까지 표기
		//	   => 10^3 = 1000을 가중치로 사용해야함
		int weight = (int)Math.pow(10, roundPosition-1);	// 3자리 지정
		System.out.println("반올림 후 num : " +(double)Math.round(num*weight)/weight);
		
		System.out.println("---------------------------------------------------");
		
		/*
		 * 로또 번호 생성기
		 * - 1 ~ 45 사이의 난수 6개를 배열(myLotto)에 저장 후 출력
		 * - 단, 배열에 저장되는 난수는 중복되는 숫자가 없어야한다.(중복제거)
		 * - 1등 당첨번호(35, 3, 1, 7, 9, 15)(thisWeekLotto)를 배열로 생성하여,
		 *   자신의 로또번호와 비교한 뒤 일치하는 숫자 갯수를 출력
		 */
		int[] Mylotto = new int[6];
		int[] thisWeekLotto = {35, 3, 1, 7, 9, 15};
				
		for(int i = 0 ; i < Mylotto.length ; i++) {
			int lottoNum = (int)(Math.random()*45)+1;
			Mylotto[i] = lottoNum;
			
			for(int j = 0; j <= i ; j++) {
				if(lottoNum == Mylotto[i]) {
					j--;
					break;
				}
			}
			
		}
//		System.out.println("나의 로또 번호 : ");
//		for(int i = 0 ; i < Mylotto.length ; i++) {
//			System.out.print(Mylotto[i] + " ");
//		}
		
		// Arrays 클래스를 활용하면 배열의 작업을 쉽게 수행할 수 있다
		// 1. 배열 내의 항목 오름 차순 정렬
		Arrays.sort(Mylotto);
		Arrays.sort(thisWeekLotto);
		
		// 2. 배열 내의 요소를 문자열로 변환하여 리턴 => 출력용으로 주로 사용	
		System.out.println("나의 로또 번호 : " +Arrays.toString(Mylotto));
		System.out.println("1등 당첨 번호 : "+Arrays.toString(thisWeekLotto));
		
		// 나의로또번호(Mylotto)와 1등 당첨번호(thisWeekLotto)를 비교하여
		// 일치하는 번호 갯수를 카우팅하여 출력
		int sameCount = 0;
		boolean isCheck = true;
		int n = 0;
		while(isCheck) {
		for(int i = 0; i < Mylotto.length ; i++) {
			for(int j = 0; j < thisWeekLotto.length ; j++) {
				if(Mylotto[i] == thisWeekLotto[j]) {
					sameCount++;
				}
			}
			
			if(sameCount == 6) {
				isCheck = false;
				
			}
		}
			n++;
		}
		
		System.out.println();
		System.out.println("맞춘 갯수 : " +sameCount);
		System.out.println("실행 횟수 : " +n);

		
	}

}





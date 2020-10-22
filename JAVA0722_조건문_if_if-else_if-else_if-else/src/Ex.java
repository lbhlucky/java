
public class Ex {

	public static void main(String[] args) {
		/*
		 * 조건문
		 * - 특정 조건에 따라 문장의 실행 여부를 결정하는 문
		 * 
		 * 단일 if문
		 * - 조건식에 따라 특정 문장 실행 여부를 결정하는 기본적인 조건문
		 * - 조건식 판별 결과가 true 이면 블록({})문 내의 문장들을 실행하고
		 *   조건식 판별 결과가 false 이면 블록문을 생략함
		 * 
		 * < 기본 문법 >
		 * 문장1;
		 * 
		 * if(조건식) {
		 * 		문장2; // 조건식 판별 결과가 true 일 때 실행할 문장들...
		 * }
		 * 
		 * 문장3;
		 * 
		 * 조건식 판별 결과가 true 일 때 : 문장1 -> 문장2 -> 문장3
		 * 조건식 판별 결과가 false 일 때 : 문장1 -> 문장3
		 */
		
		// 문장 1
		System.out.println("프로그램 시작!");
		
		int num = 3;
		
		if (num > 5) {	// 조건식 : 변수 num이 5보다 클 경우 true, 아니라면 false
			
			// 조건식 판별 결과가 true일 때 실행할 문장들
			System.out.println("num이 5보다 크다.");	// 문장2
			
		}
				
		System.out.println("프로그램 종료!");	// 문장3
		System.out.println("-------------------------");
		
		// 문장 1
				System.out.println("프로그램 시작!");
				
				num = 3;
				
				boolean b = num > 5;
				// boolean 타입 변수 또는 리터럴을 if문에 직접 전달도 가능
				
				if (b) {	// 조건식 : 변수 num이 5보다 클 경우 true, 아니라면 false
					
					// 조건식 판별 결과가 true일 때 실행할 문장들
					System.out.println("num이 5보다 크다.");	// 문장2
					
				}
						
				System.out.println("프로그램 종료!");	// 문장3
		
	}

}

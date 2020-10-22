
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * if ~ else 문
		 * - 조건식 판별 결과에 따라 서로 다른 문장을 실행하는 if문
		 *   => 조건식 판별 결과가 true 이면 
		 *   	if 문의 중괄호 블록문{} 을 실행하고
		 *      false 이면 else 문의 블록문{} 을 실행
		 * - 삼항연산자(조건연산자)와 동일한 형태의 조건문 
		 *   => if ~ else 문이 더 상위 조건문
		 * 
		 * < 기본 문법 >
		 * 문장1;
		 * 
		 * if(조건식) {
		 * 		문장2; // 조건식 판별 결과가 true 일 때 실행할 문장들...
		 * } else {
		 * 		문장3; // 조건식 판별 결과가 false 일 때 실행할 문장들...
		 * }
		 * 
		 * 문장4;
		 * 
		 * => 조건식 판별 결과가 true 일 때 : 문장1 -> 문장2 ->  문장4
		 *    조건식 판별 결과가 false 일 때 : 문장1 -> 문장3 ->  문장4
		 *    (문장2 와 문장3 은 동시에 실행될 수 없다!)
		 */
		
		System.out.println("프로그램 시작!\n");
		int num = 31;
		
		if (num > 5) {	// num이 5보다 클 경우
			
			System.out.println(num + "은 5보다 큽니다.\n");
			
		}else {	// num이 5보다 작거나 같을 경우
			
			System.out.println(num + "은 5보다 작거나 같습니다.\n");
		}
		
		System.out.println("프로그램 종료!");
		
	}

}

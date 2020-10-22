
public class Ex3 {
	public static void main(String[] args) {
			/*
			 * do - while 문
			 * - while 문과 기본적인 동작은 유사하나
			 * 	 while문과 달리 do 문장을 통해 실행문을 먼저 실행하고
			 * 	 마지막에 while문의 조건식을 통해 반복 여부를 결정
			 * - while 문은 조건식에 따라 실행문이 실행되지 않을 수도 있지만
			 * 	 do - while문의 조건식과 관계없이 실행문이 무조건 한번은 실행됨
			 * - do - while문의 while(조건식)뒤에 반드시 세미콜론 필수!!!
			 * 
			 * < 기본 문법 >
			 * do {
			 * 		// 실행문
			 * } while(조건식);
			 * 
			 */
		int i = 1;
		while (i <= 10) {	// <= i가 10보다 클 경우 반복문 내부는 실해오디지 못함
			System.out.println(i+ ": Hello, World!");
			i ++;
		}
		System.out.println("반복문 종료 후 i 값 : " +i);
		
		System.out.println("============================");
		
		// do - while문을 사용할 경우
		i = 11;
		
		// i가 11이므로 while 조건식 결과가 false 이지만
		// 일단, do문에 의해 반복 내용을 한 번 실행한 후
		// 마지막에 while 조건식을 판별하여 false가 되어 빠져나감.
		do {
			System.out.println(i+ ": Hello, World!");
			i++;
		} while(i <= 10);
		System.out.println("반복문 종료 후 i 값 : " +i);
	}
}

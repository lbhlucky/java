
public class Ex {

	public static void main(String[] args) {
		/*
		 * for문과 if문의 조합 - for문 내에서 if문을 사용하여 반복 과정에서 특정 조건에 만족하면 지정된 문장을 실행하거나 실행하지 않음!
		 * 
		 */

		// for문을 사용하여 i가 1 ~ 10까지 1씩 증가하면서 반복 => i 출력
		for (int i = 1; i <= 10; i++) {
			// 1 ~ 10까지 정수 중 i값이 5일 때 출력
			if (i == 5) {
				System.out.println("i = " + i);

			}
			if (i < 5) {
				System.out.println("i = " + i);
			}
		}

		System.out.println("========================================");

		// for문을 사용하여 i가 1 ~ 10까지 1씩 증가 바복
		// => i값이 짝수 일때 " i = x, 짝수! " 출력하고,
		// => i값이 짝수 일때 " i = x, 홀수! " 출력

		for (int x = 1; x < 11; x++) {
			if (x % 2 == 0) {
				System.out.println("x = " + x + ", 짝수!");
			} else { // else if문도 사용 가능!
				System.out.println("x = " + x + ", 홀수!");
			}
		}

	}

}

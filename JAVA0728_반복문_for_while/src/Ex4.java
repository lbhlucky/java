
public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 반복문에서 제어변수 활용
		 * 
		 * 
		 * 
		 */

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.print("*");

			}

			System.out.println();
		}

		System.out.println("=========================================");

		/*
		 * 반복문에서 제어변수의 활용 - 반복문에서 제어변수의 초기식, 조건식, 증감식 등에 다른 변수(제어 변수포함)를 조합하여 사용가능 =>
		 * 특히, 계속 변화하는 제어변수를 조건식 등에 사용할 경우 반복 횟수가 동적으로 변하는 반복문을 구현할 수 있다.!!
		 * 
		 * Ex) 반복문 횟수가 고정인 경우 ***** i = 1, j = 1 ~ 5; ***** i = 2, j = 1 ~ 5; ***** i =
		 * 3, j = 1 ~ 5; ***** i = 4, j = 1 ~ 5; ***** i = 5, j = 1 ~ 5;
		 */

		/*
		 * Ex)
		 * 
		 * * i = 1, j = 1 ~ 1; ** i = 2, j = 1 ~ 2; *** i = 3, j = 1 ~ 3; **** i = 4, j
		 * = 1 ~ 4; ***** i = 5, j = 1 ~ 5;
		 */

		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}

			System.out.println();
		}

		System.out.println("=============================================");

		for (int i = 1; i <= 5; i++) {

			System.out.println("i = " + i);

			for (int j = 1; j <= i; j++) {
				System.out.println("------> j = " + j);

			}

			System.out.println("---------------------------------------");

		}

	}

}

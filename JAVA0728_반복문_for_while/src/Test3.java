
public class Test3 {

	public static void main(String[] args) {

		// 중첩 for문을 활용하여 시계의 분침, 초침 구현

		// 분침 ( 0 ~ 59 분)
		for (int min = 0; min < 60; min++) { // 바깥쪽 for문

//			System.out.print(min + "분 ");

			// 초침 ( 0 ~ 59 초)
			for (int sec = 0; sec < 60; sec++) { // 안쪽 for문

				System.out.println(min + "분 " + sec + "초");

			}

		}

		System.out.println("=================================================");

		// 100m 운동장 10바퀴 돌도록 중첩 for문을 사용하여 구현
		// ex) 1바퀴 - 1m
		// 1바퀴 - 2m
		// 1바퀴 - 3m
		// .....생략
		// 1바퀴 - 100m
		// 2바퀴 - 1m
		// 2바퀴 - 2m
		// .....생략
		// 10바퀴 - 1m
		// .....생략
		// 10바퀴 - 100m

		for (int i = 1; i <= 10; i++) {

			System.out.println();

			for (int j = 1; j <= 100; j++) {

				System.out.println(i + "바퀴 : " + j + "미터");

			}

		}

		System.out.println("================================================");

		// 중첩 for문을 사용하여 구구단 구현
		for (int row = 2; row < 10; row++) {

			System.out.println();
			System.out.println(" < " + row + "단" + " > ");

			for (int col = 1; col < 10; col++) {

				System.out.println(row + " * " + col + " = " + row * col);

			}
		}

	}

}

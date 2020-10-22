
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 중첩 while 문
		 * - 중첩 for문과 마찬가지로 while 문 내에 while문을 기술하는것 
		 * - 바깥쪽 while문이 1번 반복할 동안, 안쪽 while 문이 여러번 반복
		 * 
		 * <기본 문법>
		 * 초기식 1 ;
		 * 
		 * while(조건식 1) {
		 * 		초기식 2;
		 * 
		 * 		while(조건식 2) {
		 * 			// 실행문
		 * 			증감식 2;
		 * 		}
		 * 		증감식 1;
		 * }
		 */

		for (int i = 1; i <= 3; i++) { // 바깥쪽 for문
			System.out.println("i = " + i);

			for (int j = 1; j <= 5; j++) { // 안쪽 for문
				// 안쪽 for문 반복횟수 = j(5번) * i(3번) = 15번
				System.out.println("------------> j = " + j);

			}

		}
		System.out.println("==============================");

		int i = 1; // 초기식 1
		while (i <= 3) { // 조건식 1
			System.out.println("i = " + i); // 실행문 1
			i++; // 증감식 1
			int j = 1; // 초기식 2
			// => 주의! 바깥쪽 while문 안쪽에,
			//	  안쪽 while문보다 윗쪽에 위치해야함.
			while (j <= 5) { // 조건식 2
				System.out.println("------------> j = " + j); // 실행문 2
				j++; // 증감식 2
			}

		}
	}
}

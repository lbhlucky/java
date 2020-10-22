
public class Ex3 {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) { // 바깥쪽 for문

			System.out.println("i = " + i);

			for (int j = 1; j <= 5; j++) { // 안쪽 for문
				// 안쪽 for문 반복횟수 = j(5번) * i(3번) = 15번
				System.out.println("------------> j = " + j);

			}

			System.out.println("==============================");
		}

	}

}

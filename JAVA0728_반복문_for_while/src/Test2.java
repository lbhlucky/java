
public class Test2 {

	public static void main(String[] args) {

		// 1 ~ 100까지 i씩 증가하면서 합계를 sum에 누적후 출력

		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1 ~ 100까지의 합 = " + sum);

		System.out.println("===========================================");

		// 1 ~ 10까지 1씩 증가하면서 홀수의 합을 oddTotal에 누적하고,
		// 짝수의 합을 evenTotal에 누적

		int oddTotal = 0, evenTotal = 0;

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 1) {
				oddTotal += i;
			} else {
				evenTotal += i;
			}
		}

		System.out.println("1 ~ 10까지의 홀수의 합 : " + oddTotal);
		System.out.println("1 ~ 10까지의 짝수의 합 : " + evenTotal);

	}

}

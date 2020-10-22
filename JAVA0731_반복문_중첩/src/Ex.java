
public class Ex {

	public static void main(String[] args) {

		int j = 2;
		while (j <= 9 ) {
			System.out.println("< " + j + "단 >");
			int i = 1;
			while (i <= 9) {
				System.out.println(j + " * " + i + " = " + i * j);
				i++;
			}
			j++;

		}
		System.out.println("==============================");
		
		// 1 ~ 10까지 정수의 합 계산
		int num = 1;
		int sum = 0;
		while (num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1 ~ 10까지의 합 : " + sum);
		
		System.out.println("==============================");
		
		// 1 ~ 10까지 홀수의 합(oddTotal) 짝수의 합 (evenTotal)
	int	i = 1;
		int oddTotal = 0, evenTotal = 0;
		
		while ( i <= 10) {
			if (i % 2 == 1) {
				oddTotal += i;
			} else if (i % 2 == 0) {
				evenTotal += i;
			}
			i++;
		}
		System.out.println("1~10까지 홀수의 합 : " + oddTotal);
		System.out.println("1~10까지 짝수의 합 : " + evenTotal);
		
		
	}

}

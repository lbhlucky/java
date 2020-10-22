
public class Ex5 {

	public static void main(String[] args) {

		/*
		 * 2. while문
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ": Hello, World!");
		}

		System.out.println("==================================");

		int i = 1;

		while (i <= 10) {

			System.out.println(i + " : Hello, World!");
			i++;

		}
		System.out.println("-----------------------------------");

//		while ( i <= 10 ) {
//			
//			if(i % 2 == 0) {
//				System.out.println(i + "는 짝수!!");
//				i++;
//			} else if ( i % 2 == 1 ) {
//				System.out.println(i + "는 홀수!!");
//				i++;
//			} 
//			
//		}
		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println();
		System.out.println("-----------------------");
		// 1 ~ 10까지 i값을 2씩 증가시키면서 출력
		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}

		System.out.println();
		System.out.println("-----------------------");

		// 2 ~ 10 까지 2씩 증가시키면서 출력
		i = 2;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}

		System.out.println();
		System.out.println("-----------------------");

		// 10 ~ 1 까지 1씩 감소시키면서 출력
		i = 10;
		while (i >= 1) {
			System.out.print(i + " ");
			i--;
		}

		System.out.println();
		System.out.println("-----------------------");

     
	}

}

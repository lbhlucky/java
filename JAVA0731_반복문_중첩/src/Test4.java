
public class Test4 {

	public static void main(String[] args) {
		/*/
		 * 1부터 차례대로 1씩 증가하는 값을 차례대로 누적하여
		 * 누적합계가 1000보다 클 떄 i 값을 출력
		 * 
		 */
		
		int i = 1;
		int sum = 0;
		while(sum<=1000) {
			sum += i;
			System.out.println("i = "+ i + ", sum = " + sum);
			i++;
		}
		
		System.out.println("반복문 종료 후 i값 : " + i);

		System.out.println("========================================");
		
		i = 1;
		sum = 0;
		while(true) {
			sum += i;
			System.out.println("i = "+ i + ", sum = " + sum);
			i++;
			if( sum >= 1000) {
				break;
			}
		}
		System.out.println("반복문 종료 후 i값 : " + i);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

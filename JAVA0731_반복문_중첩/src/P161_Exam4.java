
public class P161_Exam4 {

	public static void main(String[] args) {
		/*
		 * Q. 4x + 5y = 60인 방정식의 해를 구하라.
		 * (단, x, y는 10이하의 자연수)
		 */
		
		for (int x = 1; x <= 10; x++) {
			
			for (int y = 1; y <= 10; y++) {
			
				if (((4 * x) + (5 * y)) == 60) {
				
					System.out.println("x = " + x + ", y = " + y);
				}
			}
		}

	}

}

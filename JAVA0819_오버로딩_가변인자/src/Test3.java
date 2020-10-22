public class Test3 {

	public static void main(String[] args) {
		
		Calculator3 c = new Calculator3();
		c.calc('+' , 10, 20);	// 10 + 20 = 30
		c.calc('+' , 10, 20, 30);	// 10 + 20 + 30 = 60
		c.calc('+' , 10, 20, 30, 40);	// 10 + 20 + 30 + 40= 100
		c.calc('+', 10,20,40,30,20);	// 10 + 20 + 40 + 30 + 20 = 120
		System.out.println();

		c.calc('-' , 100, 10);	// 100 - 10 = 90
		c.calc('-' , 100, 10, 20);	// 100 - 10 - 20 = 70
		c.calc('-' , 100, 10, 20, 30);	// 100 - 10 - 20 - 30= 40
		c.calc('-', 100,20,40,5,20,10);	// 100 - 20 - 40 -5 - 20 - 10 = 5
		System.out.println();
		
		c.calc('*' , 10, 20);	// 10 * 20 = 200
		c.calc('*' , 10, 20, 30);	// 10 * 20 * 30 = 6000
		c.calc('*', 10,20,40,30,20,10);	// 10 * 20 * 40 * 30 * 20 * 10 = 48000000
		System.out.println();
				
		c.calc('/' , 100, 10);	// 100 / 10 = 10
		c.calc('/' , 100, 10, 2);	// 100 / 10 / 2 = 5
		c.calc('/', 100, 2, 10, 5);	// 100 / 2 / 10 / 5 = 1 
		System.out.println();
		
	}

}

class Calculator3 {
	
	// 가변인자를 활용하여 1개의 메서드로 모든 연산 처리하기
	public void calc(char opr, int... nums) {
		int result = nums[0];
		
		System.out.print(nums[0]);
		
		if(opr == '+') {
			for(int i = 1 ; i < nums.length; i++) {
				result += nums[i];
				System.out.print(" + " + nums[i]);
			}
		} else if (opr == '-') {
			for(int i = 1 ; i < nums.length; i++) {
				result -= nums[i];
				System.out.print(" - " + nums[i]);
			}	
		} else if (opr == '*') {
			for(int i = 1 ; i < nums.length; i++) {
				result *= nums[i];
				System.out.print(" * " + nums[i]);
			}	
		} else if (opr == '/') {
			for(int i = 1 ; i < nums.length; i++) {
				result /= nums[i];
				System.out.print(" / " + nums[i]);
			}	
		}
		System.out.println(" = " +result);
	}
		
}
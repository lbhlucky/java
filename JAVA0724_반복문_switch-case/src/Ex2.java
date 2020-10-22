
public class Ex2 {
	
	public static void main(String[] args) {
	
		
		System.out.println("1. Hello, World!");
		System.out.println("2. Hello, World!");
		System.out.println("3. Hello, World!");
		System.out.println("4. Hello, World!");
		System.out.println("5. Hello, World!");
		System.out.println("6. Hello, World!");
		System.out.println("7. Hello, World!");
		System.out.println("8. Hello, World!");
		System.out.println("9. Hello, World!");
		System.out.println("10. Hello, World!");
		
		System.out.println("===================================================");
		
		for(int i = 1; i <= 10 ; i++) {
			System.out.println(i + "번째. Hello, World!");
		}
	
		/*
		 *  위의 반복문에 대한 흐름 확인(= 디버깅, Debugging)
		 *  --------------------------------------------------------------------
		 *  제어변수(i)	조건식(i<=10)		 실행결과(출력)			  증감식(i++)
		 *  --------------------------------------------------------------------
		 *  	1			true		"1. Hello, World!" 출력			1 -> 2
		 *    	2			true		"2. Hello, World!" 출력			2-> 3
		 *    	3			true		"3. Hello, World!" 출력			3 -> 4
		 *  -----------------------------중 략---------------------------------
		 *    	8			true		"8. Hello, World!" 출력			8 -> 9
		 *      9			true		"9. Hello, World!" 출력			9 -> 10
		 *      10			true		"10. Hello, World!" 출력		10 -> 11  
		 *    	11			flase		for문을 종료하고 빠져나감			  
		 */
		
		System.out.println("===================================================");
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.print(i + " ");
			
		}
		
		System.out.println();
		System.out.println("===================================================");
		
		for(int i = 1; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("===================================================");
		
		for(int i = 2 ; i <= 10 ; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("===================================================");
		
		for(int i = 10 ; i >= 1 ; i--) {
			System.out.print(i + " ");
		}
		
	}
	
}


public class P160_Exam2 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for ( int num = 1 ; num <= 100 ; num++) {
		
			if(num % 3 == 0){
			
				sum += num;
				
				System.out.println("i = " + num + ", sum = " + sum);
				
			}
			
		} 
		
		System.out.println("3의배수총합 : "+sum);
					
	}

}

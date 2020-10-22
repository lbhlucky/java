public class Ex4 {
	public static void main(String[] args) {
		/*
		 * break vs continue문
		 * 1. break 문
		 * 		- 현재 실행중인 반복문의 블럭을 빠져나가는 문
		 * 		- 주로 if문과 조합하여 특정 조건일 때 반복 실행을 중지 시킴
		 * 
		 * 	< 기본 문법 >
		 * 	반복문(){
		 * 		실행문....
		 * 		if(조건식){
		 * 			break;
		 * 		}
		 * 	}
		 * 
		 */
		int i ;
		
		for (i = 1; i <= 10; i++) {
			
			System.out.println(i + ": Hello, World!");
			
			if( i == 5) {
				
				break;
				
			}
			
		}
		
		System.out.println("반복문 종료 후 i 값 : " + i);
		
		System.out.println("=====================================");

		 i = 1;
		
		 while (i <= 10) { // <= i가 10보다 클 경우 반복문 내부는 실해오디지 못함
			 
			System.out.println(i + ": Hello, World!");
		
			if ( i == 5) {
				
				break;
			}
			
			i++;
			
		}
		 
		System.out.println("반복문 종료 후 i 값 : " + i);
		
		System.out.println("=====================================");
		
		for (i = 1; i <= 10; i++) {
			
			
			if( i == 5) {
				
				continue;
				
			}
			
			System.out.println(i + ": Hello, World!");
			
		}
		
		System.out.println("=====================================");
		
	
		while (i <= 10) { // <= i가 10보다 클 경우 반복문 내부는 실해오디지 못함
			 
			i++;
			
			// i가 5일 때 while문 다음 반복 실행(조건식으로 이동)
			// => continue 윗줄에 모든 실행문이 존재하므로 생략할 문장 없음
			//		continue 실행 전 후가 달라지지 않는다.
			if ( i == 5) {
				
				continue;
			}
			
			System.out.println(i + ": Hello, World!");
			
		}
		
		System.out.println("반복문 종료 후 i 값 : " + i);
		
		
		
		
		
		
		
	}
	
}

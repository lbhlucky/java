
public class Test2 {

	public static void main(String[] args) {
		// if - else 문 연습
		// 1. 정수형 변수 visitCount가 0일 때, "Hello, World!"출력하고
		// 아니면 " 첫 방문이 아니시군요!" 출력
		// visitCount 와 상관없이 ' JavaProgramming!"을 출력하는 if문
		int visitCount = 1;
		
		if(visitCount == 0) {	// visitCount 가 0일 때
			
			System.out.println("Hello, World!\n");
			
		} else { // visitCount가 0이 아닐 때
			
			System.out.println("첫 방문이 아니시군요!\n");
			
		}
		
		System.out.println("Java Programming!");
		
		System.out.println("----------------------------");
		
		// int형 변수 num이 양수이면 "양수" 출력하고
		// 아니면 "양수 아님!"
		
		int num = -43;
		
		if(num > 0 ) {	// num이 양수 일 때
			
			System.out.println(num + "은 양수! \n");
			
		} else {	// num이 양수가 아닐 때 
			
			System.out.println(num + "은 양수 아님!\n");
			
		}
		
		System.out.println("----------------------------");
		
		// int형 변수 num이 홀수이면 "홀수!" cnffurgkrh
		// 아니면 "홀수 아님!" 출력
		 num = 4;
			
			if(num % 2 == 1 ) {	// num이 양수 일 때
				
				System.out.println(num + "은 홀수! \n");
				
			} else {	// num이 양수가 아닐 때 
				
				System.out.println(num + "은 홀수 아님!\n");
				
			}
			
			System.out.println("----------------------------");
			
		// 문자 ch가 소문자 일때 , 대문자로 변환하고 출력
		// 소문자 아닐 때, "소문자 아님!" 출력
		// 소문자 -> 대문자 변환시 -32 수행,  소문자 범위 (97~122)
			char ch = 'B';
			
			if(ch >= 'a' && ch <= 'z') {	// ch가 소문자일 경우
				
				System.out.println("소문자 " + ch + " 대문자로 변환 ! \n" );
				ch -= 32;
				System.out.println("변환된 문자 : " + ch + "\n" );
				
			} else { // ch가 소문자가 아닐 경우
				
				System.out.println(ch + "는 소문자 아님! \n");
				
			}
			
	}

}

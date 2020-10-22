
public class Test {

	public static void main(String[] args) {
		// 단일 if문 연습
		// 1. 정수형 변수 visitCount가 0일 때, "Hello, World!"출력하고
		// visitCount 와 상관없이 ' JavaProgramming!"을 출력하는 if문
		// 정수형 변수 visitCount 를 선언하고 0으로 초기화
		
		// if문을 사용하여 visitCount 가 0인지 판별
		// => 조건식 판별 결과가 true이면 "Hello, World!" 출력
			
		// if문 종료후 "Java Programming!"출력
		
		int visitCount = 3;
		
			if(visitCount == 0) {
			
				System.out.println("Hello, World!");
				
		}
			
		System.out.println("Java Programming!");
		
		System.out.println("----------------------------------");
		
		// 2. 정수형 변수 numn이 음수 일때 양수로 변환한 절대값을 출력
		// 단 양수일 땐 변함없이 그대로 출력
		int num = -15;
		
		if(num < 0) {
			
			System.out.println(num + " => 양수로 변환 ");
			num = -num;
//			num *= (-1);
			
		}
		
		System.out.println("num = " + num);
		
		System.out.println("----------------------------------");
		
		// 문자 ch가 소문자 일때 , 대문자로 변환하고 출력
		// 대문자일 때, 그대로 출력
		// 소문자 -> 대문자 변환시 -32 수행,  소문자 범위 (97~122)
		char ch = 'f';
		
		if (ch >= 'a' && ch <= 'z') {
			
			System.out.println("소문자 " + ch + " 대문자로 변환! ");
			ch -= 32;
			
		}
	
		System.out.println("ch = " + ch);

	}

}

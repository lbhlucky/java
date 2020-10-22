
public class Ex {

	public static void main(String[] args) {
		
		int num = 1;
		
		// 결과가 정수 또는 문자열인 변수 또는 식을 switch 문() 안에작성
		switch (num) {
			// case 문을 사용하여 정수형 변수 num의 값과 비교할 값 지정
			case 1 : 
				System.out.println("num = 1");
				break;	// 현재 switch를 벗어남("프로그램 종료!" 출력)
			case 2 : 
				System.out.println("num = 2");
				break;	// 현재 switch를 벗어남("프로그램 종료!" 출력)
			case 3 : 
				System.out.println("num = 3");
				break;	// 현재 switch를 벗어남("프로그램 종료!" 출력)
		}
		
		System.out.println("프로그램 종료!");
		
		System.out.println("======================================");
	
		switch (num) {
			// case 문을 사용하여 정수형 변수 num의 값과 비교할 값 지정
			// 만약, num = 1일 때, case 1 문장을 실행한 후 break문이 없으므로
			// case 1 실행문 아래쪽의 모든 case 와 default의 실행문을 실행
			// => 단, break 문을 만나거나 switch 문이 끝날때까지 실행함.
			case 1 : 
				System.out.println("num = 1");
			
			case 2 : 
				System.out.println("num = 2");
				
			case 3 : 
				System.out.println("num = 3");
		
		}
	
		System.out.println("프로그램 종료!");		
		
		
		System.out.println("======================================");
	
		num = 2;
		
		switch (num) {
			// case 문을 사용하여 정수형 변수 num의 값과 비교할 값 지정
			// 만약, num = 1일 때, case 1 문장을 실행한 후 break문이 없으므로
			// case 1 실행문 아래쪽의 모든 case 와 default의 실행문을 실행
			// => 단, break 문을 만나거나 switch 문이 끝날때까지 실행함.
			case 1 : 
				System.out.println("num = 1");
			
			case 2 : 
				System.out.println("num = 2");
				
			case 3 : 
				System.out.println("num = 3");
			default :	// num이 1, 2, 3이 아닐 경우 무조건 실행되는 문장
				System.out.println("default문 실행됨!");
		}
		
		System.out.println("프로그램 종료!");		
		
		System.out.println("======================================");
		
		switch (num) {
		// case 문을 사용하여 정수형 변수 num의 값과 비교할 값 지정
		// case 1, 2, 3일 때 문장을 실행한 후 break문을 만나므로	
		// 다른 case 와 default의 실행문이 실행되지 않는다
		// 또한, 일치하는 값이 없으면 default 문을 실행하미
		case 1 : 
			System.out.println("num = 1");
			break;
		case 2 : 
			System.out.println("num = 2");
			break;
		case 3 : 
			System.out.println("num = 3");
			break;
		default :	// num이 1, 2, 3이 아닐 경우 무조건 실행되는 문장
			System.out.println("default문 실행됨!");
	}

	System.out.println("프로그램 종료!");		

	System.out.println("======================================");
	
	// switch - case 문의 단점
	// - 조건식에도 제약 사항이 있지만
	//	 case문 뒤에 값만 올 수 있고, 식이나 범위 지정이 불가능하므로
	//	 if문에 비해 유연성이 떨어짐
	int score = 89;
	
	// 입력받은 점수(score)의 학점 출력하기 위해 switch문 사용 시 
	switch(score) {
		case 100 : System.out.println("A학점!");
		break;
		case 97 : System.out.println("A학점!");
		break;
		case 98 : System.out.println("A학점!");
		break;
		//...생략
		case 89 : System.out.println("B학점!");
		break;
		//...생략
		case 0 : System.out.println("F학점!");
		break;
		default : System.out.println("점수 입력 오류!");
	}
	
	System.out.println("======================================");
	
	String name = "K";
	
	switch (name) {		// 문자열 데이터도 switch문 조건식으로 활용가능
		case "K" :
		case "k" : System.out.println("KOREA"); break;
		case "A" :
		case "a" : System.out.println("AMERICA"); break;
	}
	
//	switch (3.14)		// 실수는 switch문에 사용불가
	
	}

}

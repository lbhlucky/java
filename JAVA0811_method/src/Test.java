
public class Test {

	public static void main(String[] args) {

		// 메서드 정의 및 호출 연습
		
		
		// 1. 매개변수도 없고, 리턴값도 없는 메서드
		// 1) "Hello, World!" 문자열을 10번 반복 출력하는 hello() 메서드
		hello();
		
		// 2) 구구단 2단 ~ 9단 까지 차례대로 출력하는 gugudan() 메서드
		gugudan();
		
		System.out.println("===========================================================");
		
		// 2. 매개변수는 없고, 리턴값만 있는 메서드 정의
		// 1) 1 ~ 10 까지 정수의 합(55)를 리턴하는 total() 메서드 
		//   => 결과값인 정수 합이 리턴되므로  int형 변수 total에 저장 후 출력
//		int total = total();
//		System.out.println("1 ~ 10까지 정수 합 : " +total);
		
		// 리턴값을 별도의 변수에 저장하지 않고 출력문에 바로 사용
		System.out.println("1 ~ 10까지 정수 합 : " +total());
		
		// 2) "Hello, World!" 문자열을 리턴하느 hello2() 메서드
		
		System.out.println("리턴받은 문자열 : " +hello2());
		

		System.out.println("===========================================================");
		
		// 3. 매개변수만 있고, 리턴값은 없는 메서드 정의
		// 1) 출력할 문자열을 전달하면, 10번 반복 출력하는 print()메서드
		print("Hello, World!");

		System.out.println("===========================================================");
		
		// 2) 정수 1개(n)개를 전달하면, 1 ~ n까지의 합계를 출력하는 sum() 메서드
		// ex) n = 10 일 때, 1 ~ 10 까지의 합 55 출력
		//     n = 100 일 때, 1 ~ 100 까지의 합 5050 출력
		sum(10);

		System.out.println("===========================================================");

		
		// 4. 매개변수도 있고, 리턴값도 있는 메서드  
		// 1) 정수 1개(n)개를 전달하면, 1 ~ n까지의 합계를 리턴하는 sum2() 메서드
		int n = 10;
		int total = sum2(n);
		System.out.println("1 ~ " + n + "까지의 합 : " +sum2(n));
		
		System.out.println("===========================================================");
		
		// 2) 정수(n)을 전달하면 "홀수" 또는 "짝수"를 판별하여 
		//    문자열을 리턴하는 num() 메서드
		n = 10;
		String result = num(n);
		System.out.println(n + "은 " + result);
		
		System.out.println("===========================================================");
		
		// 5. 매개변수가 2개 이상인 메서드
		// 1) 정수 2개를 전달받아 두 정수 합을 출력하는 add()메서드
//		add(10,20);
		int num1 = 10, num2 = 20;
		System.out.println(num1+"과"+num2+"의 합 : " +add(num1,num2));
		
		
	}	// main() 메서드 끝

	// --------------------------------------------------------------
	// 1. 매개변수도 없고, 리턴값도 없음
	// 1) "Hello, World!" 문자열을 10번 반복 출력하는 hello() 메서드
	// => 리턴값이 없으므로 리턴타입에 void를 명시
	// => 매개변수가 없으므로 소괄호() 부분을 비워둠
	
	public static void hello() {
		// 메서드가 호출되면 "Hello, World!" 문자열을 10번 반복 출력
		for(int i = 0; i < 10 ; i++) {
			System.out.println(i+1 +". Hello, World!");
	
	// ---------------------------------------------------------------
		

			
		}
 	}

	public static void gugudan() {
		
		for(int i = 2; i < 10; i++) {
			System.out.println("< " + i + "단 >");
			for(int j = 1 ; j < 10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.println();
		}
		
	}
	// 2. 매개변수는 없고, 리턴값만 있는 메서드 정의
	// 1) 1 ~ 10 까지 정수의 합(55)를 리턴하는 total() 메서드 
	public static int total() {
		
		int total = 0;
		for(int i = 1 ; i <= 10 ; i++) {
			total += i;
		}		
		return total;		// int형 값을 반드시 리턴해야함!
	}
	
	
	public static String hello2() {
		String hello = "Hello, World!";
		return hello;
	}

	
	
	// 3. 매개변수만 있고, 리턴값은 없는 메서드 정의
	// 1) 출력할 문자열을 전달하면, 10번 반복 출력하는 print()메서드
	public static void print(String str) {
		// 외부로부터 전달받은 문자열이 String타입 변수 str에 저장됨
		for(int i = 0 ; i < 10 ; i++)
			System.out.println(i+1 + str);
	}
	
	// 2) 정수 1개(n)개를 전달하면, 1 ~ n까지의 합계를 출력하는 sum() 메서드
	// ex) n = 10 일 때, 1 ~ 10 까지의 합 55 출력
	//     n = 100 일 때, 1 ~ 100 까지의 합 5050 출력
	public static void sum(int n) {
		int sum = 0;
		for(int i = 1 ; i <= n ; i++) {
			sum += i;
		}
		System.out.println("1 ~ " + n + "까지의 합 : "+sum);
	}
	
	// 4. 매개변수도 있고, 리턴값도 있는 메서드  
	// 1) 정수 1개(n)개를 전달하면, 1 ~ n까지의 합계를 리턴하는 sum2() 메서드
	public static int sum2(int n) {
		// 외부로부터 전달받은 정수 1개가 변수 n에 저장됨
		int total = 0;
		for(int i = 1 ; i <= n ; i++) {
			total += i;
		}
		return total;
	}
	
	// 2) 정수(n)을 전달하면 "홀수" 또는 "짝수"를 판별하여 
	//    문자열을 리턴하는 num() 메서드	
	public static String num(int n) {
		
		// 주의 사항 !! if문 사용 시 모든 조건에 따른 return문이 필수!!!!
		// 만약, if문과 else if문 조합할 경우 else문이 없으면
		// if문 조건식이 모두 아닐 때 return 문장이 없으므로 오류 발생!!

		
		//해결책1. else if문 대신 else문을 사용하거나 else문을 추가
		// => if문이 false 일 경우 무조건 else 문에서 return 문이 실행됨 
//		if(n % 2 == 0) {
//			return  "짝수";
//		} else {
//			return  "홀수";
//		}
		
		// 해결책 2. if문 등의 실행 블럭 내에서 직접 리턴하지 안혹
		// 리턴할 값을 변수에 저장만 한뒤 if문이 끝난 후 return 문 실행
		String result = "";
		// => 반드시 초기화 필수!!( 널스트링("") 또는 null 사용)
		if(n % 2 == 0) {
			  result = "짝수";
		} else if(n % 2 == 1) {
			result =  "홀수";
		}
		// if문 바깥에 return문이 존재하므로
		// 어떤 경우라도 무조건 return 문이 실행되게 됨
		return result;
	}
	
	
	// 5. 매개변수가 2개 이상인 메서드
	// 1) 정수 2개를 전달받아 두 정수 합을 출력하는 add()메서드
	public static int add(int a, int b) {
//		System.out.println(a+b);
		int sum = a+b;
		return sum;
	}
	
	
	
	
	
	
	
	
}		// Test 클래스 끝

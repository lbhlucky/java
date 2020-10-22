
public class Test2 {

	public static void main(String[] args) {

		// AND 연산자(&&) 연습 문제
		
		int num = 15;
		
		// 1. 정수 num이 10보다 크거나 같고 20보다 작거나 같을 경우
		// num >= 10
		// num <= 20
		boolean result = num >= 10 && num <= 20; 
		System.out.println("result = " + result);
		
		System.out.println("------------------------------------");
		
		// 2. 나이가(age)가 20세 이상이고, 30세 미만(이하)인가?
		int age = 15;
		result = age >= 20 && age < 30;
//		result = (age >= 20) && (age <= 30);
		System.out.println("result = " + result);
		
		System.out.println("====================================");
		
		// 3. 정수 num이 0보다 작거나 100보다 큰가?
		num = 5;
		result = num < 0 || num > 100;
		System.out.println("result = " + result);
		
		System.out.println("------------------------------------");
		
		// 4. 나이(age)가 5세 미만이거나 65세 이상인가
		age = 5;
		result = age < 5 || age >=65;
		System.out.println("result = " + result);
		
		System.out.println("------------------------------------");
		
		
	}

}


public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 메서드 오버로딩(Method Overloading) = 메서드 다중 정의
		 * - 시그니처(리턴타입, 메서드명, 매개변수 )중 
		 *   매개변수(파라미터)가 다른 메서드를 여러번 정의하는 것
		 * - 동일한 작업을 수행하는 메서드의 매개변수 타입이 다를때
		 *   메서드 이름을 별도로 구분하지 않고, 같은 이름의 메서드를
		 *   매개변수만 달리하여 여러번 정의하는 것
		 *   => 메서드 호출 시점에서 전달되는 데이터 타입에 따라 
		 *      매개변수 타입 해당 메서드를 자동으로 호출함
		 * - 매개변수의 이름만 다르거나, 리턴 타입만 다른 것은 오버로딩이 아님
		 * 
		 * - System.out.println() 메서드(print(), printf() 메서드 포함) 가
		 *   오버로딩이 적용된 메서드의 대표적인 예.
		 * 
		 */
		NormalMethod nm = new NormalMethod();
		nm.abs(-10);
		nm.dAbs(-3.3);
		nm.lAbs(-30L);
		
		System.out.println("--------------------------------------------------------");
		
		OverloadingMethod om = new OverloadingMethod();
		om.abs(-10); 	// public void abs(int num){} 메서드가 호출됨
		om.abs(-3.3);	// public void abs(double num) {} 메서드가 호출됨
		om.abs(-30L);	// public void abs(long num) {} 메서드가 호출됨
		// => 즉, 메서드 파라미터 전달 시, 매개변수를 구분할 수 있으면
		//    메서드 오버로딩이 성립되는 것으로 간주하고 오류 발생 없음!
		
		
		
	}

}

class OverloadingMethod {
	// 정수 1개를 전달받아 절대값을 계산하여 출력하는 abs() 메서드 정의
	// => int, double, long 타입에 대한 각 메서드를 abs()이름으로 통일
	//    단, 매개변수 타입인 int, double, long 으로 구분
	
	public void abs(int num) {
		// 전달받은 정수 num이 음수일 경우 양수로 변환 후 출력
		// 아니면 그대로 출력
		if(num < 0) {
			num = -(num);
		}
		
		System.out.println("num = " +num);
		
	}
	
	
	// 매개변수의 타입이 같고, 변수명만 다른 것은 오버로딩이 아니다!
	// public void abs(int num2) {} // 컴파일 에러 발생!
	
	// public int abs(int num) {}
	
		
	// int형이 아닌 다른 타입 매개변수를 선언하면 오버로딩이 성립됨!
	public void abs(double num) {
		// 전달받은 실수 num이 음수일 경우 양수로 변환 후 출력
		// 아니면 그대로 출력
		if(num < 0) {
			num = -(num);
		}
		
		System.out.println("num = " +num);
		
	}
	
	public void abs(long num) {
		// 전달받은 정수 num이 음수일 경우 양수로 변환 후 출력
		// 아니면 그대로 출력
		if(num < 0) {
			num = -(num);
		}
		
		System.out.println("num = " +num);
		
	}
	
	
	
}










class NormalMethod {
	
	// 정수 1개를 전달받아 절대값을 계산하여 출력하는 abs() 메서드 정의
	public void abs(int num) {
		// 전달받은 정수 num이 음수일 경우 양수로 변환 후 출력
		// 아니면 그대로 출력
		if(num < 0) {
			num = -(num);
		}
		
		System.out.println("num = " +num);
		
	}
	
	// double 타입 실수를 전달받는 메서드를 별도로 정의
	// => 메서드명도 식별자이므로 중복되면 안된다!
	public void dAbs(double num) {
		// 전달받은 실수 num이 음수일 경우 양수로 변환 후 출력
		// 아니면 그대로 출력
		if(num < 0) {
			num = -(num);
		}
		
		System.out.println("num = " +num);
		
	}
	
	// long 타입 정수를 전달받는 메서드를 별도로 정의
	// => 메서드명도 식별자이므로 중복되면 안된다!
		public void lAbs(long num) {
			// 전달받은 정수 num이 음수일 경우 양수로 변환 후 출력
			// 아니면 그대로 출력
			if(num < 0) {
				num = -(num);
			}
			
			System.out.println("num = " +num);
			
		}
		
	// 데이터 1개를 전달받아 출력하는 print() 메서드
		public void intPrint(int data) {
			System.out.println(data);
		}
		
		public void StringPrint(String data) {
			System.out.println(data);
		}
		public void doublePrint(double data) {
			System.out.println(data);
		}
	
}

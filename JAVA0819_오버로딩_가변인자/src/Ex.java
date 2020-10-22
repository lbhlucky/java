public class Ex {

	public static void main(String[] args) {
		/*
		 * 메서드 오버로딩 - 매개변수 갯수 또는 순서가 다른 메서드
		 * - 매개변수의 타입이 같더라도 갯수가 다르면 오버로딩이 성립됨
		 *   => 단, 타입이 같은 매개변수간의 순서 변경은 오버로딩이 아님!
		 * 
		 */
		OverloadingMethod om = new OverloadingMethod();
		
		// 반드시 호출하려는 메서드의 매개변수 갯수 및 타입이 일치해야함
		om.print(10, 20);
		om.print(10, 20,30);
//		om.print(10, 20,30,40);	// 오류 발생!
		
		System.out.println("===================================================");
		
		// 매개변수 갯수가 다르게도 활용가능!
		om.print2(2, "홍길동", "이순신");
		om.print2(3, "홍길동", "이순신", "강감찬");
		om.print2(4, "홍길동", "이순신", "강감찬", "김태희");
		
		System.out.println("===================================================");
		
		// 정수 1개 실수 1개를 전달 받아 덧셈 결과를 출력하는 sum()메서드 저으이
		om.sum(1, 3.14);
		om.sum(3.14, 1);
		
	}

}	// Ex 클래스 끝

class OverloadingMethod{
	
	// 정수 2개를 전달 받는 print() 메서드
	public void print(int n1, int n2) {
		System.out.println(n1 + ", " +n2);
	}
	
	// 정수 3개를 전달 받는 print() 메서드
	public void print(int n1, int n2, int n3) {
		System.out.println(n1 + ", " +n2 + ", " +n3);
	}
	
	// ------------------------------------------------------------------------------
	
	// 정수 1개(count) 문자열(name) 2 ~ 4개까지 전달받는 
	// print2() 메서드 정의
	public void print2(int count, String name1, String name2) {
		System.out.println(count + " : " + name1 + ", " + name2);
	}
	
	public void print2(int count, String name1, String name2, String name3) {
		System.out.println(count + " : " + name1 + ", " + name2 + ", " + name3);
	}
	
	public void print2(int count, String name1, String name2, String name3, String name4) {
		System.out.println(count + " : " + name1 + ", " + name2 + ", " + name3 + ", " + name4);
	}
	
	public void sum(int x, double y) {
		double result = (x+y);
		System.out.println(x + " + " + y + " = " + result);
	}
	
	public void sum(double x, int y) {
		double result = (x+y);
		System.out.println(x + " + " + y + " = " + result);
	}
	
	public void sum(int x, int y) {
		double result = (x+y);
		System.out.println(x + " + " + y + " = " + result);
	}
	
	
	// 같은 데이터타입끼리는 순서는 바꿀 수 없다! => 오버로딩 성립 X
//	public void sum(int y, int x) {
//		double result = (x+y);
//		System.out.println(x + " + " + y + " = " + result);
//	}
	
}	// OverloadingMethod 클래스 끝
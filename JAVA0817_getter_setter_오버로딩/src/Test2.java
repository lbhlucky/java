
public class Test2 {

	public static void main(String[] args) {
		// 정수 또는 실수 2개를 전달받아 덧셈 결과를 출력하는 프로그램
		// => 메서드 오버로디오할용
		PlusClass pc = new PlusClass();
		pc.plus(10,20);
		pc.plus(1.5, 1.5);
		pc.plus(10, 1.5);		// 10.0 + 1.5	
		// => int, double 전달시 자동으로 double, double 로 전달됨
					
		
	}

}	// Test2 클래스 끝

class PlusClass {
	
	public void plus(int x, int y) {
		System.out.println(x + " + " + y + " = " +(x+y));
	}
	
	public void plus(double x, double y) {
		System.out.println(x + " + " + y + " = " + (x+y));
	}
	
	
}	// PlusClass 클래스 끝
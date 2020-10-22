public class Test2 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		
		double result = r.cal(10);
		System.out.println("정사각형의 넓이 = " +result);
		
		System.out.println();
		
		double result2 = r.cal(10, 20);
		System.out.println("직사각형의 넓이 = " +result2);
		
		
	}

}

class Rectangle {
	
	// 사각형 한변의 길이를 전달받아 정사각형 넓이 계산
//	public double cal(double width) {
//		System.out.println("사각형 가로 길이 = " +width);
//		System.out.println("사각형 세로 길이 = " +width);
//		return width * width;
//	}
	
	// 정사각형 계산 코드와 직사각형 계산 코드가 거의 동일하므로
	// 정사각형에 필요한 가로길이(width)를 직사각형 계산 메서드 호출 후
	// 가로길이(width)와 세로길이(height)에 전달하면 코드 중복 제거됨
	public double cal(double width) {
		// cal(width, height)를 메서드를 호출하여
		// 가로길이를 두 매개변수에 전달하면 직사각형 계산과 동일하므로
		// 계산된 결과를 리턴받아 다시 리턴
		return cal(width, width);
	}
	
	// 사각형 가로, 세로 길이를 전달받아 직사각형 넓이 계산
	public double cal(double width, double height) {
		System.out.println("사각형 가로 길이 = " +width);
		System.out.println("사각형 세로 길이 = " +height);
		return width * height;
	}
}
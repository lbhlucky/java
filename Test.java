public class Test {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.rad = 3;
		c.draw();
		
		Rectangle r = new Rectangle();
		r.line1 = 10;
		r.line2 = 20;
		r.draw();
		
		Triangle t = new Triangle();
		t.a = 10;
		t.b = 20;
		t.c = 30;
		t.draw();
		
		System.out.println("================================================");
		Shape s = c;
		s.draw();
		
		s = r;
		s.draw();
		
		s = t;
		s.draw();
		
		System.out.println("================================================");
		// 메서드 파라미터 전달 시 각 클래스 타입이 아닌
		// 클래스들의 슈퍼클래스 타입의 매개변수로 전달 받을 경우
		// 하나의 메서드만으로 여러 인스턴스 파라미터를 전달 받을 수  있음
		Circle c2 = new Circle();
		shapeDraw(c2);	// Circle -> Shape 업캐스딩
		
		Rectangle r2 = new Rectangle();
		shapeDraw(r2);	// Rectangle -> Shape 업캐스딩
		
		Triangle t2 = new Triangle();
		shapeDraw(t2);	// Triangle -> Shape 업캐스딩
	}	// main() 메서드 끝
	
//		public static void shapeDraw(Circle x) {
//		x.draw();
//	}

// 	메서드 오버로딩을 통해 다른 타입의 파라미터를 전달받을 수는 있음
// 	=> 코드의 중복이 발생함
//	public static void shapeDraw(Rectangle x) {
//		x.draw();
//	}

// 	Circle, Rectangle, Triangle 타입 인스턴스를 
// 	하나의 메서드에서 모두 전달받으려면 업캐스팅 활용하여 파라미터 선언
// 	=> 즉, Shape 타입의 변수를 선언하면 모든 인스턴스를 하나로 전달 가능
	public static void shapeDraw(Shape s) {
		// 업캐스팅 후에도 공통된 메서드인 draw() 호출이 가능
		s.draw();
	}
	
}	// test클래스 끝

/*
 * 도형(Shape) 클래스 정의
 * - draw() 메서드 정의 : 파라미터 없음, 리턴값 없음
 *   => "도형 그리기!" 출력
 *   
 * 원(Circle)클래스 정의 - 도형(Shape) 클래스 상속
 * - 멤버변수 : 반지름(rad, 실수)
 * - draw() 메서드 오버라이딩
 *   => "원 그리기!" 출력
 * 사각형(Rectangle)클래스 정의 - 도형(Shape) 클래스 상속
 * - 멤버변수 : 두 직선의 길이(line1, line2 정수)
 * - draw() 메서드 오버라이딩
 *   => "사각형 그리기!" 출력
 * 삼각형(Triangle)클래스 정의 - 도형(Shape) 클래스 상속
 * - 멤버변수 : 세 꼭지점의 좌표(a, b, c 정수)
 * - draw() 메서드 오버라이딩
 *   => "삼각형 그리기!" 출력
 */

class Shape {
	
	public void draw() {
		System.out.println("도형 그리기!");
	}
}

class Circle extends Shape {
	double rad;

	@Override
	public void draw() {
		System.out.println("반지름 " + rad + " 사용하여 원 그리기!");
	}

}

class Rectangle extends Shape {
	int line1, line2;

	@Override
	public void draw() {
		System.out.println(
				line1 +", " + line2 +  " 직선 두 개 사용하여 사각형 그리기!");
	}
	
}

class Triangle extends Shape {
	int a, b, c;

	@Override
	public void draw() {
		System.out.println(
				a + ", " + b + ", " + c + " 꼭지점 세 개 사용하여 삼각형 그리기!");
	}

}
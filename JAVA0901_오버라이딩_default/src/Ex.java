public class Ex {

	public static void main(String[] args) {
		
//		Point2D p2 = new Point2D();
//		p2.print2D();
		
		System.out.println("--------------------------------------------");
		Point3D p3 = new Point3D();
		p3.print3D();
		
		// 만약 2차원 좌표를 사용해야할 겨웅
		// 별도로 Point2D 클래스의 인스턴스 생성 없이
		// 상속받는 메서드 호출만으로 사용가능
		p3.print2D();
		
	}

}

// 2차원 좌표를 관리하는 Point2D클래스 정의
class Point2D {
	// x, y 축 좌표 정보를 저장하는 인스턴스 변수 선언
	int x = 10;
	int y = 20;
	
	
	// x, y 축 좌표 정보를 출력하는 메서드 저으이
	public void print2D() {
		System.out.println("2차원 좌표 : x = " +x + ", y = " +y);
	}
}

//3차원 좌표를 관리하는 Point3D클래스 정의
// => 2차원 좌표 관리는 이미 Point2D 클래스에서 수행중이므로
//	  Point2D 클래스를 상속받아 Point3D 클래스를 정의하면 코드 중복 제거됨
class Point3D extends Point2D {
//	int x = 10;
//	int y = 20;
	
	// => 이미 Point2D클래스에서 x, y 좌표를 관리하므로 z좌표만 추가
	int z = 30;
	
	public void print3D() {
		// 서브클래스 메서드 내에서 슈퍼클래스로부터 상속받은
		// 변수나 메서드에 자유롭게 접근가능
		System.out.println("3차원 좌표 : x = " +x + ", y = " +y + ", z = " +z);
	}
}


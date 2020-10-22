public class UnitExam {

	public static void main(String[] args) {
		Unit u = new GroundUnit();
		// => groundunit -> unit  업캐스팅
		
		Tank t = new Tank();
		
		
		AirCraft ac = new AirCraft();
		// => 
		
		// AirCraft 는 Unit의 서브클래스이므로 업캐스팅 가능
//		 u = (Unit)ac;		// 가능
		// AirCraft 는 Unit의 서브클래스이므로 업캐스팅 가능 (형변환 연산자 생략가능)
//		 u = ac;			// 가능
		 
		 // GroundUnit은 Unit의 서브클래스이며
		 // 참조변수 u에는 GroundUnit의 인스턴스가 업캐스팅 되어있음
		 // 따라서, u -> GroundUnit 으로 다운캐스팅 해도 문제없음
//		 GroundUnit gu = (GroundUnit)u;	// 다운캐스팅
		 
		// AirCraft는 AirUnit의 서브클래스이므로 업캐스팅 가능
//		 AirUnit au = ac;
		 
		// u에 저장된 GroundUnit은 tank의 슈퍼클래스이므로
		// GroundUnit -> Tank로 다운캐스팅 할수 없다.
//		 t = (Tank)u;	// x
		 
		if(u instanceof Tank) {	// u is a Tank?
			// true일 때만 변환하도록 수행
			System.out.println("u -> Tank로 변환 가능!");
			t = (Tank)u;
		} else {
			System.out.println("u -> Tank로 변환 불가능!!");
		}
		// GroundUnit은 Tank의 슈퍼클래스이므로
		// Tank -> GroundUnit으로 업캐스팅가능
//		 GroundUnit gu1 = t;
		 
		
	}

}

class Unit {}

class AirUnit extends Unit {}

class GroundUnit extends Unit{}

class Tank extends GroundUnit{}

class AirCraft extends AirUnit{}
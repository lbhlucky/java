public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 메서드 오버라이딩(Method Overriding) - 메서드 재정의
		 * - 슈퍼클래스로부터 상속받은 메서드와 시그니처가 동일한 메서드를
		 *   서브클래스에서 새롭게 재정의하는 것!
		 * - 기존의 슈퍼클래스의 메서드를 수정하여 덮어 쓰는 것!
		 * - 오버라이딩 이후에는 슈퍼클래스의 메서드는 은닉되어 보이지 않음!
		 * 
		 * - 오버라이딩을 사용하는 이유 
		 * 	 => 코드의 재사용성이 향상되고, 통일성이 제공됨
		 * 
		 * - 오버라이딩 단축키 : Alt + Shift + S -> V
		 * 	 => 자동 오버라이딩을 수행하면 @Override 어노테이션이 붙게됨
		 *   	오버라이딩 규칙을 위반하면 오류가 발생하도록 함
		 *   	(ex. 오버로딩, 오타로 인한 이름 입력 오류 등)
		 *  
		 * 
		 * < 오버라이딩 작성 규칙 >
		 * 1. 슈퍼클래스의 메서드 시그니처 (이름, 파라미터, 리턴타입)가
		 *    완벽하게 동일해야한다.
		 * 2. 슈퍼클래스 메서드의 접근제한자보다 범위가 좁아질 수 없다!!
		 *    (ex. 슈퍼클래스가 public이면 서브클래스도 public여야 한다.)
		 *    (ex. 슈퍼클래스가 protected이면 서브클래스는 public 또는 protected여야 함!)
		 */

		Child4 c = new Child4();
		
		c.childPrn();	// 서브클래스에서 정의한 메서드
		c.parentPrn();	// 서브클래스에서 오버라이딩된 메서드
		// => 슈퍼클래스(Parent4의 parentPrn() 메서드는 보이지 않으므로
		//    접근이 불가능하게 됨(은님됨)
	
		System.out.println("====================================================");
		
		// Car 클래스를 상속받은 DieselCar 와 ElectricCar 클래스의
		// 인스턴스를 생성하여 오버라이딩 된 메서드를 각각 호출
		DieselCar dc = new DieselCar();
		
		dc.speedUp();
		dc.speedDown();
		dc.addFuel();
		
		ElectricCar ec = new ElectricCar();
		
		ec.speedUp();
		ec.speedDown();
		ec.addFuel();
		
	}

}

class Parent4 {
	public void parentPrn() {
		System.out.println("슈퍼클래스의 parentPrn() 메서드!");
	}
}

class Child4 extends Parent4 {
	public void childPrn() {
		System.out.println("서브클래스의 childPrn() 메서드!");
	}
	
	// 슈퍼클래스로부터 상속받은 parentPrn() 메서드 오버라이딩
	// => 리턴타입, 이름, 파라미터가 모두 동일해야함
	// => 접근제한자는 좁아질 수 없음
	public void parentPrn() {
		System.out.println("서브클래스에서 오버라이딩된 parentPrn() 메서드!");
	}
}

// ----------------------------------------------------------------------------

class Car {
	
	public void speedUp() {
		System.out.println("자동차 속력 증가!");
	}
	
	public void speedDown() {
		System.out.println("자동차 속력 감소!");
	}
	
	public void addFuel() {
		System.out.println("자동차 연료 공급!");
	}
	
	
}

// 디젤 자동차 - Car클래스 상속
class DieselCar extends Car {
	// Car클래스의 메서드 오버라이딩하여 DieselCar만의 기능을 재정의
	public void speedUp() {
		System.out.println("DieselCar 방식으로 속력 증가!");
	}
	
	public void speedDown() {
		System.out.println("DieselCar 방식으로 속력 감소!");
	}
	
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 공급!");
	}
}
// 전기 자동차 - Car클래스 상속
class ElectricCar extends Car {

	@Override	// annotation
	public void speedUp() {
		System.out.println("ElectricCar 방식으로 속력 증가!");
	}

	@Override
	public void speedDown() {
		System.out.println("ElectricCar 방식으로 속력 감소!");
	}

	@Override
	public void addFuel() {
		System.out.println("전기 충전소에서 배터리 충전!");
	}
	// 자동 오버라이딩 단축키 : Alt + Shift + S => V
	
}
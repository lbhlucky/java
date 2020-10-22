public class Test {

	public static void main(String[] args) {
		
		
		
	}

}
/*
 * Taxi, Truck 클래스의 공통된 특성을 추출하여 슈퍼클래스 Car 정의
 * => Taxi 와 Truck의 speedUp(), speedDown() 메서드를
 *    슈퍼클래스인 Car클래스에서 강제성을 부여하여
 *    서브클래스들이 반드시 구현하도록 해야함 => 추상메서드로 정의 필요
 * 
 * 택시(Taxi) 클래스
 * - 멤버변수 : 현재속력(speed, 정수), 최대속력(maxSpeed, 정수)
 * - 메서드 : 속력증가(speedUp()), 파라미터와 리턴타입 없음
 *            => "Taxi 속력증가!" 출력
 *             속력감소(speedDown()), 파라미터와 리턴타입 없음
 *            => "Taxi 속력 감소!" 출력
 *            
 *            택시(Taxi) 클래스
 * - 멤버변수 : 현재속력(speed, 정수), 최대속력(maxSpeed, 정수)
 * - 메서드 : 속력증가(speedUp()), 파라미터와 리턴타입 없음
 *            => "Taxi 속력증가!" 출력
 *             속력감소(speedDown()), 파라미터와 리턴타입 없음
 *            => "Taxi 속력 감소!" 출력
 */

abstract class Car {
	int speed;
	int maxSpeed;
	public abstract void speedUp();
	public abstract void speedDown();
}

class Taxi extends Car{

	@Override
	public void speedUp() {
		System.out.println("Taxi 속력증가!");
	}

	@Override
	public void speedDown() {
		System.out.println("Taxi 속력감소!");
		
	}
	
}

class Truck extends Car {

	@Override
	public void speedUp() {
		System.out.println("Truck 속력증가!");
		
	}

	@Override
	public void speedDown() {
		System.out.println("Truck 속력감소!");
		
	}
	
}

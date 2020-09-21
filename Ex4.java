
public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 인터페이스의 필요성(장점)
		 * 3. 상속 관계가 없는 클래스끼리 관계 부여 가능 => 다형성 확장
		 *   - 기존에 다른 클래스를 상속중일 때 다중 상속이 불가능한데
	     *	   인터페이스를 활용하여 상속관계가 아닌 객체간에
		 *     공통 인터페이스 제공으로 새로운 상속 관계 부여가 가능
		 *   - 관계가 없는 객체의 경우 공통 타입이 Object 타입뿐이므로
		 *     Object 타입으로 변환하여 관리는 할 수 있으나,
		 *     각 객체의 메서드 호출을 위해서는 다시 다운캐스팅이 필요하지만
		 *     인터페이스를 통해 상속 관계를 부여하고, 인터페이스에서
		 *     공통메서드를 추상메서드로 제공하는 경우에는
		 *     별도의 다운캐스팅 및 타입 판별 없이 바로 메서드 호출이 가능해짐
		 *     
		 */
		
		Ex4 ex = new Ex4();
		ex.badCase();
		ex.goodCase();
		
		int a[] = {1, 2, 3, 4, 5} ;
		


	}
	// 상속관계가 아닌 객체들을 사용하여 다형성을 적용시켜야 할 경우
	public void badCase() {
		// HandPhone, DigitalCamera의 공통 타입은 Object 타입 밖에 없음
		// => 이 때, Object 타입으로 업캐스팅 시 charge() 메서드 호출 불가
//		Object obj = new HandPhone();
//		obj.charge();		// Object 타입이므로 호출 불가능한 메서드
		// 다운캐스팅을 통해 다시 HandPhone 타입으로 변경해야 charge() ghcnf rksmd
		
//		obj = new DigitalCamera();
//		obj.charge();		// Object 타입이므로 호출 불가능한 메서드
		
		// Object[] 타입으로 HandPhone, DigitalCamera 인스턴를 관리
		Object[] objs = {new HandPhone(), new DigitalCamera()};
		
		// for문을 사용하여 배열 objs의 모든 인스턴스에 차례대로 접근하여ㅑ
		// 각각 타입에 맍는 다운 개스팅 수행 후 charge() 메서드 호출
		for (int i = 0; i < objs.length ; i++) {
			Object o = objs[i];
			if(o instanceof HandPhone) {
				// HandPhone 타입으로 다운캐스팅 가능
				HandPhone hp = (HandPhone)o;
				hp.charge();
			} else if(o instanceof DigitalCamera) {
				// DigitalCamera 타입으로 다운캐스팅 가능
				DigitalCamera dc = (DigitalCamera)o;
				dc.charge();
			}
		}
//		for(Object o : objs) {
//			
//		}
		
	}
	
	// 상속관계가 아닌 객체들에게 인터페이스를 활용한 상속관계를 부여한 후
	// 다형성에 활용할 경우
	public void goodCase() {
		// HandPhone2, DigltalCamera2 객체를 담기 위한 타입이
		//  Object 타입 외에 Chargeable 타입도 가능
		// => 따라서, Chargeable 타입 배열로 두 객체 관리가 가능
		Chargeable[] objs = {new HandPhone2(), new DigitalCamera2()};
		
		// for문을 사용하여 Chargeable[] 타입 내에 모든 객체에 접근하여
		// 상속받아 구현한 공통 메서드 charge() 메서드 호출
		// => Chargeable 인터페이스 charge() 메서드가 존재하므로
		//    별도의 다운캐스팅 없이도 charge() 메서드에 접근가능
		for(int i = 0 ; i <objs.length ; i++) {
			objs[i].charge();
		}
		
		
	// 향상된 for문 사용
//		for(Chargeable obj : objs) {
//			obj.charge();	// 공통메서드를 직접 호출 가능(별도의 다운 캐스팅 과정 불필요)
//		}
	}

}

class Phone {}

class Camera {}

class HandPhone extends Phone{
	public void charge() {
		System.out.println("HandPhone 충전!");
	}
}

class DigitalCamera extends Camera{
	public void charge() {
		System.out.println("DigitalCamera 충전!");
	}
}

// -------------------------------------------------------------------------------------
// HandPhone 과 DigitalCamera 사이에 특정 관계를 부여해주기 위해
// 공통 인터페이서인 Chargeable 인터페이스를 정의하고
// 해당 인터페이스 내에 추상메서드로 charge() 메서드 정의
interface Chargeable {
	
	public abstract void charge();
	
}

// HandPhone2 클래스 정의 = Phone 클래스 상속 , Chargeable 인터페이스 구현
class HandPhone2 extends Phone implements Chargeable {

	@Override
	public void charge() {
		System.out.println("HandPhone2 충전!!!");
		
	}
	
}
// DigitalCamera2 클래스 정의 = Camera 클래스 상속, Chargeble 인터페이스 구현
class DigitalCamera2 extends Camera implements Chargeable {

	@Override
	public void charge() {
		System.out.println("DigitalCamera2 충전!!!");
		
	}
	
}













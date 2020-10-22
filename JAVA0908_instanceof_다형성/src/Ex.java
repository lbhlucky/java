public class Ex {

	public static void main(String[] args) {
		/*
		  * 다형성(Polymorphism)
		 * - 하나의 클래스 타입으로 여러 인스턴스를 참조하는 것
		 * - 업캐스팅을 의미함
		 *   => 서브클래스에서 메서드 오버라이딩을 수행했을 때
		 *      슈퍼클래스 타입으로 업캐스팅 후 메서드 호출 시
		 *      오버라이딩 된 메서드가 호출되어
		 *      코드는 동일하나 실행 결과가 달라지게 됨
		 *      
		 * - 다형성을 통해 코드의 통일성을 향상시킬 수 있으나
		 *   해당 인스턴스의 상세 속성에 접근하려면
		 *   다운캐스팅을 통해 서브클래스 타입으로 변환해야 접근이 가능함!
		 * 
		  * 업캐스팅시 오버라이딩
		 * - 동적 바인딩 : 코드상의 실행할 메서드와 컴파일 후
		 *   실행 시점에서 실행되는 메서드가 달라지는 것
		 *
		 * - 서브클래스에서 오버라이딩 된 메서드가 존재할 경우
		 *   업캐스팅 후에도 오버라이딩 된 메서드가 호출됨
		 *   => 즉, 메소드 호출시 참조 타입이 누구인지 중요하지 않고
		 *      실제 인스턴스가 누구인지가 중요하다!
		 */
		// Truck 인스턴스 생성 및 접근 가능한 멤버 호출
		System.out.println("-----------------Truck의 접근 가능한 메소드");

		Truck truck = new Truck();
		
		// Truck 클래스에서 정의한 메서드
		truck.dump();	
		
		// Car클래스로부터 상속받은 메서드
		truck.speedUp();
		truck.speedDown();
		
		// Taxi 인스턴스 생성 및 접근 가능한 멤버 호출
		System.out.println("-----------------Taxi의 접근 가능한 메소드");
		
		Taxi taxi = new Taxi();

		// Taxi 클래스에서 정의한 메서드
		taxi.lift();
		taxi.drop();

		// Car클래스로부터 상속받은 메서드
		taxi.speedUp();
		taxi.speedDown();
		
		System.out.println();
		System.out.println("===========================================");
		System.out.println("---------------------Truck -> Car 업캐스팅");
		// Taxi -> Car 업캐스팅 및 접근 가능하 메서드 호출
		Car car = truck;
		
		// Truck 클래스에서 speedUp(),speedDown() 메서드를 오버라이딩
		// => 따라서, 업캐스팅 후에도 오버라이딩된 Truck의 메서드 호출됨
		car.speedUp();		// 서브클래스에서 오버라이딩된 메서드 호출
		car.speedDown();	// 서브클래스에서 오버라이딩된 메서드 호출
//		car.drmp();		// 참조 영역 축소로 상속 멤버 외에 접근 불가

		System.out.println("---------------------Car -> Truck 다운캐스팅");
		// Car -> Truck 다운캐스팅 및 접근 가능하 메서드 호출
//		truck = car;	// 다운캐스팅 시 명시적 형변환 필요
		truck = (Truck)car;	// 다운캐스팅
		
		// Truck 클래스에서 정의한 메서드
		truck.dump();
		
		// Car클래스로부터 상속받은 메서드
		truck.speedUp();
		truck.speedDown();
		
		
		System.out.println("---------------------Taxi -> Car 업캐스팅");
		// Taxi -> Car 업캐스팅 및 접근 가능하 메서드 호출
		car = taxi;
		
		// Taxi 클래스에서 speedUp(),speedDown() 메서드를 오버라이딩
		// => 따라서, 업캐스팅 후에도 오버라이딩된 Taxi의 메서드 호출됨
		car.speedUp();		// 서브클래스에서 오버라이딩된 메서드 호출
		car.speedDown();	// 서브클래스에서 오버라이딩된 메서드 호출

//		참조 영역 축소로 상속 멤버 외에 접근 불가
//		car2.lift();
//		car2.drop();
		
		System.out.println("---------------------Car -> Taxi 다운캐스팅");
		//Car -> Taxi 다운캐스팅 및 접근 가능하 메서드 호출
//		taxi = car;	// 다운캐스팅 시 명시적 형변환 필요
		taxi = (Taxi)car;
		
		// Taxi 클래스에서 정의한 메서드
		taxi.lift();
		taxi.drop();
		
		// Car클래스로부터 상속받은 메서드
		taxi.speedUp();
		taxi.speedDown();

		
		
		
	}

}

/*
 * Car 클래스 정의
 * - 메서드 정의
 *   1) speedUp() : 파라미터 없음, 리턴값 없음
 *      => "Car의 속력 증가!" 출력
 *   2) sppeDown() : 파라미터 없음, 리턴값 없음
 *      => "Car의 속력 감소!" 출력
 *      
 * Truck 클래스 정의 - Car 클래스 상속
 * - 메서드 정의 : 파라미터 없음, 리턴값 없음
 *   1) dump() : "Truck의 짐 싣기"
 *   
 * Taxi 클래스 정의 - Car 클래스 상속
 * - 메서드 정의 : 파라미터 없음, 리턴값 없음
 *   1) lift() : "Taxi의 승객 승차!"출력
 *   2) drop() : "Taxi의 승객 하차!"출력
 * 
 */

class Car {
	
	public void speedUp() {
		System.out.println("Car의 속력 증가!");
	}
	
	public void speedDown() {
		System.out.println("Car의 속력 감소!");
	}
}

class Truck extends Car {
	
	@Override
	public void speedUp() {
		System.out.println("Truck의 속력 증가!");
	}

	@Override
	public void speedDown() {
		System.out.println("Truck의 속력 감소!");
	}

	public void dump() {
		System.out.println("Truck의 짐 싣기!");
	}
}

class Taxi extends Car {
	
	@Override
	public void speedUp() {
		System.out.println("Taxi의 속력 증가!");
	}

	@Override
	public void speedDown() {
		System.out.println("Taxi의 속력 감소!");
	}

	public void lift() {
		System.out.println("Taxi의 승객 승차!");
	}
	
	public void drop() {
		System.out.println("Taxi의 승객 하차!");
	}
}
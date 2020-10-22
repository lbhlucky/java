
public class test2 {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.carName = "SONATA";
		car.companyName = "HYUNDAI";
		car.cc = 2000;
		
		System.out.println("자동차 종류 : " +car.carName);
		System.out.println("브랜드 명 : " +car.companyName);
		System.out.println("배기량 : " +car.cc);
		System.out.println("현재 속력 : " +car.speed);
		System.out.println();
		
		car.speedUp(100);		// 0 -> 100
		System.out.println();
		
		car.speedUp(220);		// 100 -> 320 => 200	: 최대 속력 도달!
		System.out.println();
		
		car.speedDown(80);		// 200 -> 120
		System.out.println();
		
		car.speedDown(180);		// 120 -> -60 => 0		: 차량 정지!
		System.out.println();
		
		car.speedUp(201);		// - > 201 => 200		: 최대속력 도달!
		

		
	}

}


/*
 * 자동차(Car) 클래스 정의
 * - 자동차 차종(carName, 문자열)
 * - 자동차 브랜드(companyName, 문자열)
 * - 자동차 배기량(cc, int)
 * - 최대속력(maxSpeed = 200, int) 현재속력(speed, int)
 * 
 * 메서드
 * 1) 속력 증가 speedUp()
 *    - 증가시킬 속력(s)를 전달받아 현재속력(speed)에 누적 후
 *      "현재 속력 : xxx km/h "출력
 *      단, 현재속력이 최대속력(maxSpeed)보다 클 경우
 *      현재 속력을 최대속력으로 변경 후 "최대 속력 도달" 출력
 *    - 리턴값 없음, 매개변수 1개(증가시킬 속력 s)
 * 2) 속력 감소 speedDown()
 *    - 감소시킬 속력(s) 전달받아 현재속력 차감한 후
 *      "현재 속력 : xxx km/h "출력
 *      단, 현재속력이 0보다 작을경우 현재 속력을 0으로 변경 후 "차량정지" 출력
 *    - 리턴값 없음, 매개변수 1개(증가시킬 속력 s)      
 */

class Car{
	String carName, companyName;
	int cc, speed;
	int maxSpeed = 200;
	
	
	public void speedUp(int s) {
		speed += s;
		if(speed >= maxSpeed) {
			speed = maxSpeed;
			System.out.println("최대 속력 도달!");
			System.out.println("조정 후 속력 : " +speed );
		} else {
			System.out.println("현재속력 : "+speed+"km/h");
		}
		
	}
	
	public void speedDown(int s) {
		speed -= s;
		if(speed <= 0) {
			speed = 0;
			System.out.println("차량 정지!");
			System.out.println("조정 후 속력 : " +speed );

		} else {
			System.out.println("현재속력 : "+speed+"km/h");
		}
	}
	
}
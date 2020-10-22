public class Ex2 {

	public static void main(String[] args) {
		/*
		 * instanceof 연산자
		 * - 어떤 객체가 특정 클래스 타입의 인스턴스인지를 판별하는 연산자
		 *   => 형변환 가능 여부(is - a 관계)를 판별
		 *   ex) a is a B => a instanceof B
		 *   
		 * - 판별 결과를 boolean 타입으로 리턴
		 *   => boolean 타입 변수에 결과값을 저장하거나
		 *      if문 등의 조건식에 직접 사용하여 판별
		 *      
		 * - 판별 결과가 true이면 형변환이 가능한 관계라는 의미
		 *   업캐스팅 또는 다운캐스팅 가능한 관계 모두 true가 리턴됨
		 * 
		 *  < 기본 문법 >
		 * 	a instanceof B
		 * => a : 객체(참조변수)
		 *    B : 클래스타입(또는 인터페이스타입)
		 */
		
		Parent2 p = new Parent2();

		// if 문을 사용하여 Parent2 객체가 Child2 타입으로 변환 가능 여부 판별
		// => p2 is a Child2
		if (p instanceof Child2) { // 우항에 변수를 넣으면 오류남! 반드시 타입을 넣어야함
			// 판별 결과가 true 이면 무조건 Child2 타입으로 변환 가능
			System.out.println("p -> Child2 타입으로 형변환 가능");
		} else {
			// 판별 결과가 false이면 어떠한 변환도 불가능!!
			// => 슈퍼클래스 타입 인스턴스이므로 다운캐스팅 불가!!
			System.out.println("p -> Child2 타입으로 형변환 불가능");
		}

		System.out.println("--------------------------------------------------------");

		Parent2 p2 = new Child2();

		if (p2 instanceof Child2) { // 우항에 변수를 넣으면 오류남! 반드시 타입을 넣어야함
			// 판별 결과가 true 이면 무조건 Child2 타입으로 변환 가능
			// => 서브클래스를 이미 업캐스팅 해 놓은 상태이므로
			// 형변환 가능하다는 true가 리턴됨!
			System.out.println("p -> Child2 타입으로 형변환 가능");
//			Child2 c = p2;	// 자동형변환은 불가능한 관계이므로
			Child2 c = (Child2) p2; // 강제형변환
		} else {
			System.out.println("p -> Child2 타입으로 형변환 불가능");
		}

		System.out.println("========================================================");

		// SmartPhone 인스턴스(sp) 생성
		SmartPhone 내폰 = new SmartPhone();
		
		// 내폰은 스마트폰 입니까?
		if(내폰 instanceof SmartPhone) {
			System.out.println("내폰은 SmartPhone 맞음!!!");
			// 그러므로 SmartPhone 타입 변수에 저장가능
			SmartPhone 동생폰 = 내폰;
			동생폰.call();
			동생폰.sms();
			동생폰.kakaoTalk();
			동생폰.youtube();
		} else {
			System.out.println("내폰은 SmartPhone 아님!!!");
		}
		
		System.out.println("--------------------------------------------------------");
		
		// 내폰은 핸드폰 입니까?
		if(내폰 instanceof HandPhone) {
			System.out.println("내폰은 HandPhone 맞음!!!");
			System.out.println("그러므로 HandPhone으로 형변환 가능함!!");
			HandPhone 엄마폰 = 내폰;
			System.out.println("내폰은 HandPhone의 모든 기능을 포함한다!");
			엄마폰.call();
			엄마폰.sms();
		} else {
			System.out.println("내폰은 HandPhone 아님!!!");
		}
		
		System.out.println("--------------------------------------------------------");

		HandPhone 엄마폰 = new HandPhone();
		
		// 엄마폰은 SmartPhone 입니까?
		if(엄마폰 instanceof SmartPhone) {
			System.out.println("엄마폰은  SmartPhone 맞음!!!");
		} else {
			System.out.println("엄마폰은  SmartPhone 아님!!!");
			System.out.println("그러므로 SmartPhone로 형변환 불가능!");
//			SmartPhone 내폰2 = 엄마폰;
//			SmartPhone 내폰2 = (SmartPhone)엄마폰;	// 실행시 오류 발생!!
			System.out.println("엄마폰은 SmartPhone의 모든 기능을 포함하지 못함!!");
		}
		
		System.out.println("--------------------------------------------------------");

		HandPhone 엄마폰2 = new SmartPhone();	// 업캐스팅
		
		// 엄마폰은 스마트폰입니까?
		if(엄마폰2 instanceof SmartPhone) {
			System.out.println("엄마폰은  SmartPhone 맞음!!!");
			System.out.println("그러므로 SmartPhone으로 형변환 가능");
//			SmartPhone 내폰2 = 엄마폰2;	// 강제형변환 필요!!
			SmartPhone 내폰2 = (SmartPhone)엄마폰2;
			System.out.println("엄마폰은 SmartPhone의 모든 기능을 포함함!!");
			System.out.println("따라서, SmartPhone으로 형변환 후에도");
			System.out.println("정상적으로 SmartPhone의 모든 기능 사용 가능");
			내폰2.call();
			내폰2.sms();
			내폰2.kakaoTalk();
			내폰2.youtube();
		} else {
			System.out.println("엄마폰은  SmartPhone 아님!!!");
		}
		
		
	}

}

class Parent2 {
}

class Child2 extends Parent2 {
}

//---------------------------------------------------------------------------------------

class HandPhone {
	String phoneNumber;

	public void call() {
		System.out.println("HandPhone의 전화 기능!");
	}

	public void sms() {
		System.out.println("HandPhone의 문자 기능!");
	}
}

// SmartPhone 클래스 정의 - HandPhone 클래스 상속
class SmartPhone extends HandPhone {
	String osName;
	
	public void kakaoTalk() {
		System.out.println("스마트폰의 카카오톡 기능!");
	}

	public void youtube() {
		System.out.println("스마트폰의 유튜브 기능!");
	}
}
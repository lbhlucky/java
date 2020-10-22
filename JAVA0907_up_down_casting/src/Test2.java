public class Test2 {

	public static void main(String[] args) {
		// 업캐스팅 연습
		// 1. 서브클래스 타입 인스턴스 생성
		SmartPhone 내폰 = new SmartPhone();
		System.out.println("--------------서브클래스에서 접근 가능한 메서드---------");
		System.out.println();
		// 서브클래스 타입으로 접근 가능한 메서드 : 4개
		내폰.kakaoTalk();	// 서브클래스에서 직접 정의한 메서드
		내폰.youtube();	// 서브클래스에서 직접 정의한 메서드
		내폰.call();		// 슈퍼클래스로부터 상속받은 메서드
		내폰.sms();		// 슈퍼클래스로부터 상속받은 메서드
		
		System.out.println();
		System.out.println("--------------슈퍼클래스에서 접근 가능한 메서드---------");
		System.out.println();
		
		// 2. 슈퍼클래스 타입 변수 선언 및 서브클래스의 인스턴스 전달
		HandPhone 엄마폰 = 내폰;	// 서브클래스타입 -> 슈퍼클래스타입(업캐스팅)
		// => 참조 변수 sp가 가진 데이터(주소값)를 전달
		
		// 슈퍼클래스 타입으로 접근 가능한 메서드 : 2개
		엄마폰.call();		// 슈퍼클래스에서 직접 정의한 메서드
		엄마폰.sms();		// 슈퍼클래스에서 직접 정의한 메서드
		
//		엄마폰.kakaoTalk();	// 호출 불가!!
//		엄마폰.youtube();	// 호출 불가!!
		// => 업캐스팅시 참조 가능한 영역의 축소가 일어나므로,
		//	  슈퍼클래스 타입으로 접근 가능한 메서드 갯수가 줄어들게 됨
		// ==> 즉, 슈퍼클래스 내의 멤버와 동일한 멤버에만 접근 가능하게 됨
		
		System.out.println();
		System.out.println("-----------슈퍼클래스에서 접근 가능한 메서드------------");
		System.out.println();
		
		// 또 다른 서브클래스 타입 인스턴스 생성
		SmartPhone 동생폰 = new SmartPhone();
		
		엄마폰 = 동생폰; // 서브클래스 -> 슈퍼클래스(업캐스팅)
		엄마폰.call();		// 슈퍼클래스에서 직접 정의한 메서드
		엄마폰.sms();		// 슈퍼클래스에서 직접 정의한 메서드
		
		System.out.println();
		System.out.println("==========다운캐스팅 연습(허용되지 않는 경우)===========");
		System.out.println();
		System.out.println("--------------슈퍼클래스에서 접근 가능한 메서드---------");
		System.out.println();
		// 다운캐스팅 연습(허용되지 않는 경우)
		// 1. 슈퍼클래스의 인스턴스 생성
		HandPhone 엄마폰2 = new HandPhone();
		
		// 슈퍼클래스 타입으로 접근 가능한 메서드 : 2개
		엄마폰2.call();
		엄마폰2.sms();
		
		// 2. 서브클래스 타입 변수에 슈퍼클래스 인스턴스 전달
		// => 다운캐스팅 수행
//		SmartPhone 내폰2 = (SmartPhone)엄마폰2;	// 다운캐스팅(오류 발생!!)
		
		System.out.println();
		System.out.println("===============다운캐스팅 연습(허용되는 경우)===========");
		System.out.println();
		// 다운캐스팅 연습(허용되는 경우)
		// 1. 서브클래스의 인스턴스 생성 및 업캐스팅 수행
		HandPhone 엄마폰3 = new SmartPhone();
		
		System.out.println();
		System.out.println("--------------슈퍼클래스에서 접근 가능한 메서드---------");
		System.out.println();
		
		// 슈퍼클래스 타입으로 접근 가능한 메서드 : 2개
		엄마폰3.call();
		엄마폰3.sms();

		System.out.println();
		System.out.println("-----------서브클래스에서 접근 가능한 메서드------------");
		System.out.println();
		// 2. 서브클래스 타입으로 다운캐스팅
		SmartPhone 내폰3 = (SmartPhone)엄마폰3;
		
		// 서브클래스 타입으로 접근 가능한 메서드 : 4개
		내폰3.call();
		내폰3.sms();
		내폰3.kakaoTalk();
		내폰3.youtube();
		
	}

}

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
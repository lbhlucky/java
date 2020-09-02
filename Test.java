public class Test {

	public static void main(String[] args) {
		
		SpiderMan sm = new SpiderMan();
		
		sm.isSpider = true;	// 스파이더 모드 설정
		
		sm.jump();	// 스파이더맨 클래스의 점프 기능 호출
		
		sm.isSpider = false;	// 스파이더 모드 해제
		
		sm.jump(); 	// SpiderMan 클래스의 jump() 메서드에서
		// 슈퍼클래스인 Person 클래스의 점프 기능이 호출됨
		
	}

}

class Person {
	String name;
	int age;
	
	public void eat() {
		System.out.println("밥 먹기!");
	}
	
	public void jump() {
		System.out.println("일반인의 점프!");
	}
	
}

class SpiderMan extends Person {
	// 스파이더맨모드 여부를 저장하는  boolean 타입 변수 isSpider 선언
	boolean isSpider;
	
	public void fireWeb() {
		System.out.println("거미줄 발사!!!");
	}

	// Person 클래스의 jump() 메서드 오버라이딩
	@Override
	public void jump() {
		// 스파이더모드(isSpider)가 true일 때,
		// "스파이더맨의 엄청난 점프!" 출력
		// Person 클래스 jump() 메서드를 호출
		if(isSpider) {	// isSpider == true와 동일
		System.out.println("스파이더맨의 엄청난 점프!");
		} else {
			// 슈퍼클래스의 jump()메서드 호출
			// => 은닉되어 있으므로 레퍼런스 super를 사용하여 호출
			super.jump();
		}
	
	}
	
}
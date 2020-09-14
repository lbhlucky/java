public class Ex {

	public static void main(String[] args) {
		SubClass sc = new SubClass();
		sc.normalMethod();		// 상속받은 일반메서드
		sc.abstractMethod1();	// MiddleClass 에서 구현한 추상메서드
		sc.abstractMethod2();	// SubClass 에서 구현한 추상메서드
		
		//추상클래스로 인스턴스 생성 불가
//		AbstractClass ac = new AbstractClass();
//		MiddleClass mc  = new MiddleClass();
		
		// 변수타입으로 사용되어 업캐스팅 활용은 가능!
		MiddleClass mc = sc;
		mc.normalMethod();		// 상속받은 일반메서드
		mc.abstractMethod1();	// MiddleClass 에서 구현한 추상메서드
		mc.abstractMethod2();	// SubClass 에서 구현한 추상메서드
		
		AbstractClass ac = sc;
		ac.normalMethod();		// 상속받은 일반메서드
		ac.abstractMethod1();	// MiddleClass 에서 구현한 추상메서드
		ac.abstractMethod2();	// SubClass 에서 구현한 추상메서드
		
	}	// main() 메서드 끝

}	// Ex 클래스 끝

// 추상클래스 AbstractClass 정의
abstract class AbstractClass {
	String var; // 일반 멤버변수
	
	public AbstractClass() {}
	
	public void normalMethod() {
		System.out.println("추상클래스의 일반 메서드()");
	}
	
	// 추상메서드 abstractMethod() 메서드 정의
	// => 현재 클래스를 반드시 추상클래스로 선언해야함
	public abstract void abstractMethod1();
	public abstract void abstractMethod2();

} // 추상클래스 AbstractClass 끝

// 추상클래스 AbstractClass를 상속받는 MiddleClass 정의
// => 2개의 추상메서드 중 하나의 메서드만 오버라이딩
abstract class MiddleClass extends AbstractClass {
	// 모든 추상메서드를 오버라이딩 하지 않고 일부만 구현할 경우
	// 여전히 추상메서드를 포함하게 되므로 일반클래스는 정의할 수 없다!
	// => 추상메서드를 모두 오버라이딩하서나, 현재클래스를 추상클래스로 선언!
	
	@Override
	public void abstractMethod1() {
		System.out.println("MiddleClass에서 구현한 추상메서드 abstractMethod1()");
	}
	
}

// MiddleClass 를 상속받는 SubClass 정의
// =>  MiddleClass에서 구현되지 않은 abstractMethod2() 메서드에 대한
//     구현 책임이 발생함! => 반드시 오버라이딩!!
class SubClass extends MiddleClass {

	@Override
	public void abstractMethod2() {
		System.out.println("SubClass에서 구현한 추상메서드 abstractMethod2()");
	}
	
}
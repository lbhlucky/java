public class Ex {

	public static void main(String[] args) {
		/*
		 * 인터페이스(Interface)
		 * - 다중 구현(implements)이 가능
		 *   => 하나의 서브클래스가 둘 이상의 부모 인터페이스를 가질 수 있다.
		 *   => 여러 부모인터페이스의 모든 추상메서드를 오버라이딩 해야함
		 * - 인터페이스끼리도 상속이 가능
		 *   => 인터페이스간의 상속은 implements 가 아닌 extends를 사용
		 *      왜냐하면, 추상메서드를 구현하는 것이 목적이 아니기 때문
		 */
	Subclass sc = new Subclass();
	sc.method1();		// Myinterface1의 추상메서드
	sc.method2();		// Myinterface2의 추상메서드
	
	// 인터페이스도 instaceof 연산자의 판별 대상이 될 수 있다!
	// sc는 Myinterface1 입니까?
	if(sc instanceof Myinterface1) {
		System.out.println("sc는 Myinterface1이 맞습니다!");
	} else {
		System.out.println("sc는 Myinterface1이 아닙니다!");
	}
	// sc는 Myinterface2입니까?	
	if(sc instanceof Myinterface2) {
		System.out.println("sc는 Myinterface2이 맞습니다!");
	} else {
		System.out.println("sc는 Myinterface2이 아닙니다!");
	}
	// sc -> Myinterface1
	Myinterface1 my1 = sc ;
	my1.method1();					// Myinterface1이 가진 추상메서드
	System.out.println(Subclass.NUM);	// Myinterface1이 가진 상수
	System.out.println(Myinterface1.NUM);	// 인터페이스명으로도 호출가능
	
	// sc -> Myinterface1
	Myinterface2 my2 = sc ;
	my2.method2();					// Myinterface2이 가진 추상메서드
	System.out.println(Subclass.NUM2);	// Myinterface2이 가진 상수
	System.out.println(Myinterface2.NUM2);
	}

}

interface Myinterface1 {
	
	public static final int NUM = 10;		// 상수
	
	public abstract void method1();			// 추상메서드
	
}

interface Myinterface2 {
	
	public static final int NUM2 = 20;			// [public static final] 생략 가능
	
	public abstract void method2();			// [public abstract] 생략가능
	
}

// Myinterface1 인터페이스를 구현하는 서브클래스 subclass 정의
class Subclass implements Myinterface1, Myinterface2 {

	// 부모 인터페이스로부터 상속받은 추상메서드 구현(오버라이딩) 필수!!
	@Override
	public void method1() {
		
		System.out.println("서브클래스에서 구현한 추상메서드 method1()!");
		
	}

	@Override
	public void method2() {

		System.out.println("서브클래스에서 구현한 추상메서드 method2()!");
		
	}
	
}











public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 정적(Static) 메서드
		 * - 메모리 로딩 시점은 정적 멤버변수와 동일함
		 * - 호출 방법도 정적 멤버변수와 동일함
		 * - 메서드 정의시 리턴타입 앞에 static 키워드를 붙여서 정의
		 * - static 메서드 내에서는 래퍼런스 this 사용불가!
		 *   => 래퍼런스 this 에 저장되는 인스턴스 주소는
		 *	    인스턴스가 생성되는 시점에서 만들어지므로
		 * 	    static 멤버가 로딩되는 시점에서는 접근 불가능하다!
		 */
		
		// 인스턴스 생성 전 클래스명을 사용하여 멤버메서드 호출
		StaticEx2.staticMethod();	// 정적 멤버 메서드 호출 가능
//		StaticEx2.normalMethod();	// 인스턴스 멤버 메서드 호출 불가능

		
		// 인스턴스 생성 후 멤버메서드 호출
		StaticEx2 se = new StaticEx2();
		
		se.normalMethod();
		se.staticMethod();	// 인스턴스를 통해 접근해서 메서드 호출도 가능하지만
							// 클래스명으로 접근하는 것을 권장함
		
		System.out.println("================================================================");
		
		// static 멤버도 private 접근제한자 사용 시 외부클래스에서 접근 불가능!
//		System.out.println("StaticEx3 = " +StaticEx3.a);
		
		// 따라서, Getter/Setter를 사용하여 static멤버에 접근해야함
		StaticEx3 ex3 = new StaticEx3();
		System.out.println("StaticEx3.getA() = " +ex3.getA());

		// static 메서드로 정의 시 클래스명만으로 접근이 가능해진다!
		System.out.println("StaticEx3.getA() = " +StaticEx3.getA());
	}

}

class StaticEx2 {
	
	public void normalMethod() {
		System.out.println("일반메서드 normalMethod()");
	}
	
	public static void staticMethod() {
		System.out.println("정적메서드 staticMethod()");
	}
	
}

class StaticEx3 {
	// static 멤버변수와 static 메서드 정의 시 주의사항!!
	private static int a = 10;		// 클래스 로딩(인스턴스 생성 전)시 함께 로딩됨
	private int b = 20;				// 인스턴스 생성 시 로딩됨
	
	public static void print() {
		// static 메서드 내에서는 인스턴스 멤버변수도 사용 불가!
		// => 클래스(static 멤버) 로딩 시점에서는
		//	  인스턴스 멤버는 생성되기 전이기 때문(this와 동일)
		System.out.println("a= " +a);
//		System.out.println("b= " +b);	// 오류 발생! 접근 불가!
	}
	
	
	//========================================================
	public static int getA() {
		return a;
	}

	// static 멤버변수 a의 값을 전달받아 초기화하는 Setter 메서드 정의
	public static void setA(int a) {
		// static 메서드 내에서는 래퍼런스 this 사용불가!
		// => 래퍼런스 this 에 저장되는 인스턴스 주소는
		//	  인스턴스가 생성되는 시점에서 만들어지므로
		// 	  static 멤버가 로딩되는 시점에서는 접근 불가능하다!
//		this.a = a;		// 오류발생!
		
		// 래퍼런스 this 대신 클래스명을 통해 접근하면 된다!
		StaticEx3.a = a;
	}
	
	//========================================================
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
	
}



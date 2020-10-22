package packOne;

public class Parent2 {
	public int publicVar = 10;		// 누구나 접근 가능
	protected int protectedVar = 20;	
									// 같은 패키지 or 다른 패키지의 상속관계 접근 가능
	int defaultVar = 30;			// 같은 패키지 접근 가능
	private int privateVar = 40;	// 자신의 클래스 내에서만 접근 가능
}

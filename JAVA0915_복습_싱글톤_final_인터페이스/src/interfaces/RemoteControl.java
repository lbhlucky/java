package interfaces;

/*
 * 인터페이스(Interface)
 * - 어떤 객체와 개발자 사이의 접점(중계)역할
 * - 인터페이스 정의 시 class 키워드 대신 interface 키워드를 사용
 * - 인터페이스는 상수와 추상메서드만 가질 수 있음
 *   1) 상수 : public static final을 사용하여 선언하며 생략도 가능
 *   2) 추상메서드 : public abstract를 사용하여 정의하며 생략도 가능
 * - 추상클래스와 마찬가지로 객체 생성이 불가능하며, 상속 전용으로 사용
 *   단, 데이터타입으로는 사용 가능하므로, 다형성 활용이 가능!
 */

public interface RemoteControl {
	// 인터페이스 내의 모든 변수는 상수(public static final)로 취급됨
	public static final int MAX_VOLUME = 100;	// 상수
	public static final int MIN_VOLUME = 0;		// 상수
	
	int MAX_CHANNEL = 100;						// 상수(public static final 생략되어있음)
	public int MIN_CHANNEL = 1;					// 상수(static final 생략되어있음)
	
	// 인터페이스 내의 모든 메서드는 추상메서드(public abstract)로 취급됨
//	public void turnPower() {};		
	public void turnPower();
	
	public abstract void channelUp();					// 추상메서드		
	public abstract void channelDown();					// 추상메서드
	public abstract void changeChannel(int channel);	// 추상메서드
	
	void volumelUp();	// 추상메서드(public abstract 생략되어있음) 
	void volumeDown();	// 추상메서드(public abstract 생략되어있음) 
	
}





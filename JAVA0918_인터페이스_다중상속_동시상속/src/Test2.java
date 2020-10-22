public class Test2 {

	public static void main(String[] args) {
				
		LgTv lg = new LgTv();
		
		lg.powerOn();
		lg.volumeUp();
		lg.volumeDown();
		lg.changeChannel(3);
		lg.function3D();
		lg.powerOff();
		
		System.out.println("현재 넷플릭스 객체는? " +lg.netflix);
		lg.setNetflixAccount("root");
		System.out.println("현재 넷플릭스 객체는? " +lg.netflix);
		
		// LgTv 인스턴스가 갖고 있는 Netflix 인스턴스 내의
		// showNetflix() 메서드 호출
		lg.netflix.showNetflix();
		
	}

}
// Tv와 Speaker 인터페이스의 공통메서드인 volumeUP/Down()을
// 추출하여 부모인터페이스인 VolumeControl 인터페이스로 추상화
interface Control {
	public abstract void powerOn();
	public abstract void powerOff();
	
	public abstract void volumeUp();
	public abstract void volumeDown();
}

// Tv 인터페이스 정의
interface Tv extends Control {
//	public abstract void powerOn();
//	public abstract void powerOff();
//	public abstract void volumeUp();
//	public abstract void volumeDown();
	public abstract void changeChannel(int channel);
}

// Speaker 인터페이스 정의
interface Speaker extends Control {
//	public abstract void powerOn();
//	public abstract void powerOff();
//	public abstract void volumeUp();
//	public abstract void volumeDown();
}

class SamsungTv implements Tv, Speaker {

	@Override
	public void powerOn() {
		System.out.println("SamsungTv 전원 켜짐~");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTv 전원 꺼짐~");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("SamsungTv 볼륨 올림~");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("SamsungTv 볼륨 내림~");
		
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("SamsungTv의"+ channel + "번으로 채널 바꿈~");
		
	}
	
	public void functionSmart() {
		System.out.println("SamsungTv의 스마트기능");
	}
	
	
}

class Netflix {
	String account;

	public Netflix(String account) {
	
		this.account = account;
		
	}
	
	public void showNetflix () {
				
		System.out.println("Netflix 기능!");
	}
}

class LgTv implements Tv, Speaker {
	// Netflix 기능은 별도의 상속을 거치지 않고
	// 클래스 내에서 has-a 관계로 포함시켜 사용할 수 있다!
//	Netflix netflix = new Netflix("root");		// 인스턴스 바로 생성
	Netflix netflix;
	
	public void setNetflixAccount(String account) {
		// 넷플릭스에서 사용할 계정을 전달받아
		// 넷플릭스 인스턴스를 생성하면서 생성자에 계쩡 전달
		// => 생성된 인스턴스를 Netflix 타입 멤버변수에 저장
		netflix = new Netflix(account);
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTv 전원 켜짐~");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LgTv 전원 꺼짐~");
		
	}

	@Override
	public void volumeUp() {
		System.out.println("LgTv 볼륨 올림~");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("LgTv 볼륨 내림~");
		
	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("LgTv의 " + channel + "번으로 채널 바꿈~");
		
	}
	public void function3D() {
		System.out.println("LgTv의 3D기능");
	}
	
}




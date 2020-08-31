public class Test {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정", 10);
		
		System.out.println("모델 : " +dmbCellPhone.model);
		System.out.println("색상 : " +dmbCellPhone.color);
		
		System.out.println("채널 : " +dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		dmbCellPhone.powerOff();
	}
	
}

class CellPhone {
	String model;
	String color;
	
	public void powerOn() {
		System.out.println("전원을 킵니다!");
	}
	
	public void powerOff() {
		System.out.println("전원을 끕니다!");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다!");
	}
	
	public void sendVoice(String message) {
		System.out.println("자기 : " +message);
	}
	
	public void receiveVoice(String message) {
		System.out.println("상대방 : " +message);
	}
	
	public void hangUp() {
		System.out.println("전화를 끊습니다!");
	}
	
}

class DmbCellPhone extends CellPhone{
	int channel;
	
	public DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	public void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다!" );
	}
	
	public void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다!");
	}
	
	public void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다!");
	}
	
}


import javax.swing.JFrame;

public class Ex5 {

	public static void main(String[] args) {
		
		MyFrame mf = new MyFrame();
		
		
		
	}

}

// 조그만 창 만들기
// java도 만들 수 있음

// javax.swing.JFrame 클래스를 상속받는 MyFrame 클래스를 상속
class MyFrame extends JFrame {
	
	public MyFrame () {
		showFrame();
	}
	
	public void showFrame() {
		// JFrame 클래스의 setTitle() 메서드를 호출하여 
		// 문자열 전달 => 프레임의 제목표시줄 내용 출력
		setTitle("프레임연습setTitle()"); 	// 외부에서 전달받아 저장
		
		// JFrame 클래스의 setSize() 메서드 호출하여
		// 정수 2개 전달 => 프레임 크기(가로, 세로) 설정
		setSize(300, 200);
		
		// JFrame 클래스의 setVisible() 메서드 호출하여
		// 논리형 데이터 1개 전달 => 화면 표시 여부 설정
		setVisible(true);
	}
	
}
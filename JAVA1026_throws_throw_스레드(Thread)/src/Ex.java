public class Ex {

	public static void main(String[] args) {
		/*
		 * 싱글 쓰레드(Single Thread)
		 * 
		 * - 하나의 main 쓰레드가 main() 메서드 내의 코드를 차례대로 실행
		 * 
		 * - 하나의 작업 수행이 끝난 뒤 다음 작업이 실행되는 구조
		 *   => 특정 작업이 끝나지 않으면 다음 작업이 실행되지 못함
		 */
		NoThread nt1 = new NoThread("A작업", 1000000);
		NoThread nt2 = new NoThread("B작업", 100000);
		NoThread nt3 = new NoThread("C작업", 1000000);
		
		nt1.run();
		nt2.run();	// nt1.run() 메서드 실행이 종료되면 실행됨
		nt3.run();	// nt1.run(), nt2.run() 메서드 실행이 종료되면 실행됨
		
		
	}

}


class NoThread {
	String name;
	int count;
	
	public NoThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}
	
	public void run() {
		for(int i = 1 ; i <= count ; i++) {
			System.out.println(name + " : " + i);
		}
	}
	
}



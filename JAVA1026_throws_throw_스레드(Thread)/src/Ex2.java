public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 멀티 쓰레드(Multi Thread)환경
		 * 
		 * - 하나의 프로세스(Process) 내에서 여러 작업들을
		 *   번갈아 가면서 처리할 수 있도록 구현한 환경
		 *   ex) 메신저에서 파일을 전송하면서 채팅 메세지를 입/출력 시
		 *       파일 전송 쓰레드, 메세지 입력 쓰레드, 메세지 출력 쓰레드로 
		 *       세 가지 작업을 번갈아가며 수행하기 때문에  하나의 작업이
		 *       진행 중이더라도 다른 작업을 대기하지 않고 번갈아가며 수행하여
		 *       마치 동시에 수행되는 것처럼 만드는 것
		 *       
		 * - 멀티 쓰레딩으로 구현된 프로그램은 동작 속도가 빨라지는 것보다
		 *   대기없이 여러작업을 번갈아가며 빠르게 수행하는데 중점을 둔다!
		 *   
		 *   
		 * < 멀티 쓰레드 환경 구현 방법 2가지 >
		 * 멀티 쓰레드를 구현할 클래스를 구현할 때
		 * 1. Thread 클래스를 상속받아 정의
		 *   - run() 메서드를 오버라이딩한 후 멀티쓰레딩으로 처리할 코드를 기술
		 *   
		 *   - Thread를 구현한 클래스 객체의 run()메서드를 호출하는 것이 아니라,
		 *     반드시 start()메서드를 호출해야한다!!!
		 *     
		 * 2. Runnable 인터페이스를 구현하여 정의
		 *   - 다른 클래스를 상속받은 경우 Thread 클래스 상속이 불가능하므로
		 *     이 때, Runnable 인터페이스를 구현하는 클래스를 정의
		 *     
		 *   - Thread 클래스와 마찬가지로 run() 메서드 오버라이딩은 동일함
		 *   
		 *   - 단, Runnable 인터페이스 내에 start() 메서드가 존재하지 않으므로
		 *     Thread 클래스의 인스턴스를 통해 Runnable 구현체를 전달하고
		 *     Thread 객체의 start() 메서드를 호출하여 간접적으로 실행해야함
		 */
		
		// 1. Thread 클래스를 상속받아 정의한 객체 사용시
		MyThread mt1 = new MyThread("A작업", 50);
		MyThread mt2 = new MyThread("B작업", 10);
		MyThread mt3 = new MyThread("C작업", 100);
		
//		mt1.run();
//		mt2.run();	// nt1.run() 메서드 실행이 종료되면 실행됨
//		mt3.run();	// nt1.run(), nt2.run() 메서드 실행이 종료되면 실행됨
		// 주의! run() 메서드를 직접 호출하는 것이 아니라
		// 		 start()메서드를 호출해야 멀티쓰레딩이 수행됨
		
//		mt1.start();
//		mt2.start();
//		mt3.start();
		// => mt1.run(), mt2.run(), mt3.run() 메서드가 번갈아가며 수행됨
		//    수행횟수, 수행순서 등은 스케줄러에 따라 항상 변할 수 있음
		//	  즉, 실행 결과가 항상 같을 수 없다.
		
		System.out.println("=====================================================");
		
		// 2. Runnable 인터페이스를 구현하여 정의한 구현체 사용 시
		YourThread yt1 = new YourThread("A작업", 50);
		YourThread yt2 = new YourThread("B작업", 10);
		YourThread yt3 = new YourThread("C작업", 100);
		
//		yt1.start();	// 호출 불가능한 메서드(존재하지 않음)
//	    => 반드시, Thread 클래스의 객체를 통해
//	       Runnable 인터페이스를 구현한 구현체 클래스 인스턴스를 전달하고
//	       Thread 객체의 start() 메서드를 호출해야한다!
		
		Thread t1 = new Thread(yt1);
		Thread t2 = new Thread(yt2);
		Thread t3 = new Thread(yt3);
		
		// Thread 객체의 start() 메서드를 호출하여 간접적으로 실행
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}

// 멀티 쓰레드 환경을 구현할 MyThread 클래스 정의
// => 1. java.lang.Thread 클래스를 상속받아 정의
// =>    멀티 쓰레딩으로 처리할 코드들은 run() 메서드를 오버라이딩 한 후 기술
class MyThread extends Thread{
	String name;
	int count;
	
	public MyThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	@Override
	public void run() {
		// 멀티 쓰레딩으로 처리될 코드를 기술하는 공간(메서드)
		for(int i = 1 ; i <= count ; i++) {
			System.out.println(name + " : " + i);
		}
	}
	
}


// 2. java.lang.runnable 인터페이스를 구현하여 정의
// => Thread 클래스와 마찬가지로 run()메서드를 오버라이딩
class YourThread implements Runnable{

	String name;
	int count;
	
	public YourThread(String name, int count) {
		super();
		this.name = name;
		this.count = count;
	}

	@Override
	public void run() {
		// 멀티 쓰레딩으로 처리될 코드를 기술하는 공간(메서드)
		for(int i = 1 ; i <= count ; i++) {
			System.out.println(name + " : " + i);
		}
	}
	
}
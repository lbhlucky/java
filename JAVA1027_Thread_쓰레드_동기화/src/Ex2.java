
public class Ex2 {

	public static void main(String[] args) {
		
		// 현재 동작중인 쓰레드 객체 가져오기
		// => 현재 코드를 실행하는 쓰레드 객체 가져오기
		Thread mainThread = Thread.currentThread();
		System.out.println("현재 쓰레드명" + mainThread.getName());
		
		Thread threadA = new Thread();
		System.out.println("threadA 쓰레드명" + threadA.getName());
		
		Thread threadB = new Thread();
		System.out.println("threadB 쓰레드명" + threadB.getName());
		
		// Thread 생성자에 문자열을 전달하여 쓰레드명 지정 가능
		Thread threadC =  new Thread("Thread C");
		System.out.println("threadC 쓰레드명" + threadC.getName());
		
		threadC.setName("Thread-C");
		System.out.println("threadC 쓰레드명" + threadC.getName());

	}

}

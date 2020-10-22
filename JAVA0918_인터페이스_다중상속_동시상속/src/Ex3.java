public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 인터페이스의 필요성(장점)
		 * 1. 구현의 강제로 표준화
		 *   - 추상메서드를 갖는 인터페이스를 서브클래스에서 상속받으면
		 *     반드시 추상메서드를 구현해야함
		 *     => 따라서, 개발자가 실수로 구현을 빠뜨릴 위험이 없다!
		 *     
		 * 2. 모듈 교체가 쉬움
		 *   - 인터페이스를 통해 업캐스팅을 사용하여 다형성을 적용시켜
		 *     단순한 모듈(객체) 교체만으로 동일한 코드를 사용하여
		 *     여러 객체를 다룰 수 있게 됨
		 *   - 또한, 새로운 모듈이 추가되더라도 기존 인터페이스 구현체라면
		 *     별도의 코드 수정 없이 객체릐 교체만으로 그대로 사용 가능!
		 *     
		 * 3. 상속 관계가 없는 클래스끼리 관계 부여 가능 => 다형성 확장
		 * 
		 * 4. 모듈간 독립적 프로그래밍으로 개발 시간 단축   
		 */
		
		// 예제> ==== 2. 모듈 교체가 쉬움 ====
		// 다형성을 활용하지 않는 방법
		LaserPrinter lp = new LaserPrinter();
		lp.print("Ex.java");
		
		DotPrinter dp = new DotPrinter();
		lp.print("Ex.java");
		// ------------------------------------------------------------------------------------------
		// 일반적인 다형성 활용
		// 부모 인터페이스 타입으로 업캐스팅하여 사용
		// => 인터페이스 내에 존재하는 상수와 추상메서드에만 접근 가능
		Printer p = new LaserPrinter();
		p.print("Ex.java");
		
		p = new DotPrinter();
		p.print("Ex.java");
		
		// ------------------------------------------------------------------------------------------
		
		System.out.println("-------------------------------------------------");
		
		// PrintClient 인스턴스 생성
		// 별로의 클래스를 정의하여 부모 인터페이스 타입 객체를 전달받아 사용
		// => 인터페이스의 멤버 외에 별도의 클래스에서 정의한 멤버도 사용 가능
		PrintClient pc = new PrintClient();
		
		pc.setPrinter(new LaserPrinter());
		pc.print("Ex.java");
		
		pc.setPrinter(new DotPrinter());
		pc.print("Ex.java");
		
		// 만약, InkjetPrinter 가 추가되더라도 Printer 를 구현했다면
		// 별도로 PrintCLient 클래스를 수정할 필요없이
		// setPrinter() 메서드 파라미터로 InkgetPrinter 객체만 교체하면
		// 얼마든 새로운 Printer 타입 객체를 다룰 수 있다.
//		pc.setPrinter(new InkJetPrinter());
//		pc.print("Ex.java");
	}

}

// 2. 모듈 교체가 쉬움
interface Printer {
	
	public void print(String fileName);
	
}

class LaserPrinter implements Printer {
	@Override
	public void print(String fileName) {
		
		System.out.println("LaserPrinter로 출력중 - " +fileName);
		
	}
	
}

class DotPrinter implements Printer {
	@Override
	public void print(String fileName) {
	
		System.out.println("DotPrinter로 출력중 - " +fileName);
	
	}	
	
}

class PrintClient {
	
	private Printer printer;	// 인터페이스 타입 참조변수 선언

	// 외부로부터 Printer 타입 인스턴스를 전달받아 초기화하는 Setter 정의
	public void setPrinter(Printer printer) {
		// Printer 타입으로 전달받을 수 있는 인스턴스는
		// LaserPrinter, DotPrinter
		this.printer = printer;
		
	}
	
	public void print(String fileName) {
		// Printer 타입 객체 내의 print() 메서드 호출하여
		// 전달받은 fileName에 내용 출력하도록 요청
		printer.print(fileName);
	}
	
}

















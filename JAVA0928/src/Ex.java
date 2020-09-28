import org.omg.CORBA.Request;

public class Ex {

	public static void main(String[] args) {
		/*
		 * Wrapper 클래스
		 * - 자바의 기본 데이터타입 8가지에 대응하는 8개의 클래스들의 모음
		 * 
		 * - 기본 데이터타입		Wrapper클래스명
		 * 		byte					Byte
		 * 		short					Short
		 * 		char					Character
		 * 		int						Integer
		 * 		long					Long
		 * 		float					Float
		 * 		double					Double
		 * 		boolean					Boolean
		 * 
		 * - 기본 데이터 타입 변수로 할 수 있는 작업은 데이터 관리뿐이지만
		 *   Wrapper 클래스를 활용하여 객체(참조데이터타입)로 관리하게 되면
		 *   Wrapper 클래스가 제공하는 메서드, 상수 등의 활용이 가능하므로
		 *   보다 다양한 데이터 처리가 가능해진다.
		 * 
		 * - 기본데이터타입 -> 참조데이터타입으로 변환하는 과정 = 박싱
		 *   => 스택 영역의 값을 힙 영역(박스)에 포장
		 *   참조데이터타입 -> 기본데이터타입으로 변환하는 과정 = 언박싱
		 *	 => 힙 영역(박스)의 내용들을 꺼내서 스택 영역에 전달   
		 * 
		 * - 박싱과 언박싱은 컴파일러에 의해 자동으로 변환되어 질 수 있으므로
		 * 	 오토박싱, 오토언박싱이라고도 함 (Java 1.5버전부터 가능)
		 * 
		 * - 객체를 별도로 생성하지 않아도 Wrapper 클래스의 static 멤버인
		 *   다양한 메서드 및 상수가 제공되어 여러 작업 수행 가능
		 *   (Wrapper 클래스명.xxx 형태로 접근 가능)
		 */
		
		// 각 Wrapper 클래스에서 제공하는 static 멤버 활용
		// 상수를 황용하여 미리 생성되어 있는 값 활용 가능
		System.out.println("byte 타입 최소값 : " +Byte.MIN_VALUE);
		System.out.println("byte 타입 최대값 : " +Byte.MAX_VALUE);
		System.out.println("short 타입 최소값 : " +Short.MIN_VALUE);
		System.out.println("short 타입 최대값 : " +Short.MAX_VALUE);
		System.out.println("int 타입 최소값 : " +Integer.MIN_VALUE);
		System.out.println("int 타입 최대값 : " +Integer.MAX_VALUE);
		System.out.println("long 타입 최소값 : " +Long.MIN_VALUE);
		System.out.println("long 타입 최대값 : " +Long.MAX_VALUE);
		
		// 메서드를 활용하여 다양한 데이터 처리 수행 가능
		System.out.println("10, 20 중 최대값 : " +Integer.max(10, 20));
//		String age = Request.getParameter("age");
		int age = Integer.parseInt("20");
		
		System.out.println("==================================================================================");
		
		int num1 = 10;	// 기본 데이터타입 변수 선언 및 초기화
		System.out.println("int num1 : " +num1);
		// 기본 데이터타입(스택) -> 참조 데이터타입(힙)으로 변환
		//			int						Integer
		// => integer 객체 생성시 파라미터로 int형 데이터 전달하여 변환
		Integer n1 = new Integer(num1);	// int -> Integer 박싱(Boxing)	
		System.out.println("Integer n1 : " +n1.toString());
		
		num1 = 99;
		n1 = num1;	// int -> Integer 오토박싱(Auto Boxing)
		// => int형 변수 값은 Integer 타입 변수에 그냥 대입하면
		//	  컴파일러에 의해 자동으로 박싱 과정이 수행되므로
		//    기본 데이터타입이 참조 데이터타입(객체)으로 자동으로 변환됨
		
		// -----------------------------------------------------
		Integer n2 = 100;
		// ing형 리터럴을 직접 Integer 타입 변수에 대입 가능
		// => 변수와 동일하게 오토박싱이 일어남
		
		// 참조 데이터타입(힙) -> 기본 데이터타입(스택)으로 변환
		//			Integer					int
		// => integer 객체 생성시 파라미터로 int형 데이터 전달하여 변환
		// Integer -> int형으로 변환할 때 
		// intValue() 메서드 호출하여 변화 = 언박싱(Unboxing)
		int num2 = n2.intValue();
		
		System.out.println("Integer n2 : " +n2);
		System.out.println("int num2 : " +num2);
		
		num2 = n2;		// Integer => int로 자동 변환 = 오토 언박싱

		// Wrapper 클래스타입 객체와 기본 데이터타입 값 비교하는 방법
		// 1. Wrapper 클래스타입 객체의 equals() 메서드 사용하여 비교
		if(n2.equals(num2)) {		// 둘 다 객체일 경우	
			System.out.println("n2와 num2는 같다!");
		} else {
			System.out.println("n2와 num2는 다르다!");
		}
		
		// 2. 동등비교연산자를 사용하여 비교
		// => 주의! Wrapper 클래스타입 객체끼리 동등 비교연산 사용 금지
		//	  => 객체의 주소값을 언방싱 후 num2와 비교
		if(n2 == num2) {	// n2를 기본데이터 타입을 꺼내서 비교해야함
			System.out.println("n2와 num2는 같다!");
		} else {
			System.out.println("n2와 num2는 다르다!");
		}
		
	}

}




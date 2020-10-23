public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 예외(Exception)
		 * - 오류(Error)는 시스템의 치명적인 문제로 인해 발생하는 문제이며,
		 *   개발자가 코드 상에서 해결이 불가능한 물제를 말하지만
		 *   예외(Exception)는 코드 상에서 실수 등으로 인해 발생하는 문제이며,
		 *   개발자가 코드 상에서 해결이 가능한 문제
		 *   
		 * - 예외가 발생할 경우 발생 시점에서 프로그램은 비정상적으로 종료됨
		 * 
		 * - 예외가 발생했을 때 프로그램이 비정상적으로 종료되지 않도록
		 *   추가적인 작업을 수행하여 정상적으로 종료되도록 하는 것을
		 *   예외 처리(Exception Handling)라고 한다.
		 *   
		 * - 예외가 발생되면 해당 예외에 대한 처리를 담당하는 클래스의
		 *   객체를 생성한 뒤 예외 메세지를 포함하여 예외를 던짐(throw)
		 *   => 따라서, 해당 객체를 전달받아 예외를 처리해야함
		 *   => try-catch 문을 사용하여 기본적으로 예외 처리가 가능
		 * 
		 * - 예외가 발견되는 시점에 따라 Complie Checked Exception 계열과
		 *   Compile Unchecked Exception 계열로 나뉨
		 *   1) Compile Checked Exception : 컴파일 시점(코드 작성 시점)에서
		 *      예외 처리 여부를 판단하여 예외가 처리되지 않으면 예외 발생 알림
		 *      ex) IOException, SQLException, FileNotFoundException 등
		 *   2) Compile Unchecked Exception : 컴파일 시점에서는 예외 처리 여부를
		 *      검사하지 않고, 실행 시점에서 예외가 발생하면 예외 발생 알림
		 *      ex) RuntimeException 계열(ArithmeticException 등) 
		 * 
		 * < Runtime Exception 계열(Compile Unchecked Exception 계열) >
		 * - 컴파일 시점에서는 예외가 발견되지 못하고,
		 *   (컴파일 시점에서 예외 처리 여부를 검사하지 않음)
		 *   실행 시점에서 예외가 발견됨
		 * 1. ArithmeticException
		 *   - 수치 데이터를 0으로 나눌 때 발생하는 예외 등
		 * 2. ArrayIndexOutOfBoundsException
		 *   - 배열 인덱스가 잘못 되었을 경우 발생하는 예외
		 * 3. NullPointerException
		 *   - 참조 변수에 null 값이 저장된 상태에서 참조할 경우
		 *     (=> null이 저장된 참조 변수의 .xxx()형태로 메서드 호출 시)
		 * 4. ClassCastException
		 *   - 객체의 강제 형변환 시 잘못 되었을 경우 발생
		 */
		
		System.out.println("프로그램 시작!");
		
		int num = 3;
//		System.out.println(num / 0);	// ArithmeticException 예외 발생
		// 예외 발생 시점부터 나머지 모든 코드의 실행이 불가능하며
		// 프로그램이 비정상적으로 종료됨
		
		int[] arr = new int[3];
//		arr[3] = 10;	// ArrayIndexOutOfBoundsException 예외 발생
		
		String str = null;
//		System.out.println(str.length());	// NullPointerException 예외 발생
		
		Animal ani = new Dog();
//		Cat cat = (Cat)ani;		// ClassCastException 예외 발생
		
		System.out.println("프로그램 종료!");
		
	}
	
}

class Animal {}

class Dog extends Animal {}

class Cat extends Animal {}
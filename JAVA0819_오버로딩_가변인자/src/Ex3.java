public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 가변 인자 (비정형 인자, variable Aguments)
		 * 
		 * - 메서드 정의 시 파라미터(매개변수)에 전달되는 인자
		 *   유동적일 때 일정 갯수가 정해져 있지 않으므로 변수 선언이 어렵다.
		 *   따라서, 이렇게 유동적인 인자의 갯수를 모두 처리할 수 있도록
		 *   가변 인자를 사용하여 변수를 선언하면
		 *   동일한 타입의 갯수가 제한이 없는 인자를 모두 전달받을 수 있다.
		 *   
		 * - 가변 인자 형태로 선언되는 매개변수는 전달받은 데이터를
		 *   해당 이름을 가진 배열 형태로 관리함
		 *   
		 * - 가변인자에 전달될 데이터는 0개부터 자유롭게 전달 가능
		 * 
		 * < 주의 사항! >
		 * 가변 인자는 마지막 파라미터로 단 한 번만 사용 가능하다!
		 *   
		 * < 가변 인자를 사용한 메서드 정의 기본 문법 >
		 * [제한자] 리턴 타입 메서드명 (데이터타입... 변수명) {
		 * 		// => 전달 되는 데이터들이 가변인자 변수명의 배열로 관리됨
		 * }
		 */
				
		VariableAguments va = new VariableAguments();
//		va.normalPrint();		// 오류 발생!
//		va.normalPrint(10);		// 오류 발생!
		va.normalPrint(10, 20);
		va.normalPrint(10, 20, 30);
//		va.normalPrint(10, 20, 30, 40);		// 오류 발생!
		
		System.out.println("==================================================");
		
		// 가변인자를 사용한 메서드 호출 시 전달할 파라미터 갯수 제한 없음
		va.varargsPrint(10);
		System.out.println();
		
		va.varargsPrint(10, 20);
		System.out.println();
				
		va.varargsPrint(10, 20, 30);
		System.out.println();
		
		va.varargsPrint(10, 20, 30, 40);
		System.out.println();
		
		va.varargsPrint();	// 전달할 데이터가 없어도 호출 가능
		System.out.println();
		
	}

}

class VariableAguments{
	
	// 가변인자(비정형인자)를 활용한 메서드
	// => 하나의 메서드 정의만으로 갯수가 다른 파라미터를 모두 처리 가능
	public void varargsPrint(int... nums ) {
		// 외부로부터 전달되는 정수형 데이터는 갯수 제한없이
		// 모두 nums 이름을 갖는 배열에 저장됨
		// => 반복문을 사용하여 배열 내의 모든 데이터에 접근하여 저장된 데이터 사용
		// 1) 일반 for문
		for(int i = 0; i < nums.length ; i++) {
			System.out.printf("%d번째 인덱스 = %d \n", i, nums[i]);
		}
		// 2) 향상된 for문
		for(int num:nums) {
			System.out.println(num + " ");
		}
		
	}

	// 주의 사항!
	// 가변인자는 마지막 인자로 단 한 번만 사용 가능
	public void varargsPring2(String title, int... nums ) {}
		// => 가변인자 앞에 다른 매개변수가 있더라도, 마지막이 가변인자면 ok
	
	
//	public void varargsPring2(int... nums, String title ) {}
		// => 가변인자 뒤에 다른 매개변수가 올 수 없다!
	
//	public void varargsPring2(int... nums, String... title) {}
		// => 가변인자 뒤에 다른 매개변수가 올 수 없으므로 
		//    2개 이상의 가변인자 사용도 불가능하다!

	
	
	//----------------------------------------------------------------------------
	
	// 정수 2개(n1, n2)를 전달받아 출력하는 print()메서드 정의
	public void normalPrint(int n1, int n2) {
		System.out.println(n1 + ", " + n2);
	}
	
	// 정수 3개(n1, n2, n3)를 전달받아 출력하는 print()메서드 정의
	public void normalPrint(int n1, int n2, int n3) {
		System.out.println(n1 + ", " + n2 + ", " + n3);
	}
	
	// => 전달되는 데이터가 2개 또는 3개의 경우에만 메서드가 호출되고
	//    0개, 1개 또는 4개 이상의 경우에는 일치하는 매개변수가 없으므로
	//    호출되지 못하고 오류가 발생한다.
	
}
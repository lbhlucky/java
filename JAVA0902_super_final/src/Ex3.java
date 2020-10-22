public class Ex3 {

	public static void main(String[] args) {
		/*
		 * final 키워드
		 * - 클래스, 메서드, 변수 선언시 변경의 마지막을 지정
		 * - 멤버변수에 final 키워드 사용 시 : 변수 값 변경 금지(= 상수로 취급됨!)
		 * 	 => final 키워드가 붙은 변수(상수)는 일반 변수와 구분하기 위해
		 *      대문자로 변수명을 작성함(단어 구분은 언더바(_)사용
		 * - 메서드에 final 키워드 사용 시 : 메서드 변경 금지(= 오버라이딩 금지!)
		 * - 클래스에 final 키워드 사용 시 : 클래스 변경 금지(= 상속 금지!)
		 *   
		 * >> 대표적인 final 클래스 : java.lang.String, java.lang.Math 등 
		 */
		
		FinalVariable fv = new FinalVariable();
		fv.num1 = 100;		// 일반 멤버변수는 값변경 가능
//		fv.num2 = 200;		// final 키워드가 선언된 변수(상수)는 값 변경 불가능
		// => The final field FinalVarable.b cancot be assigned
		
		
	}

}

// 1. 멤버변수에 final 키워드 사용 => 값 변경 불가 (상수 취급)
class FinalVariable {
	int num1 = 10;			// 일반 멤버변수(차후에 값 변경 가능)
//	final int num2 = 20;	// 상수로 취급됨(차후에 값 변경 불가능)
	final int NUM2 = 20;	// 상수로 취급됨(차후에 값 변경 불가능)
	final String SCHOOL_NAME = "아이티윌";	// 단어 구분은 언더바(_) 사용
}

//-------------------------------------------------------------------------

// 2. 메서드에 final 키워드 사용 => 오버라이딩 불가
class FinalMethod {
	
	public void normalMethod() {
		System.out.println("일반 메서드!");
	}
	
	public final void finalMethod() {
		System.out.println("final 메서드!");
	}
	
}

class FinalMethodSubClass extends FinalMethod {
	
	public void normalMethod() {
		System.out.println("일반 메서드!");
		finalMethod(); 	// final 메서드를 호출하는 것은 가능!
	}
	
	// final 제한자가 사용된 메서드는 오버라이딩이 불가능!
	// => Cannot override the final method from FinalMethod
//	public final void finalMethod() {
//		System.out.println("final 메서드!");
//	}
	
}

// -------------------------------------------------------------------------

// 3. 클래스에 final 키워드 사용 => 상속 금지
final class FinalClass {}

// final 제한자가 붙은 클래스를 상속받는 경우
//  => 상속 불가능한 클래스이므로 오류 발생!!
//		The type FinalClassSubClass cannot subclass the final class FinalClass
//class FinalClassSubClass extends FinalClass{}

class HasAClass {
	// final 클래스는 상속은 불가능 하지만, 인스턴스 생성을 통해 사용 가능
	FinalClass fc = new FinalClass();	
}









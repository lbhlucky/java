public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 제네릭 타입의 파라미터 타입 재현
		 * 
		 * - 제네릭 타입으로 사용된 타입 파라미터에는
		 *   Object 타입을 비롯한 모든 타입을 지정 가능한데
		 *   만약, 특정 타입만 지정하도록 강제하려면
		 *   extends 키워드를 사용하여 타입 파라미터의 강제성을 부여 가능
		 *   
		 * - 인터페이스를 타입 제한용으로 지정할 때에도 extends 사용  
		 *   
		 *  < 기본 문법 > 
		 *  class 클래스명<제네릭타입명 extends 클래스타입> {}
		 *  => 인스턴스 생성 시점에서 지정 가능한 제네릭타입은
		 *     Number 클래스와 Number클래스의 서브클래스 타입만 지정 가능
		 *     (ex. Integer, Double 등)
		 */
		
		// NumberBox 클래스의 제네릭타입은 Number 타입까지만 사용 가능하므로
		// String 등 Number 타입이 아닌 타입 지정 불가능
//		NumberBox<String> n = new NumberBox<String>();	//	Bound mismatch!
//		NumberBox<Object> n = new NumberBox<Object>();	//	Bound mismatch!
		
		NumberBox<Integer> num = new NumberBox<Integer>();
		
	}

}


class NumberBox<T extends Number> {
// => 제네릭타입으로 지정 가능한 타입은 Number 와 그 서브클래스타입만 가능
}
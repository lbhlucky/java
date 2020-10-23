public class Ex {

	public static void main(String[] args) {
		
		/*
		 * 제네릭(Generic) = 일반화
		 * - 컴파일 시점에 사용 가능한 객체의 타입을 체크하는 것
		 * 
		 * - 클래스 또는 인터페이스를 정의할 때 해당 클래스 또는 인터페이스에서
		 *   사용하기 위한 어떤 타입을 미리 지정하는 것이 아니라
		 *   제네릭 타입으로 선언한 후 실제 객체 사용을 위해
		 *   인스턴스를 생성하는 시점에서 사용할 타입을 결정하는 것
		 *  
		 * - 자바에서 제공하는 컬렌션 프레임워크 등의 클래스 및 인터페이스에는
		 *   제네릭이 정용된 경우가 많으며, 이 클래스 등의 인스턴스 생성 시
		 *   실제 사용 할 데이터 타입을 지정해줘야한다.
		 *   
		 *  < 주의 사항 > 
		 *  1. 제네릭 타입은 static 멤버에 지정 불가
		 *     => 인스턴스 생성 시점에 타입이 결정되어야 하는데
		 *        static 멤버는 인스턴스 생성 시점보다 먼저 로딩되기 때문
		 *  2. 
		 */
		
		NormalBox nb = new NormalBox();
		nb.setSome(new Toy());	// 객체 저장하기
		// => Object 타입으로 저장할 경우 모든 데이터타입 사용 가능
		
		Object some = nb.getSome();	// 저장된 객체 가져오기
		// => Object 타입으로 저장할 경우 모든 데이터타입 사용 가능
		
		// Object 타입으로 리턴받은 객체의 상세 내용에 접근하려면
		// 해당 객체의 클랫흐 타입으로 강제 형변환(다운캐스팅)이 필요함
		// => 단, 변환 시 발생할 수 있는  ClassCastException을 방지하기 위해
		//	  instansof 연산자를 통한 타입 변환 가능 여부 체크가 필요함
		
		if(some instanceof Toy) {	// Toy타입인지 판별
			// Toy 타입으로 다운 캐스팅
//			System.out.println("Toy로 변환 가능한 객체");
			Toy toy = (Toy)some;
		} else if (some instanceof Icecream) { // Icecream 타입인지 판별
			// Icecream 타입으로 다운 캐스팅
//			System.out.println("Icecream으로 변환 가능한 객체");
			Icecream icecream = (Icecream)some;
		} 
		
		// =======================================================================================
		// 제네릭 타입이 적용된 GenericBox 클래스의 인스턴스 객체 생성
		// => 주의! 제네릭 타입에 실제 데이터타입 지정 시
		//    반드시 참조데이터타입을 사용해야한다!
//		GenericBox<int> gb;	// 기본데이터타입은 제네릭 타입에 지정 불가!
//		GenericBox<Integer> gb; // Wrapper 클래스 타입으로 사용 가능!
		
		// GenericBox 인스턴스의 제네릭 타입을 Toy 타입으로 지정하기 위해
		// 클래스명 뒤에 <Toy> 타입을 지정하고
		// 생성자 호출 코드의 생성자명 뒤에도  <Toy> 타입을 지정
		// => 클래스 내의 임시 데이터타입(T)이 모두 Toy타입으로 바뀜
		GenericBox<Toy> toyBox = new GenericBox<Toy>();
		// 파라미터 타입이 Toy타입으로 변경되었으므로
		// 다른 데이터타입은 사용 불가능하게 바뀐다!
		// => 즉, 데이터를 저장하는 시점에서 미리 타입 검사가 수행됨
//		toyBox.setSome(new Icecream());	// Icecream 타입 전달 불가 --why-> Toy 타입 객체만 전달 가능
		toyBox.setSome(new Toy());	// Toy 타입 전달가능
		
		// 저장된 객체를 꺼내올 때 별도의 변환 없이
		// 원본 그대로의 타입을 사용 가능(문제 발생 소지 없음)
		Toy toy = toyBox.getSome();
		
		// 만약, 다른 데이터타입의 객체를 저장해야할 경우
		// 새로운 객체를 생성하는 시점에서 해당 데이터타입을 지정하면 됨
		GenericBox<Icecream> icecreamBox = new GenericBox<Icecream>();
		// 제네릭 T 가 Icecream 타입으로 변경됨
		icecreamBox.setSome(new Icecream());
		Icecream icecream = icecreamBox.getSome();
		
		// =========================================================================================
		// 만약, Object 타입을 사용해야하는 경우
		// <>안에 타입을 안쓰거나 Object 타입으로 지정하면됨
//		GenericBox<Object> cb = new GenericBox<Object>();
		// Object 타입의 경우 제네릭타입 지정을 생략해도 자동으로 적용됨
		GenericBox gb = new GenericBox();
		gb.setSome(new Icecream());
		gb.setSome(new Toy());
		
		// ---- Ex ----
//		SubClass<String> s = new SubClass();
		
	}

}

class Toy {
	String toyName;
}

class Icecream {
	String icecremName;
}

// 제네릭 타입을 적용한 클래스 정의
// => 클래스 또는 인터페이스 선언 시 이름 뒤에 <> 기호를 쓰고,
//	  해당 기호 사이에 알팦벳 대문자 한글자를 지정
//	  (클래스 내에서 하용하게 될 임시 데이터타입 이름 지정)
//	  주로, 대문자 T(Type) 또는 E(Element)를 사용
// => 지정된 임시 데이터타입은 객체 생성 시점에서 실제 데이터타입으로 변경됨
//	  (선언 시점에서는 실제 존재하지 않는 데이터타입)
class GenericBox<T> {	// 임시 데이터 타입으로 T를 지정
	
	private T some;		// 변수 some의 데이터타입은 무엇으로도 변할 수 있음
	
//	private static T some2;	// 제네릭 타입은 static 멤버에 사용 불가
	
//	T obj = new T();	// 제네릭 타입으로 인스턴스 생성 불가
	
	public T getSome() {
		return some;
	};
	
	public void setSome(T some) {
		this.some = some;
	}
	
	public void method() {
		// 제네릭타입은 instansof 연산자의 타입파라미터로 사용 불가
		Object o = new Object();
//		if(o instanceof T) {};
	}

}

// 일반적인 클래스 정의
class NormalBox {
	// toy, icecream 등 다양한 타입을 저장하기 위해 Object타입 변수 선언
	private Object some;

	public Object getSome() {
		return some;
	}

	public void setSome(Object some) {
		this.some = some;
	}
	
	
}

// =========================================================================================================
interface Userable<D> {}

class SuperClass<P> {
	protected P product;
}

// 부모로 부터 상속 받을 때 제네릭타입도 상속받아 표현하려면
// 서브클래스도 부모의 제네릭 타입을 반드시 명시해야한다!
// => 단, (아래의 'M'과 같이)서브클래스만의 제네릭 타입을 추가하는 것은 상관없음
class SubClass<P, D, M> extends SuperClass<P> implements Userable<D> {
	
	public void method() {
		
	};
}






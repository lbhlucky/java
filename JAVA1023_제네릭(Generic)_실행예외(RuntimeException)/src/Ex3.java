import java.util.ArrayList;

public class Ex3 {
	
	public static void main(String[] args) {
		/*
		 * 제네릭 타입이 적용된 메서드
		 * 
		 * - 특정 메서드 내에서만 사용 가능한 타입 지정
		 * 
		 * - 메서드 리턴타입 앞에 제네릭 타입 지정
		 * 
		 * - 리턴 타입 또는 파라미터 타입으로 사용 가능
		 * 
		 * 
		 * < 기본 문법 >
		 * [제어자] <제네릭타입> 리턴타입 메서드명([파라미터...]) {}
		 * 
		 * < 제네릭타입 지정 방법 > 
		 * 메서드 호출 시 메서드명 앞에 제네릭 타입을 명시
		 * 참조변수명.<제네릭타입>메서드명([파라미터...]);
		 * 
		 */
		
		GenericMethod gm = new GenericMethod();
		
		gm.normalMethod();
		gm.<String>genericMethod1("홍길동");
		gm.<Integer>genericMethod1(10);
		
		System.out.println("-------------------------------------------");
		
		int num = gm.<Integer>genericMethod2(20);
		System.out.println("리턴받은 데이터 : " +num);
		
		String str = gm.<String>genericMethod2("홍길동");
		System.out.println("리턴받은 데이터 : " +str);
		
		System.out.println("==============================================");
		
		// 제네릭 메서드에서의 타입 파라미터 제한
		
		WildcardGenericType wgt = new WildcardGenericType();

		// 메서드 내의 파라미터 타입에 제네릭 타입을 '?' 로 지정했을 경우
		// 'extends Object'와 동일하게 취급되므로 모든 타입을 제네릭 지정 가능
		wgt.method1(new GenericBox3<Object>());
		wgt.method1(new GenericBox3<Person>());
		wgt.method1(new GenericBox3<SpiderMan>());
		
//		wgt.method2(new GenericBox3<Object>());
		// Person 또는 Person 클래스의 서브클래스 타입(SpiderMan)만 가능
		wgt.method2(new GenericBox3<Person>());
		wgt.method2(new GenericBox3<SpiderMan>());
		
		wgt.method3(new GenericBox3<Object>());
		wgt.method3(new GenericBox3<Person>());
//		wgt.method3(new GenericBox3<SpiderMan>());
		// Person 또는 Person 클래스의 슈퍼클래스 타입(Object)만 가능
		
		System.out.println("==============================================");
		ArrayList<Number> list = new ArrayList<Number>();
//		list.addAll(c);
		// public boolean addAll(Collection<? extends Number> c)
		// => addAll() 메서드 파라미터로 Collection 객체를 전달 가능하나
		//    이 때, Collection 객체의 제네릭 타입은 Number 타입 또는
		//    Number 클래스의 서브클래스 타입만 사용 가능하다!
		
	}
	
}

class GenericMethod {
	
	public void normalMethod() {
		System.out.println("일반 메서드");
	}
	
	public <P> void genericMethod1(P p) {
		// 메서드 파라미터로 전달받은 데이터타입을 제네릭타입 P로 지정
		// => 리턴타입 앞에 제네릭타입 <P> 지정 필수!
		System.out.println("파라미터 타입 : " +p.getClass().getName());
		System.out.println("전달받은 데이터 : " +p);
	}
	
	public <P> P genericMethod2(P p) {
		// 메서드 파라미터와 리턴타입을 제네릭타입 P로 지정
		// => 리턴타입 앞에 제네릭타입 <P> 지정 필수!
		System.out.println("파라미터 타입 : " +p.getClass().getName());
		System.out.println("전달받은 데이터 : " +p);
		return p;
	}
	
}

class Person {}

class SpiderMan extends Person {}

class GenericBox3<T> {}

class WildcardGenericType {
	// GenericBox3 객체를 파라미터로 전달받는 경우
	// GenericBox3 타입에 대한 제네릭 타입을 ? 기호로 지정할 경우
	// 만능문자로 취급되어 ? extends Object와 동일하므로 모든 타입 지정됨
	public void method1(GenericBox3<?> some) {};	// '?' : extends Object 와 같은 뜻
	
	// GenericBox3 타입에 대한 제네릭 타입을 ?extends x로 지정할 경우
	// ? 는 X 또는 X 의 서브클래스 타입으로만 지정 가능
	public void method2(GenericBox3<? extends Person> some) {};
	
	// GenericBox3 타입에 대한 제네릭 타입을 ? super X 로 지정할 경우
	// ? 는 X 또는 X 의 슈퍼클래스 타입으로만 지정 가능
	public void method3(GenericBox3<? super Person> some) {};
}























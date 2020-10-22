public class Ex2 {

	public static void main(String[] args) {
		// 인터페이스 간의 상속과  클래스, 인터페이스의 동시 상속
		
		고래상어 고래상어 = new 고래상어();
		고래상어.번식();
		
		동물 동물 = 고래상어;
		동물.번식();
		
	}

}

// 두 개의 부모인터페이스를 정의하고 하나의 인터페이스에서 몯 ㅜ상속
interface Parentinterface1 {
	
	public abstract void parentmethod1();
	
	
}

interface Parentinterface2 {
	
	public abstract void parentmethod2();
	
	
}

// Childinterface 인터페이스 정의 = Parentinterface1과 Parentinterface2 상속
// 주의사항1. 인터페이스간의 상속은 extends 키워드 사용
// 주의사항2. 부모인터페이스를 상속받은 자식인터페이스에서 추상메서드 구현 없음
//			 => 인터페이스 내에는 무조건 추상메서드만 존재해야하므로
interface Childinterface extends Parentinterface1, Parentinterface2 {
	// 두 개의 부모인터페이스(Parentinterface1, Parentinterface2)를 상속 받으면
	// 부모인터페이스의 추상메서드와 자신의 추상메서드를 모두 갖게됨
	// 즉, Parentmethod1(), Parentmethod2() 추상메서드와
	public abstract void childmethod3();	// 자신의 추상메서드를 갖는다
}

// Subclass2 클래스 정의 - Childinterface 인터페이스구현
class Subclass2 implements Childinterface {

	@Override
	public void parentmethod1() {
		System.out.println("서브클래스에서 구현한 parentmethod1()");
	}

	@Override
	public void parentmethod2() {
		System.out.println("서브클래스에서 구현한 parentmethod1()");
	}

	@Override
	public void childmethod3() {
		System.out.println("서브클래스에서 구현한 childmethod3()");
	}
	
}



// ===================================================================================================

class ParentClass {
	public void normalMethod() {
		System.out.println("ParentClass의 normalMethod()");
	}
}

// 하나의 서브클래스에는 하나의 슈퍼클래스와 1개 이상의 인터페이스를
// 부모로 가질 수 있다.
// => 주의사항! extends와 implements 동시 사용시 extends를 먼저 선언해야함
class SubClass3 extends ParentClass implements Childinterface{

	@Override
	public void parentmethod1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parentmethod2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void childmethod3() {
		// TODO Auto-generated method stub
		
	}
	
}

//===================================================================================================

//abstract class 동물 {
//	
//	public abstract void 번식();
//	
//}
//
//abstract class 고래 extends 동물{		
//	// 번식()메서드 포함
//	public void 번식() {
//		System.out.println("새끼를 낳아 번식!");
//	}
//}
//abstract class 상어 extends 동물{		
//	// 번식()메서드 포함
//	public void 번식() {
//		System.out.println("알을 낳아 번식!");
//	}
//}
//// 만약, 클래스간의 다중 상속이 가능했다면 발생할 수 있는 문제
//class 고래상어 extends 고래, 상어 {	// 실제로는 불가능하므로 오류발생
//	// 만약, 고래상어 클래스 내에서 번식() 메서드 호출하면
//	// 고래의 번식인가? 상어의 번식인가?
//	// => 다이아몬드 상속관계에서의 문제(이슈)
//	//	  하나의 부모로부터 두 자식이 상속을 받고
//	// 	  다시 하나의 손자가 두 자식으로 부터 상속을 받을 경우
//	//	  부모로부터 상속된 메서드를 두 자식이 구현하고
//	//	  손자가 해당 메서드에 접근하려할 때
//	//    두 자식 중 누구의 메서드인지 구분할 수 없게된다.
//	//    => 따라서, 자바에서 클래스간의 다중 상속은 불가능!!
//	public void 번식() {
//		super.번식();	// 고래.번식()? 상어.번식()? ==> 구별 불가능
//	}
//}


// 인터페이스는 다중 상속이 가능한 이유
interface 동물 {
	public abstract void 번식();
}

interface 고래 extends 동물 {
	// 인터페이스를 상속받은 인터페이스에서는 구현의 강제가 발생하지 않음!
	// => 구현하고 싶어도 구현이 불가능
}

interface 상어 extends 동물 {
	// 인터페이스를 상속받은 인터페이스에서는 구현의 강제가 발생하지 않음!
	// => 구현하고 싶어도 구현이 불가능
}


class 고래상어 implements 고래,상어{

// 하나의 부모로부터 두 자식이 상속을 받고
// 다시 하나의 손자가 두 자식으로 부터 상속을 받을 경우
	
	@Override
	public void 번식() {	
		// 고래.번식()? 상어.번식()? 구분할 필요없음!
		// 동일한 추상메서드이므로 구분 필요없이 바디{}만 구현하면된다!
		System.out.println("알을 낳아 번식!");
	}
}












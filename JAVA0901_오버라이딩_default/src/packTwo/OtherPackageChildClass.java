package packTwo;

import packOne.Parent2;

// Parent2 클래스를 상속받아 정의
// => 다른 패키지에 위치하므로 import 문 필수!!!
public class OtherPackageChildClass extends Parent2 {

	public void useMember() {
	
//		System.out.println(p.protectedVar);	
//		=> protected(X) : 패키지가 다르고, 상속관계가 아니므로 접근 불가!
	
//		System.out.println(p.defaultVar);		
//		=> default(X) : 다른 패키지에서 접근 불가!

//		System.out.println(p.privateVar);
//		=> private(X) : 다른 클래스에서 접근 불가!

		// 주의! 상속 관계에 있는 부모의 인스턴스를 생성할 경우
		// 상속 관계가 아닌 일반 포함관계의 클래스로 취급되므로 주의해야함
		
		Parent2 p = new Parent2();
		System.out.println(p.publicVar);		// public(O)
	
		//===========================================================
		// 상속 관계에 있는 멤버는 인스턴스 생성 없이 직접 접근해야함
		// => 인스턴스를 생성할 경우 is - a 관계가 아닌 has - a 관계로 바뀜
		
		System.out.println(publicVar);		// public(O)
		
		System.out.println(protectedVar);	
//		=> protected(O) : 패키지가 다르지만, 상속 관계이므로 접근 가능
	
//		System.out.println(defaultVar);		
//		=> default(X) : 다른 패키지에서 접근 불가!

//		System.out.println(privateVar);
//		=> private(X) : 다른 클래스에서 접근 불가!
	
	}
	
}

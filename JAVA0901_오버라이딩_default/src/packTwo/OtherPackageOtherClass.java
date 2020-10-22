package packTwo;

import packOne.Parent2;

public class OtherPackageOtherClass {
	// 다른 패키지이면서 상속 관계가 아닌 클래스 멤버에 접근
	public void useMember() {
		// Parent 클래스의 인스턴스를 생성하여 멤버에 접근
		Parent2 p = new Parent2();
		System.out.println(p.publicVar);		// public(O)
		
//		System.out.println(p.protectedVar);	
//		=> protected(X) : 패키지가 다르고, 상속관계가 아니므로 접근 불가!
		
//		System.out.println(p.defaultVar);		
//		=> default(X) : 다른 패키지에서 접근 불가!

//		System.out.println(p.privateVar);
//		=> private(X) : 다른 클래스에서 접근 불가!
		
	}
}

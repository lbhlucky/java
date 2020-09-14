public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 싱글톤 디자인 패턴 (Singleton Design Patten)
		 * - 프로그램에서 단 하나뿐인 유일한 객체(인스턴스) => 싱글톤 객체
		 * - 싱글톤 객체를 사용하여 프로그램을 작성하는 기법을
		 *   싱글톤 디자인 패턴이라고 한다.
		 * - 새로운 인스턴스 생성이 불가능하게 하며,
		 *   미리 생성된 하나의 인스턴스를 모든 참조변수에서 공유해서 사용
		 *   
		 *  < 싱글톤 패턴 작성 순서 >
		 *  1. 객체가 생성되면 안되기 때문에 외부에서 생성자 호출을 못하도록
		 *     생성자 정의 시 접근제한자를 private으로 선언
		 *  2. 자신의 클래스 내에서 직접 인스턴스를 생성하여 참조변수에 저장
		 *     => 참조변수의 접근제한자를 private으로 선언하여 접근 제한
		 *     => 참조변수를 static 변수로 선언하여 객체 생성없이 로딩
		 *  3. 생성된 인스턴스를 외부로 리턴하는 Getter를 저으이
		 *     => static변수를 리턴해야하므로 Getter 메서드로 static으로 선언
		 */
		
		// 접근제한자가 private으로 선언된 생성자 호출이 불가능하므로
		// SingletonClass 인스턴스 생성이 불가능해진다.
//		SingletonClass sc = new SingletonClass();
//		SingletonClass sc2 = new SingletonClass();
		
		// static으로 선언된 정적 멤버변수 instance에 접근하여
		// 미리 생성되어 있는 인스턴스를 가져올 수 있다.
		// => 외부에서 함부로 값을 변경할 수 없도록 private 접근제한자 적용
//		SingletonClass sc = SingletonClass.instance;
//		SingletonClass.instance = null;

		// 외부에서 접근할 수 있도록 Getter 메서드를 제공하므로
		// Getter를 호출하여 생성된 인스턴스를 전달받아 사용할 수 있음
		// => static 메서드인 getInstance() 메서드를 호출하여 인스턴스 리턴
		SingletonClass sc = SingletonClass.getInstance();
		
		// 참조 변수 sc2에도 동일한 인스턴스를 리턴 받기
		SingletonClass sc2 = SingletonClass.getInstance();
	}

}

class SingletonClass {
	
	// 1. 생성자의 접근제한자를 private으로 선언하여
	//    외부에서 인스턴스 생성(생성자 호출)못하도록 제한
	private SingletonClass() {}
	
	// 2. 자신의 클래스 내에서 직접 인스턴스를 생성하여 참조 변수에 저장
	// 	  => 이 때, 인스턴스 생성이 불가능하므로 인스턴스 변수 접근 불가능
	//   	 따라서, 인스턴스 생성 없이도 접근가능하도록 static으로 선언
	//	  => 또한, 외부에서 변수에 접근하여 함부로 값을 변경하지 못하도록
	//		 접근제한자를 private으로 선언
	private static SingletonClass instance = new SingletonClass();
	
	// 3. 인스턴스 생성 후 인스턴스가 저장된 멤버변수도 
	//    접근제한자로 인해 외부에서 접근이 불가능하므로
	//	  대신 인스턴스를 리턴해주는 Getter()메서드 정의
	//	  => 이 때, 인스턴스 생성 없이도 호출 가능하도록 static으로 선언
	public static SingletonClass getInstance() {
		return instance;
	}
	
	
}



public class Ex {
	// 변수 : 데이터 저장하는 용도
	// 메소드 : 기능을 사용하는 용도( 데이터 저장과 불러오기 )
	public static void main(String[] args) {
		/*
		 * 접근제한자( Access Modifier)
		 * - 클래스 또는 인터페이스의 멤버에 접근을 제한하는 키워드
		 * - 4가지 ( public, protected, (defalut), private )로 구성되며,
		 *   defalut 접근제한자는 별도의 키워드 없이 변수 또는 메서드 선언
		 *   
		 *  1. public : 외부의 모든 클래스에서 접근 가능하도록 지정
		 *  2. private : 자신의 클래스에서만 접근 가능하도록 지정,
		 *               (다른 클래스에서 접근 불가능하도록 지정)
		 *               
		 * - 주로, 클래스 내의 멤버변수는 private 접근제한자를 사용하여
		 *   외부에서 접근할 수 없도록(내부에서만 접근 가능하도록) 제한 하고,
		 *   public으로 선언된 Getter/Setter 메서드를 통해
		 *   간접적으로 멤버변수에 접근할 수 있도록한다.
		 * - 객체지향 특징 중 E(Encapsulation, 캡슐화 = 은닉성)에 해당함
		 *   
		 *  1. Getter 메서드 : 내부의 멤버변수에 저정된 값을 외부로 리턴
		 *     => 매개변수는 없고, 리턴값만 있는 메서드로 정의
		 *     => 메서드명은 주로, getXXX() 형식으로 지정
		 *        (XXX은 해당 멤버변수의 변수명을 사용)
		 *        (ex. int 타입변수 num의 Getter 메서드 이름 : getNum())
		 *  2. Setter 메서드 : 외부로부터 데이터를 전달받아 멤버변수에 저장
		 *     => 매개변수만 있고, 리턴값은 없는 메서드로 정의
		 *     => 메서드명은 주로, setXXX()형식으로 지정
		 *        (XXX은 해당 멤버변수의 변수명을 사용)
		 *        (ex. int 타입 변수 num의 Setter 메서드 이름 : setNum());
		 *        
		 */
		
		
		
		
		// Person 클래스의 인스턴스 생성
		// 다음과 같이 데이터를 저장한 후 출력
		// 이름 : 홍길동
		// 나이 : 20
		Person p = new Person();
//		p.name = "홍길동";		// not visible
		// => private 접근제한자로 지정된 멤버변수는 외부에서 접근 불가능
		
		// Setter 메서드를 호출하여 name에 저장할 이름을 지정
		p.setName("이순신");
		
		// Getter 메서드를 호출하여 name에 저장된 이름을 출력
		System.out.println("이름 : "+p.getName());

//		p.age = 20;
//		System.out.println("나이 : " +p.age);
		
		// Setter 메서드를 호출하여 age에 저장할 이름을 지정
		p.setAge(23);
		
		// Getter 메서드를 호출하여 age에 저장된 이름을 출력
		System.out.println("나이 : " + p.getAge());
		
		p.print();
		

	} // main 메서드 끝

}	// Ex 클래스 끝

class Person {
	private String name;
	private int age;
	
	
	
	// ------------------------------------------------------
	// 단축키를 황요한 Getter/Setter 메서드 자동생성
	// Alt + Shift + s => 손가락 다 뗀 후 R
	// 
	// ------------------------------------------------------
	
	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getAge() {
		return age;
	}
	
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	// 인스턴스 변수 name에 접근할 Getter/Setter 메서드 정의
	// => 누구나 접근할 수 있도록 접근제한자 public 사용
	// 1) Getter 정의 (매개변수는 없고, 리턴 값만 있는 메서드)
//	public String getName() {
//		// 인스턴스 변수 name 값을 리턴
//		return name;
//	}
//	
//	// 2) Setter 정의 (매개변수만 있고, 리턴 값은 없는 메서드)
//	public void setName(String newName) {
//		// 외부로부터 전달받은 newName값을 인스턴스 변수 name에 저장
//		name = newName;
//	}
//	
//	// 변수 age에 대한 Getter/Setter 정의
//	
//	public int getAge() {	// 매개변수는 없고, 리턴값만 있는 메서드
//		// 인스턴스 변수 age값을 리턴
//		return age;
//	}
//	    
//	public void setAge(int newAge) {	// 매개변수만 있고, 리턴값은 없는 메서드
//		// 외부로부터 전달받은 newAge값을 인스턴스 변수 age에 저장
//		age = newAge;
//	}
	



	// private으로 선언된 멤버도 같은 클래스 내에서 자유롭게 접근 가능
	// => 같은 클래스 내에서 접근 시 참조변수명 없이 이름만 지정
	public void print() {
		System.out.println("이름 : " +name);
		System.out.println("나이 : " +age);
	}
	
	
}	// Person 클래스 끝



























public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 생성자 오버로딩
		 * - 메서드 오버로딩과 기본적인 규칙 및 동작이 동일함
		 * - 객체 생성시 다양한 타입 및 갯수의 파라미터를 갖는
		 *   여러 생성자를 호출하여 다양한 초기화를 수행하는 용도로 사용
		 */
				
		Person2 p = new Person2();
		p.print();
		
		System.out.println("-------------------------------------");	
		
		Person2 p1 = new Person2("홍길동");
		p1.print();
		
		System.out.println("-------------------------------------");
		
		Person2 p2 = new Person2("황결댕", 20);
		p2.print();
	}

}

class Person2 {

	String name;
	int age;

	// 1. 기본 생성자 정의
	// => Person2() 생성자 호출됨! 출력
	Person2() {
		System.out.println("Person2() 생성자 호출됨!");
	}

	// 2. 이름(newName)을 전달 받아 초기화하는 생성자 정의
	// => Person2(String) 생성자 호출됨! 출력 및 이름 초기화
	Person2(String newName) {
		System.out.println("Person2(String) 생성자 호출됨!");
		name = newName;
	}

	// 3. 이름(newName)과 나이(newAge)을 전달 받아 초기화하는 생성자 정의
	// => Person2(String, int) 생성자 호출됨! 출력 및 이름, 나이 초기화
//	Person2(String newName, int newAge) {
//		System.out.println("Person2(String, int) 생성자 호출됨!");
//		name = newName;
//		age = newAge;
//	}
	
	// 생성자 자동 생성 단축키 : Alt + Shift +S -> O
	public Person2(String name, int age) {
		System.out.println("Person2(String, int) 생성자 호출됨!");
		this.name = name;
		this.age = age;
	}
	

	// 멤버변수(이름, 나이)를 출력하는 print()메서드
	public void print() {
		System.out.println("이름 : " +name);
		System.out.println("나이 : " +age);
	}

	
}
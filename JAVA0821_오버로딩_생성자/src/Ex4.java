public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 생성자 this()
		 * - 생성자 내에서 자신의 인스턴스 내의 다른 생성자를 호출
		 * - 생성자 초기화 코드가 중복될 때 중복 제거를 위해
		 *   하나의 생성자에서만 초기화 코드를 작성하고
		 *   나머지 다른 생성자는 해당 생성자 호출을 통해 데이터만 전달하여
		 *   초기화 코드의 중복을 제거하는 용도로 사용
		 *   
		 * - 주의 사항!!!!!!
		 * 	  생성자 this()는 반드시 생성자 내의 첫문장에서 호출되어야한다!  
		 *   
		 *   <기본 사용 문법>
		 *  this([생성자에 전달할 데이터...]);
		 */
		
		Person4 p = new Person4();
		System.out.println("이름 : "+p.name);
		System.out.println("나이 : "+ p.age);
		System.out.println("--------------------------------");
		
		Person4 p1 = new Person4("신길동");
		System.out.println("이름 : "+p1.name);
		System.out.println("나이 : "+ p1.age);
		System.out.println("--------------------------------");
		
		Person4 p2 = new Person4("장우동", 30);
		System.out.println("이름 : "+p2.name);
		System.out.println("나이 : "+ p2.age);
	}

}

class Person4 {
	String name;
	int age;
	
	// 기본 생성자 정의 - 이름 : "홍길동", 나이 : 0 초기화
	public Person4() {
//		name = "홍길동";
//		age = 0;
//		다른 생성자 Person4(String, int)를 호출하여 대신 초기화 요청
//		=> 생성자는 new 이외에 호출이 불가능하며 생성자 this()필수!!
		this("홍길동", 0);	
		System.out.println("Person4()생성자 호출됨!");
//		this("홍길동", 0);
		// => 생성자 this()는 반드시 생성자 내의 첫문장에서 호출되어야한다!
		
	}

	// 이름 전달받는 생성자 정의 - 나이 : 0 초기화
	public Person4(String name) {
//		this.name = name;
//		age  = 0;
		this(name, 0);
		System.out.println("Person4(String)생성자 호출됨!");
	}
	
	// 이름, 나이 전달받는 생성자 정의
	public Person4(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person4(String, int)생성자 호출됨!");
	}

	
}
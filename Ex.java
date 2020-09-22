import java.util.ArrayList;
import java.util.Date;

public class Ex {

	public static void main(String[] args) {
		/*

		 * Object클래스
		 *  2) toString() : 어떤 "객체의 정보"를 "문자열"로 리턴
		 *    
		 *    - 일반적으로 개발자 입장에서 객체의 정보는 객체가 갖는
		 *      멤버변수들에 저장된 값을 의미하지만,
		 *      Object 클래스의 toString() 메서드는 객체의 참조변수 값이 아닌
		 *      객체 고유의 값(주소값)을 문자열로 리턴해준다
		 *    
		 *    - 따라서, 개발자가 원하는 멤버변수 값을 리턴받기 위해서는
		 *      toString() 메서드를 오버라이딩하여, 
		 *      멤버변수들을 문자열로 결합하여 리턴하도록 해야함
		 *     
		 *    - 만약, 출력문에 참조변수명.toString() 메서드를 전달하면
		 *      객체의 정보를 문자열로 리턴받아 출력하는데,
		 *      이 때, 출력문에는 toString()_ 메서드 호출 부분 생략가능
		 *     
		 *    - 자바에서 제공하는 API 대부분은 해당 객체의 값을 리턴하도록
		 *      toString() 메서드가 오버라이딩 되어 있다.
		 *      (ex. String, Date 클래스 등...)
		 *    - 자동 생성 단축기 : Alt + Shift + S -> S
		 */
		
//		객체의 정보 : 객체가 가진 멤버변수
		Person p = new Person("홍길동", 20, "901010-1234567");
		
		System.out.println("Person 클래스 객체 p 의 정보 : "+p.toString());
		// => 객체 p가 갖는 정보를 문자열로 리턴받아 출력
		//    이 때, 객체의 정보는 참조변수의 값이 아닌 고유값이 출력됨
		
		System.out.println("Person 클래스 객체 p 의 정보 : "+p);
		// => toString() 메서드를 생략하고 "출력문"에 참조변수만 사용해도
		//	  toString() 메서드를 사용한 것과 동일한 결과가 출력됨 = 생략가능
		
		// getClass() : 해당 객체의 클래스 정보를 리턴
		System.out.println("p.getClass() : " + p.getClass());

		// getClass() 메서드의 리턴타입은 Class 클래스 타입이며
		// 해당 객체의 getName() 메서드 호출 시 클래스명만 리턴받을 수   있음
		System.out.println("p.getClass().getName() : " + p.getClass().getName());
		
		// hashCode() : 해당 객체의 고유 식별값(해시코드값  != 주소값)
		System.out.println("p.hashCode() : " + p.hashCode());
		
		// 결국 Object 클래스의 toString() 메서드가 리턴하는 값은
		// getClass().getName()의 리턴값과 '@' 기호와
		// hashCode() 리턴값을 16진수로 변환한 값을 문자열로 결합한 값이다.
		
		System.out.println("===========================================================");
		
		Person2 p2 = new Person2("홍길동", 20, "901010-1234567");
		
		// d오버라이딩 된 toString() 메서드 호출
		System.out.println("Person 클래스 객체 p2 의 정보 : "+p2.toString());
		System.out.println("Person 클래스 객체 p2 의 정보 : "+p2);
		
		// toString() 리턴값이 String 타입이므로 String 타입 변수 저장도 가능
		String info = p2.toString();
//		String info = p2;			// 오류 발생!		
		// 변수에 toString() 메서드의 리턴값 저장 시 toString() 생략 불가!
		System.out.println(info);
		
		System.out.println("---------------------------------------------------------------");
		// toString() 메서드가 오버라이딩 되어 있는 API에 : Date 클래스
		// Date 클래스 : 날짜 정보를 관리하는 클래스
		
		Date d1 = new Date();
		// 날짜 정보를 출력문을 사용하여 출력
		System.out.println(d1.toString());
		System.out.println(d1);
		
		// ArrayList 클래스 : java.util
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("list 객체에 저장된 데이터 : " + list);
		
	}

}

class Person {
	
	String name;
	int age;
	String jumin;
	
	public Person(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((jumin == null) ? 0 : jumin.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (jumin == null) {
			if (other.jumin != null)
				return false;
		} else if (!jumin.equals(other.jumin))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}


class Person2 {
	
	String name;
	int age;
	String jumin;
	
	public Person2(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((jumin == null) ? 0 : jumin.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (jumin == null) {
			if (other.jumin != null)
				return false;
		} else if (!jumin.equals(other.jumin))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	// toString() 메서드 오버라이딩 수동
//	@Override
//	public String toString() {
//		// 현재 클래스의 멤버변수를 문자열로 결합하여 리턴
//		return name + ", " + age + ", " + jumin;
//	}
	
	// toString() 메서드 오버라이딩 자동 : 단축키 - Alt + Shift + S -> S
	@Override
	public String toString() {
		return "Person2 [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}
	
	
	
	
	
}








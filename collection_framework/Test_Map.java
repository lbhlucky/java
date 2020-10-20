package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class Test_Map {

	public static void main(String[] args) {
		
		Map map = new HashMap();
		
		// 키로 사용할 데이터 : Person 객체
		// 값으로 사용할 데이터 : 학생 전화번호
		map.put(new Person("홍길동","901010-1234567"), "010-1234-5678");
		map.put(new Person("이순신","911010-1111111"), "010-1233-1231");
		map.put(new Person("홍길동","901010-1234567"), "010-5432-0440");
		// => Person 객체를 키로 갖는 경우
		//    new 연산자를 통해 객체 생성 코드를 키에 전달할 경우
		//	  데이터는 동일하지만 생성된 객체의 주소값이 다르므로
		//	  서로 다른 키로 인식됨
		// => 따라서, 이름과 주민번호가 같은 객체라도
		//	  서로 다른 전화번호가 별개의 위치에 저장됨
		
		
		System.out.println(map);	// 번지 수가 나오기 때문에 값을 보기위해 toString() 오버라이딩해야함
		
		System.out.println("====================================================================");
		
		Map map2 = new HashMap();
		Person p = new Person("홍길동","901010-1234567");
		
		map2.put(p, "010-2222-2222");
		map2.put(p, "010-3333-3333");
		// => Person 객체의 참조변수 p를 키에 두 번 전달하는 경우
		//	  전화번호가 다르더라도 참조변수는 1개이므로 하나의 키로 인식됨
		// => 따라서, 이름과 주민번호가 같은 객체는
		//	  뒤의 전화번호를 덮어쓰게 됨
		System.out.println(map2);
		
	}

}

class Person {
	String name;
	String jumin;
	
	public Person(String name, String jumin) {
		super();
		this.name = name;
		this.jumin = jumin;
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

	@Override
	public String toString() {
		return "Person [name=" + name + ", jumin=" + jumin + "]";
	}
	
}























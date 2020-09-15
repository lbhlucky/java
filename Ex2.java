public class Ex2 {

	public static void main(String[] args) {
		
		Person p = new Person("홍길동", "123456-1234567");
		System.out.println("국적 : " +p.nation);
		System.out.println("이름 : " +p.name);
		System.out.println("주민번호 : " +p.ssn);
		
		// 인스턴스를 통해서도 final 변수 변경은 불가능
//		p.nation = "대한민국";
//		p.ssn = "012345-0123456";
		
	}

}

class Person {
//	final String nation;	// final 변수는 초기화 하지않으면 오류 발생!
	final String nation = "Korea";	// 초기화 필수!!
	
	String name;

	final String ssn;		// 만약, final 변수 선언 시 초기화하지 않을 경우
	// => 변수 선언시 초기화하지 않은 final 변수를 blank final 변수라고 함
	//	  blank final 변수는 생성자에서 반드시 초기화 필수!

	public Person(String name, String ssn) {
		super();
		this.name = name;
		this.ssn = ssn;			// blabk fianl 변수를 초기화했으므로
								// 변수 선언에서 발생한 오류가 사라짐
		
		// 한번 초기화 된 final 변수는 더  이상 값 변경 불가
//		nation = "대한민국";
		ssn = "111111-2222222";	// blank final 변수는 생성자 내에서 변경 가능
	}
	
	
}




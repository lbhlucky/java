public class Test2 {

	public static void main(String[] args) {
		
		Student s = new Student("이름", 20, "주민번호", "학교명", "학번");
		
		System.out.println(s.getInfo());
		
	}

}

class Person2 {
	String name;
	int age;
	String jumin;

	public Person2(String name, int age, String jumin) {
		super();	// 슈퍼클래스인 Object클래스의 기본생성자 호출 코드(생략 가능)
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
	
	// 메서드 정의
	// 이름, 나이, 주민번호를 문자열 결합 후 리턴하는 getInfo() 메서드 정의
	public String getInfo() {
		return name + ", " + age + ", " + jumin;
	}
}

/*
 * Student 클래스 정의 => Person2 상속
 * - 멤버변수 : 학교명(schoolName, 문자열), 학번(schoolId, 문자열)
 * - 생성자 : 이름, 나이, 주민번호, 학교명, 학번을 전달받아 초기화
 * - 메서드 : getInfo() 메서드 오버라이딩
 *            => 이름, 나이, 주민번호, 학교명, 학번을 문자열 결합 후 리턴 
 */
class Student extends Person2 {
	String schoolName;
	String schoolId;
	
	// 파라미터 생성자 정의
	public Student(String name, int age, String jumin, String schoolName, String schoolId) {
		// 슈퍼클래스의 파라미터 생성자 호출하여 부모의 멤버변수 대신 초기화ㄴ
		super(name, age, jumin);
		// 서브클래스의 멤버변수만 직접 초기화
		this.schoolName = schoolName;
		this.schoolId = schoolId;
	}


	// getInfo() 메서드 오버라이딩
	@Override
	public String getInfo() {
		
		return super.getInfo() + ", " + schoolName + ", " + schoolId;

		// super.멤버변수명 또는 this.멤버변수명 또는 멤버변수명을 사용하여
		// 슈퍼클래스의 멤버변수를 직접 지정도 가능
		//	return name + ", " + age + ", " + jumin + schoolName + ", " + schoolId;
		
	}
	
	
	
	
}

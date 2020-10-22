public class Ex2 {

	public static void main(String[] args) {
		/*
		 * super 키워드 사용법
		 * 
		 * 2. 생성자 super()
		 * - 서브클래스의 생성자에서는 묵시적으로
		 *   슈퍼클래스의 기본 생성자를 자동으로 호출함
		 *   
		 * - 서브클래스의 생성자(기본생성자 포함) 내에서는 묵시적으로
		 *   슈퍼클래스의 기본생성자를 자동으로 호출(super())하게 됨
		 *   => 이 때, 슈퍼클래스에 기본 생성자 없이, 파라미터 생성자만 존재 할 경우
		 *      서브클래스의 생성자에 기본 생성자를 호출하면 오류가 발생하게 됨
		 *  - 해결책 1) 슈퍼클래스에 기본생성자를 명시적으로 정의
		 *  - 해결책 2) 슈퍼클래스의 파라미터 생성자를 명시적으로 호출
		 *              => 생성자 super() 를 통해 파라미터 생성자 호출 가능  
		 *	- 생성자 super() 를 사용하여 슈퍼클래스 생성자를 호출하면
     	 *      슈퍼클래스의 멤버변수는 슈퍼클래스가, 서브클래스의 멤버변수는
     	 *      서브클래스가 초기화하게 되어, 초기화 코드 중복을 제거하게 됨
     	 *      => 생성자 this() 와 사용 용도가 동일함
     	 *  - 생성자 this() 처럼 생성자 내의 첫번째 라인에서 호출 필수!
     	 *    => 따라서, 생성자 this() 와 super() 는 동시 사용 불가!         
		 */
		
		
	}

}

/*
 * 직원(Employee2) 클래스 정의
 * - 멤버변수 : 이름(name, String), 연봉(salary, int)
 * - 생성자
 *   1) 이름, 연봉 전달받아 초기화하는 생성자
 * - 메서드
 *   1) getEmployee() - 파라미터 없음, 리턴타입 String
 *      => 이름, 연봉을 문자열 결합 후 리턴
 */
class Employee2 {
	String name;
	int salary;

	public Employee2() {};	// 기본 생성자를 정의해주면 오류 제거됨
	
	// 파라미터 생성자를 하나라도 정의할 경우
	// 컴파일러에 의해 기본 생성자가 자동으로 정의되지 않는다.
	public Employee2(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getEmployee() {
		String info = name + ", " +salary;
		return info; 
	}
	
}

/* Manager2 클래스 정의 : Employee2 클래스를 상속
 * - 멤버변수 : 부서명(depart, 문자열)
 * - 생성자 : 이름, 연봉, 부서명을 전달받아 초기화하는 생성자
 * - 메서드 
 *   1) getEmployee() 메서드 오버라이딩
 *     => 이름, 연봉, 부서명을 문자열로 결합 후 리턴 
 */

class Manager2 extends Employee2 {

	String depart;


//	public Manager(String name, int salary, String depart) {
//		super(name, salary);
//		this.depart = depart;
//	}
	
	/*
	 *  서브클래스의 생성자(기본생성자 포함) 내에서는 묵시적으로
	 * 슈퍼클래스의 기본생성자를 자동으로 호출(super())하게 됨
	 * => 이 때, 슈퍼클래스에 기본 생성자 없이, 파라미터 생성자만 존재 할 경우
	 *    서브클래스의 생성자에 기본 생성자를 호출하면 오류가 발생하게 됨
	 */
	public Manager2(String name, int salary, String depart) {
//		super();	// 슈퍼클래스의 기본 생성자를 호출하는 코드(자동으로 포함)
//		System.out.println("Manager2() 생성자 호출됨!");
		// 슈퍼클래스의 파라미터 생성자를 명시적으로 호출
		super(name, salary);
		// => 슈퍼클래스의 파라미터 생성자에서 멤버변수를 초기화하므로
		//    서브클래스의 멤버변수만 직접 초기화하면 됨 => 코드 중복 제거
//		this.name = name;
//		this.salary = salary;
		this.depart = depart;
	}


	@Override
	public String getEmployee() {
		// 이름, 연봉, 부서명을 문자열로 결합하여 리턴하도록 오버라이딩
		// => 현재 Manager클래스 내에서 더 이상 슈퍼클래스인
		//	  Employee 클래스의 getEmployee() 메서드는 보이지 않는다(은닉)
//		String info = name + ", " + salary+ ", " + depart;
//		return info;
		
		// 슈퍼클래스인 getEmployee() 메서드에서 이미
		// 이름(name)과 연봉(salary)을 문자열로 결합하여 리턴하므로
		// 슈퍼클래스의 getEmployee() 메서드를 호출한 뒤 
		// 부서명(depart)만 별도로 결합해도 된다.
		// => 이 때, 슈퍼클래스의 동일한 메서드를 호출하려면
		// 	  super.메서드명()을 통해 은닉된 메서드 호출이 가능
		
		return super.getEmployee() + ", " + depart;
	}
	
}

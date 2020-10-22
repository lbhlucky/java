public class Test2 {

	public static void main(String[] args) {
		Employee emp = new Employee("1111", "홍길동", 4000);
		emp.calcSalary(emp);
		Manager man = new Manager("2222", "이순신", 5000, "영업팀");
		emp.calcSalary(emp);
		Engineer eng = new Engineer("3333", "강감찬", 3000, 3);
		emp.calcSalary(emp);
		
		
	}

}
// 사원(Employee) 클래스 정의
class Employee {
	String id;
	String name;
	int salary;

	// 사원번호와 이름, 연봉을 전달받아 초기화하는 생성자 Employee() 정의
	public Employee(String id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
	}

	// 사원 정보(사원번호, 이름)을 문자열로 결합하여 리턴하는 
	// getEmplpyee() 메서드 정의

	public String getEmployee() {
		return id + ", " + name + ", " + salary;
	}
	
	// 1. 메서드 오버라이딩을 통해 각 클래스에서 따로 연봉 계산
	// 연봉을 꼐산하는 calcSalary() 메서드 정의
//	public void calcSalary() {
//		System.out.println("연봉 : " +salary);
//	}
	
	// 2. 슈퍼클래스인 Employee 에서 모든 직원의 연봉을 다 계산할 경우
	// => 메서드 하나로 Employee, Manager, Engineer 인스턴스를
	//	  모두 전달받아야 하므로 업캐스팅 활용
	public void calcSalary(Employee emp) {
		// instanceof 연산자를 사용하여 Employee, Manager, Engineer 판별
		// ※ if문 비교시 상속관계에 있어 서브클래스 -> 부모클래스 순으로 기술할것
		
		// ※ 주의사항!! ※
		// instanceof 연산자를 사용하여 형변환 가능 여부 판별 시
		// 슈퍼클래스 타입보다 서브클래스 타입을 먼저 판별해야함
		
		if(emp instanceof Manager) {
			// 매니저(Manager)의 연봉 계산
			Manager m = (Manager)emp;
			System.out.println("관리 부서 : " + m.depart + "에 따른 연봉 계산");
			// ex) depart 가 "영업팀"일 경우 보너스 50% 향상 등 수행
			System.out.println("매니저의 연봉 : " +salary);
		} else if(emp instanceof Engineer) {
			Engineer e = (Engineer)emp;
			// 엔지니어(Engineer)의 연봉 계산
			System.out.println("자격증 갯수 : " + e.certCount + "에 따른 연봉 계산");
			// ex) certCount갯 수 * 10만원 보너스 추가
			System.out.println("매니저의 연봉 : " +salary);
		} else if(emp instanceof Employee) {
			// 일반 사원(Employee)의 연봉 계산
			System.out.println("연봉 : " +salary);
			
		}
		
		
	}
		
}
// 매니저(Manager)클래스 정의 - Employee 클래스 상속
// 멤버변수 : 관리부서명(depart, 문자열)
// 사원번호, 이름, 연봉, 관리부서명을 전달받아 초기화하는 생성자 Manager() 정의
// 사원정보(사원번호, 이름, 연봉, 부서명)을 문자열로 결합하여 리턴하는
// getEmployee() 메서드 오버라이딩
class Manager extends Employee {
	String depart;

	public Manager(String id, String name, int salary, String depart) {
		// => 슈퍼클래스 Employee 에 기본 생성자가 없으므로
		//    파라미터 생성자를 명시적으로 호출하지 않으면 오류 발생!
		super(id, name, salary);
		this.depart = depart;
	}

	@Override
	public String getEmployee() {
		// 오버라이딩으로 인해 은닉된 슈퍼클래스의 메서드를 호출하려면
		// 레퍼런스 super를 통해 접근(super.메서드명())
		return super.getEmployee()+", "+depart;
	}

	// 1. 메서드 오버라이딩을 통해 각 클래스에서 따로 연봉 계산
	// 연봉을 꼐산하는 calcSalary() 메서드 정의
//	@Override
//	public void calcSalary() {
//		System.out.println("관리 부서 : " + depart + "에 따른 연봉 계산");
//		// ex) depart 가 "영업팀"일 경우 보너스 50% 향상 등 수행
//		System.out.println("매니저의 연봉 : " +salary);
//		super.calcSalary();
//	}
//	
		
}

// 엔지니어(Engineer) 클래스 정의 - Emplpyee 클래스 상속
class Engineer extends Employee {
	int certCount;	// 자격증 갯수

	public Engineer(String id, String name, int salary, int certCount) {
		// => 슈퍼클래스 Employee 에 기본 생성자가 없으므로
		//    파라미터 생성자를 명시적으로 호출하지 않으면 오류 발생!
		super(id, name, salary);
		this.certCount = certCount;
	}

	@Override
	public String getEmployee() {
		// 오버라이딩으로 인해 은닉된 슈퍼클래스의 메서드를 호출하려면
		// 레퍼런스 super를 통해 접근(super.메서드명())
		return super.getEmployee()+", "+certCount;
	}
	
	// 1. 메서드 오버라이딩을 통해 각 클래스에서 따로 연봉 계산
	// 연봉을 꼐산하는 calcSalary() 메서드 정의
//	@Override
//	public void calcSalary() {
//		System.out.println("자격증 갯수 : " + certCount + "에 따른 연봉 계산");
//		// ex) certCount갯 수 * 10만원 보너스 추가
//		System.out.println("매니저의 연봉 : " +salary);
//		super.calcSalary();
//	}
		
}










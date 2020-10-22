public class Test4 {

	public static void main(String[] args) {
		
		// 생성된 인스턴스를 두 번 가져오기
//		SingletonTest st = new singletonTest();	// 인스턴스 생성 불가
		SingletonTest st1 = SingletonTest.getInstance();
		SingletonTest st2 = SingletonTest.getInstance();
		
		System.out.println(st1.num+ ", " + st2.num);	// 10, 10 출력
		
		// 인스턴스 내의 인스턴스 변수 값을 변경하면 나머지도 공유됨
		st1.num = 100;
		System.out.println(st1.num+ ", " + st2.num);	// 100, 100 cnffur

		JavaTeacher jt = JavaTeacher.getInstance();
		JavaTeacher jt1 = JavaTeacher.getInstance();
		
		System.out.println(jt.teacherName+", "+jt1.teacherName);
		
		jt.teacherName = "이연태";
		System.out.println(jt.teacherName+", "+jt1.teacherName);
		
	}

}

// 1. SingletonTest 클래스 정의 => 싱클톤 디자인 패턴 적용
class SingletonTest {
	
	// 1. 생성자 정의
	private SingletonTest() {}
	
	// 2. 인스턴스 생성
	private static SingletonTest instance = new SingletonTest();
	
	// 3. Getter 정의
	public static SingletonTest getInstance() {
		
		return instance;
		
	}
	
	//==============================================================================
	
	// 싱글톤 패턴 객체확인을 위한 인스턴스 변수 1개 선언
	int num = 10;
	
}

// 2. JavaTeacher 클래스 정의 => 싱글톤 패턴 적용

class JavaTeacher {

	String teacherName = "홍진숙";
	
	// 생성자 정의
	private JavaTeacher() {}
	
	// 외부에서 접근할 수 없도록 private 접근제한자 적용
	// 인스턴스를 생성하지 못하기 때문에 클래스명만으로 접근 가능하도록
	// static 적용
	private static JavaTeacher instance = new JavaTeacher();
	
	// private 접근제한자로 인해 외부에서 접근하지못하기때문에
	// 외부에서 접근하기 위한 Getter 메서드 정의
	// 인스턴스를 생성하지 못하기 때문에 클래스명만으로 접근할 수 있도록
	// static 적용
	public static JavaTeacher getInstance() {
		return instance;
	}
	

}








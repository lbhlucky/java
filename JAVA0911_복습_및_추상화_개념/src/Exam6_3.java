public class Exam6_3 {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "홍길동";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.math = 76;
		
		System.out.println("====================================================");
		
		
		System.out.println("이름 : " +s.name);
		// Student클래스의 getTotal메서드 호출하여
		// 국어, 영어, 수학 점수의 총점을 리턴받아 출력
		// 100 + 60 +76 = 236(정수)
		System.out.println("총점 : " +s.getTotal());
		
		// Student클래스의 getAverage메서드 호출하여
		// 국어, 영어, 수학 점수의 총점을 리턴받아 출력
		// 236/3 78.7(실수)
		System.out.println("평균 : " +s.getAverage());
		
		Student s2 = new Student("홍길동", 1, 1, 100, 60, 76);
		
		System.out.println(s2.info());
	}
	
		
}

// Student 클래스 정의
// 멤버변수 : 학생이름(name), 반(ban),  번호(no), 국어점수(kor), 영어점수(eng), 수학점수(math)
class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	
	public Student() {
		super();
	}

	public Student(String name, int ban, int no, int kor, int eng, int math) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println( name+", "+ban+", "+no+", "+kor+", "+eng+", "+math);
	}

	public int getTotal() {

		return kor+eng+math;
	}
	
	public double getAverage() {

		return (double)getTotal()/3;
	}
	
	
	public String info() {
		
		String info = name+", "+ban+", "+no+", "+kor+", "+eng+", "+math;
		return info;
	}
	
	
}


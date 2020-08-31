public class Ex {

	public static void main(String[] args) {
		/*
		 * 상속(inheritance)
		 * - 슈퍼클래스(부모클래스, 상위클래스)가 가진 멤버(변수, 메서드)를
		 *   서브클래스(자식클래스, 하위클래스)가 물려받아
		 *   선언없이 사용할 수 있도록 하는 것
		 * - 서브클래스를 정의할 때 물려받을 슈퍼클래스를 지정하여 표현
		 * - is-a 관계로 표현
		 * - 상속을 통해 슈퍼클래스의 멤버를 물려받기 때문에
		 *   직접 메서드 또는 변수를 생성할 필요가 없어서 코드 중복 최소화됨
		 *   또한, 슈퍼클래스의 멤버를 수정하면 서브클래스에는
		 *   슈퍼클래스에서 수정된 내용이 그대로 적용되므로 유지보수가 용이
		 *
		 * < 상속 적용 기본 문법 >
		 * class 서브클래스명 extends 슈퍼클래스명 ()
		 */
		// Child 클래스 인스턴스 생성
		Child c = new Child();
		
		// Child 인스턴스를 통해 접근 가능한 메서드 : 2개 
		c.childPrn();	// 서브클래스에서 직접 정의한 메서드
		
		c.parenrPrn();	// 슈퍼클래스로부터 상속받은 메서드
		
		System.out.println("----------------------------------------");
		
		// ironMan 인스턴스 생성
		IronMan i = new IronMan();
		
		// ironMAn 인스턴스를 통해 접근 가능한 메서드 : 4개
		i.fly();
		i.shoootBeam();

		// Person 클래스(슈퍼클래스)로부터 상속받은 메서드 - 2개
		i.eat();
		i.jump();
				
		// Person 클래스(슈퍼클래스)로부터 상속받은 멤버변수 - 1개
		i.name = "토니 스타크";
		System.out.println("내 이름은 : " +i.name);
		
		System.out.println("----------------------------------------");
		
		// SpiderMan 인스턴스 생성
		SpiderMan s = new SpiderMan();
		
		s.fireWeb();
		
		// Person 클래스(슈퍼클래스)로부터 상속받은 메서드 - 2개
		s.eat();
		s.jump();
		
		// Person 클래스(슈퍼클래스)로부터 상속받은 멤버변수 - 1개
		s.name = "피터 파커";
		System.out.println("내 이름은 : " +s.name);
		
		System.out.println("====================================================");
		
		// 할아버지 클래스의 인스턴스 생성
		System.out.println("-------할아버지--------");
		할아버지 할아버지 = new 할아버지();
		
		// 접근 가능한 멤버 : 2개
		System.out.println(할아버지.house);	// 직접 선언한 변수
		할아버지.singWell();				// 직접 정의한 메서드
		System.out.println("-----------------------");
		
		// 아버지 클래스의 인스턴스 생성
		// 접근 가능한 멤버 : 할어버지 2개 + 아버지 2개 = 4개
		System.out.println("--------아버지---------");
		아버지 아버지 = new 아버지();
		System.out.println(아버지.car);	// 직접 선언한 변수
		아버지.drawWell();				// 직접 정의한 메소드
		
		System.out.println(아버지.house);	// 할아버지로부터 상속받은 변수
		아버지.singWell();					// 할아버지로부터 상속받은 메서드
		System.out.println("-----------------------");
		
		// 나 클래스인스턴스 생성
		// 접근 가능한 멤버 : 할아버지 2개 + 아버지 2개 + 나 2개 = 6개
		System.out.println("----------나-----------");
		나 나 = new 나();
		System.out.println(나.age);		// 직접 선언한 변수
		나.eatWell();					// 직접 정의한 메서드
		
		System.out.println(나.car);		// 아버지로부터 상속받은 변수
		나.drawWell();					// 아버지로부터 상속받은 메서드
		
		System.out.println(나.house); 
		// 할아버지로부터 상속받은 아버지로부터 상속받은 변수
		나.singWell();
		// 할아버지로부터 상속받은 아버지로부터 상속받은 메서드		
		System.out.println("-----------------------");

		
	}
	
}

// 슈퍼클래스 Person 정의
class Person {
	String name;
	
	public void eat() {
		System.out.println("밥 먹기!");
	}
	
	public void jump() {
		System.out.println("10m 점프!");
	}
	
	public void talk() {
		System.out.println("말하기!");
	}
	
}

//서브클래스 ironMan클래스 정의 => 슈퍼클래스 Person 상속
class IronMan extends Person {
	// Person 클래스를 상속받았으므로 Person 클래스가 가진 멤버를
	// IronMan 클래스 내에서 아무런 선언없이도 접근하여 사용가능
	public void fly() {
		System.out.println("하늘을 날다!");
	}
	
	public void shoootBeam() {
		System.out.println("빔을 쏘다!");
	}
}

// 서브클래스 SpiderMan 클래스 정의 =>  슈퍼클래스 Person 상속
class SpiderMan extends Person{
	
	public void fireWeb() {
		System.out.println("거미줄 발사!");
	}
}

//---------------------------------------------------------------

class 할아버지 {
	String house = "이층집";
	
	public void singWell() {
		System.out.println("노래를 잘 한다!");
	}
}
// 할아버지 클래스를 상속받는 아버지 클래스 정의
// => 멤버변수 : car("스포츠카")
//    메소드 : drawWell() -> "그림을 잘 그린다!"

class 아버지 extends 할아버지{
	String car = "스포츠카";
	
	public void drawWell() {
		System.out.println("그림을 잘 그린다.");
	}
}

//---------------------------------------------------------------
// 아버지 클래스를 상속받는 나 클래스 정의
class 나 extends 아버지 {
	int age = 20;
	
	public void eatWell() {
		System.out.println("잘 먹는다~");
	}
}



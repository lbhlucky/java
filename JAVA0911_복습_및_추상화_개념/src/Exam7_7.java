
public class Exam7_7 {

	public static void main(String[] args) {
		Child c = new Child();	// 생성자 Child()호출
		System.out.println("x = " + c.getX());
	}

}

class Parent {
	int x = 100;

	Parent() {	// this(x) 호출
		this(200);
	}

	Parent(int x) {
//		super();	// object() 생성자 호출
		this.x = x; // this.100 = 200 ==> this.200
	}

	int getX() {
		return x;	// x = 200
	}
}

class Child extends Parent {
	int x = 3000;

	Child() {
		this(1000);	// 생성자 this(x) 호출
	}

	Child(int x) {
//		super();	// parent() 생성자 호출
		this.x = x;	// this.3000 = 1000 ==> this.1000
	}
}
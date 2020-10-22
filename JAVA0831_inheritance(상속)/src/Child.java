
// 서브(자식)클래스 정의
// => 슈퍼(부모)클래스 Parent 클래스를 상속받기 위해
//	  클래스명 뒤에 extends 키워드를 쓰고, 슈퍼클래스 이름을 명시한다.
public class Child extends Parent{
	
	public void childPrn() {
		System.out.println("서브클래스의 childPrn()");
	}
	
}

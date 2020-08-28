// com.lg.tv 패키지를 소스코드에 포함시키기위한 import문 작성
//import com.lg.tv.*;	// 패키지 내의 모든 클래스를 포함하는 경우
import com.lg.tv.Tv;	// 패키지 내의 특정 클래스만 포함하는 경우

// 주의! 패키지가 다르고 이름이 동일한 클래스는 동시에 import 불가능!
//import com.samsung.tv.Tv;	// 오류 발생
import com.samsung.tv.*;	// 사용 가능

// 클래스명이 같을 경우 클래스명을 명시적으로 import한 것이 우선적이다!

public class Ex {

	public static void main(String[] args) {
	/*
	 *  패키지(Package) 및
	 *  - 클래스 파일이 위치하는 물리적 폴더 구조
	 *  - 패키지가 다르면 같은 이름의 클래스도 각각 별도로 관리가 가능함
	 *  - 패키지명은 상위패키위와 하위패키지로 구분하여
	 *    패키지 내에 다른 패키지를 생성할 수  있음
	 *    => 각 패키지 단계를 마침표(.)로 구분하여 지정
	 *  - 패키지명은 보통 각 회사의 모메인 이름을 사요하며
	 *    도메인 이름을 상위도메인부터 역순으로 나열하여 지정
	 *    (ex. samsung.com 일 경우 com.samsung으로 지정)
	 *  - 특정 패키지에 소속된 클래스의 소스코드 최상단에는 반드시
	 *    package 키워드를 사용하여 소속 패키지의 이름을 명시해야함!
	 *    => 단, 하나의 클래스는 하나의 패키지에 소속되므로
	 *       package문은 소스 코드 최상단에서 단 한 번만 선언됨!
	 *  - 특정 클래스의 이름을 나타내는 기본적인 규칙은
	 *     " 패키지명.클래스명 "의 형태로 지정하는 것이 기본
	 *    현재 패키지 내에 중복되는 클래스가 없을 경우 패키지명 생략 가능
	 *  
	 *  < 기본 문법 >
	 *  package  상위패키지명.하위패키지명;
	 *    
	 *    
	 *  [ import문 ]
	 *  - 특정 패키지에 소속된 클래스를 소스코드에 포함시키는 문
	 *  - 해당 패키지명과 클래스명을 조합하여 특정 클래스를 지정하거나
	 *    클래스명 대신 *기호로 해당 패키지의 모든 클래스를 지정 가능
	 *  - package 문과 class 선언부 사이에 위치하며
	 *    package 문과 달리 갯수제한 없이 여러번 사용 가능
	 *  - 자동 import 단축키 : Ctrl + Shift + O
	 *  - java.lang 패키지는 유일하게 import문 생략이 가능한 패키지이다!
	 *    (자바에서 가장 기본이 되는 패키지이므로 자동으로 포함됨)
	 *    
	 *  < 기본 문법 >
	 *  import 상위패키지명.하위패키지명.클래스명
	 *  import 상위패키지명.하위패키지명.*;
	 */
		
		// 원래 사용하던 클래스 지정 방식(패키지명을 생략하고 사용)
		
		String str = "홍길동";
		
		
		// 실제  String 클래스를 지정하는 정석적인 방법
		// => java.lang 패키지 내에 위치하므로
		java.lang.String str2 = "홍길동";
		
		// com.lg.tv 패키지의 Tv클래스 지정하여 객체생성
//		com.lg.tv.Tv tv = new com.lg.tv.Tv();
		
		// com.lg.tv패키지명을 생략하기 위해서는
		// 해당 패키지를 import문을 통해 포함 시켜야함
		Tv tv= new Tv();
		
		// com.samsung.tv 패키지 내의 Tv클래스를 사용해야하는 경우
		// => 이미 com.lg.tv 패키지의 Tv클래스가 import되어 있으므로
		//    다른 패키지의 Tv클래스는 패키지명을 포함해서 지정해야함
		// 	  (동일한 클래스를  import할 수 없다!)
		
//		com.samsung.tv.Tv Tv2 = new com.samsung.tv.Tv();	
		
		// import문을 사용하여 "com.lg.tv.Tv" 위치를 지정했을 겨웅
//		LgTv lgTv = new LgTv();	// 사용 불가능(위치를 모르기 떄문_
//		 => 해결책 : import문을 추가하거나 tv.*로 변경해야함
//					 패키지명.클래스명 형태로 지정
		
		
		// import문을 사용하여 "com.samsung.tv.*" 위치를 지정했을 경우
		SamsungTv samsungTv = new SamsungTv();	// 사용가능
		
		
	}
	
}

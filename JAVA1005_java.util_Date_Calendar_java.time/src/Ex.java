import java.util.Random;

public class Ex {

	public static void main(String[] args) {
		/*
		 * Random 클래스
		 * - 난수 관련 기능을 제공하는 클래스
		 * - Math 클래스의 random() 메서드와는 달리
		 *   객체 생성 후 메서드 호출을 통해 난수 발생
		 *   => nextXXX() 메서드사용(XXX : 데이터타입)
		 */
		Random	r = new Random();
		
		for(int i = 1 ; i <= 10 ; i++) {
			// 1. boolean 타입 범위의 난수 발생
//			System.out.println(r.nextBoolean());
			// 2. double 타입 범위의 난수 발생(0.0 <= x < 1.0)
//			System.out.println(r.nextDouble());
			// 3. int 타입 범위의 난수 발생
//			System.out.println(r.nextInt());
			// 4-1. int 타입 범위 중 0 ~ x-1 까지의 난수 발생
//			System.out.println(r.nextInt(10));	// 0 ~ 9 까지의 난수 발생
			// 4-2. int 타입 범위 중 1 ~ x-1 까지의 난수 발생
			System.out.println(r.nextInt(10)+1);	// 1 ~ 10 까지의 난수 발생
			
		}
		
	}

}




public class Ex {

	public static void main(String[] args) {
		/*
		 * java.lang.Math 클래스
		 * - 수학 관련 기능을 제공하느 ㄴ클래스
		 * 
		 * - final 클래스이므로 상속 불가하며
		 *   모든 멤버는 static으로 선언되어 있으므로 클래스명만으로 접근 가능
		 *   
		 */
		
		int num1 = -10;
		System.out.println("num1의 절댓값 : " +Math.abs(num1));
		
		int num2 = 10, num3 = 20;
		System.out.println("num2 와 num3 중 최대값 : " +Math.max(num2, num3));
		System.out.println("num2 와 num3 중 최소값 : " +Math.min(num2, num3));
		
		// 소수점 첫째자리를 기준으로 올림, 내림, 반올림 수행
//		double num4 = 3.141592;
//		System.out.println("num4의 올림 : " +Math.ceil(num4));		// 리턴타입 : 실수
		// => 파이 값을 미리 Math 클래스에서 상수로 만들어 제공
		System.out.println("파이값 : " +Math.PI);
		System.out.println("num4의 올림 : " +Math.ceil(Math.PI));		// 리턴타입 : 실수
		System.out.println("num4의 내림 : " +Math.floor(Math.PI));		// 리턴타입 : 실수
		System.out.println("num4의 반올림 : " +Math.round(Math.PI));	// 리턴타입 : 정수
		
		// x^y 만들기
		// Math.pow(x, y) : x의 y 제곱 값
		System.out.println(Math.pow(2, 2));		// 리턴타입 double : 4.0
		System.out.println(Math.pow(10, 2));	// 리턴타입 double : 100.0
		System.out.println(Math.pow(10, 3));	// 리턴타입 double : 1000.0
		
		System.out.println("==================================================================");
		/*
		 * 난수(임의의 수) 발생
		 * Math.random() 메서드 사용
		 * - 난수 x의 범위 : 0.0 <= x < 1.0 (double 타입)
		 * - 주로, 난수의 자릿수를 지정하여 정수화 시킨 후 활용
		 *   (ex. 난수의 소수점 6자리까지 정수화 = 6자리 정수형 난수)
		 * - 하한값 n ~ m까지의 난수 발생 공식
		 *   1) (int)(Math.random() *상한값(최대값 m) +1
		 *   2) (int)(Math.random() *(상한값(최대값 m) - 하한값(최소값 n) +1) +하한값(최소값 n)
		 *      => 1번 방법 보다 중복되는 숫자만들 확률이 적음
		 */
		
		// 0.0 <= x < 1.0 범위의 난수 발생
		System.out.println("기본 난수 : " +Math.random());
		
		// 0.0 <= x < 10.0 범위의 난수 발생
		System.out.println(Math.random()*10);
		
		// 0 <= x < 10 범위의 난수 발생
		System.out.println((int)(Math.random()*10));
		
		// 1 <= x < = 10 범위의 난수 발생(정수화)
		System.out.println((int)(Math.random()*10)+1);
		
		// 1 <= x <=20 범위의 난수 발생(정수화)
		for(int i = 0 ; i < 10 ; i++) {
		System.out.println(i+" : " +(int)((Math.random()*20)+1));
		}
		
	}

}





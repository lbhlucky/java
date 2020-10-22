
public class Ex2 {

	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();	// Calculator 인스턴스 생성
		
		myCalc.powerOn();			// powerOn 메소드 호출
		myCalc.powerOn();	
		
		// Calculator클래스의 plus 메소드 호출
		int result1 = myCalc.plus(5, 6);		
		System.out.println("result1 : " +result1);
		
		// Calculator클래스의 minus 메소드 호출
		int result2 = myCalc.minus(0, 0);
		System.out.println("result2 : " +result2);
		
		// Calculator클래스의 multiply 메소드 호출
		int result3 = myCalc.multiply(9, 2);
		System.out.println("result3 : " +result3);
				
		byte x = 10, y = 4;
		
		// Calculator클래스의 divide 메소드 호출
		double result4 = myCalc.divide(x, y);
		System.out.println("result4 : " +result4);
		
		myCalc.powerOff();
		myCalc.powerOff();
		
		System.out.println("현재 전원 상태 : " +myCalc.isPowerOn);
		myCalc.changePower();
		System.out.println("변경된 전원 상태 : " +myCalc.isPowerOn);
		
	}

}


class Calculator{
	// 전원 on/off 상태를 저장할 변수 isPowerOn 선언 => boolean 타입
	boolean isPowerOn ;		// 기본값 false
	
	public void changePower() {
		isPowerOn = !isPowerOn;		// 현재의 전원 상태를 반전 시켜줌.
	}

	public void powerOn() {
		// 전원을 켜기 위해 isPowerOn을 true로 변경
		if(!isPowerOn) {	
		// => isPowerOn == false 와 동일한 조건식
			System.out.println("전원을 켭니다.");
			isPowerOn = true;
		} else
			System.out.println("이미 전원이 켜져있습니다.");
	}
	public int plus(int x, int y) {	
		// 전달 받은 2개의 정수의 합을 result에 저장 후 리턴
		int result = x + y;
		return result;
	}
	
	public int minus(int x, int y) {	
		// 전달 받은 2개의 정수의 차을 result에 저장 후 리턴
		int result;
		if(x > y) {
			 result = x-y;
		} else if (y > x) {
			 result = y -x;
		} else {
			 result = 0;
		}		
		return result;
	}
	
	public int multiply(int x, int y) {	
		// 전달 받은 2개의 정수의 곱을 result에 저장 후 리턴
		int result = x * y;
		return result;
	}
	
	public double divide(int x, int y) {	
		// 전달 받은 2개의 정수를 나눈 결과를 result에 저장 후 리턴
		double result = (double)x / y;
		return result;
	}
	
	public void powerOff() {
		// 전원을 끄기 위해 isPowerOn을 false로 변경
		if(isPowerOn) {	// 변수에 들어가 잇는 값 자체가 true/false 이기 때문에 변수만 사용해도 됨
		// => isPowerOn == true 와 동일한 조건식
			System.out.println("전원을 끕니다.");
			isPowerOn = false;
		} else
		System.out.println("이미 전원이 꺼져있습니다.");
	}
	
	
}
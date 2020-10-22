public class Ex2 {

	public static void main(String[] args) {
		WalkBad wb = new WalkBad();
		wb.walk();
		wb.walk(2);
		wb.walk(2, "m");	//m로 변환
		wb.walk(2, "cm");	//cm로 변환
		wb.walk(2, "inch");

		// 하나의 메서드에서 다른 메서드 호출을 통해
		// 중복 코드를 제거할 수 있으며
		// 중복 코드를 제거하면 유지보수성이 향상됨
		WalkGood wg = new WalkGood();
		wg.walk();
		wg.walk(1);
		wg.walk(2, "cm");
	}

}	// Ex2 클래스 끝

// 사람보폭을 1m = 100cm 이동거리 계산
class WalkBad{
	
	// 사람의 한 걸음(보폭)의 길이 출력
	public void walk() {
		System.out.println("100cm 이동!");
	}
	
	// 사람 걸음 수에 따른 이동 거리 출력
	public void walk(int step) {
		System.out.println(step * 100 + "cm 이동!");
	}
	
	// 사람 걸음 수에 따른 이동거리를 지정한 단위에 따라 m로 변환 후 출력 출력
	public void walk(int step, String unit) {
		// 2걸음 : 100cm * 2 / 2.5 (inch)
		// switch - case문을 사용 다누이 판별("cm", or "m")
		double distance = 0.0;
		switch(unit) {
		case "cm":	
			distance = step *100;
			System.out.println(distance + "cm 이동!");
			break;
		case "m":	// step * 100 결과를 m 로 변화 하기 위해 /100
			distance = (step *100)/100;
			System.out.println(distance + "m 이동!");			
			break;
		default:		// 계산 불가능한 단위라고 가정
			System.out.println("알 수 없는 단위이므로 이동 불가!");
		}
			
		
	}
	
}	// WalkBad 클래스 끝

class WalkGood{
	
	// 오버로딩 된 메서드끼리 수행할 작업이 중복되는 경우
	// 하나의 메서드에서 다른 메서드를 호출하여
	// 필요한 데이터를 전달함으로써 중복되는 코드를 제거할 수 있다!
	
	// 사람의 한 걸음(보폭)의 길이 출력
	public void walk() {
//		System.out.println("100cm 이동!");
		walk(1, "cm");
	}
	
	// 사람 걸음 수에 따른 이동 거리 출력
	public void walk(int step) {
//		System.out.println(step * 100 + "cm 이동!");
		// 동일한 step * 100 계산과 "cm 이동!" 메세지를 출력하는 코드를
		// step, unit 파라미터를 전달하는 메서드 호출을 통해 중복 제거 수행
		walk(step, "cm");
	}
	
	// 사람 걸음 수에 따른 이동거리를 지정한 단위에 따라 m로 변환 후 출력 출력
	public void walk(int step, String unit) {
		// ex) 2걸음, m = 100 * 2 = 200cm / 100 = 2m 결과를 출력
		// switch - case문을 사용 다누이 판별("cm", or "m")
		double distance = 0.0;
		switch(unit) {
		case "cm":	
			distance = step *100;
			System.out.println(distance + "cm 이동!");
			break;
		case "m":	// step * 100 결과를 m 로 변화 하기 위해 /100
			distance = (step *100)/100;
			System.out.println(distance + "m 이동!");			
			break;
		default:		// 계산 불가능한 단위라고 가정
			System.out.println("알 수 없는 단위이므로 이동 불가!");
		}
			
		
	}
	
}	// WalkGood 클래스 끝


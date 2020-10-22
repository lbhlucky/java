
public class Ex {

	public static void main(String[] args) {
		
		int i1 = 1234;
		long l1 = i1;	// int -> long 으로 자동형변환
		System.out.println(i1 + ", " + l1);
		
//		byte b1 = i1; // int -> byte로 자동형변환 불가
		byte b1 = (byte) i1; // byte 타입으로 명시적(강제)형변환 필수!
		// => 변환 과정에서 오버플로우가 발생하므로 다른 값이 저장됨
		System.out.println(i1 + ", " + b1); //1234, -46 출력됨
		
		double d1 = i1; // int -> double로 자동형변환(소수점 .0 추가됨)
		System.out.println(i1 + ", " + d1);
		
		double d2 = 0.12345678901234567890;
//		float f1 = d2; // double -> float로 자동형변환불가
		float f1 = (float) d2; // float 타입으로 명시적(강제)형변환 필수!
		System.out.println(d2 + ", " + f1);
		// double 타입은 소수점 18째 자리에서 반올림 17자리로 표시
		// float 타입은 소수점 9번째 자리에서 반올림 8자리로 표시
		
		byte b3 = 67;
//		char c1 = b3; // 오류발생
		// byte 또는 short타입 간의 변환은 반드시 명시적 형변환
		char c1 = (char) b3;
		System.out.println(b3 + ", " + c1);
		
		// boolean 타입은 그 어떤 데이터타입과도 형변환 불가능
		
		
	}

}

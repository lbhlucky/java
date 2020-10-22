
public class Test {

	public static void main(String[] args) {
		/*
		 * 정수 5개를 저장하는 배열을 생성하고
		 * 10, 20, 30, 40, 50으로 초기화한 후 출력하고
		 * 정수형 변수 total 에 배열내의 정수의 합을 누적한 뒤
		 * 결과값을 출력
		 */
		
//		int[] arr = new int[5]		// 정수 5개를 저장하는 배열 생성
		int[] arr = {10, 20, 30, 40, 57};		
		
		int total = 0;	// 배열 내의 정수의 합을 누적하기 위한 정수형 변수 생성
		
		for(int i = 0 ; i < 5 ; i++) {
			
			total += arr[i];
			
			System.out.println("arr배열의 " + i + "번째 인덱스 : "+arr[i]);
			
		}
		
		System.out.println("arr 배열 내의 인덱스 총 합 : " +total);
		
		System.out.println("==================================");
		
		
		total = 0;
		for(int i = 0 ; i < arr.length ; i++) {
				total += arr[i];
				
			System.out.printf("arr배열의 %d번째 인덱스 : %d \n", i, arr[i]);
			
		}
		
		System.out.printf("arr 배열 내의 인덱스 총 합 : %d\n", total);
		
		double avg = (double)total / arr.length; // 문자 (연산) 문자 일 경우 보통 앞쪽에 강제 형변환
		System.out.println("정수의 평균값 : " + avg);
		
		
	}

}

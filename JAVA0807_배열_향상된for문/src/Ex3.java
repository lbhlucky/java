
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 향상된 for문(ForEach문)
		 * - 배열 등의 객체 반복을 위해 for문 사용시
		 *   조건식, 증감식 등이 없는 단순한 for문
		 * - 저장된 배열 내의 모든 데이터를 하나씩 꺼내서
		 *   좌변에 선언된 변수에 저장 반복하고 자동 종료
		 * - 단, 특정 범위만 반복할 수 없고, 인덱스 사용 불가
		 *  
		 *   
		 *   < 기본 문법 >
		 *   for(변수 선언 : 배열) {
		 *   
		 *   	// 배열 내의 데이터를 하나 꺼내서 좌변의 변수에 저장하고
		 *   	// 블록 내에서 해당 변수를 사용하여 데이터 접근 가능
		 *   
		 *   }
		 */
		
		int[] arr = {1, 2, 3, 4, 5};
		
		for(int i = 0 ; i < arr.length ; i++) {
		
			System.out.println(arr[i]);
			
		}
		
		System.out.println("================================");
		
		// 향상된 for문 사용 시
		for (int num:arr) {

			// 배열 arr내의 데이터를 차례대로 꺼내서 num에 저장 반복
			System.out.println(num);
			
		}
	}

}

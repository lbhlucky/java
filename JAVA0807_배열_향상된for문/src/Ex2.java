
public class Ex2 {

	public static void main(String[] args) {
		/*
		 *  다차원 배열
		 * - 1차원 배열을 여러겹 중첩시킨 형태의 배열
		 *    (일반적인 다차원 배열은 2차원까지만 사용)
		 * - 2차원 배열은 행렬의 형태를 지님
		 * - 2차원 배열의 행크기 : 배열명.length
		 *   2차원 배열 특정 행의 열크기 : 배열명[행번호].length
		 * 
		 *  <2차원 배열 생성 기본 문법>
		 * 데이터타입[][] 변수명 = new 데이터타입[행크기][열크기]
		 * 
		 *   <2차원 배열 접근 기본 문법>
		 * 변수명[행번호][열번호]
		 * 
		 *   <2차원 배열 생성 및 초기화 동시에 수행하는 문법>
		 *   데이터 타입[][] 변수명 = {
		 *   	
		 *   }
		 */
		// 2차원 배열 변수 score 선언
//		int[][] score ;
		
		// 2차원 배열 5행 3열 크기를 갖는 int형 배열 생성
//		score = new intp[5][3];
		
		// 위의 두 문장을 하나로 결합하여 배열 선언 및 생성을 동시에 수행
		int[][] score = new int[5][3];
		
		/*
		 * 다음과 같은 데이터로 초기화
		 *  국어	영어	수학
		 * --------------------------
		 * 	80(0,0)	80(0,1)	80(0,2)
		 * 	90(1,0)	90(1,1)	90(1,2)
		 * 100(2,0)	80(2,1)	60(2,2)
		 * 100(3,0)100(3,1) 100(3,2)
		 *  77(4,0)	80(4,1)	90(4,2)
		 * --------------------------
		 */
		
		// 변수명[행번호][열번호] = 값;
		score[0][0] = 80;
		score[0][1] = 80;
		score[0][2] = 80;
		score[1][0] = 90;
		score[1][1] = 90;
		score[1][2] = 90;
		score[2][0] = 100;
		score[2][1] = 80;
		score[2][2] = 60;
		score[3][0] = 100;
		score[3][1] = 100;
		score[3][2] = 100;
		score[4][0] = 77;
		score[4][1] = 80;
		score[4][2] = 90;
		
		System.out.printf("1번 학생 : %3d %3d %3d\n", score[0][0], score[0][1], score[0][2]);
		System.out.printf("2번 학생 : %3d %3d %3d\n", score[1][0], score[1][1], score[1][2]);
		System.out.printf("3번 학생 : %3d %3d %3d\n", score[2][0], score[2][1], score[2][2]);
		System.out.printf("4번 학생 : %3d %3d %3d\n", score[3][0], score[3][1], score[3][2]);
		System.out.printf("5번 학생 : %3d %3d %3d\n", score[4][0], score[4][1], score[4][2]);

		System.out.println("===================================");
		
		// 행번호(i)를 0 ~ 4까지 반복 
//		for(int i = 0 ; i < 5 ; i++) {
		for(int i = 0 ; i < score.length ; i++) {
			
//			System.out.println("i = " + i);
			System.out.print((i+1) + "번 학생 : ");
			
		// 열번호(j)를 0 ~ 2 까지 반복
//			for(int j = 0; j < 3 ; j++) {
			for(int j = 0; j < score[0].length ; j++) {
//			System.out.println("j = " +j);
			// 2차원 배열 score의 행, 열에 대한 중첩  for문
			System.out.printf("%3d ", score[i][j]);
			
			}
		
			System.out.println();	// 줄바꿈
			
		}
					
		System.out.println("=====================================");
		
		
		// 2차원 배열의 행크기 : 배열명.length
		// 2차원 배열의 열크기 : 배열명[행번호].length
		System.out.println("2차원 배열 score의 행의 크기 : " + score.length);
		System.out.println("2차원 배열 score 1번행의 열의 크기 : " + score[1].length);
		System.out.println("2차원 배열 score 2번행의 열의 크기 : " + score[2].length);
		
		System.out.println("=====================================");
		
		// 2차원 배열의 모든 데이터를 출력하는 공식
		// => 바깥쪽 for문은 행을 반복하는 반복문(배열명.length)
		// => 안쪽 for문은 행의 열을 반복하는 반복문(배열명[행번호].length)
		for(int i = 0 ; i < score.length ; i ++) {
			
			System.out.print((i+1) + "번 학생 : ");
			
			for (int j = 0; j < score[0].length; j++) {
			
				System.out.printf("%3d ", score[i][j]);
				
			}
			
			System.out.println(); 		// 줄바꿈
			
		}
		
		System.out.println("============================================");
		
		// 2차원 배열의 생성 및 초기화를 동시에 수행
		/*
		 * 다음과 같은 데이터로 초기화
		 *  국어	영어	수학
		 * --------------------------
		 * 	80(0,0)	80(0,1)	80(0,2)
		 * 	90(1,0)	90(1,1)	90(1,2)
		 * 100(2,0)	80(2,1)	60(2,2)
		 * 100(3,0)100(3,1) 100(3,2)
		 *  77(4,0)	80(4,1)	90(4,2)
		 * --------------------------
		 */
		
		int[][] score2 = {
				{80,80,80},		// 0번행 (0열, 1열, 2열)
				{90,90,90},   	// 1번행 (0열, 1열, 2열)
				{100,80,60}, 	// 2번행 (0열, 1열, 2열)
				{100,100,100 }, // 3번행 (0열, 1열, 2열)
				{77,80,90} 		// 4번행 (0열, 1열, 2열)
		};
		for(int i = 0 ; i < score.length ; i++) {

			for(int j = 0 ; j < score2[0].length ; j++) {
			
				System.out.printf("2차원 배열score2의 %d행 %d열 %3d \n",i, j, score[i][j]);
				
			}
		}
	}

}


public class Test {

	public static void main(String[] args) {
		/*
		 * 5명의 학생 점수를 저장하는 배열 생성 후
		 * 해당 점수의 총점과 평균을 계산
		 */
		
		// 1. 5명의 학생의 점수( 100, 80, 77, 90, 60)를 갖는 배열 생성 후 출력
		int[] score = {100, 80, 77, 90, 60};
		int total = 0;
		
//		for(int i = 0; i < score.length ; i++) {
//			System.out.println((i+1)+"번"+" 학생 : "+score[i]+"점" );
//			total += score[i];
//			System.out.printf("%d번 학생 : %d점\n", i+1, score[i]);
//			
//		}
		//-----------------------------------------------
		// 학생 4명의 이름( 홍길동, 이순신, 강감찬, 조인성, 정우성) 등
		// 배열 names 에 저장 및 점수와 함꼐 출력
		String[] names = {"홍길동", "이순신", "강감찬", "조인성", "정우성"};
		
		for(int i = 0; i < names.length ; i++) {
			System.out.println(names[i] + "학생" + score[i] + "점");
			total += score[i];
		}
		//-----------------------------------------------
		System.out.printf("학생들의 총점 : %d점\n", total);
		
		System.out.println("========================================");
		
		// 2. for문을 사용하여 5명의 학생의 점수를 총점에 누적 후 출력
//		int total = 0;
		
//		for(int i = 0; i < score.length ; i++) {
			
//			total += score[i];
			
//		}
//		System.out.println("학생들의 총점 : " + total);
//		System.out.printf("학생들의 총점 : %d점\n", total);
		
		System.out.println("========================================");
		
		// 3. 5명학생의 점수 평균을 계산 후 출력
		double avg = (double)total / 5;
//		double avg = total / 5.0;
//		double avg = (double)total / score.length;
		System.out.println("평균 : " + avg + "점");
		
		
	}

}


public class test {

	public static void main(String[] args) {

		char grade = 'B';
		
		switch (grade) {
		
			case 'A' :		// 실행문과 break문이 없으므로 아래쪽 문장 실행
			case 'a' :		// 'A' 와 'a' 가 동일한 문장을 실행함
				System.out.println("우수 회원입니다.");
				break;
			case 'B' :		// 실행문과 break문이 없으므로 아래쪽 문장 실행
			case 'b' :		// 'B' 와 'b' 가 동일한 문장을 실행함
				System.out.println("일반 회원입니다.");
				break;
			default :
				System.out.println("손님입니다.");
			
		}
		
		System.out.println("==============================================");
		
		int num = 4;
		
		switch (num % 2) {
			case 0 :
				System.out.println("짝수또는0입니다.");
				break;
			case 1 :
				System.out.println("홀수입니다.");
				
		}
		
		System.out.println("==============================================");
		
		// if문을 사용하여 점수(score)가 정삼범위(0~100)인지 판별
		
		int score = 101;
		
		if(score >= 0 && score <= 100) {
			
		switch(score/10) {
			case 10 : 
			case 9 : 
				System.out.println("A학점"); break;
			case 8 : 
				System.out.println("B학점"); break;
			case 7 : 
				System.out.println("C학점"); break;
			case 6 : 
				System.out.println("D학점"); break;
			default  : 
				System.out.println("F학점!"); break;
			}
		} else {
			System.out.println("점수 입력 오류!");
		}
		
	}

}

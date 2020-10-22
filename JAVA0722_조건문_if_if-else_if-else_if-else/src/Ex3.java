
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * if ~ else if ~ else 문(다중 if ~ else 문 또는 if ~ else if 문)
		 * - 두 가지 이상의 조건식을 차례대로 판별하면서
		 *   세 가지 이상의 경우를 판별하는 조건문
		 * 
		 * < 기본 문법 >
		 * if(조건식1) {
		 * 		// 조건식1 의 결과가 true 일 때 실행할 문장들...
		 * 		문장1;
		 * } else if(조건식2) {
		 * 		// 조건식1 의 결과가 false 이고, 조건식2 의 결과가 true 일 때 실행할 문장들...
		 * 		문장2;
		 * } else if(조건식n) {
		 * 		// 조건식 1, 2 의 결과가 false 이고, 조건식n 의 결과가 true 일 때 실행할 문장들...
		 * 		문장n;
		 * } else {
		 * 		// 모든 조건식의 결과가 false 일 때 실행할 문장들... 
		 *      // (생략 가능)
		 * 		문장x;
		 * }
		 */
		
		// 정수 num이 5보다 크면 "num이 5보다 크다"
		// 정수 num이 5보다 작으면 "num이 5보다 작다"
		// 둘 다 아닐 경우 "num은 5와 같다"
		
		int num = -15;
		
		if( num > 5) {
			
			System.out.println(num + "은 5보다 크다.");
			
		} else if(num < 5) {
			
			System.out.println(num + "은 5보다 작다.");
			
		}
		
		System.out.println("=============================");
		
		num = 5;
		// num이 5일 때, if문과 else if문 모두 해당되지 않으면
		// 실행할 문장을 else 문 블록에 기술해야한다.
		if( num > 5) {
			
			System.out.println(num + "은 5보다 크다.");
			
		} else if(num < 5) {
			
			System.out.println(num + "은 5보다 작다.");
			
		} else {
			
			System.out.println(num + "은 5와 같다.");
			
		}
		
		System.out.println("=============================");
		
		// 중첩 if문
		int score = 18;
		String grade = "";
		if (score >= 0 && score <= 100) {
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
				//System.out.println
				grade = "B";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}
			System.out.println("시험 성적 : " + grade);
		} else {
			System.out.println("점수 입력 오류!");
		}
		
	}

}

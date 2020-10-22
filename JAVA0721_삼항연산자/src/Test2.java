
public class Test2 {

	public static void main(String[] args) {

		int num = -12;
		// 짝수란? 숫자를 2로 나누었을 때 나머지가 0인 수
//		System.out.println("num은 짝수인가? " +(num % 2 == 0));
		
		String result = "";
		
		// 변수 num이 짝수이면 result에 문자열 "짝수"를 저장하고
		// 아니면, result에 문자열 "홀수"를 저장
		result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.println("num : " + result);
		
		// 변수 num이 양수이면 "양수" 아니면 "음수"를 result에 저장
		result = (num >= 0) ? "양수" : "음수";
		System.out.println("num : " + result);
		

		
		System.out.println("--------------------------------");
		System.out.println("끼요오오오오오오오오오오오오오옷");
		System.out.println("--------------------------------");
		
		// 변수num이 양수이면 "양수" 음수이면 "음수"를 아니면 " 0 " result에 저장
		num = -1;
		result = (num > 0) ? "양수" : (num == 0 ? "0" : "음수");
		System.out.println("num : " + result);
		
		// 변수 num이 짝수이면 result에 문자열 "짝수"를 저장하고
		// 홀수이면, result에 문자열 "홀수"를 저장
		// 아니면, "0"을 저장
		// => 주의! 0을 판별하는 조건이 짞수를 판별하는 조건보다 앞에 와야함
		num = 0;
//		result = (num % 2 == 0) ? "짝수" : num == 0 ? "0이다" : "홀수";
		// => 0이 입력되어도 나머지가 0이므로 "짝수"가 저장됨(잘못된 식)
		result = (num == 0) ? "0" : (num % 2 == 1) ? "홀수" : "짝수"; 
		// 또는 result = (num == 0) ? "0" : (num % 2 == 0) ? "짝수" : "홀수";
		// 또는 result = (num == 0) ? "0" : (num % 2 == 1) ? "홀수" : "짝수";
		// 또는 result = (num % 2 == 1) ? "홀수" : num == 0 ? "0이다" : "짝수";
		System.out.println("num : " + result);
		
	}

}

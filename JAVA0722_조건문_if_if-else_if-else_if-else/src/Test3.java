public class Test3 {

	public static void main(String[] args) {
		// if - else if - else 문 연습
		// 1. 정수형 변수 num이 양수, 음수, 0인지 판별

		int num = 0;

		if (num > 0) {

			System.out.println(num + "은 양수!");

		} else if (num < 0) {

			System.out.println(num + "은 음수!");

		} else {

			System.out.println(num + "은 0!!!!");

		}

		System.out.println("=============================");

		// 2. 정수형 변수 num이 홀수, 짝수, 0인지 판별하여 출력\
		// 0 판별 조건식이 최소한 짝수 판별식보다 앞에 있어야한다.
		num = 0;
		if (num % 2 == 1) {
			System.out.println(num + "은 홀수!");
		} else if (num == 0) {
			System.out.println(num + "은 0!!");
		} else {
			System.out.println(num + "은 짝수!");
		}

		System.out.println("=============================");

		// 3. 문자 ch가 대문자일 경우 소문자로 변환
		// 소문자일 경우 대문자로 변환
		// 아니면 "ch는 영문자가 아닙니다!" 출력
		// ch출력
		char ch = '2';

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자이므로 소문자로 변환!");
			ch += 32;
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("소문자이므로 대문자로 변환!");
			ch -= 32;
		} else {
			System.out.println(ch + "는 영문자가 아닙니다!");
		}

		System.out.println("ch = " + ch);

		System.out.println("=============================");

		// 문자 ch가 대문자일 경우 "ch 는 대문자!"출력
		// 소문자일 경우 "ch 는 소문자!"출력
		// 숫자일 경우 "ch 는 숫자!"출력
		// 아니면 "ch 는 기타문자!"출력
		ch = '$';
		if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + "는 대문자!!");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + "는 소문자!!");
		} else if (ch >= '0' && ch <= '9') {
			System.out.println(ch + "는 숫자!");
		} else {
			System.out.println(ch + "는 기타문자!!");
		}

		System.out.println("=============================");

		int score = 881;
		String grade = "";
		if (score >= 90 && score <= 100) {
			System.out.println(grade = "A");
		} else if (score >= 80 && score < 90) {
			System.out.println(grade = "B");
		} else if (score >= 70 && score < 80) {
			System.out.println(grade = "C");
		} else if (score >= 60 && score < 70) {
			System.out.println(grade = "D");
		} else if (score > 0 && score < 60) {
			System.out.println(grade = "F");
		} else {
			System.out.println("점수 입력 오류!");
		}
		System.out.println("시험 성적 : " + grade);

		System.out.println("=============================");

		score = 48;
		grade = "";
 		if (score >= 0 && score <= 100) {
			if (score >= 90) {
				grade = "A";
			} else if (score >= 80) {
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

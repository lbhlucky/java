
public class Ex {

	public static void main(String[] args) {

		// int형 정수를 저장하는 변수 num을 선언
		int num;
		// int형 변수 num에 정수 10을 저장
		num = 10;
		// int형 변수 num에 저장된 값 출력
		System.out.println(num);
		
		// 학생 5명의 정수를 저장하는 변수 사용 시
		int score1 = 80,score2 = 60, score3 = 70, score4 = 100, score5 = 10;
		System.out.println("1번 학생 점수 " +score1);
		System.out.println("2번 학생 점수 " +score2);
		System.out.println("3번 학생 점수 " +score3);
		System.out.println("4번 학생 점수 " +score4);
		System.out.println("5번 학생 점수 " +score5);
		
		int sum = 0;
		
		sum += score1;
		sum += score2;
		// ...생략...
		
		// => 대량의 데이터를 일반 변수로 관리하기엔 부적합하다!
		//	  따라서, 배열을 통해 여러개의 데이터를 하나의 묶음으로 관리!!
		
		System.out.println("=======================================");
		
		// int형 정수 3개를 저장하기 위한 배열 변수 arr 을 선언
		// 배열 선언!! : 데이터타입[] 배열명
//		int[] arr;	// int형 정수 저장을 위한 배열 공간의 이름을 arr로 선언
		// => 주의! 아직 정수를 저장할 수 있는 메모리 공간을 생성되기 전이므로
		// 	  배열에 데이터 저장은 불가능 하다!
		
		// 배열 생성!! : 배열명 = new 데이터타입[배열크기]
//		arr = new int[3] ;
		// => 실제 데이터 저장이 가능한  메모리 공간 3개가 연속적으로 생성됨
		// => 이 때, 배열이 생성되면 자동으로 배열 내부 공간의 데이터가
		//	  기본값으로 초기화 됨
		
		// 위의 배열 선언 및 배열 생성 코드를 한 문장으로 결합
		int[] arr = new int[3];	// 0 ~ 2 번 인덱스를 배열 공간 생성됨
		
		// 배열의 각 인덱스에 접근하여 저장된 데이터 출력
		System.out.println("배열 arr의 0번 인덱스 : " +arr[0]);
		System.out.println("배열 arr의 1번 인덱스 : " +arr[1]);
		System.out.println("배열 arr의 2번 인덱스 : " +arr[2]);
//		System.out.println("배열 arr의 3번 인덱스 : " +arr[3]);
		// => 0 ~ 2 번 까지의 인덱스만 존재하므로, 존재하지않는 인덱스를
		//	  접근하려 할 경우 ArrayIndexOutOfBoundsException : 3 at Ex.main(Ex.java:51)
		//		=> 3이라는 인덱스가 잘못됐다는 메세지 이며, 51번 라인이 원인
		
		System.out.println("=========================================");
		
		// 배열 arr의 0번 인덱스에 정수 10을 저장
		arr[0] = 10;
		// 1번 인덱스에 20, 2번 인덱스에 30 저장
		arr[1] = 20;
		arr[2] = 30;
		System.out.println("배열 arr의 0번 인덱스 : " +arr[0]);
		System.out.println("배열 arr의 1번 인덱스 : " +arr[1]);
		System.out.println("배열 arr의 2번 인덱스 : " +arr[2]);
		
		System.out.println("=========================================");
		
		arr[2] = 100;
		System.out.println("배열 arr의 2번 인덱스 : " +arr[2]);
		
		System.out.println("=========================================");
		
		// 배열 선언, 생성, 초기화를 동시에 수행
		// => 리터럴을 사용하여 배열을 직접 생성하는 문법 사용
		//  데이터타입[] 배열명 = {값1, 값2, ....값n};
		// => n개 만큼의 배열이 자동으로 생성되며 0 ~ n-1까지 인덱스 부여
		
		// 1) int형 배열 5개 생성하면서 1, 2, 3, 4, 5로 초기화
		int[] nums = {1, 2, 3, 4, 5};	// 0 ~ 4번 인덱스 까지 자동 부여됨
		System.out.println("배열 nums의 0번 인덱스 : " +nums[0]);
		System.out.println("배열 nums의 1번 인덱스 : " +nums[1]);
		System.out.println("배열 nums의 2번 인덱스 : " +nums[2]);
		System.out.println("배열 nums의 1번 인덱스 : " +nums[3]);
		System.out.println("배열 nums의 2번 인덱스 : " +nums[4]);
		
		System.out.println("=========================================");
		
		// 학생 3명의 이름을 배열로 갖는 names 배열 생성
		String[] names = {"홍길동", "이순신", "강감찬"};
		System.out.println("배열 names의 0번 인덱스 : " +names[0]);
		System.out.println("배열 names의 1번 인덱스 : " +names[1]);
		System.out.println("배열 names의 2번 인덱스 : " +names[2]);
		
		System.out.println("=========================================");

		System.out.println("배열 names의 크기(길이) : " +names.length);
		System.out.println("배열 nums의 크기(길이) : " +nums.length);
		
		System.out.println("=======================================");

		// 변수를 인덱스 번호로 활용하여 배열 내의 모든 데이터에 접근하는 방법
		int index = 0;
		System.out.println("배열 names의 0번 인덱스 : " +names[index]);
		index++;
		System.out.println("배열 names의 1번 인덱스 : " +names[index]);
		index++;
		System.out.println("배열 names의 2번 인덱스 : " +names[index]);
		
		System.out.println("=======================================");
		
		// 반복문을 사용하여 배열 내의 모든 데이터에 접근
		for(int i = 0 ; i < 3 ; i++) {
			System.out.printf("배열 names의 %d번 인덱스 : %s \n",i, names[i]);
		}
		
		System.out.println("=======================================");
		
		// 2) nums 배열의 모든 정수 출력
		for(int i = 0 ; i < 5 ; i++) {
			System.out.printf("배열 nums의 %d번 인덱스 : %s \n", i, nums[i]);
			System.out.println("배열 nums의 " + i + "번 인덱스 : " + nums[i]);
			System.out.println("-------------------------------------------");
		}
		
		System.out.println("=======================================");
		
		// 반복문을 사용하여 배열 내의 모든 데이터에 접근
		// => 단, 조건식에 배열 크기를 직접 
		//    배열명.length 속성을 사용하여 동
		// 1) names 배열의 모든 이름 출력
		for(int i = 0 ; i < names.length ; i++) {
			System.out.printf("배열 names의 %d번 인덱스 : %s \n",i, names[i]);
		}
		
		System.out.println("=======================================");
		
		// 2) nums 배열의 모든 정수 출력
		for(int i = 0 ; i < nums.length ; i++) {
			System.out.printf("배열 nums의 %d번 인덱스 : %s \n", i, nums[i]);
			System.out.println("배열 nums의 " + i + "번 인덱스 : " + nums[i]);
			System.out.println("-------------------------------------------");
		}
		
		System.out.println("=======================================");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

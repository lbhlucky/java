public class Test2 {

	public static void main(String[] args) {
		
		// 기본 생성자 Account2() 호출
		Account2 acc = new Account2();
		acc.print2();
		System.out.println("----------------------------------------");
		
		// 파라미터 생성자 Account2(String) 호출
		Account2 acc1 = new Account2("012-3456-7890");
		acc1.print2();
		System.out.println("----------------------------------------");
		
		// 파라미터 생성자 Account2(String, String) 호출
		Account2 acc2 = new Account2("000-0000-0000","황길동");
		acc2.print2();
		System.out.println("----------------------------------------");
		
		// 파라미터 생성자 Account2(String, String, int) 호출
		Account2 acc3 = new Account2("222-2222-222", "이순신" , 100000);
		acc3.print2();
		
		System.out.println("----------------------------------------");
		
	}

}

/*
 * Account2 클래스 정의
 * - 멤버변수
 *   1) 계좌번호(accountNo, 문자열)
 *   2) 예금주명(ownerName, 문자열)
 *   3) 현재잔고(balance, 정수)
 *   
 * - 기본 생성자 정의 및 다음 데이터로 초기화
 *   계좌번호 = "111-1111-111"
 *   예금주명 = "홍길동" 
 *   현재잔고 = 0 
 * 
 */

class Account2 {
	String accountNo, ownerName;
	int balance;
	
	
	public Account2() {
		System.out.println("Account2 생성자 호출됨");
		accountNo = "111-1111-111";
		ownerName  = "홍길동";
		balance = 0;
	}

	// 계좌번호(accountNo)저ㅏㄴ달 받아 초기화하는 생성자 정의
	// 예금주명 : "홍길동", 현재잔고 : 0 으로 직접 초기화
	public Account2(String accountNo) {
		System.out.println("Account2(String) 생성자 호출됨");
		this.accountNo = accountNo;
		ownerName  = "홍길동";
		balance = 0;
	}

	public Account2(String accountNo, String ownerName) {
		System.out.println("Account2(String, String) 생성자 호출됨");
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		balance = 0;
	}

	public Account2(String accountNo, String ownerName, int balance) {
		System.out.println("Account2(String, String, int) 생성자 호출됨");
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void print2() {
		System.out.println("계좌번호 : " +accountNo);
		System.out.println("예금주명 : " +ownerName);
		System.out.println("현재잔고 : " +balance);
	}
	
	
	

}















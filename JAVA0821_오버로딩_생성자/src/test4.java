public class test4 {

	public static void main(String[] args) {
		
		Account4 acc = new Account4();
		acc.print();
		
		Account4 acc1 = new Account4("012-3456-789");
		acc1.print();
		
		Account4 acc2 = new Account4("012-3456-789", "고길동");
		acc2.print();
		
		Account4 acc3 = new Account4("012-3456-789", "고길동", 30000);
		acc3.print();
	}

}
/*
 * Account 클래스 정의
 * - 멤버변수
 *   1) 계좌번호(accountNo, 문자열)
 *   2) 예금주명(ownerName, 문자열)
 *   3) 현재잔고(balance, 정수)
 *   
 * - 계좌번호(accountNo)를 전달받는 생성자 정의 및 다음 데이터로 초기화
 *   계좌번호 = 입력받은 계좌번호
 *   예금주명 = "홍길동" 
 *   현재잔고 = 0 
 * 
 * - 계좌번호(accountNo),예금주명(owerName)를 전달받는
 *   생성자 정의 및 다음 데이터로 초기화
 *   계좌번호 = 입력받은 계좌번호
 *   예금주명 = 입력받은 예금주명
 *   현재잔고 = 0
 *   
 * - 계좌번호(accountNo),예금주명(ownerName),현재잔고(balancce)를 전달받는
 * 	 생성자 정의 및 다음 데이터로 초기화
 *   계좌번호 = 입력받은 계좌번호
 *   예금주명 = 입력받은 예금주명
 *   현재잔고 = 입력받은 현재잔고
 */

class Account4 {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account4() {
//		accountNo = "111-1111-111";
//		ownerName = "홍길동";
//		balance = 0;
		
		//Account4(String, String, int) 생성자 호출하여 대신 초기화 수행
		this("111-1111-111","홍길동", 0);
	}

	public Account4(String accountNo) {
//		this.accountNo = accountNo;
//		ownerName = "홍길동";
//		balance = 0;
		
		//Account4(String, String, int) 생성자 호출하여 대신 초기화 수행
		this(accountNo,"홍길동", 0);
	}

	public Account4(String accountNo, String ownerName) {
//		this.accountNo = accountNo;
//		this.ownerName = ownerName;
//		balance = 0;
		
		//Account4(String, String, int) 생성자 호출하여 대신 초기화 수행
		this(accountNo,ownerName, 0);
	}
	
	// 다른 생성자로부터 데이터를 전달받아 초기화 작업을 수행하는 생성자
	public Account4(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		System.out.println("Account4(String, String, int) 생성자 호출됨");
	}

	public void print() {
		System.out.println("계좌번호 : " +accountNo);
		System.out.println("예금주명 : " +ownerName);
		System.out.println("현재잔고 : " +balance);
		System.out.println();
		
	}
}
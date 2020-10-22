public class Test {

	public static void main(String[] args) {
		/*
		 * Account 클래스의 인스턴스 생성 및 다음과 같이 데이터 지정, 출력
		 * 계좌 번호 : 111-1111-111
		 * 예금주 명 : 홍길동
		 * 현재 잔고 : 100000원
		 */
		
		Account acc = new Account();
		// Account클래스의 멤버변수들은 모두 private
//		acc.accountNo = "111-1111-111";
//		acc.ownerName = "홍길동";
//		acc.balance = 1000000;
		
		acc.setAccountNo("111-1111-111");		
		acc.setOwnerName("홍길동");
//		acc.setBalance(100000);		// private메서드는 외부에서 접근 불가
		//=> 대신 deposit() 또는 withdraw() 메서드를 사용
		
//		System.out.println("계좌번호 : " +acc.accountNo);
//		System.out.println("예금주명 : " +acc.ownerName);
//		System.out.println("현재잔고 : " +acc.balance + "원");
		
		System.out.println("계좌번호 : " +acc.getAccountNo());
		System.out.println("예금주명 : " +acc.getOwnerName());
		System.out.println("현재잔고 : " +acc.getBalance() +"원");
		
		
	}

}		// Test 클래스 끝

/*
 *  Account 클래스 정의
 *  - 멤버변수
 *   1) 계좌번호(accountNo, String)
 *   2) 예금주명(ownerName, String)
 *   3) 현재 잔고(balance, int)
 */

class Account{
	
	private String accountNo;
	private String ownerName;
	int balance;
	// private 멤버변수 accountNo에 대한 Getter/Setter 정의
//	public String getAccountNo() {
//		return accountNo;		// 인스턴스 변수 accountNo 값을 리턴 
//	}
//	
//	public void setAccountNo(String newAccountNo) {
//		accountNo = newAccountNo;	// 외부로부터 입력받은 newAccountNo을 인스턴스변수 accountNo에 저장
//	}
//	
//	// private 멤버변수 ownerName에 대한 Getter/Setter 정의
//	public String getOwnerName() {
//		return ownerName;		// 인스턴스 변수 ownerName 값을 리턴
//	}
//	
//	public void setOwnerName(String newOwnerName) {
//		ownerName = newOwnerName;		// 외부로부터 입력받은 newOwnerName을 인스턴스변수 ownerName에 저장
//	}
//	
//	// private 멤버변수 balance에 대한 Getter/Setter 정의
//	public int getBalance() {		
//		return balance;			// 인스턴스 변수 balance 값을 리턴
//	}
//	
//	public void setBalance(int newBalance) {
//		balance = newBalance;			// 외부로부터 입력받은 newBalance를 인스턴스변수 balance에 저장
//	}
//	
	
	
	// ------------------------------------------------------
	// 단축키 활용해서 Getter/Setter 생성 (Alt + Shift + S => R)	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	// 은행계좌에서 현재잔고를 직접 수정하는 것은 좋지 못하므로
	// setBalance() 메서드를 제외하거나, private으로 선언하면 된다!
	private void setBalance(int balance) {
		this.balance = balance;
	}	
	// ------------------------------------------------------
	
	
}		// Account 클래스 끝

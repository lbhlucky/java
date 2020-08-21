public class Test {

	public static void main(String[] args) {
		
		Account acc = new Account();
		System.out.println("계좌번호 : " +acc.accountNo);
		System.out.println("예금주명 : " +acc.ownerName);
		System.out.println("현재잔고 : " +acc.balance+"원");
		
		System.out.println("----------------------------------------");
		
		Account acc2 = new Account();
		System.out.println("계좌번호 : " +acc2.accountNo);
		System.out.println("예금주명 : " +acc2.ownerName);
		System.out.println("현재잔고 : " +acc2.balance+"원");
		
		System.out.println("----------------------------------------");
		
		// 파라미터 생성자 Account(String, String, int) 호출
		Account acc3 = new Account("222-2222-222", "이순신" , 100000);
		System.out.println("계좌번호 : " +acc3.accountNo);
		System.out.println("예금주명 : " +acc3.ownerName);
		System.out.println("현재잔고 : " +acc3.balance+"원");
		
		
	}

}

/*
 * Account 클래스 정의
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

class Account {
	String accountNo, ownerName;
	int balance;
	
	// 기본 생성자 정의 및 멤버변수 초기화
	Account(){
		accountNo = "111-1111-111";
		ownerName  = "홍길동";
		balance = 0;
	}
	
	// 생성자 오버로딩을 사용하여 파라미터 생성자 저으이
	// => 계좌번호, 예금주명, 혀냊잔고를 전달받아 초기화 수행
	Account(String newAccountNo, String newOwnerName, int newBalance) {
	    accountNo = newAccountNo;
		ownerName = newOwnerName;
		balance = newBalance;
	}
}















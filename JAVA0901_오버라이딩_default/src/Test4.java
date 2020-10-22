public class Test4 {

	public static void main(String[] args) {
		
		itwillBank4 ib = new itwillBank4();
		
		ib.accountNo = "111-1111-111";
		ib.ownerName = "홍길동";
		ib.insureName = "자동차보험";
		
		ib.printAccountInfo();
		
		System.out.println("=====================================");
		
		KakaoBank kb = new KakaoBank();
		
		kb.accountNo = "012-3456-789";
		kb.ownerName = "카카오";
		kb.deposit(1000000);
		kb.withdraw(50000);
		kb.kakaoPayBalance = 30000;
		
		kb.printAccountInfo();
		
	}

}

class Account4{
	/*
	 * 은행계좌(Account) 클래스 정의 멤버변수 
	 * 1) 계좌번호(accountNo, 문자열), ex) "111-1111-111" 
	 * 2) 예금주명(ownerName, 문자열), ex) "홍길동"
	 * 3) 현재잔고(balance, 정수) ex) "1000000"
	 */
	
	String accountNo, ownerName;
	int balance;

	/*
	 * 메서드 정의
	 * 1) 입금(deposit)
	 *    - 매개변수 1개 (정수형 amount)
	 *    - 리턴값 없음
	 *    - 입금할 금액(amount)를 전달 받아 현재잔고에 누적 후
	 *      입금된 금액 : xxxxx원
	 *      현재 잔고 : xxxx원
	 * 2) 출금(withdraw)
	 *    - 매개변수 1개 정수형(amount) - 출금할 금액
	 *    - 리턴값 있음(int - 출금된 금액)
	 *    - 출금할 금액(amount)를 전달 받아 현재잔고(balance)와 비교
	 *      => 만약, 현재잔고보다 출금할 금액이 클 경우 출금 불가능 하므로
	 *         "출금 불가!(잔액 부족!)" 출력
	 *         출금할 금액 : xxxx원, 현재잔고 : xxxx원" 출력 후 메서드 종료
	 *      => 아니면(현재잔고보다 출금할 금액이 크지 않을 경우) 출금 가능하므로
	 *         출금할 금액만큼 현재잔고(balance)에서 차감한 후
	 *         출금할 금액 만큼 리턴
	 */
	
	public void deposit(int amount) {
				
		balance += amount;
		
		System.out.println("입금된 금액 : " +amount + "원");
		System.out.println("입금 후 잔고 " +balance + "원");
	}
	
	public void printAccountInfo() {
		// 계좌 기본 정보를 출력하는 메서드
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
		
	}
	

	public int withdraw(int amount) {
		
		
		System.out.println("현재 잔고 " +balance + "원");
		if(balance >= amount) {
			balance -= amount;
			System.out.println("출금 금액 : " +amount+"원");
			System.out.println("출금 후 잔고 " +balance + "원");
		} else{
			System.out.println("출금 불가!(잔액 부족!)");
			System.out.println("출금 요청 금액 : " +amount +"원"+", 출금 후 잔고 " +balance + "원");
			
			amount = 0;
		}
		return amount;
		
		
	}
		
}

// Account 클래스를 상속받는 itwillBank 클래스 정의
// 보험명(insureName, 문자열) 변수 선언
// 보험계약(contract()) 메서드 정의
// => 파리미터(String, insureName), 리턴값 없음
//	  => 전달받은 보험명을 멤버변수에 전달하고
//		 "계약하신 보험명 : xxx보험입니다." 출력

class itwillBank4 extends Account4 {


	String insureName;
	
	public void contract(String insureName) {
		this.insureName = insureName;
		System.out.println("계약하신 보험명 : " +insureName +"입니다.");
	}
	
	// Account4 클래스의 printAccointinfo() aptjemfmf dhqjfkdleld gkdu
	// 계좌번호, 예금주명, 현재잔고, 보험명을 출력
	@Override
	public void printAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
		System.out.println("보험명 : " +insureName);
	}
		
}

// KakaoBank 클래스 정의 - Accoount4 클래스 상속
// => 멤버변수 : 카카오페이잔고 (int형 kakaoPayBalance)
// => printAccountInfo() 메서드 오버라이딩
//    계좌번호, 예금주명, 현재잔고, 카카오페이잔고 출력

class KakaoBank extends Account4 {

	int kakaoPayBalance;
	
	@Override
	public void printAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
		System.out.println("카카오페이잔고 : " +kakaoPayBalance);
	}

	
}
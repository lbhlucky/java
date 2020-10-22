public class Test {

	public static void main(String[] args) {
		
		itwillBank ib = new itwillBank();
		
		ib.accountNo = "111-1111-111";
		ib.ownerName = "홍길동";
		ib.deposit(100000);
		System.out.println("출금된 금액 : " + ib.withdraw(50000));
		ib.contract("자동차보험");
		ib.print();
		
		
	}

}

class Account{
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

class itwillBank extends Account {
	String insureName;
	
	public void contract(String insureName) {
		this.insureName = insureName;
		System.out.println("계약하신 보험명 : " +insureName +"입니다.");
	}
	
	public void print() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
		System.out.println("보 험 명 : " + insureName);
		
	}
}
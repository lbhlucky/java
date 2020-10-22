public class test {
	
	public static void main(String[] args) {
		/*
		 * Account 인스턴스 생성 후 다음과 같이 데이터 저장 후 출력
		 * ----------------------------------------------------------
		 * 계좌 번호 : 111- 1111-111
		 * 예금주 명 : 홍길동
		 * 현재 잔고 : 1000000원
		 * 
		 */
		Account a = new Account();
		
		a.accountNo = "111-1111-111";
		a.ownerName = "홍길동";
		a.balance = 100000;
		
		System.out.println("계좌번호 : " + a.accountNo);
		System.out.println("예금주명 : "+a.ownerName);
		System.out.println("현재잔고 : "+a.balance+"원");
		
		a.deposit(5000);
		System.out.println("-------------------------------");
//		a.withdraw(5000);
		System.out.println("출금된 금액"+a.withdraw(5000)+"원");
		System.out.println("-------------------------------");
//		a.withdraw(5000000);
		System.out.println("출금된 금액"+a.withdraw(5000000)+"원");
		
		System.out.println("=============================================");
		
		Account a1 =new Account();
		
		a1.accountNo = "222-2222-222";
		a1.ownerName = "황길동";
		a1.balance = 200000;
		
		a1.deposit(5000);
		System.out.println("-----------------------------------------");
		System.out.println("출금된 금액"+a1.withdraw(50000)+"원");
		System.out.println("-----------------------------------------");
		System.out.println("출금된 금액"+a1.withdraw(50000000)+"원");
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


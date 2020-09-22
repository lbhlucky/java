public class Test {

	public static void main(String[] args) {
		
		Account acc = new Account("123-456-7890", "홍길동", 100000);
		
		Account acc2 = new Account("098-765-4321", "홍길동", 100000);
		
		String accInfo = acc.toString();
		String acc2Info = acc2.toString();
		
		if(acc.equals(acc2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println(accInfo);
		System.out.println(acc2Info);
		
		Account acc3 = new Account("098-765-4321", "홍길동", 100000);
		
		if(acc2.equals(acc3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
	}

}




/*
 * Account 클래스 정의
 * - 멤버변수
 *   1) 계좌번호(문자열, accountNo)
 *   2) 예금주명(문자열, ownerName)
 *   3) 현재잔고(int, balance)
 *   
 * - 생성자 : 계좌번호, 예금주명, 현재잔고를 전달받아 초기화
 * 
 * - toString() 메서드와 equals 메서드 오버라이딩
 */

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		super();
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accountNo == null) ? 0 : accountNo.hashCode());
		result = prime * result + balance;
		result = prime * result + ((ownerName == null) ? 0 : ownerName.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountNo == null) {
			if (other.accountNo != null)
				return false;
		} else if (!accountNo.equals(other.accountNo))
			return false;
		if (balance != other.balance)
			return false;
		if (ownerName == null) {
			if (other.ownerName != null)
				return false;
		} else if (!ownerName.equals(other.ownerName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", ownerName=" + ownerName + ", balance=" + balance + "]";
	}
	
	
}


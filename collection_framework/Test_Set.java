package collection_framework;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test_Set {

	public static void main(String[] args) {
		/*
		 * Set 객체를 활용한 로또 번호 생성기
		 * - 중복되지 않는 1 ~ 45 범위의 난수 6개 지정
		 * - 이 때, 저장되는 난수는 오름차순 정렬
		 * 
		 * => TreeSet 사용
		 */
		Random r = new Random();
		
		for(int i = 0 ; i <= 10 ; i++) {
			Set myLotto = new TreeSet();
			
		
		while(myLotto.size() < 6) {

			myLotto.add(r.nextInt(45)+1);
			
		}
		
		System.out.println("나의 로또 번호 : " +myLotto);
		
		// ----------------------------------------------------
		// 1등 당첨 번호 ( 1, 11, 21, 31, 41, 42) 와 비교하여
		// 일치하는 번호 갯수 출력
		Set thisWeekLotto = new TreeSet();
		thisWeekLotto.add(1);
		thisWeekLotto.add(11);
		thisWeekLotto.add(21);
		thisWeekLotto.add(31);
		thisWeekLotto.add(41);
		thisWeekLotto.add(42);
		int count = 0;
			for(Object o : myLotto) {
				if(thisWeekLotto.contains(o)) {
					count++;
				}
			}
			System.out.println("이번 주 당첨 번호 : " +thisWeekLotto);
			System.out.println("일치하는 번호 갯수 : " + count + "개");
			System.out.println("----------------------------------------------------");
		}
		
	}

}










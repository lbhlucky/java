import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * HashSet, ArrayList 객체 생성 및 사용
		 * => 제네릭타입 적용
		 * 
		 */
		
		HashSet<Integer> hs = new HashSet<Integer>();
		// 제네릭 타입으로 Integer 타입을 지정했으므로 정수만 사용 가능
		hs.add(1);
//		hs.add('2');	// 제네릭 Integer 타입으로 선언 => int 타입만 가능
		hs.add(3);
		
		for(int s : hs) {	//for(Integer s : hs) 도 가능
			System.out.println(s);
		}
		
		System.out.println("====================================================");
		
		ArrayList<String> arr = new ArrayList<String>();
		
		arr.add("홍길동");
		arr.add("홍두깨");
//		arr.add(123);	// 제네릭 String 타입으로 선언 => String 타입만 가능
		arr.add("홍고추");
		arr.add("홍당무");
		
		for(String str : arr) {
			System.out.println(str);
		}
		
		System.out.println("------------------------------------------------");
		
		for(int i = 0 ; i < arr.size() ; i++) {
			System.out.println(i+"번 째 인덱스 : " +arr.get(i));
		}
		
		System.out.println("====================================================");
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "가");
		hm.put(2, "나");
		hm.put(3, "다");
		hm.put(4, "라");
//		hm.put("5", "라");	// 키는 정수만 사용 가능
//		hm.put("5", 234);	// 값은 문자열만 사용 가능
		
//		System.out.println(hm.keySet());
//		System.out.println(hm.values());
		
		for(int i = 1; i <= hm.size();i++) {
			System.out.println(i+"키캆의 벨류 : "+hm.get(i));
		}
		
		
		
	}

}











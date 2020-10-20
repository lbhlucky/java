package collection_framework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex_Map {

	public static void main(String[] args) {
		/*
		 * Map 인터페이스 계열
		 * - 키(Key) 와 값(Value)을 한 쌍으로 갖는 자료 구조(해쉬테이블 구조)
		 * - 키는 중복불가, 값은 중복 가능
		 *   => 기존에 존재하는 키를 지정하여 값을 저장하는 경우
		 *      기존 키에 저장된 값을 제거하고 새로운 값으로 대체
		 * - 대표적인 구현체 클래스 : HashMap, Properties 등
		 */
		
		Map map = new HashMap();
		
		// put(key, value) : key에 해당하는 value 추가
		map.put(1, "홍길동");
		map.put(2, "이순신");
		map.put(3, "강감찬");
		
		System.out.println("Map 객체가 비어있는가? : " +map.isEmpty());
		System.out.println("Map 객체에 저장된 엔트리 갯수? : " +map.size());
		System.out.println("Map 객체의 모든 엔트리 출력? : " +map);
		
		// get(Object key) : key에 해당하는 value 리턴
		System.out.println("1번 키의 값 : " +map.get(1));
		System.out.println("2번 키의 값 : " +map.get(2));
		System.out.println("3번 키의 값 : " +map.get(3));
		
		System.out.println("모든 키 출력 : " + map.keySet());
		System.out.println("모든 값 출력 : " + map.values());
		System.out.println("모든 엔트리 셋 출력 : " + map.entrySet());
		
		// Map 객체의 모든 요소에 접근하는 방법
		Set keyset = map.keySet();	// 모든 key를 Set 타입으로 리턴
		Collection values = map.values();	// 모든 value를 Collection 타입으로 리턴

		// 1. 모든 키를 사용하여 향상된 for문으로 접근 후
		//	  키에 해당하는 값을 꺼내는 방법
		for(Object o : keyset) {
			System.out.println(o+"(키)에 대한 값 : " +map.get(o));
		}
		
		System.out.println("-----------------------------------------------");
		
		// 2. 모든 키에 대한 iterator 객체를 리턴 받아
		//	  키에 해당하는 값을 꺼내는 방법
		Iterator ite = keyset.iterator();
		
		while(ite.hasNext()) {
			Object key = ite.next();
			Object o = map.get(key);
			
			System.out.println(key+"(키)에 대한 값 : " +o);
		}
		
		System.out.println("-----------------------------------------------");
		
		// 3. 모든 엔트리의 키, 값 꺼내는 방법
		// => 엔트리 내의 키, 값을 분ㄹ이하는 방법(즉, 키를 통해 값을 찾지 X)
		Set entrySet = map.entrySet();	// 모든 엔트리 Set 타입으로 리턴
		
		Iterator ite2 = entrySet.iterator();
		while(ite2.hasNext()) {
			// 1. iterator 개겣의 next() 메서드로 엔트리 1개 가져오기
			//    => Map.Entry 타입으로 전달 받기 위해 Entry 타입 형변환 필요
			Map.Entry entry = (Entry)ite2.next();
			
			// 2. 엔트리 객체에서 키, 값 꺼내기
			
			Object key = entry.getKey();
			Object value = entry.getValue();
			
			System.out.println(key + "(키)에 대한 값 : " +value);
		}
		
		System.out.println("=========================================================");
		
		System.out.println(map);
		
		// remove(Object key) : 해당 키, 값 삭제하고, 삭제되는 값 리턴
		System.out.println("2번 키 삭제 : " + map.remove(2));	// 존재할 경우 삭제될 값 리턴
		System.out.println("2번 키 삭제 : " + map.remove(2));	// 존재하지 않을 경우 null 값 리턴
		
		// remove(Object key, Object value)
		// => 해당 키, 값에 해당하는 데이터 삭제 후 결과 리턴
		//    단, 삭제할 키 또는 값이 존재하지 않으면 false 리턴
		System.out.println("3번 키의 강감찬 삭제 : " +map.remove(3, "강감찬"));
		System.out.println("3번 키의 강감찬 삭제 : " +map.remove(3, "강감찬"));
		System.out.println("1번 키의 홍길 삭제 : " +map.remove(1, "홍길"));
		
		
		
		
		
		
		
	}

}



















package collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex_Set {

	public static void main(String[] args) {
		/*
		 * Set 인터페이스 계쩔
		 * - 저장 순서를 유지하지 않고, 데이터 중복을 허용하지 않는 타입
		 *   => 하나의 주머니에 무작위로 저장하는 구조와 동일함
		 * - 대표적인 구현체 클래스 : HashSet, TreeSet 등
		 */
		Set set = new HashSet();	// 업캐스팅 발생
		
		System.out.println("Set 객체가 비어있는가? " + set.isEmpty());
		System.out.println("Set 객체에 저장된 요소 갯수 : " + set.size());
		
		// add(Object o) : 모든 타입의 데이터 추가
		set.add(1);
		set.add("Two");
		set.add(3.14);
		
		System.out.println("Set 객체가 비어있는가? " + set.isEmpty());
		System.out.println("Set 객체에 저장된 요소 갯수 : " + set.size());
		
		// toString() 메서드가 오버라이딩 되어 있으므로 요소 출력 가능
		System.out.println("Set 객체에 저장된 모든 요소 : " +set.toString());
		System.out.println("Set 객체에 저장된 모든 요소 : " +set);
		
		System.out.println("정수 1 추가 가능한가? " +set.add(1));
		
		System.out.println("정수 4 추가 가능한가? " +set.add(4));
		System.out.println("Set 객체에 저장된 모든 요소 : " +set);
		
		set.add('5');
		set.add("육");
		System.out.println("Set 객체에 저장된 모든 요소 : " +set);
		
		// contains(Object o) : 해당 요소 존재 여부를 boolean 타입으로 리턴
		System.out.println("문자열 TWO가 포함되어 있는가? " +set.contains("TWO"));
		System.out.println("문자열 5가 포함되어 있는가? " +set.contains("5"));
		
		// remove(Object o) : 해당 요소 제거
		System.out.println("문자열 육 제거 결과 : " +set.remove("육"));
		System.out.println("Set 객체에 저장된 모든 요소 : " +set);
		
		// Object[] toArray() : 컬렉션 객체를 배열로 변환
		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(arr));	// 배열 내용 출력
		
		// clear() : 컬렉션 객체 초기화(모든 요소 제거)
		set.clear();
		System.out.println("Set 객체에 저장된 모든 요소 : " +set);
		System.out.println("Set 객체가 비어있는가? " + set.isEmpty());
		System.out.println("Set 객체에 저장된 요소 갯수 : " + set.size());
		
		// 컬렉션 객체의 데이터를 꺼내는 공통 방법
		// 1. 향상된 for문 사용 : for(꺼내 온 데이터를 담을 변수 : 데이터가 저장된 객체)
//		for(Object o : set) {
			// 저장되는 데이터타입이 Object 타입이므로
			// 다양한 데이터를 모두 저장할 수 있도록 Object 타입 변수에 저장
//			System.out.println("Set 객체에 저장된 요소 : " +o);
//		}
		// 2. Iterator(반복자) 객체 사용
		// Set 객체의 Iterator() 메서드를 호출하여 Iterator 객체를 리턴 받음
//		Iterator ite = set.iterator();
//		
//		// while 문을 사용하여
//		while(ite.hasNext()) {	// Iterator 객체에 접근하여 다음 데이터가 있는 지 확인
//			Object o = ite.next();	// 다음 요소 꺼내기
//			System.out.println("Set 객체에 저장된 요소 : " +o);
//		}
		
		System.out.println("=========================================================================");
		
		Set set2 = new HashSet();
		set2.add("112번");
		set2.add("232번");
		set2.add("321번");
		set2.add("4312번");
		set2.add("54325번");
		set2.add("6321번");
		
		System.out.println(set2);
		
		// Set 계열 구현체 클래스 중 정렬 기능을 제공하는 클래스 : TreeSet
		// => 주의! : 동일한 데이터타입끼리만 저장 가능(정렬의 위해서)
		Set treeSet = new TreeSet(set2);
		// => 컬렉션 객체 생성시 다른 컬렉션 객체를 전달하여 초기화 가능
		System.out.println(treeSet);
		
		Set set3 = new TreeSet();
		set3.add("10번");
		set3.add("20번");
		
		System.out.println(set3);
		
		// addAll() : 기존 컬렉션 객체에 다른 컬렉션 객체의 요소 한 번에 추가
		set3.addAll(treeSet);
		System.out.println(set3);
		
		Set set4 = new HashSet(set3);
		System.out.println(set4);
		// equals() : 두 컬렉션 객체의 요소가 같은지 판별 => 순서 상관 없음
		System.out.println("set3와 set4는 같은가? " +set3.equals(set4));
		
	}

}












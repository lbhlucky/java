package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Ex_List {

	public static void main(String[] args) {
		/*
		 * List 인터페이스 계열
		 * - 저장 순서를 유지하며, 데이터 중복을 허용하는 구조
		 * - 인덱스 번호를 사용하여 요소 관리
		 * - 배열과 유사한 구조
		 * - add() 메서드로 데이터 추가, get()메서드로 데이터 리턴
		 * - 대표적인 구현체 클래스 : ArrayList, Vector, LinkedList 등
		 */
		
		List list = new ArrayList();
		
		// add() : 데이터 추가
		list.add(1);
		list.add(2);
		list.add("삼");
		list.add(4);
		list.add(5.5);
		list.add(6);
		
		System.out.println("List 객체가 비어있는가? : " +list.isEmpty());
		System.out.println("List 객체에 저장된 요소 갯수? : " +list.size());
		System.out.println("List 객체의 모든 요소 출력? : " +list);
		
		// add(int index, Object o) : 해당 인덱스에 o를 삽입(끼워넣기)
		list.add(4, 4.4);	// 4번 인덱스에 4.4.삽입(5.5는 5번으로 밀림)
		System.out.println("List 객체의 모든 요소 출력? : " +list);
		
		// set(int index, Object o) : 해당 인덱스 데이터를 o로 교체(설정)
		list.set(4, "FOUR");	// 4번 인덱스의 데이터를 "FOUR" 로 교체
		System.out.println("List 객체의 모든 요소 출력? : " +list);
		
		list.add(4);
		
		System.out.println("정수 4의 인덱스(앞에서부터 탐색) : " +list.indexOf(4));
		System.out.println("정수 4의 인덱스(뒤에서부터 탐색) : " +list.lastIndexOf(4));
		
		// get(int index) : index 위치의 데이터 꺼내기
		System.out.println("4번 인덱스 데이터 꺼내기 : " +list.get(4));
		
		System.out.println("---------------------------------------");
		
		// List 객체의 모든 요소를 꺼내는 방법
		// 1. 일반 for문 사용(get() 메서드와 조합)
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(i+"번 인덱스 : "+list.get(i));
		}
		
		System.out.println("---------------------------------------");
		
		// 2.향상된 for 문 사용
		for(Object o : list) {
			System.out.println("요소 : "+o);
		}
		
		System.out.println("---------------------------------------");
		
		// 3. iterator 객체 사용
		Iterator ite = list.iterator();
		while(ite.hasNext()) {
			Object o = ite.next();
			System.out.println("요소 : "+o);
		}
		
		System.out.println("---------------------------------------");
		
		// 정수 데이터 2를 제거하는 경우
		list.remove(2);	// 2번 인덱스로 취급되므로 정수 2가 삭제되지 않음
		System.out.println("List 객체의 모든 요소 출력? : " +list);
		
		list.remove((Object)2);	// Object 타입으로 변환 하면 객체가 지정됨
		System.out.println("List 객체의 모든 요소 출력? : " +list);
		
		System.out.println("=====================================================================");
		
		/*
		 * LinkedList(연결리스트) 와 ArrayList
		 * - 차이점
		 *   1. ArrayList는 배열 구조로 데이터 저장
		 *      => 데이터 검색이 빠름
		 *         순차적인 추가/삭제가 빠르나, 부분 추가/삭제 느림
		 *      ==> 한번에 넣을 때는 유용
		 *   2. LinkedList는 데이터와 함꼐 다음 데이터 위치도 저장
		 *      => 데이터 검색이 처음부터 목적지까지 진행되므로 느림
		 *         부분 추가/삭제는 빠르지만, 순차적인 추가/삭제는 느림
		 *      ==> 계속 데이터를 변경해야할 경우 유용
		 */
		
		List list2 = new LinkedList(list);
		System.out.println("List 객체의 모든 요소 출력? : " +list);
		
		/*
		 * Vector 와 ArrayList
		 * - List 인터페이스 구현, 저장 순서 유지, 중복 허용
		 * - 배열 구조를 사용
		 * - 사용하는 메서드도 거의 일치
		 * 
		 * - 차이점
		 *   Vector 는 멀티쓰레드 환경에서 자동으로 동기화 제공됨
		 *   => 즉, 멀티쓰레드를 사용하지 않는 환경엣허 성능 저하 발생
		 */
		
		List list3 = new Vector(list);
		System.out.println("List 객체의 모든 요소 출력? : " +list);
		
		System.out.println("=====================================================================");
		
		// List 객체에 데이터를 한꺼번에 추가하는 방법
		// => Arrays.asList() 메서드를 호출하여 배열을 생성한 뒤
		//    List 타입 객체로 변환해준다.
		List list4 = Arrays.asList(1, 10, 4, 5, 3, 8);
		System.out.println("정렬 전 : "+list4);

		// List 객체의 정렬(sort)과 뒤섞기(shuffle)
		// => Collections 클래스의 static메서드 sort()와 shuffle() 사용

		// 1. 데이터 정렬
		Collections.sort(list4);
		System.out.println("정렬 후 : "+list4);
		
		// 2. 데이터 뒤섞기(셔플)
		Collections.shuffle(list4);
		System.out.println("셔플 후 : "+list4);
		
		
		
	}

}




























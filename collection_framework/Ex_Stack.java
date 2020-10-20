package collection_framework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex_Stack {

	public static void main(String[] args) {
		/*
		 * 스택(Stack)
		 * - 한 쪽(TOP)에서 데이터의 추가/삭제가 발생하는 구조
		 * - 먼저 추가된 객체가 마지막에 나오는 구조(First In Last Out)
		 *   = 마지막에 추가된 객체가 먼저 나오는 구조(Last In First Out)
		 *   = 후입선출 구조
		 * - 주로 응용프로그램의 undo/redo, 웹브라우저의 뒤로/앞으로 기능을
		 *   2개의 Stack(backward, forward)으로 구현
		 */
		
		Stack stack = new Stack();
		
		// push(Object o) : 데이터를 스택에 추가
		stack.push("1 - www.itwillbs.co.kr");
		stack.push("2 - www.naver.com");
		stack.push("3 - www.oracle.com");
		
		// Object.peek() : 맨위의 객체 리턴
		System.out.println("스택 맨 위의 객체 : " +stack.peek());
		System.out.println("스택 맨 위의 객체 : " +stack.peek());
		System.out.println("스택 맨 위의 객체 : " +stack.peek());
		
		// Object.pop() : 맨위의 객체 리턴
//		System.out.println("스택 맨 위의 객체 : " +stack.pop());
//		System.out.println("스택 맨 위의 객체 : " +stack.pop());
//		System.out.println("스택 맨 위의 객체 : " +stack.pop());
		
		// 더 이상 꺼낼 객체가 없을 경우 예외 발생 : EmptyStackException
//		System.out.println("스택 맨 위의 객체 : " +stack.peek());
//		System.out.println("스택 맨 위의 객체 : " +stack.pop());
		System.out.println("Stack 객체가 비어있는가? : " +stack.isEmpty());
		
		// isEmpty() 메서드 결과가 false 일 때만 꺼내기 수행
		if(!stack.isEmpty()) {
			System.out.println("스택 맨 위의 객체 : " +stack.pop());
		}
		
		System.out.println("======================================================");
		/*
		 * 큐(Queue)
		 * - 양 끝단에서 데이터 삽입/삭제가 따로 일어나는 구조
		 *   => 한 쪽에서 offer()로 삽입, 반대 쪽에서 poll()로 삭제(꺼내기)
		 * - 구현체 클래스 : LinkedList
		 *   => LinkedList 클래스는 Queue와 List 인터페이스를 모두 구현
		 * - 은행 업무 번호표, 최근 문서를 구현하는데 사용
		 */
		
		Queue q = new LinkedList();
		
		q.offer("1 - Ex.java");
		q.offer("2 - main.jsp");
		q.offer("3 - index.html");
		
		System.out.println("최근 문서 목록 : " +q);
		
		System.out.println("가장 오래된 문서 : " +q.peek());
		System.out.println("가장 오래된 문서 : " +q.peek());
		
		System.out.println("가장 오래된 문서 제거 : " +q.poll());
		System.out.println("가장 오래된 문서 제거 : " +q.poll());
		System.out.println("가장 오래된 문서 제거 : " +q.poll());
		
		// 실제 사용시 Queue의 크기를 제한해 두고
		// offer()로 삽입할 때 Queue 크기가 다 찼을 경우
		// 가장 먼저 삽입된 객체를 제거한 후 삽입
		int MAX_QUEUE_SIZE = 5;
		
		if(q.size() >= MAX_QUEUE_SIZE) {
			q.poll();
		}
		
		q.offer("4 - a.jpg");
		
	}

}











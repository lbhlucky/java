
public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 주석(Comment)
		 * - 주석문으로 처리된 문장은 컴파일 대상에서 제외되므로
		 *   프로그램 실행 대상에서 제외됨
		 * - 주로 코드의 설명이나 프로그램의 설명문 작성용으로 사용
		 *   또는 특정 코드를 실행 대상에서 제외시키기 위한 용도로 사용
		 * 
		 * 1) 한 줄 주석(단일 주석) : //
		 *    => // 기호 뒤의 한 줄을 모두 주석으로 처리
		 *    => 단축키 : 주석 처리할 라인에 커서를 두고 Ctrl + Shift + C 
		 *                (해제 단축키도 동일)
		 *    => 여러 줄 주석 용도로도 사용 가능
		 *       (범위 지정 후 주석 처리 시 한 줄 주석이 여러 줄에 걸쳐 처리)
		 *                
		 * 2) 여러 줄 주석(범위 주석) : /* 주석처리할 문장들... */
		/*    => 두 기호 사이에 포함되는 모든 문장을 주석으로 처리(여러 줄 처리도 가능)
		 *    => 단축키 : 주석 처리할 범위를 블록으로 지정하고 Ctrl + Shift + /
		 *     
		 */
		
		/*
		 * 이 곳은 여러 줄 주석 범위 내이므로
		 * 모든 문장이 주석으로 처리되어 실행 대상에서 제외됩니다.
		 * 따라서, 프로그램의 초기 설명문을 작성하는데 유용합니다.
		 */
		
		/**
		 * 이 곳은 자바 도큐먼트 주석 범위 내이므로
		 * 여러 줄 주석과 마찬가지로 모든 문장이 주석 처리됨
		 * 단, 일반적인 주석 용도는 아니고, 특수한 설명서를 만드는데 사용됨
		 */
		System.out.println(1);
		System.out.println(2);
//		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(155161);
//		System.out.println(10); 
	}
}

public class Ex5 {

	public static void main(String[] args) {
		/*
		 *  break 문과 continue 문의
		 * 
		 */
		OUTTER :
		for(int i =2 ; i <= 9; i++) {
			
			System.out.println("< " + i + "단 >");
			
			INNER :
			for(int j  = 1 ; j <= 9 ; j++) {
				
				if(j == 5) {
					
//					break;
					// break문을 만나면 가장 가까운 반복문 블럭 빠져나감
					// => 즉, 안쪽 for문이 종료되지만, 바깥쪽for문의
					//		남는 문장이 실행되고, 다음 반복이 진행됨
					// => 결과적으로 각 단의 4까지 출력됨
					
//					break INNER;
					// => 안쪽 반복문의 레이블 지정 시 일반 break문과 동일
											
//					break OUTTER;
					// => 바깥쪽 반복문의 레이블 지정 시
					//	  지정된 바깥쪽 for문을 빠져나감
					// => 즉, 안쪽 for문이 5일 때 전체 반복문 종료되므로
					// 	  2단의 2 * 4 까지만 출력되고 종료됨
					
//					continue;
					// continue 문을 만나면 가장 가까운 반복문의 
					// 아랫쪽 실행문장을들을 생략하고 다음 반복 진행함
					// => 즉, 안쪽 for문이 5일 때 출력을 생략하고
					//	i++로 이동하여 다음 반복인 6, 7, 8, 9는 그대로 진행
					// => 결과적으로 각 단의 5를 제외한 나머지 출력됨
					
					continue OUTTER;
					// => 바깥쪽 반복문의 레이블 지정 시
					//	  현재 문장의 아래쪽 문장들을 생략하고
					// 	  바깥쪽 for문의 증감식(i++)으로 이동하여
					// 	  다음 반복 실행
					// => 즉, 안쪽 for문이 5일 때, 나머지 출력을 생략하고
					//	  다음 단으로 이동하여 다시 5일때 나머지 출력 생략
					// => 결과적으로 각 단의 4까지만 출력됨
					
				}
				
				System.out.println(i + " * " + j + " = " + (i*j));
				
			}
										
			System.out.println();
			
		}
	
		System.out.println("===============================");
	
	
		
		
	}

}


public class test2 {

	public static void main(String[] args) {
		/*
		 *  for문을 사용한 구구단 출력
		 *  - 단을 저장할 정수형 변수 dan을 선언하고 초기화
		 *  
		 *  < 출력 예시 >
		 *  ex ) 
		 */
		int dan = 2;
		int i = 1;
//		System.out.println(dan + "단");
//		System.out.println(dan + " * " + i + " = " + (dan*i));
//		i++;
//		System.out.println(dan + " * " + i + " = " + (dan*i));
//		i++;
//		System.out.println(dan + " * " + i + " = " + (dan*i));
//		i++;
//		System.out.println(dan + " * " + i + " = " + (dan*i));
//		i++;
//		System.out.println(dan + " * " + i + " = " + (dan*i));
//		i++;
//		System.out.println(dan + " * " + i + " = " + (dan*i));
//		i++;
//		System.out.println(dan + " * " + i + " = " + (dan*i));
//		i++;
//		System.out.println(dan + " * " + i + " = " + (dan*i));
//		i++;
//		System.out.println(dan + " * " + i + " = " + (dan*i));
				
//		System.out.println(dan + " * " + " 1" + " = " + dan*1);
//		System.out.println(dan + " * " + " 2" + " = " + dan*2);
//		System.out.println(dan + " * " + " 3" + " = " + dan*3);
//		System.out.println(dan + " * " + " 4" + " = " + dan*4);
//		System.out.println(dan + " * " + " 5" + " = " + dan*5);
//		System.out.println(dan + " * " + " 6" + " = " + dan*6);
//		System.out.println(dan + " * " + " 7" + " = " + dan*7);
//		System.out.println(dan + " * " + " 8" + " = " + dan*8);
//		System.out.println(dan + " * " + " 9" + " = " + dan*9);
//		
		
		for(dan =2; dan < 10 ; dan++) {
			System.out.println("<" + dan + "단" + ">");
			System.out.println();
			for(i=1 ; i < 10 ; i++) {
				System.out.println(dan + " * " +  i  + " = " + (dan * i));
				System.out.println();
			}
		}
		
				
	}

}

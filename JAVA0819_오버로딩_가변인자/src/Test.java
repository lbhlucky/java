public class Test {
	public static void main(String[] args) {
		/*
		 * 간단한 계산기(Calculator 클래스)
		 * - calc() 메서드 오버로딩
		 * => 연산자(char, opr) 1개와 정수 2~4개(num1 ~ num4)를 전달 받아
		 *    해당 연산자에 맞는 연산 결과를 출력하는 메서드 정의
		 * 
		 */
		Calculator c = new Calculator();
		c.calc('+' , 10, 20);	// 10 + 20 = 30
		c.calc('+' , 10, 20, 30);	// 10 + 20 + 30 = 60
		c.calc('+' , 10, 20, 30, 40);	// 10 + 20 + 30 + 40= 100
		
		c.calc('-' , 100, 10);	// 100 - 10 = 90
		c.calc('-' , 100, 10, 20);	// 100 - 10 - 20 = 70
		c.calc('-' , 100, 10, 20, 30);	// 100 - 10 - 20 - 30= 40
		
		c.calc('*' , 10, 20);	// 10 * 20 = 200
		c.calc('*' , 10, 20, 30);	// 10 * 20 * 30 = 6000
				
		c.calc('/' , 100, 10);	// 100 / 10 = 10
		c.calc('/' , 100, 10, 2);	// 100 / 10 / 2 = 5
		
		
	}
}

class Calculator {
	
	public void calc(char opr, int num1, int num2) {
//		if(opr == '+') {
//		System.out.println(num1 + " + " + num2 + " = " +(num1+num2));
//		} else if(opr =='-') {
//			System.out.println(num1 + " - " + num2 + " = " +(num1-num2));
//		} else if(opr == '*') {
//			System.out.println(num1 + " * " + num2 + " = " +(num1*num2));
//		} else if(opr == '/'){
//			System.out.println(num1 + " / " + num2 + " = " +(num1/num2));
//		}
//		System.out.println();
		
		int result =0;
		if(opr =='+') {
			result = num1+num2;
		} else if(opr =='-') {
			 result = num1-num2;
		} else if(opr == '*') {
			result = num1*num2;
		} else if(opr == '/') {
			result = num1/num2;
		}
		System.out.printf("%d %c %d = %d\n", num1, opr, num2, result);
		
//		System.out.println(""+num1 + opr + num2 + " = " +(num1+num2)+"");
//		System.out.printf("%d %c %d = %d\n", num1, opr, num2, (num1+num2));
	}
	
	public void calc(char opr, int num1, int num2, int num3) {
//		if(opr == '+') {
//			System.out.println(num1 + " + " + num2 + " + " + num3  + " = " +(num1+num2+num3));
//		} else if(opr =='-') {
//			System.out.println(num1 + " - " + num2 + " - " + num3  + " = " +(num1-num2-num3));
//		} else if(opr == '*') {
//			System.out.println(num1 + " * " + num2 + " * " + num3  + " = " +(num1*num2*num3));
//		} else if(opr == '/'){
//			System.out.println(num1 + " / " + num2 + " / " + num3  + " = " +(num1/num2/num3));
//		}
//		System.out.println();
//		
		int result =0;
		if(opr =='+') {
			result = num1+num2+num3;
		} else if(opr =='-') {
			 result = num1-num2-num3;
		} else if(opr == '*') {
			result = num1*num2*num3;
		} else if(opr == '/') {
			result = num1/num2/num3;
		}
		System.out.printf("%d %c %d %c %d = %d\n", num1, opr, num2, opr, num3, result);
		
//		System.out.printf("%d %c %d %c %d = %d\n", num1, opr, num2, opr, num3, (num1+num2+num3));
	}
	
	public void calc(char opr, int num1, int num2, int num3, int num4) {
//		if(opr == '+') {
//			System.out.println(num1 + " + " + num2 + " + " + num3  + " + " + num4  + " = " +(num1+num2+num3+num4));
//		} else if(opr =='-') {
//			System.out.println(num1 + " - " + num2 + " - " + num3  + " - " + num4  + " = " +(num1-num2-num3-num4));
//		} else if(opr == '*') {
//			System.out.println(num1 + " * " + num2 + " * " + num3  + " * " + num4  + " = " +(num1*num2*num3*num4));
//		} else if(opr == '/') {
//			System.out.println(num1 + " / " + num2 + " / " + num3  + " / " + num4  + " = " +(num1/num2/num3/num4));
//		}
//		System.out.println();
		
		int result =0;
		if(opr =='+') {
			result = num1+num2+num3+num4;
		} else if(opr =='-') {
			 result = num1-num2-num3-num4;
		} else if(opr == '*') {
			result = num1*num2*num3*num4;
		} else if(opr == '/') {
			result = num1/num2/num3/num4;
		}
		System.out.printf("%d %c %d %c %d %c %d = %d\n", num1, opr, num2, opr, num3, opr, num4, result);
		
//		System.out.printf("%d %c %d %c %d %c %d = %d\n", num1, opr, num2, opr, num3, opr, num4, (num1+num2+num3+num4));
	}
	
}
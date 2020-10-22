
public class Test2 {
	public static void main(String[] args) {
		int dan = 2;
		while( dan < 10) {
			System.out.println("< " + dan + "단 >");
			int num = 1;
			while(num < 10 ) {
				System.out.println(dan + "*" + num + " = " + dan*num);
				num++;
			}
			System.out.println();
			dan++;
		}
	}
}

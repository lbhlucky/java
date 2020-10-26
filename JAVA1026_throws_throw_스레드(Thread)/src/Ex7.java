import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex7 {

	public static void main(String[] args) {
		/*
		 * 예외 처리에 대한 위임(throws 키워드)
		 * 
		 * - 예외 처리를 예외가 발생한 곳에서 직접 처리하지 않고
		 *   메서드를 호출한 곳을 ㅗ발생한 예외를 떠넘길 때 사용
		 *   
		 * - 메서드 정의 시 마지막에 throws 키워드를 명시하고
		 *   예외가 발생할 것으로 예상하는 클래스 명을 지정하면
		 *   해당 예외 발생시 try-catch 블록이 없을 경우
		 *   메서드를 호출한 곳으로 예외를 던진다.
		 *   이 때, 위임받은 곳에서 해당 예외를 처리(try-catch)해야함
		 *   
		 * - 메서드를 호출하는 외부에서 메서드 호출 시점에
		 *   예외 발생 여부를 판별하고, 예외를 처리할 수 있도록 해주며
		 *   또한, 메서드를 호출하는 Caller 에서 여러 메서드 내의 예외를
		 *   한꺼번에 묶어서 처리할 수 있도록 해준다!
		 */
		
		// 과장으로부터 예외를 위임받았을 경우
		// 현재 호출한 곳이 main() 메서드이므로 더 이상 위임할 곳이 없다!
		// 따라서, 현재 위치에서 위임받은 모든 예외를 처리해야한다!
		try {
			과장();
		} catch (Exception e) {
			System.out.println("main() 메서드(사장)가 모든 예외를 위임받아 처리!");
		}
		
		
		
	}
	
	public static void 과장() throws Exception{	// 모든 예외를 위임
		// 2개의 예외를 위임받아 과장이 직접 처리할 경우
		// => 각각의 예외를 따로 catch 하거나
		//	  | 기호로 다중 catch로 묶을 수 있음
//		try {
//			대리();
//		} catch (ClassNotFoundException | SQLException e) {
//			System.out.println("과장이 ClassNotFoundException & SQLException 예외를 직접 처리!");
//		}
		
		// 2개의 예외를 위임받아 과장이 직접 처리하지 않고 위임을 할 경우
		// => 각 예외 클래스 모두를 throw 뒤에 명시하거나
		//	  예외 클래스를 통합하여 상위 클래스 명을 명시할 수 도 있다!
		대리();
		
	}
	
	public static void 대리() throws SQLException, ClassNotFoundException{
		// 예외를 위임받아 대리가 직접 처리할 경우
//		try {
//			사원();
//			사원2();
//		} catch (ClassNotFoundException e) {
//			System.out.println("대리가 ClassNotFoundException 예외를 윙ㅁ받아 처리!");
//		} catch (SQLException e) {
//			System.out.println("대리가 SQLException 예외를 위임받아 처리!");
//		}
			
		// 대리가 위임받아 직접 처리하지 않고 과장()에게 위임하는 경우
		사원();	 // SQLException
		사원2(); // ClassNotFoundException
		
		
	}
	
	public static void 사원() throws SQLException {
		//예외 발생 시 예외가 발생한 곳에서 직접 예외를 처리하는 방법
//		try {
//			Connection con = DriverManager.getConnection("");	// SQL Exception
//		} catch (Exception e) {
//			System.out.println("사원이 SQLException 예외를 직접 처리!");
//		}
		
		// 예외 발생 시 예외가 발생한 곳에서 처리하지 않고
		// 예외가 발생한 메서드를 호출한 곳으로 예외를 떠넘기는 방법
		// => 발생할 것으로 예상되는 예외 클래스 명을
		//	  메서드 선언부 마지막에 throws 키워 뒤에 명시
		
		Connection con = DriverManager.getConnection("");	// SQL Exception
		// => throws SQLException을 명시할 경우
		//	  현재 사원() 메서드를 호출한 대리() 메서드 내의
		//	  사원() 메서드 호출 코드에 예외 처리가 위임됨
		
	}
	
	public static void 사원2() throws ClassNotFoundException {
		// ClassNotFoundException 예외를 대리에게 위임
		Class.forName("");
	}

}

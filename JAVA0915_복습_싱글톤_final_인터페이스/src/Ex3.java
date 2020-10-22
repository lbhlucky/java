public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 상수(Constant)
		 * - 항상 같은 값을 갖는 데이터(불변데이터) = Literal(리터럴)
		 * - 변수 중에서도 값이 변하지 않는 변수를 상수라고함
		 * 	 (= 상수형 변수)
		 * - 보통 변수에 static과 final을 붙여서 표현
		 *   => static : 클래스 내의 유일한 데이터이며, 클래스명으로 접근
		 *   	final : 값 변경 금지
		 * - 상수로 선언된 변수는 이름을 대문자로 선언하며
		 *   단어 사이의 구분 기호로 언더바(_) 기호 사용
		 */
		
		System.out.println("지구 반지름 : " +Earth.EARTH_RADIUS+"km");
		System.out.println("지구 표면적 : " +Earth.EARTH_AREA+"km^2");
	
		System.out.println("--------------------------------------------------------------------------");
		
		// 어떤 클래스에 데이터를 저장한 후 해당 데이터를 판별해야하는 경우
		// 데이터에 대한 문자열이나 정수 데이터 비교 시
		// 비교데이터를 잘못 지정하거나, 데이터 저장 시 잘못 저장할 경우로 인해
		// 실제 비교할 때 올바른 비교가 수행되지 않을 수 있다
		Car car = new Car();
		car.setCompany("HYUNDAI");
		car.setModel("SONATA");
		car.setColor("RED");
		
		if(car.getCompany().equals("hyundai")) {
			// 대문자 HYUNDAI 와 소문자 hyundai는 다른 문자열로 취급됨
			// =>equalsignoreCase() 메서드를 호출하면 해결할 수는 있음
			System.out.println("현대자동차 !");
			
		} else {
			System.out.println("타사자동차 !");
		}
		
		if(car.getModel().equals("쏘나타")) {
			// "SONATA" 와 "쏘나타" 는 다른 문자열이며 다른 차종으로 취급됨
			// => equalsIgnoreCase() 메서드를 호출해도 해결 불가능
			System.out.println("쏘나타 맞다 !");
			
		} else {
			System.out.println("쏘나타 아니다!");
		}
		
		System.out.println("--------------------------------------------------------------------------");
		/*
		 * 클래스에서 상수를 통해 사용될 데이터를 제공하는 경우
		 * - 사용자 입장에서 데이터 사용 시 오 타 등의 위험을 줄이고
		 *   상수명만으로 해당 데이터의  실제 내용과 상관없이 사용 가능하므로
		 *   편의성 및 코드의 안정성이 증대됨
		 */
		Car2 car2 = new Car2();
		car2.setCompany(Car2.COMPANY_HYUNDAI);
		car2.setModel(Car2.MODEL_SONATA);
		car2.setColor(Car2.COLOR_BARCELONA_RED);
		
		if(car2.getCompany().equals(Car2.COMPANY_HYUNDAI)) {
			// 대문자 HYUNDAI 와 소문자 hyundai는 다른 문자열로 취급됨
			// =>equalsignoreCase() 메서드를 호출하면 해결할 수는 있음
			System.out.println("현대자동차 !");
			
		} else if(car2.getCompany().equals(Car2.COMPANY_HYUNDAI)){
			System.out.println("타사자동차 !");
		}
		
		if(car2.getModel().equals(Car2.MODEL_SONATA)) {
			// "SONATA" 와 "쏘나타" 는 다른 문자열이며 다른 차종으로 취급됨
			// => equalsIgnoreCase() 메서드를 호출해도 해결 불가능
			System.out.println("쏘나타 이다 !");
			
		} else if(car2.getModel().equals(Car2.MODEL_TOSON)) {
			System.out.println("투싼 이다!");
		}
		
		if(car2.getColor() == Car2.COLOR_BARCELONA_RED) {
			System.out.println("빨간색이네요!");
		} if(car2.getColor() == Car2.COLOR_PERFECT_BLACK) {
			System.out.println("검은색이네요!");
		}
		
	}

}

class Earth {
	// 상수 선언
	// 상수는 보통 이름을 대문자로 선언(단어 사이 구분은 '_'기호 사용
	public static final double EARTH_RADIUS = 6400;
	public static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS ;
	
}

class Car {
	String company;
	String model;
	String color;
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
}

class Car2 {
	// 상수(static final)을 사용하여 데이터를 관리하는 경우
	private String company;
	private String model;
	private int color;
	
	// 데이터 저장에 필요한 값들을 상수로 미리 선언해둠
	// => 이 때, 상수명을 최대한 식별이 용이하도록 관련있는 이름으로 지정
	public static final String COMPANY_HYUNDAI = "현대자동차";
	public static final String COMPANY_KIA = "기아자동차";
	
	public static final String MODEL_SONATA = "SONATA";
	public static final String MODEL_TOSON = "TUSON";
	
	public static final int COLOR_PERFECT_BLACK = 0x000000;
	public static final int COLOR_BARCELONA_RED = 0xFF0000;	
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getColor() {
		return color;
	}
	
	public void setColor(int color) {
		this.color = color;
	}
	
	
}






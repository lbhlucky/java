public class Test {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setCompany(Car.COMPANY_HYUNDAI);
		c1.setModel(Car.MODEL_SONATA);
		c1.setColor(Car.COLOR_PERFECT_BLACK);
		c1.setCarNumber("12가3456");
		
		Car c2 = new Car();
		c2.setCompany(Car.COMPANY_HYUNDAI);
		c2.setModel(Car.MODEL_SONATA);
		c2.setColor(Car.COLOR_PERFECT_BLACK);
		c2.setCarNumber("12가3456");
		
		// 두 차량의 제조사, 모델, 색상, 번호판이 모두 동일하므로
		// 두 자동차는 같은 자동차이다. 따라서, equals() 메서드를 사용하여
		// 같은지 비교했을 때, "두 차량은 같은 차입니다!" 출력되어야 한다.
		// => 따라서, equals() 메서드를 오버라이딩하여
		//    제조사, 모델, 색상, 번호판이 모두 동일한지 비교해야한다!
		if(c1.equals(c2)) {
			System.out.println("c1과 c2는 같은 차입니다.");
		} else {
			System.out.println("c1과 c2는 다른 차입니다.");
		}
		
	}

}

class Car {
	// 상수(static final)을 사용하여 데이터를 관리하는 경우
	private String company;
	private String model;
	private int color;
	private String carNumber;
	

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
	
	public String getCarNumber() {
		return carNumber;
	}
	
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((carNumber == null) ? 0 : carNumber.hashCode());
		result = prime * result + color;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	
	// Object 클래스의 equals() 메서드 오버라이딩 - 수동
//	@Override
//	public boolean equals(Object obj) {
//		// null 값 비교는 생략
//		Car car = (Car)obj; // 다운캐스팅
//		
//		if(company.equals(car.company)) {
//			if(model.equals(car.model)) {
//				if(color == car.color) {
//					if(carNumber.equals(car.carNumber)) {
//						
//						return true;
//					}
//				}
//			}
//		}
//		
//		return super.equals(obj);
//	}
//	
	// Object 클래스의 equals() 메서드 오버라이딩 - 자동
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carNumber == null) {
			if (other.carNumber != null)
				return false;
		} else if (!carNumber.equals(other.carNumber))
			return false;
		if (color != other.color)
			return false;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	
	
}
	







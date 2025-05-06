public class Car{
	static String companyName = "Honda";
	String carModel = "Civic";
	String carModel1 = "Accord";
	public static void main(String[] args){
		System.out.println("Company:" + Car.companyName);
		Car car = new Car();
		System.out.println("Car 1 Model:" + car.carModel);
		System.out.println("Car 2 Model:" + car.carModel1);
	}
}
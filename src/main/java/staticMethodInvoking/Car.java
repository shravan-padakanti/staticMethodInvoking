package staticMethodInvoking;

public class Car {

	private static String carName;
	
	public  static void setCarName(String name){
		Car.carName=name;
	}
	
	public static void printData(){
		System.out.println("car name"+" "+carName);
	}
}

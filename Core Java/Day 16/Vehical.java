/*
WAP to get details  of vehicle i.e. Bike and Car.Override engine() method to describe both bike and car
create Vehicle as base class and BIke ,Car as derived class
*/
import java.util.Scanner;
class Vehical{
	String bikeName,bikeCompany,bikeEngine;
	String carName,carCompany,carEngine;
	Scanner sc=new Scanner(System.in)
}
class Bike{
	public void engine(){
		system.out.prinln("This is Bike engine Method")
	}
}
class Car extends Bike(){
	@override
	public void engine(){
		super.engine;
		system.out.prinln("This is Car Engine Method")
	}
}
public class Vehical{
	Car car=new Car();
	car.engine();
}
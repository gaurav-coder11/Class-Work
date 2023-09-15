package vehicles;

public class Car implements Vehicle{
	public void run(){
	System.out.println("Car is running");
	}
	public void speed(){
	System.out.println("Speed of Car is 50mk/h");	
	}
	public static void main(String args[]){
	Car c= new Car();
	c.run();
	c.speed();
	System.out.println("Hello World");
	}
}
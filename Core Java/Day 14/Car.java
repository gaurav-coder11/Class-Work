/*

WAP to get car details from the  
user.Here properties to display are  
brand,modelname,topspeed  and write 
corresponding getters and setters,
Atleast two car details should be 
visible

*/

class CarDemo{
	private String brand;
	private String modelname;
	private int topspeed;

// getter method for name
	public String getBrand(){
		return this.brand;

	}
	public String getModelName(){
		return this.modelname;

	}
	public int getTopSpeed(){
		return this.topspeed;

	}


	//setter method for name
	public void setBrand(String brand){
		this.brand=brand;

	}

	public void setModelName(String modelname){
		this.modelname=modelname;

	}
	public void setTopsPeed(int topspeed){
		this.topspeed=topspeed;

	}

}

public class Car{
	public static void main(String[] args) {
		//create an object of data
		CarDemo cardemo=new CarDemo();

		//access private veriable and fiels from another class
		cardemo.setBrand("BMW");
		cardemo.setModelName("7 Series");
		cardemo.setTopsPeed(190);

		Car cartesla=new Car();
		cartesla.setBrand("Tesla ");
		cartesla.setModelName("Model Y");
		cartesla.setTopsPeed(320);

		// Car ferrari=new Car();
		// ferrari.setBrand("Ferrari");
		// ferrari.setModelName("Ferrari 296 GTB");
		// ferrari.setTopsPeed(205);

		System.out.println("Car Brand Name: "+ cardemo.getBrand());
		System.out.println("Car Brand Name: "+ cardemo.getModelName());
		System.out.println("Car Brand Name: "+ cardemo.getTopSpeed());

		System.out.println("Car Brand Name: "+ cartesla.getBrand());
		System.out.println("Car Brand Name: "+ cartesla.getModelName());
		System.out.println("Car Brand Name: "+ cartesla.getTopSpeed());

		// System.out.println("Car Brand Name: "+ ferrari.getBrand());
		// System.out.println("Car Brand Name: "+ ferrari.getModelName());
		// System.out.println("Car Brand Name: "+ ferrari.getTopSpeed());
	}
}
/*

Create a class Person with two private data members name and age .Perform Encapsulation on these fields

*/

class Information{
	// private specifier
	private String name;
	private int age;

	// getter method for name
	public String getName(){
		return this.name;

	}
	// getter method for age
	public int getAge(){
		return this.age;

	}

	//setter method for name
	public void setName(String name){
		this.name=name;

	}
	//setter method for age
	public void setAge(int age){
		this.age=age;

	}

} 
public class InfoDemo{
	public static void main(String[] args) {

	//create an object of data
	Information info=new Information();
	//access private veriable and fiels from another class
	info.setName("Gaurav");
	info.setAge(22);
	System.out.println("Your Name is: "+ info.getName());
	System.out.println("Your Age is: "+info.getAge());
	}
}
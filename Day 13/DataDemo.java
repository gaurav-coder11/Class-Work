//use of private veriable
class PersonDemo{
	// private specifier
	private String name;

	// getter method 
	public String getName(){
		return this.name;

	}
	//setter method
	public void setName(String name){
		this.name=name;

	}

} 
public class DataDemo{
	public static void main(String[] args) {

	//create an object of data
	PersonDemo p=new PersonDemo();
	//access private veriable and fiels from another class
	p.setName("Ganesha");
	System.out.println(p.getName());
	}
}
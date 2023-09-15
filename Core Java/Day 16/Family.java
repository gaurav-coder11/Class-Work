/*Create a class father,Son and Baby .
All three classes have a method move .
write specific comment inside that like for 
father-I can walk with the help of stick.
*/
class Baby{
	public void move(){
		System.out.println("I Am Baby");
	}

}
//Son inherit Baby
class Son extends Baby{
	@Override
	public void move(){
		super.move();
		System.out.println("I Am Son");
	}
}
class Father extends Son{
	@Override
	public void move(){
		super.move();
		System.out.println("I Am Fother and "+"I can walk with the help of stick.");
	}
}

public class Family{
public static void main(String args[]){
	//create an Object to the subc lass
	Father father=new Father();
	father.move();
	
	}
}
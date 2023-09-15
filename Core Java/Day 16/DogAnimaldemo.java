//wap to method overring

class Animal{
	public void eat(){
		System.out.println("I Can Eat");
	}

}
//Dog inherit animal
class Dog extends Animal{
	//override the eat() method
	@Override
	public void eat(){
		super.eat();// Call the superclass method
		System.out.println("I eat dog food");
	}
	public void bark(){
		System.out.println("I CAN BARK");
	}
}
//
public class DogAnimaldemo{
public static void main(String args[]){
	//create an Object to the subc lass
	Dog dog=new Dog();
	dog.eat();
	dog.bark();
	}
}
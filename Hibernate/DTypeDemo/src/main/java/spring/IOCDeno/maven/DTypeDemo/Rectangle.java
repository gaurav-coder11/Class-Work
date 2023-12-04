package spring.IOCDeno.maven.DTypeDemo;
//dependency injection using setter method

public class Rectangle implements Shapes {
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public void Drow() {
		System.out.println("Drawing "+ color + " Rectange");

	}

}

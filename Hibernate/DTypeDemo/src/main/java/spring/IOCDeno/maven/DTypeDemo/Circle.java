package spring.IOCDeno.maven.DTypeDemo;
//dependency injection through constructor 
public class Circle implements Shapes {
	private String color;

	public Circle(String color) {
		super();
		this.color = color;
	}

	@Override
	public void Drow() {
		System.out.println(" Drawing "+ color + " Circle");
	}
}
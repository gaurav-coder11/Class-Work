package spring.IOCDeno.maven.DTypeDemo;

public class Painter implements Performer {
 Shapes shape;

	public Painter(Shapes shape) {
		super();
		this.shape = shape;
	}
	
	@Override
	public void perform() {
		System.out.println("Painter is Drawing");
		shape.Drow();
	}

}

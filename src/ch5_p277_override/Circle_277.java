package ch5_p277_override;

public class Circle_277 extends Shape_277 {
	
	protected String name;

	@Override
	public void paint() {
		// TODO Auto-generated method stub
		super.paint();
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		String name2 = super.name;
		System.out.println(name2);
	}
}

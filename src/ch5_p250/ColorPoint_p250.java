package ch5_p250;

public class ColorPoint_p250 extends Point_p250 { //Point_p250 클래스를 상속 받음

	private String color; //점의 색
	
	public ColorPoint_p250(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setColor(String color) { //setter 메소드
		this.color = color;
	}
	
	public void showColorPrint() {
		System.out.print(color);
		showPoint(); //Point_p250 클래스의 showPoint() 메소드 호출
		
	}
	
}

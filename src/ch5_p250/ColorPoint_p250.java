package ch5_p250;

public class ColorPoint_p250 extends Point_p250 { //Point_p250 Ŭ������ ��� ����

	private String color; //���� ��
	
	public ColorPoint_p250(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setColor(String color) { //setter �޼ҵ�
		this.color = color;
	}
	
	public void showColorPrint() {
		System.out.print(color);
		showPoint(); //Point_p250 Ŭ������ showPoint() �޼ҵ� ȣ��
		
	}
	
}

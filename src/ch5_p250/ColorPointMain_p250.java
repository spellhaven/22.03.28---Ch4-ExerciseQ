package ch5_p250;

public class ColorPointMain_p250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point_p250 p = new Point_p250(10, 20); //Point_p250 클래스로 객체 p 선언
		p.showPoint();
		
		ColorPoint_p250 cp = new ColorPoint_p250(30, 40, "red"); //ColorPoint_p250 클래스로 객체 cp 선언
		cp.setColor("red"); //본인 클래스인 setColor 메소드 호출
		cp.showColorPrint(); //본인 클래스 메소드 호출 - 좌표, 색상 출력해 보자.
		
	}

}

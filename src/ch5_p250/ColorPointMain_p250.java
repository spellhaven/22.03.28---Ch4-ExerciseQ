package ch5_p250;

public class ColorPointMain_p250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point_p250 p = new Point_p250(10, 20); //Point_p250 Ŭ������ ��ü p ����
		p.showPoint();
		
		ColorPoint_p250 cp = new ColorPoint_p250(30, 40, "red"); //ColorPoint_p250 Ŭ������ ��ü cp ����
		cp.setColor("red"); //���� Ŭ������ setColor �޼ҵ� ȣ��
		cp.showColorPrint(); //���� Ŭ���� �޼ҵ� ȣ�� - ��ǥ, ���� ����� ����.
		
	}

}

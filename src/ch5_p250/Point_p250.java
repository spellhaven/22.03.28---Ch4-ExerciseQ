package ch5_p250;

public class Point_p250 {
	//��Ӱ��踦 �� �� ������ ����.
	
	private int x, y; //���� x��ǥ y��ǥ
	
	
	// p 267�� �����Ͽ� Point_p250 Ŭ������ ������ 2���� �������� �ٲ� ���Ҵ�.
	// �����ڵ��̴ϱ� �翬�� ���� �̸��� Ŭ���� �̸����� ������, ������. ���� �Ű������� �޶� �����ε尡 �� �ȴ�. super(x,y)��� ��������� ������ �ִ�...
	public Point_p250() {
		this.x = 0;
		this.y = 0;
	}

	public Point_p250(int x, int y) {  
		this.x = x;
		this.y = y;
	}
	
//	public void set(int x, int y) {  //�̷� �Լ��� "setter �޼ҵ�"��� �θ���. (private int�� x, y�� set�� �� �ִ� ����� �ܺο��� public void set()�� �ҷ����� ������̱� ������.)
//		this.x = x;
//		this.y = y;
//	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");	//(x,y) ���
	}
	
}

package ch5_p314_exercise;

public class ColorTV extends TV {

	private int colornum; //1024�÷�
		
	public ColorTV(int size, int colornum) {
		super(size);
		this.colornum = colornum;
		// TODO Auto-generated constructor stub
	}
	
	public void printProperty() {
		// ó���� ���� int size = super.getSize();��� ������, ���� �������̵� �ϴ� �� �ƴ��ݾ�.
		// �ڽ�Ŭ������ �̹� �θ�Ŭ���� �޼ҵ带 �� �˾ƿ�! �׷��� ������ super. ���̱׳ɾ��� �԰���.
		int size = getSize(); 
		System.out.println(size  + "��ġ " + colornum + "�÷�");
		// ��Ŭ������ replace size with getter��� ������ �� ���
		// 16�� ���� �ٷ� System.out.println(getSize() + "��ġ " + colornum + "�÷�");��� �ص� �ȴ�.
	}
	
	//�ǽ����� 2�� ������ �߰��� ��
	protected int getColornum() {
		return colornum;
	}
	
	
}

// 314�� 1�� ���������� size��� �̸��� �ְ� 3�� �ִµ�, �̳���� �� �ٸ���. ����ص���.
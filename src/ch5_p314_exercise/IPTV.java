package ch5_p314_exercise;

public class IPTV extends ColorTV{ // �̷��� TV�� ���� �Ƶ��� ColorTV �� �� ��ӹް� �ǰ���? ��

	private String ipaddress; //ip�ּ�	
	
	// �� ���� ��Ŭ���� ������ �ڵ��ϼ���� ¯�̾�~~~ �� �� ���� �������� ��Ǯ��~~~~
	// ��Ŭ���� �����˻�⵵ ¯�̾�~~~
	// ��Ŭ����. �� �� ������ �׾�. ������������. (��������)
	
	
	// ������: Ŭ���� ���� �� �Ű����� "����"�� ��û �߿��ϴ�. - ����ϴٰ� ���� ������ 2048��ġ TV�� ������ ���ߴ� �����
	public IPTV(String ipaddress, int size, int colornum) { // �� ������ �̰� int colornum, int size�� ���� �߸� ����� 2048��ġ 32�÷� �� ��
		super(size, colornum); 
		this.ipaddress = ipaddress;
	}

	public void printProperty() { //�������̵��� �� �Ǳ� �ٶ�� �ڵ��Ѵ�. �̸��Ͽ� '�⵵ ��Ÿ'.
		 // �� ��¼����? �̰�?? getcolornum()�̶�� ���� ���� �����߰ڴ�.
		
		int size = getSize();
		int colornum = getColornum();
		// ��� �������� L20, L21�� L24 �ȿ� �ٷ� getSize() �� �̷� ������ ���Խ�Ű�� �԰���.
		
		System.out.println("���� IPTV�� " + ipaddress + " �ּ��� " + size + "��ġ " + colornum + "�÷�");
		
		// ����� �������� System.out.println("���� IPTV�� " + ipaddress + " �ּ��� "); ������ ���� �Ŀ�
		// �ٷ� ���� ���ο� super.Printproperty(); �ϼ̴�. ������ ���ϱ� ��¥ �̷��� �ǳ׿�?
		

		// �� push �ʵǳ�
	}
	
	
}

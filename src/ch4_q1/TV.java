package ch4_q1;

public class TV {
	
	// �� 3���� �ʵ�/��� ����/�Ӽ�(attribute)�̶�� �Ҹ���.
	private String tv_name; // TV����ȸ�� 
	private int year;	// �����⵵
	private int inch;	// TVũ��. 
	
	
	public TV(String tv_name, int year, int inch) {
		super();	// �� ���������� super()�� ���� �ǰ�, �׳� �ֵ� �ȴ�... ������ ���߿� �˰� �ǰ���? ��
		this.tv_name = tv_name;
		this.year = year;
		this.inch = inch;
	}
	
	// �� show()��� �Լ��� �츮�� TV.java Ŭ���� �Ʒ��� TV()�� ������ ���� �޼ҵ��. (���������� �� �� �ְ���.)
	// ��ġ �ܹ���(TV())�� �ݶ�(show())�� �ٸ� ���������� ���ż�Ʈ(TV.java) �ȿ� ���ԵǴ� ��ó��...
	// �׷��� show()�� �� Ŭ���� �ȿ� ������ �ʰ� �׳� �ƹ����� ���� ��� ����� ��������, ������ "�ڷᱸ��"�� �ٸ���!
	public void show() {	 
		System.out.print(tv_name + "���� ���� " + year + "���� " + inch + "��ġ TV");
		//System.out.print(this.tv_name + "���� ���� " + this.year + "���� " + this.inch + "��ġ TV"); //�� �ص� ���� �����µ�... ������ �˾ƺ���. ��
	}
}


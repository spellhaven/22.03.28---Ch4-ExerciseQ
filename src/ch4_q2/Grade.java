package ch4_q2;

public class Grade {
	
	private int math; // ��) ���⵵ �����ڰ� �����ϱ� ���� �Ժη� �� �ٲٰ� private �ϸ� �ǰ���?
	private int english; // ��) ��� ���� ���ظ��� �� �׳� ���������� ���� ���� ������ ���߿� �������� ����ġ����? ���� ����??
	private int science;
	
	public Grade(int math, int english, int science) {
		super();
		this.math = math;
		this.english = english;
		this.science = science;
	}
	
	// �ǿܷ� å ���������� ����� 91.0�� �ƴϰ� 91�� �̷� ������ ���� �ش�.
	// �׷��� average() �Լ��� int�� ����� �Ǵ°���. �̷� �� �� Ȯ���Ϸ�.
	
	public int average() {
		int ave = (math + science + english) / 3;	// �� �ÿ��� ������ int ave ���� int average�� �̸� ��� �����ε尡 ����� �� �� ����.
		return ave;	// ������ ����(Gucci) ������ ���� �Ұ� ��
	}
	
	
}

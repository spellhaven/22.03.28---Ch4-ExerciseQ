package ch4_q2;

import java.util.Scanner;

public class GradeOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann = new Scanner(System.in);
		System.out.print("����, ����, ���� ������ 3���� ���� �Է�>>");
		int math = scann.nextInt(); // ���� ����
		int science = scann.nextInt(); // ���� ����
		int english = scann.nextInt(); // ���� ����
		
		Grade me = new Grade(math, science, english);
		System.out.println("����� " + me.average());
		
		scann.close();
	}

}

// ��� ����� ����� �ִ� �� ���� Grade Ŭ������ ���� ������ �ʾƵ� �ȴ�. �׳� main()�Լ��� ��������� �Լ� �ϳ� ����� ����..
// �׷��� �̷� ���������� '�ڷᱸ��'�� ���� ���ظ� �������� ���� �ڵ��� ���� ��.
package ch5_p314_exercise;

public class TVmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �������� 1��
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	
		// �������� 2��
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //192.1.1.2 IP �ּҿ� 32��ġ, 2048�÷�
		iptv.printProperty();
	
	}

}

package ch5_p314_exercise;

public class TVmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연습문제 1번
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
	
		// 연습문제 2번
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //192.1.1.2 IP 주소에 32인치, 2048컬러
		iptv.printProperty();
	
	}

}

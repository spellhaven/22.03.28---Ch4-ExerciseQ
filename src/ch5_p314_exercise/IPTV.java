package ch5_p314_exercise;

public class IPTV extends ColorTV{ // 이러면 TV와 얘의 아들인 ColorTV 둘 다 상속받게 되겠지? ㅋ

	private String ipaddress; //ip주소	
	
	// 와 정말 이클립스 생성자 자동완성기는 짱이야~~~ 난 너 없이 연습문제 못풀어~~~~
	// 이클립스 오류검사기도 짱이야~~~
	// 이클립스. 난 너 없으면 죽어. 나를떠나지마. (집착광공)
	
	
	// 느낀점: 클래스 만들 때 매개변수 "순서"도 엄청 중요하다. - 상속하다가 순서 꼬여서 2048인치 TV를 보유할 뻔했던 사람이
	public IPTV(String ipaddress, int size, int colornum) { // 아 개웃겨 이거 int colornum, int size로 순서 잘못 썼더니 2048인치 32컬러 됨 ㅋ
		super(size, colornum); 
		this.ipaddress = ipaddress;
	}

	public void printProperty() { //오버라이딩이 잘 되길 바라며 코딩한다. 이름하여 '기도 메타'.
		 // 아 어쩌더라? 이걸?? getcolornum()이라는 놈을 따로 만들어야겠다.
		
		int size = getSize();
		int colornum = getColornum();
		// 계속 말하지만 L20, L21을 L24 안에 바로 getSize() 뭐 이런 식으로 포함시키기 쌉가능.
		
		System.out.println("나의 IPTV는 " + ipaddress + " 주소의 " + size + "인치 " + colornum + "컬러");
		
		// 참고로 교수님은 System.out.println("나의 IPTV는 " + ipaddress + " 주소의 "); 까지만 쓰신 후에
		// 바로 다음 라인에 super.Printproperty(); 하셨다. 생각해 보니까 진짜 이래도 되네요?
		

		// 왜 push 않되냐
	}
	
	
}

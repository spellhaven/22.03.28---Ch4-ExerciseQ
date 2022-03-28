package ch5_p314_exercise;

public class ColorTV extends TV {

	private int colornum; //1024컬러
		
	public ColorTV(int size, int colornum) {
		super(size);
		this.colornum = colornum;
		// TODO Auto-generated constructor stub
	}
	
	public void printProperty() {
		// 처음에 내가 int size = super.getSize();라고 썼지만, 딱히 오버라이딩 하는 건 아니잖아.
		// 자식클래스는 이미 부모클래스 메소드를 다 알아요! 그렇기 때문에 super. 없이그냥쓰기 쌉가능.
		int size = getSize(); 
		System.out.println(size  + "인치 " + colornum + "컬러");
		// 이클립스가 replace size with getter라고 점지해 준 대로
		// 16줄 없이 바로 System.out.println(getSize() + "인치 " + colornum + "컬러");라고 해도 된다.
	}
	
	//실습문제 2번 때문에 추가한 놈
	protected int getColornum() {
		return colornum;
	}
	
	
}

// 314쪽 1번 문제에서는 size라는 이름의 애가 3개 있는데, 이놈들은 다 다르다. 기억해두자.
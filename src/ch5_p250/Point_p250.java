package ch5_p250;

public class Point_p250 {
	//상속관계를 한 번 연습해 보자.
	
	private int x, y; //점의 x좌표 y좌표
	
	
	// p 267을 참조하여 Point_p250 클래스를 생성자 2개인 버전으로 바꿔 보았다.
	// 생성자들이니까 당연히 둘의 이름이 클래스 이름으로 같은데, 괜찮다. 들어가는 매개변수가 달라서 오버로드가 잘 된다. super(x,y)라고 명시적으로 선택해 주니...
	public Point_p250() {
		this.x = 0;
		this.y = 0;
	}

	public Point_p250(int x, int y) {  
		this.x = x;
		this.y = y;
	}
	
//	public void set(int x, int y) {  //이런 함수를 "setter 메소드"라고 부른다. (private int인 x, y를 set할 수 있는 방법은 외부에서 public void set()를 불러오는 방법뿐이기 때문에.)
//		this.x = x;
//		this.y = y;
//	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");	//(x,y) 출력
	}
	
}

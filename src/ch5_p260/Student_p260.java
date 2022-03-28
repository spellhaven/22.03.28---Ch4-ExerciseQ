package ch5_p260;

public class Student_p260 extends Person_p260 {
	
	public void setStudent() {
		
		age = 30;
		name = "홍길동";
		height = 170;
//		weight = 80;
		// 슈퍼클래스인 Person_p260에서 weight 필드는 private이라 자식인 Student_p260도 접근할 수가 없다.
		// 괜찮다. Person_p260에 setWeight()라는 세터 메소드를 만들어 놨으니...
	
	}
	
	

}

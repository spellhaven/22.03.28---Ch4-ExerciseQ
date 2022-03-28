package ch4_q1;

public class TV {
	
	// 이 3개는 필드/멤버 변수/속성(attribute)이라고 불린다.
	private String tv_name; // TV제조회사 
	private int year;	// 제조년도
	private int inch;	// TV크기. 
	
	
	public TV(String tv_name, int year, int inch) {
		super();	// 이 문제에서는 super()를 빼도 되고, 그냥 둬도 된대... 왠지는 나중에 알게 되겠지? ㅋ
		this.tv_name = tv_name;
		this.year = year;
		this.inch = inch;
	}
	
	// 이 show()라는 함수는 우리가 TV.java 클래스 아래에 TV()와 별개로 만든 메소드다. (형제관계라고 할 수 있겠지.)
	// 마치 햄버거(TV())와 콜라(show())는 다른 음식이지만 버거세트(TV.java) 안에 포함되는 것처럼...
	// 그래서 show()를 이 클래스 안에 만들지 않고 그냥 아무데나 만들어도 출력 결과는 같겠지만, 엄연히 "자료구조"는 다르다!
	public void show() {	 
		System.out.print(tv_name + "에서 만든 " + year + "년형 " + inch + "인치 TV");
		//System.out.print(this.tv_name + "에서 만든 " + this.year + "년형 " + this.inch + "인치 TV"); //로 해도 같은 결과라는데... 다음에 알아보자. ㅋ
	}
}


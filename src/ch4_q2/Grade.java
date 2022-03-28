package ch4_q2;

public class Grade {
	
	private int math; // 교) 여기도 생성자가 있으니까 남이 함부로 못 바꾸게 private 하면 되겠죠?
	private int english; // 나) 사실 아직 이해못함 ㅋ 그냥 무지성으로 쓰다 보면 원리는 나중에 마음으로 깨우치겠지? 영어 배우듯??
	private int science;
	
	public Grade(int math, int english, int science) {
		super();
		this.math = math;
		this.english = english;
		this.science = science;
	}
	
	// 의외로 책 연습문제가 평균을 91.0점 아니고 91점 이런 식으로 돌려 준다.
	// 그러니 average() 함수는 int로 만들면 되는거지. 이런 걸 잘 확인하래.
	
	public int average() {
		int ave = (math + science + english) / 3;	// 내 궁예에 따르면 int ave 말고 int average로 이름 지어도 오버로드가 제대로 될 거 같다.
		return ave;	// 하지만 굳이(Gucci) 시험헤 봐야 할가 ㅋ
	}
	
	
}

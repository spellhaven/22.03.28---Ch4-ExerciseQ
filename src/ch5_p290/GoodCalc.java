package ch5_p290;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		return 0;
	}

	// 추상 클래스 슈퍼클래스 Calculator에 선언된 add, sub, average를 다 우클릭 Source - Override하기 전까지
	// 이클립스는 에러야! 를 멈추지 않았다.
	// 결론) "추상 클래스" = "집착광공"
	
	// "나에게서 상속을 받아 갔으면, 내가 선언한 3개의 메소드를 너는 무조건 구현해야 해."
	
}

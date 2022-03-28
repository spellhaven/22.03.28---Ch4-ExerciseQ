package ch5_p314_exercise;

public class TV {
	private int size;
	
	public TV(int size) {
		this.size = size;
	}
	
	protected int getSize() {	// size가 private니까 이런 getter 함수가 있어야지 ㅋ.
		return size;
	}
	
}

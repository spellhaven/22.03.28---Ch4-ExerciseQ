package ch5_p314_exercise;

public class TV {
	private int size;
	
	public TV(int size) {
		this.size = size;
	}
	
	protected int getSize() {	// size�� private�ϱ� �̷� getter �Լ��� �־���� ��.
		return size;
	}
	
}

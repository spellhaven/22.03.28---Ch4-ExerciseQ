package ch4_q2;

import java.util.Scanner;

public class GradeOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scann.nextInt(); // 수학 점수
		int science = scann.nextInt(); // 과학 점수
		int english = scann.nextInt(); // 영어 점수
		
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		
		scann.close();
	}

}

// 사실 평균을 출력해 주는 건 굳이 Grade 클래스로 따로 만들지 않아도 된다. 그냥 main()함수랑 형제관계로 함수 하나 만들면 되지..
// 그러나 이런 연습문제로 '자료구조'에 대한 이해를 뇌가리에 ㅌ악 박도록 하자 ㅋ.
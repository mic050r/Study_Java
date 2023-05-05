package source;

import java.util.Scanner;

public class TestSuite {
	Scanner sc = new Scanner(System.in);
	private int subject_Num;
	private double total = 0, avg = 0;
	
	public void MidtermAvg() {
		ExamAvg();
	}

	public void FinalExamAvg() {
		ExamAvg();
	}

	public void PerformanceScore() {

	}
	
	public void ExamAvg() {
		System.out.print("과목 개수를 입력하시오 : ");
		subject_Num = sc.nextInt();
		
		double score[] = new double[subject_Num];
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1) + "번째 점수 입력 : ");
			score[i] = sc.nextInt();
			total += score[i];
		}
		avg = total/subject_Num;
		System.out.println("평균은 " + avg + "입니다.");
	}
}

package source;

import java.util.Scanner;

public class TestSuite {
	Scanner sc = new Scanner(System.in);
	private int subject_Num;
	private String subject_Name;
	private int mid, fin, per;
	private int mid_sco, fin_sco, per_sco;
	private double total = 0, avg = 0, score = 0;

	public void MidtermAvg() {
		ExamAvg();
	}

	public void FinalExamAvg() {
		ExamAvg();
	}

	public void PerformanceScore() {
		System.out.print("과목을 입력하시오 : ");
		subject_Name = sc.next();
		System.out.print("수행 비율 : "); per = sc.nextInt();
		System.out.print("중간 비율 : "); mid = sc.nextInt();
		System.out.print("기말 비율 : "); fin = sc.nextInt();
		System.out.println("");
		
		System.out.print("수행 점수 : "); per_sco = sc.nextInt();
		System.out.print("중간 점수 : "); mid_sco = sc.nextInt();
		System.out.print("기말 점수 : "); fin_sco = sc.nextInt();
		
		score = ((mid_sco + fin_sco)/2)*((mid+fin)*0.01) + per_sco;
		System.out.println("총 점수는 " + score);
		System.out.println("");
	}

	public void ExamAvg() {
		System.out.print("과목 개수를 입력하시오 : ");
		subject_Num = sc.nextInt();

		double score[] = new double[subject_Num];
		for (int i = 0; i < score.length; i++) {
			System.out.print((i + 1) + "번째 점수 입력 : ");
			score[i] = sc.nextInt();
			total += score[i];
		}
		avg = total / subject_Num;
		System.out.printf("평균은 %2.lf입니다.", avg);
	}
}

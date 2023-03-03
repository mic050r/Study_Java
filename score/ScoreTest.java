import java.util.Iterator;
import java.util.Scanner;

public class ScoreTest {
//1학년 1,2학기 중간, 기말 평균 입력 => db 저장
	public ScoreTest() {
		// 성적입력
		double score[] = new double[4];
		String str[] = { "1학기 중간고사", "1학기 기말고사", "2학기 중간고사", "2학기 기말고사" };
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.print("1학년 " + str[i] + " 평균 : ");
			score[i] = sc.nextDouble();
		}

		// 결과 출력
		String bar[] = { "1학기 중간고사 평균", "1학기 기말고사 평균", "2학기 중간고사 평균", "2학기 기말고사 평균" };
		System.out.println("================================================================");
		for (int i = 0; i < bar.length; i++) {
			System.out.print("  " + bar[i]);
		}
		System.out.println();
		for (int i = 0; i < score.length; i++) {
			System.out.print("\t" + score[i] + "\t");
		}

		System.out.println();

	}

	public static void main(String[] args) {
		new ScoreTest();
	}

}

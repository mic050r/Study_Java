package source;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TestSuite t1 = new TestSuite();
		while (true) {
			System.out.print("  =====================  \n");
			System.out.print("|     1. 중 간 평 균      |\n");
			System.out.print("|     2. 기 말 평 균      |\n");
			System.out.print("|     3. 수 행 점 수      |\n");
			System.out.print("|     4. 종      료      |\n");
			System.out.print("  =====================  \n");

			System.out.print("원하는 번호를 선택하세요 : ");
			int key = sc.nextInt();
			if (key == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			switch (key) {
			case 1:
				t1.MidtermAvg();
				break;
			case 2:
				t1.FinalExamAvg();
				break;
			case 3:
				t1.PerformanceScore();
				break;

			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

}

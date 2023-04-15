package practice;

// n진수에서 10진수로 바꾸기
public class DecimalTest {
	public static void main(String[] args) {
		// n진수 값 = 14
		String a = "1110";

		System.out.println("2진수 -> 10진수");
		System.out.println(Integer.parseInt(a, 3));

		System.out.println("3진수 -> 10진수");
		System.out.println(Integer.parseInt(a, 3));

		System.out.println("4진수 -> 10진수");
		System.out.println(Integer.parseInt(a, 4));

		System.out.println("5진수 -> 10진수");
		System.out.println(Integer.parseInt(a, 5));

		System.out.println("6진수 -> 10진수");
		System.out.println(Integer.parseInt(a, 6));

		System.out.println("7진수 -> 10진수");
		System.out.println(Integer.parseInt(a, 7));

		System.out.println("8진수 -> 10진수");
		System.out.println(Integer.parseInt(a, 8));

		System.out.println("16진수 -> 10진수");
		;
		System.out.println(Integer.parseInt(a, 16));
	}
}

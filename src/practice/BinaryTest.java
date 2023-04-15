package practice;

// 10진수에서 n진수로 바꾸기
public class BinaryTest {
	public static void main(String[] args) {
		// 10진수의 값은 14
		int a = 14;

		System.out.println("10진수 -> 2진수");
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toString(a, 2));

		System.out.println("10진수 -> 3진수");
		System.out.println(Integer.toString(a, 3));

		System.out.println("10진수 -> 4진수");
		System.out.println(Integer.toString(a, 4));

		System.out.println("10진수 -> 5진수");
		System.out.println(Integer.toString(a, 5));

		System.out.println("10진수 -> 6진수");
		System.out.println(Integer.toString(a, 6));

		System.out.println("10진수 -> 7진수");
		System.out.println(Integer.toString(a, 7));

		System.out.println("10진수 -> 8진수");
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toString(a, 8));

		System.out.println("10진수 -> 16진수");
		System.out.println(Integer.toString(a, 16));
		System.out.println(Integer.toHexString(a));
	}
}
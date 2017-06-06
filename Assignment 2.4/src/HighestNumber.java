
public class HighestNumber {

	public static void main(String[] args) {

		int a = 7;
		int b = 12;
		int c = 19;

		if (c > b && b > a) {
			System.out.println("The highest number is " + c);
		} else if (b > c && c > a) {
			System.out.println("The highest number is " + b);
		} else {
			System.out.println("The highest number is " + a);
		}
	}
}

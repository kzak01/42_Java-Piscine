package Module00.ex00;
public class Program {


	public static int addPutNumber(int number, int plus) {
		boolean isNegative = false;

		if (number < 0) {
			isNegative = true;
			number = Math.abs(number);
		}
		if (number >= 10) {
			plus = addPutNumber(number / 10, plus);
		}
		plus += number % 10;
		if (isNegative) {
			plus = -plus;
		}
		return plus;
	}
	// public static int addPutNumber(int number, int plus) {
	// 	if (number >= 10) {
	// 		plus = addPutNumber(number / 10, plus);
	// 	}
	// 	plus += number % 10;
	// 	return plus;
	// }
	
	public static void main(String[] args) {
		int number = -479598;
		int plus = addPutNumber(number, 0);

		System.out.println(plus);
	}
}

package section4Statements;

public class DecimalComparator {

	public static void main(String[] args) {

		double a = 2.36523543;
		String f = String.format("%.3f", a);
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));

	}

	public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
		long one = (long) (numOne * 1000);
		long two = (long) (numTwo * 1000);
		if (one == two) {
			return true;
		} else {
			return false;
		}
	}
}

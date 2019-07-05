package section4Statements;

public class EqualSumChcker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hasEqualSum(1, 1, 1));

	}

	public static boolean hasEqualSum(int numOne, int numTwo, int numThree) {
		int sum = numOne + numTwo;
		if (sum == numThree) {
			return true;
		}
		return false;
	}

}

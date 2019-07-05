package section4Statements;

public class speedConvertertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(speedConvertertest.toMilesPerHour(-8));
		System.out.println(toMilesPerHour(1.5));
		System.out.println(toMilesPerHour(10.25));
		System.out.println(toMilesPerHour(-5.6));
		System.out.println(toMilesPerHour(25.42));
		System.out.println(toMilesPerHour(1.5));

		printConversion(25.42);
	}

	public static long toMilesPerHour(double kilometersPerHour) {
		if (kilometersPerHour < 0) {
			return -1;
		}
		return Math.round(kilometersPerHour / 1.609);

	}

	public static void printConversion(double kilometersPerHour) {
		long l = toMilesPerHour(kilometersPerHour);
		if (l < 0) {
			System.out.println("Invalid value");
		}else {
			System.out.println(kilometersPerHour + "km/h=" + l + "mi/h");
		}
	}

}



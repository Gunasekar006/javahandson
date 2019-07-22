package section4Statements;

public class MinutesToYearAndDaysCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printYearsAndDays(525600);
		printYearsAndDays(561600);

		printYearsAndDays(-561600);

	}
	public static void printYearsAndDays(long minutes) {
		if(minutes>=0) {
			long yy=minutes/(60*24);
			long year=yy/365;
			long zz=yy%365;
			System.out.println(minutes+" min="+year+"y and "+zz+" d");
		}else {
			System.out.println("Invalid Value");	
		}
		
	}

}

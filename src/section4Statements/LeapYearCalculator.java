package section4Statements;

public class LeapYearCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(1800));

	}

	public static boolean isLeapYear(int year) {
		if (year >= 1 && year <= 9999) {
			if( (year % 4 == 0)&& (year % 100 == 0)&&(year % 400 == 0) ){
						return true;
					}else if((year%4==0)&& (year%100!=0 )) {
						return true;
					}else
						
						return false;
			}
		return false; 
	}
}

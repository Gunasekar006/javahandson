package section4Statements;

public class BarkingDogs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shouldWakeUp(true, -1);
	System.out.println(	shouldWakeUp(true, 23));
		shouldWakeUp(true, -1);
	}

	public static boolean shouldWakeUp(boolean bark, int hourOfTheDay) {
		if(hourOfTheDay<0) {
			return false;
		}
		if (!bark) {
			System.out.println("dog is not barking");
		} else if (bark && hourOfTheDay < 8) {
			return true;
		} else if (bark && (hourOfTheDay > 0 &&(hourOfTheDay>1&& hourOfTheDay < 8 || hourOfTheDay==23))) {
			return true;
		}else {
			return false;
		}
		
		return bark;

	}
}

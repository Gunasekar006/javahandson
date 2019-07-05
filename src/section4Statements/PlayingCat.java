package section4Statements;

public class PlayingCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println(isCatPlaying(true,10));
	System.out.println(isCatPlaying(false,36));
	System.out.println(isCatPlaying(false,35));
	}

	public static boolean isCatPlaying(boolean Summer,int temp) {
		if(Summer&&(temp>=25 && temp<=45)) {
			return true;
		}else if(!Summer&& (temp>=25 && temp<=35)) {
			return true;	
		}
		return false;
	}
}

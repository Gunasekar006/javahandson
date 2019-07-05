package section4Statements;

public class MegaBytesConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(5000);
		
		
		
	}
	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		if(kiloBytes<0){
			System.out.println("Invalid Value");
		}
		
		int re=kiloBytes/1024;
		int qu=kiloBytes%1024;
		System.out.println(re); 
		System.out.println(qu);
		
		
		
	}
	

}

package section4Statements;

public class AreaCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(area(5.0));
System.out.println(area(-1.0));
System.out.println(area(4.0,5.0));
System.out.println(area(-1.0,8));
	}
	  public static double area(double radius){
	         if(radius>=0){
	        	 double pi=Math.PI;
	          double cicrleArea=radius*radius*pi;
	         return cicrleArea;
	         
	         }
	         return -1;
	     }
	     
	     public static double area(double x,double y){
			if(x>=0 && y>=0) {
				return x*y;
			}
			return -1;
	         
	     }
	     

}

package section4Statements;

import java.util.concurrent.SynchronousQueue;

import org.omg.Messaging.SyncScopeHelper;

public class EqualityPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printEqual(1,1,1);
		System.out.println("fs");
		printEqual(1,-6,1);
		printEqual(1,2,3);	
		printEqual(1,2,1);	
	}
	public static void printEqual(int x,int y,int z) {
		if(x<=0||y<=0 || z<=0) {
			System.out.println("Invalid Value");
		}else if(x==y&&y==z&&z==x) {
		System.out.println("All numbers are equal");	
		}else if(x!=y&&y!=z&&z!=x) {
			System.out.println("All numbers are different");
		}else if(x==y||y==z||z==x) {
			System.out.println("Neither all are equal or different");	
		}
	}

}

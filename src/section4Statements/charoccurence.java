package section4Statements;

import java.util.HashMap;
import java.util.Iterator;

public class charoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap<Character, Integer> hmap=new 	HashMap<Character, Integer>();
		
		String s="Guna";
		
		
		char[] character=s.toCharArray();
		
		
		
		for(char c: character) {
			
			if(hmap.containsKey(c)) {
				
				hmap.put(c,hmap.get(c)+1);
			}else
			{
				hmap.put(c, 1);
				}
					
			
		}
		
		for(Character key:hmap.keySet()) {
			System.out.println(key+"--"+hmap.get(key));
		}

		
		// 1. using Iterator
				Iterator<Character> itr = hmap.keySet().iterator();
				while (itr.hasNext()) {
					System.out.println(itr.next()+"--"+hmap.get(itr));
					
				}
					
					
					
					
					
	}

}

package javaCollections;
import java.util.*;

public class MapCollections {

	public static void main(String[] args) {
	      
		Map map1 = new HashMap(); 
		map1.put("Jim", "30");
		map1.put("Spock", "32");
		map1.put("Uhura", "29");
		map1.put("Scotty", "31");
		System.out.println();
		System.out.println("Elements");
		System.out.print("\t" + map1);
		System.out.println();
		System.out.print("Jim now has " + map1.get("Jim") + " years.");
		System.out.println();
		map1.put("Jim", "31");
		System.out.println();
		System.out.print("Jim now has " + map1.get("Jim") + " years.");
		System.out.println();
		map1.put("Jim", "32");
		System.out.println();
		}
	
	public int countJ(String blah){
		int count = 0;
		for (int i = 0; i < blah.length(); i++){
				if(blah.charAt(i)=='a' || blah.charAt(i)=='A'){
						count++;
				}
			}
			return count;
	}
	
	
}
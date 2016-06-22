package javaCollections;
import java.util.*;

public class TreeCollections {

	public static void main(String args[]) {

		TreeSet mytree = new TreeSet();
		
		mytree.add("5");
		mytree.add("6");
		mytree.add("2");
		mytree.add("4");
		mytree.add("1");
		mytree.add("3");
		mytree.add("7");
		mytree.add("8");
		System.out.println(mytree);
                
		mytree.clear();
		System.out.println(mytree);
                
		mytree.add("Microsoft");
		mytree.add("Sony");
		mytree.add("Apple");
		mytree.add("Apple"); //duplicates wont work
		mytree.add("Disney");
		mytree.add("Google"); 
		mytree.add("Akamai");
		
		System.out.println(mytree);
		
		
		System.out.println("Last item: " + mytree.last());
		
		System.out.println("First item: " + mytree.first());
		System.out.println("Removing Sony...");
		mytree.remove("Sony");
		System.out.println(mytree);
		System.out.println("First item now : " + mytree.first());
		System.out.println("Removing Akamai..");
		mytree.remove("Akamai");
		System.out.println(mytree);
		System.out.println("First item now: " + mytree.first());
		System.out.println(mytree);
        
		
                
	}
}

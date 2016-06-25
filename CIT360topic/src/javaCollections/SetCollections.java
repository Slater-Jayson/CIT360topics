package javaCollections;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class SetCollections {

	
	@Test
    public void setUp() {
        HashSet set1 = new HashSet();
        set1.add("one");
        HashSet set2 = new HashSet();
        set2.add("two");
        
        assertTrue(set1.contains("black"));
        assertFalse(set2.contains("gold"));
        
    }
	

   

	
	public static void main(String args[]) {
		
		HashSet myset = new HashSet();
		myset.add("3");
		myset.add("6");
		myset.add("5");
		myset.add("4");
		myset.add("3"); 
		myset.add("2");
		myset.add("1");
		System.out.println(myset);
		
		
		HashSet myset2 = new HashSet();
		myset2.add("Microsoft");
		myset2.add("Sony");
		myset2.add("Apple");
		myset2.add("Google");
		myset2.add("Disney"); 
		myset2.add("Akamai");
		myset2.add("Nike");
		System.out.println(myset2);
		System.out.println("Removing Google");
		myset2.remove("Google");
		System.out.println(myset2);

                
	}
}
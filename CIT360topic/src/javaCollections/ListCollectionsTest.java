package javaCollections;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ListCollectionsTest {

	@Test
	public void testMain() {
		   ListCollections test = new ListCollections();
	        assertEquals(Arrays.asList("Roman", "Egyptian", "Norse"), test.myArray());
	    
	   }
	}



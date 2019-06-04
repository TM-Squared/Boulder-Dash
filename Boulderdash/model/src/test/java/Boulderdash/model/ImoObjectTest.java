package Boulderdash.model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class ImoObjectTest {

	 public static ImoObject immobject;
	
	 
	 @Before
	 public void setUp() throws Exception
	 
	 {
		this.immobject = new ImoObject(1,10);
	 }
	 
	/**
	 * testGetX()
	 */
	@Test
	public void testGetX() {
		int expected=1;
		

		assertEquals(expected, this.immobject.getX());
		
	}


	@Test
	public void testGetY() {
		 int expected = 10;
		
		
		assertEquals(expected, this.immobject.getY());
		
	}
	
	

}

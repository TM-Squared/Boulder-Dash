package Boulderdash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MobileObjectTest {
	 public static MobileObject obj;
		

	@Before
	public void setUp() throws Exception {

		this.obj = new MobileObject (1, 10); 
	}

	@Test
	public void testGetX() {
		final int expected = 1;
		
		 assertEquals(expected, this.obj.getX()); 
	
	}


	@Test
	public void testGetY() {
		final int expected = 10;
		
		 assertEquals(expected, this.obj.getY()); 
	}


	
}

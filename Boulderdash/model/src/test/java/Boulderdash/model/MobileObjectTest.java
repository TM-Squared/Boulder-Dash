package Boulderdash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MobileObjectTest {

	private MobileObject mobobject;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		this.mobobject = new MobileObject (1, 10); 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetX() {
		final int expected = 10;
		
		 assertEquals(expected, this.mobobject.getX()); 
	
	}

	@Test
	public void testSetX() {
		assertNotNull(this.mobobject.x);
	}

	@Test
	public void testGetY() {
		final int expected = 1;
		
		 assertEquals(expected, this.mobobject.getY()); 
	}

	@Test
	public void testSetY() {
		assertNotNull(this.mobobject.y);
		
	}

	
}

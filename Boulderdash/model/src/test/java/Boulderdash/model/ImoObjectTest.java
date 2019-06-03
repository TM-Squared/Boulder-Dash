package Boulderdash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ImoObjectTest {
	
	private ImoObject imoobject;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
		this.imoobject = new ImoObject (1, 10); 
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetX() {
		final int expected = 1;
		
		 assertEquals(expected, this.imoobject.getX()); 
	}


	@Test
	public void testGetY() {
		final int expected = 10;
		 assertEquals(expected, this.imoobject.getY()); 
	}
	@Test
	public void testSetX() {
		
		assertNotNull(this.imoobject.x);
		 
	}
	@Test
	public void testSetY() 
	{
	
		assertNotNull(this.imoobject.y);
	}

	

}

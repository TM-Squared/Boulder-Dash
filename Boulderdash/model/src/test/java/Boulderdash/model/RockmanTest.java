package Boulderdash.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RockmanTest {
	
	Rockman rockman;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.rockman= new Rockman(1,10);
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testGetX() 
	{
		assertNotNull(this.rockman.x);
	}
	@Test
	public void testGetY()
	{
		assertNotNull(this.rockman.y);
	}

	@Test
	public void testSetX() {
		assertNotNull(this.rockman.x);
	}

	

	@Test
	public void testSetY() 
	{
		assertNotNull(this.rockman.y);
	}
	@Test
	public void testgetImage() 
	{
		assertNotNull(this.rockman.image);
	}
	

}

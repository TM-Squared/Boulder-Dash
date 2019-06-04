package Boulderdash.view;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LevelManagementTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		Scanner sc=new Scanner(System.in);
	}
	

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testChangeLevel() {
		//fail("Not yet implemented");
		Scanner sc=new Scanner(System.in);
		while(GamePanel.lvl>5 && GamePanel.lvl<1) {
			System.out.println("Choississez un niveau entre 1 et 5");
			GamePanel.lvl=sc.nextInt();
		}
		int Expectedlvl=4;
		int Result=GamePanel.lvl;
		assertEquals(Expectedlvl, Result);
	
	}

}

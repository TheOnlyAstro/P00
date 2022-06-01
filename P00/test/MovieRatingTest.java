import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MovieRatingTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testmovieRatingNormal() {
	    int age = 25;
	    Movie mov = new Movie();
	    boolean actual = mov.movieRatingR21(age);
	    assertTrue(actual); 
	}
	
	@Test
	public void testmovieRatingBoundary() {
	    int age = 22;
	    Movie mov = new Movie();
	    boolean actual = mov.movieRatingR21(age);
	    assertTrue(actual);  
	}
	
	@Test
	public void testmovieRatingError() {
	    int age = 16;
	    Movie mov = new Movie();
	    boolean actual = mov.movieRatingR21(age);
	    assertFalse(actual);  
	}
}

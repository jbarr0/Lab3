import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradebookTester {
	GradeBook g1,g2;
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(66.4);
		g1.addScore(79.4);
		g1.addScore(72.2);
		g2.addScore(56.4);
		g2.addScore(99.4);
		g2.addScore(86.7);

	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
	}

	@Test
	void testAddScore() {
		assertTrue(g1.toString().equals("66.4 79.4 72.2 0.0 0.0 "));
		assertEquals(3,g1.getScoreSize());
	}

	@Test
	void testSum() {
		assertEquals(218,g1.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(66.4,g1.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(151.6,g1.finalScore());
	}

}

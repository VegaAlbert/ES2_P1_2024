import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase {

	/* Aquesta classe és per fer proves
	 * no la modifiqueu
	 */

	private int[] costats = new int[] {2,2,2,3,4};

	@Test
	void test_Equilater() {
		int[] resultat = Triangle.trobaTriangle(Triangle.Tipus.Equilater, costats);
		int[] esperat = new int[] {2,2,2};
		assertArrayEquals(esperat, resultat);
	}

	@Test
	void test_Isosceles() {
		int[] resultat = Triangle.trobaTriangle(Triangle.Tipus.Isosceles, costats);
		int[] esperat = new int[] {2,2,3};
		assertArrayEquals(esperat, resultat);
	}

	@Test
	void test_Escale() {
		int[] resultat = Triangle.trobaTriangle(Triangle.Tipus.Escale, costats);
		int[] esperat = new int[] {2,3,4};
		assertArrayEquals(esperat, resultat);
	}

	@Test
	void test_costats_null() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			Triangle.trobaTriangle(Triangle.Tipus.Escale, null);
	    });

	    String expectedMessage = "Paràmetre d'entrada null";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));
	}

	@Test
	void test_tipus_null() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			Triangle.trobaTriangle(null, costats);
	    });

		String expectedMessage = "Paràmetre d'entrada null";
	    String actualMessage = exception.getMessage();

	    assertTrue(actualMessage.contains(expectedMessage));

	}

}

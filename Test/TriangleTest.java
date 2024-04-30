import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    void triangle_test1() {
        Triangle.Tipus elTipus = Triangle.Tipus.Equilater;
        int[] costats = {};
        int[] valorEsperat = null;
        int[] valorObtingut = Triangle.trobaTriangle(elTipus, costats);

        assertArrayEquals(valorEsperat, valorObtingut);
    }
    @Test
    void triangle_EquilaterCorrecte() {
        Triangle.Tipus elTipus = Triangle.Tipus.Equilater;
        int[] costats = {3, 3, 3};
        int[] valorEsperat = {3, 3, 3};
        int[] valorObtingut = Triangle.trobaTriangle(elTipus, costats);

        assertArrayEquals(valorEsperat, valorObtingut);
    }
    @Test
    void triangle_CaminIsosceles() {
        Triangle.Tipus elTipus = Triangle.Tipus.Isosceles;
        int[] costats = {2, 4, 4};
        int[] valorEsperat = {2, 4, 4};
        int[] valorObtingut = Triangle.trobaTriangle(elTipus, costats);

        assertArrayEquals(valorEsperat, valorObtingut);
    }

    @Test
    void triangle_CaminEscale() {
        Triangle.Tipus elTipus = Triangle.Tipus.Escale;
        int[] costats = {2, 3, 4};
        int[] valorEsperat = {2, 3, 4};
        int[] valorObtingut = Triangle.trobaTriangle(elTipus, costats);

        assertArrayEquals(valorEsperat, valorObtingut);
    }
}
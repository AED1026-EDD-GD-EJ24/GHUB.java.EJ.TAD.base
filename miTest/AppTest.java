package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    static Calculadora c;

    @BeforeAll public static void setUp() {
        c = new Calculadora();
    }

    @Test public void testSuma() {
        assertTrue(c.suma(2,3)==5);
    }

    @Test public void testResta() {
        assertTrue(c.resta(4,2)==2);
    }

    @Test public void testMultiplica() {
        assertTrue(c.multiplica(5,7)==35);
    }

    @Test public void testDivide() {
        assertTrue(c.divide(12,4)==3);
    }
}
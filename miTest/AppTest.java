package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    
    static Rational r;
    static Rational a= new Rational(7,5);
    static Rational b =new Rational(2,3);
    static Rational c = new Rational(31,15);

    /* 
    @BeforeAll public static void setUp() {
        c = new Calculadora();
    }
    */

    @Test public void testAdd() {
        assertTrue(r.add(a,b)==c);
    }
    /* 

    @Test public void testResta() {
        assertTrue(c.resta(4,2)==2);
    }

    @Test public void testMultiplica() {
        assertTrue(c.multiplica(5,7)==35);
    }

    @Test public void testDivide() {
        assertTrue(c.divide(12,4)==3);
    }
    */
}
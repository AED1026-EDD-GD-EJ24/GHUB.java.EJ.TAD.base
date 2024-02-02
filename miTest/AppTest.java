package miTest;

import miPrincipal.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

class AppTest {
    
    static Rational r;
    static Rational a;
    static Rational b;

    @BeforeAll public static void setUp() {
        r = new Rational();
    }
    
    @Test public void testAdd() throws Exception {
        a = new Rational(7,5);
        b = new Rational(2,3);
        r=r.add(a,b);

        assertTrue(r.getNumerador()==31);
        assertTrue(r.getDenominador()==15);    
       
    }
    

    @Test public void testMult() throws Exception  {
        a = new Rational(7,5);
        b = new Rational(2,3);
        r=r.mult(a,b);

        assertTrue(r.getNumerador()==14);
        assertTrue(r.getDenominador()==15);   
    }

    @Test public void testEqual() throws Exception {
        a = new Rational(2,5);
        b = new Rational(4,10);

        assertTrue(r.equal(a,b));
    }

    
}
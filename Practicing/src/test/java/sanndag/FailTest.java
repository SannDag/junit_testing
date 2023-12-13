package sanndag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FailTest {

    @Test
    void test1(){
        double res1= Fail.raiz(25.0);
        assertEquals(5.0, res1);
    }

    @Test
    void test2a(){
        try{
            double res1 = Fail.raiz(-25.0);
        } catch(IllegalArgumentException iae){
            assertTrue(true);
        }
    }

    @Test
    void test2b(){
        try{
            double res1 = Fail.raiz(25.0);
        } catch(IllegalArgumentException iae){
            assertTrue(true);
        }
    }

    @Test
    void test2c(){
        try{
            double res1 = Fail.raiz(-25.0);
            fail("Debería haber lanzado una excep.");
        } catch(IllegalArgumentException iae){
            assertTrue(true);
        }
    }

    @Test
    void test2d(){
        try{
            double res1 = Fail.raiz(25.0);
            fail("Debería haber lanzado una excep.");
        } catch(IllegalArgumentException iae){
            assertTrue(true);
        }
    }
}

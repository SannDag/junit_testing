package sanndag;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class IntroTest {

    @Test
    void test(){
        int res = Intro.suma(1,2);
        assertEquals(res,3);
    }

//    @Test
//    void test2(){
//        int x = 3;
//        Assertions.assertTrue(esPositivo(x));
//
//        BooleanSupplier esPar = () -> x % 2 == 0;
//        assertFalse(esPar());
//    }


}

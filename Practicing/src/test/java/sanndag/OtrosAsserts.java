package sanndag;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class OtrosAsserts {

    @Test
    void test1(){
        int x = 3;
        assertAll(
                () -> assertEquals(3,x),
                ()-> assertFalse(x % 2 == 0),
                () -> assertTrue(x > 0),
                () -> assertNotNull(Integer.valueOf(x))
        );
    }

    @Test
    void test2(){
        int x = 4;
        assertAll(
                () -> assertEquals(4,x),
                ()-> assertFalse(x % 2 == 0),
                () -> assertTrue(x > 0),
                () -> assertNotNull(Integer.valueOf(x))
        );
    }

    @Test
    void test3(){
        assertTimeout(Duration.of(1, ChronoUnit.MILLIS),
                () -> {
                    System.out.print("3 hola");
                    Thread.sleep(10);
                    System.out.print("adios");
                });

        //si tarda mas de un milisegundo tira excepción:
        //execution exceeded timeout of 1 ms by 18 ms
    }

    @Test
    void test4(){
        assertTimeout(Duration.of(20, ChronoUnit.MILLIS),
                () -> {
                    System.out.print("3 hola");
                    Thread.sleep(2);
                    System.out.print("adios");
                });

        //si tarda mas de un milisegundo tira excepción:
        //execution exceeded timeout of 1 ms by 18 ms
    }

    @Test
    void test5(){
        //con la palabra preemtively, le decimos que si venció el tiempo no siga ejecutando
        //si la palabra no está, por más que haya vencido el tiempo en que debía terminar,
        //seguirá ejecutandose.
        assertTimeoutPreemptively(Duration.of(1, ChronoUnit.MILLIS),
                () -> {
                    System.out.print("3 hola");
                    Thread.sleep(10);
                    System.out.print("adios");
                });
    }


}

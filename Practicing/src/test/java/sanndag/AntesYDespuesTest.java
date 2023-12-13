package sanndag;

import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AntesYDespuesTest {

    @BeforeAll
    static void antesDeNada(){
        System.out.println("antes de nada");
    }

    @BeforeEach
    static void antesDeCada(){
        System.out.println("antes de cada");
    }

    void test1(){
        System.out.println("test1");
    }

    void test2(){
        System.out.println("test2");
    }

    @AfterEach
    static void despuesDeCada(){
        System.out.println("despues de cada");
    }

    @AfterAll
    static void despuesDeTodo(){
        System.out.println("despues de todo");
    }

}

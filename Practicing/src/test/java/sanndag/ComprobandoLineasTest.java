package sanndag;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertLinesMatch;

public class ComprobandoLineasTest {

    @Test
    void test1(){
        List<String> lista1 = Arrays.asList("Hola", "qué tal", "adios");
        List<String> lista2 = Arrays.asList("Hola", "qué tal", "adios");

        assertLinesMatch(lista1,lista2);
    }

    @Test
    void test2(){
        List<String> esperada = Arrays.asList("Hola", ">>>>", "adios");
        List<String> obtenida = Arrays.asList("Hola", "qué tal", "adios");

        assertLinesMatch(esperada,obtenida);
        //comprueba que la oración tenga coincidencia entre la primer y ultima palabra.
    }

    @Test
    void test3(){
        List<String> esperada = Arrays.asList("Hola", ">>>>", "adios");
        List<String> obtenida = Arrays.asList("Hola", "qué tal", "nos vemos");

        assertLinesMatch(esperada,obtenida);
    }

    @Test
    void test4(){
        List<String> esperada = Arrays.asList("Hola", ">> 2 >>", "adios");
        List<String> obtenida = Arrays.asList("Hola", "qué tal", "nos vemos", "adios");
        // ">> 2 >>" le indicamos cuantas lineas queremos que salte, por eso este test funciona ok.

        assertLinesMatch(esperada,obtenida);
    }

    @Test
    void test5(){
        List<String> esperada = Arrays.asList("Hola", ">> 3 >>", "adios");
        List<String> obtenida = Arrays.asList("Hola", "qué tal", "nos vemos", "adios");
        // ">> 3 >>" aca le indicamos que espermaos 3 string entre el hola y el adios, por eso este test falla
        assertLinesMatch(esperada,obtenida);
    }

    @Test
    void test6(){
        List<String> esperada = Arrays.asList(
                "Inicio operación",
                "a = \\d+",
                ">> trazas previas >>",
                "En operación",
                ">> trazas posteriores >>",
                "Fin operación");

        List<String> obtenida = Arrays.asList(
                "Inicio operación",
                "a = 3",
                "b = 8",
                "a + b = 11",
                "En operación",
                "Fin operación");

        assertLinesMatch(esperada,obtenida);

    }
}

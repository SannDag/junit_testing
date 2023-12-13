package sanndag;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HolaMundoTest {

    @Test
    public void testOut(){
        PrintStream originalOut = System.out; //salida original
        ByteArrayOutputStream bos = new ByteArrayOutputStream(); //nueva salida
        System.out.println(new PrintStream(bos)); //reemplazo de salida

        HolaMundo.main(null);
        String salida = bos.toString(); // recuperación del contenido
        assertEquals("Hola Mundo\n", salida);

        System.out.println(originalOut); // restauración de la consola
    }

    @Test
    public void testErr() {
        PrintStream originalErr = System.err; // salida original
        ByteArrayOutputStream bos = new ByteArrayOutputStream(); // nueva salida
        System.setErr(new PrintStream(bos)); //reemplazo de salida

        HolaMundo.main(null);
        String salida = bos.toString(); // recuperación del contenido
        assertEquals("Hola mundo\n", salida);

        System.setOut(originalOut); // restauración de la consola
    }


}

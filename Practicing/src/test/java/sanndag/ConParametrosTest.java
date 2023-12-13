package sanndag;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Month;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ConParametrosTest {

    @ParameterizedTest(name = "{index}: test5({0})")
    @ValueSource(ints = {2, 4, 6, 8})
    void test5(int num){
        assertTrue(num % 2 == 0);
    }

    @ParameterizedTest(name = "{index}: test6({0})")
    @EnumSource
    void test6(Month mes){
        assertNotNull(mes);
    }

    static Stream<Persona> personaProvider() {
        return Stream.of(
                new Persona("Pepe", "Perez"),
                new Persona("Lola", "Lopez"),
                new Persona("Manuel", "Gomez"));

    }

    @ParameterizedTest(name = "{index}: test7({0})")
    @MethodSource("personaProvider")
    void test7(Persona p){
        assertEquals(4, p.nameLength(p.getName()));
    }
}

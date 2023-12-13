package sanndag;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Colleciones {

    @Test
    void testIguales(){
        List<String> l1 = Arrays.asList("a", "e", "i", "o", "u");
        List<String> l2 = Arrays.asList("a", "e", "i", "o", "u");
        List<String> l3 = Arrays.asList("a", "e", "i", "o", "z");

        assertEquals(l1,l2);
        assertNotSame(l1,l2);
        assertNotEquals(l1,l3);

        assertIterableEquals(l1,l2);
        assertIterableEquals(l1,l3);

    }
}

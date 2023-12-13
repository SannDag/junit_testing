package sanndag;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ComprobandoExcepciones {

    @Test
    void test1(){
        try{
            int [] nums = new int[] {1,2};
            int num = nums[10];
            fail("se espera una excepcion");
        }catch (ArrayIndexOutOfBoundsException e){
            assertTrue(e.getMessage().contains("10"));
        } catch(Throwable t){
            fail(t);
        }
    }

    @Test
    void test2(){
        int [] nums = new int [] {1,2};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int num = nums[10];
        });
    }


}

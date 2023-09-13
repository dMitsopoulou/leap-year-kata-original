import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class YearShould{
    @Test
    public void return_false_if_not_divisible_by_4() {
        assertFalse(Year.isLeap(1997));
    }

    @Test
    public void return_true_if_divisible_by_4(){
        assertTrue(Year.isLeap(1996));

    }

    @Test
    public void return_true_if_divisible_by_400(){
        assertTrue(Year.isLeap(1600));
    }

    @Test
    public void return_false_if_divisible_by_100_not_divisible_by_400(){
        assertFalse(Year.isLeap(1800));
    }


    @ParameterizedTest
    @CsvSource({

            "1997,false",
            "1996,true",
            "1600,true",
            "1800,true",

    })
    public void methodRun_MethodReturnsExpectedValue(final int year, final boolean retval) {
        if (retval){
            assertTrue(Year.isLeap(year));
        } else {
            assertFalse(Year.isLeap(year));
        }




    }



}

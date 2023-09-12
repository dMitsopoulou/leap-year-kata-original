import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class YearShould{
    @Test
    public void return_false_if_not_divisible_by_4() {
        assertFalse(new Year(1997).isLeap());
    }
}

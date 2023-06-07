package ex2;

import org.example.ex2.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUnitsTest {

    private StringUtils stringUtils;



    @Test
    public void testIsPalindrome(){
        // duas formas de fazer a mesma coisa, asserTrue ou asserEquals
        assertTrue(StringUtils.isPalindrome("ana"));
        assertTrue(StringUtils.isPalindrome("Ana"));
        assertEquals(false, StringUtils.isPalindrome("123"));
        assertEquals(false, StringUtils.isPalindrome(null));
        assertEquals(false, StringUtils.isPalindrome("âna h"));
    }

}

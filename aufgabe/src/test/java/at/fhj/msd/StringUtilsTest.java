package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.sun.tools.javac.util.StringUtils;

public class StringUtilsTest {

    @Test
    public void testIsPalindrome() {
        
        assertTrue(StringUtils.isPalindrome("otto"));
        assertFalse(StringUtils.isPalindrome("Developer"));
    }}
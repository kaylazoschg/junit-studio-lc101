package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void bracketsOutsideWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void bracketsWithinWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void bracketsBeforeWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void emptyString() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void openBracketOnly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void openBracketOnlyInsideWord() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code"));
    }

    @Test
    public void closingBracketOnly() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("LaunchCode]"));
    }

    @Test
    public void nestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[Launch]Code]"));
    }

    @Test
    public void backwardsBracketsBeforeWord() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][LaunchCode"));
    }

    @Test
    public void backwardsBracketsWithoutWord() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void backwardsBracketsInsideWord() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Launch[Code"));
    }

}

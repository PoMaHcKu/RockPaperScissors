package by.itra.tasks.task3.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParametersValidatorTest {

    private ParametersValidator validator;
    private String[] params1;
    String[] params2;
    String[] params3;
    String[] params4;
    String[] params5;
    String[] params6;

    @Before
    public void initTestParameters() {
        this.validator = new ParametersValidator();
        params1 = new String[] {"one", "two"};
        params2 = new String[] {"one", "two", "two"};
        params3 = new String[] {"one", "two", "Two"};
        params4 = new String[] {"rock", "paper", "scissors", "lizard"};
        params5 = new String[] {"rock", "paper", "scissors"};
        params6 = new String[] {"rock", "paper", "scissors", "lizard", "spock"};
    }

    @Test
    public void isValid() {
        assertFalse(validator.isValid(params1));
        assertFalse(validator.isValid(params2));
        assertFalse(validator.isValid(params3));
        assertFalse(validator.isValid(params4));
        assertTrue(validator.isValid(params5));
        assertTrue(validator.isValid(params6));
    }
}
package tut4;

import junit.framework.TestCase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestCalc extends TestCase {
    @Test
    void testFact(){
        Assertions.assertEquals(2,Calc.add(1,1));

    }
}
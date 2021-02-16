package ca.retrylife.mathutils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnglesTest {

    @Test
    public void testSmallestCoTerminal() {
        assertEquals(-30.0, Angles.getSmallestCoTerminalDegrees(330.0), Comparison.K_VERY_SMALL_NUMBER);
        assertEquals(30.0, Angles.getSmallestCoTerminalDegrees(30.0), Comparison.K_VERY_SMALL_NUMBER);
    }

}
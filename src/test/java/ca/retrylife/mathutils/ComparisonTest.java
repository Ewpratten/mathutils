package ca.retrylife.mathutils;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ComparisonTest {

    @Test
    public void epsilonEqualsTest() {

        assertTrue(Comparison.epsilonEquals(1.0, 2.0, 4.0));
        assertFalse(Comparison.epsilonEquals(1.0, 6.0, 4.0));
        assertTrue(Comparison.epsilonEquals(0.0, 0.0));
        assertTrue(Comparison.isZero(0.0));

    }

    @Test
    public void withinTest() {

        assertTrue(Comparison.within(1, 0, 2, true));
        assertTrue(Comparison.within(0, 0, 2, true));
        assertTrue(Comparison.within(2, 0, 2, true));
        assertFalse(Comparison.within(2, 0, 2, false));
        assertFalse(Comparison.within(0, 0, 2, false));

    }

}
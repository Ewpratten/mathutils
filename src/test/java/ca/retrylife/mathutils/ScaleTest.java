package ca.retrylife.mathutils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ScaleTest {

    @Test
    public void testMap() {

        assertEquals(1.0, Scale.map(0.5, 0, 1, 0, 2), Comparison.K_VERY_SMALL_NUMBER);
    }

    @Test
    public void testClamp() {

        assertEquals(10.0, Scale.clamp(10.0, 0.0, 20.0), Comparison.K_VERY_SMALL_NUMBER);
        assertEquals(20.0, Scale.clamp(20.0, 0.0, 20.0), Comparison.K_VERY_SMALL_NUMBER);
        assertEquals(20.0, Scale.clamp(40.0, 0.0, 20.0), Comparison.K_VERY_SMALL_NUMBER);
        assertEquals(0.0, Scale.clamp(-40.0, 0.0, 20.0), Comparison.K_VERY_SMALL_NUMBER);

    }

}
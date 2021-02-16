package ca.retrylife.mathutils;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class UnitsTest {

    @Test
    public void metersToFeetTest() {
        assertEquals(3.28, Units.convert(1.0, Units.METRE, Units.FOOT), 1e-2);
    }

    @Test
    public void feetToMetersTest() {
        assertEquals(0.30, Units.convert(1.0, Units.FOOT, Units.METRE), 1e-2);
    }

    @Test
    public void metersToInchesTest() {
        assertEquals(39.37, Units.convert(1.0, Units.METRE, Units.INCH), 1e-2);
    }

    @Test
    public void inchesToMetersTest() {
        assertEquals(0.0254, Units.convert(1.0, Units.INCH, Units.METRE), 1e-3);
    }

}
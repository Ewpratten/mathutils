package ca.retrylife.mathutils;

/**
 * Various units of measurement
 */
public enum Units {

    MILLIMETRE(1), CENTIMETRE(10), METRE(1000), INCH(25.4), FOOT(304.8), YARD(914.4);

    private final double coeff;

    private Units(double coeff) {
        this.coeff = coeff;
    }

    /**
     * Get the coeff of this unit
     * 
     * @return Coeff
     */
    private final double getCoeff() {
        return coeff;
    }

    /**
     * Converts a measurement into specified units
     *
     * @param value      The value of the measurement e.g. 10
     * @param units_from The unit type to convert from e.g. UNITS.MILLIMETRE
     * @param units_to   The unit type to convert to e.g. UNITS.INCH
     * @return Converted value
     */
    public static double convert(double value, Units from, Units to) {

        // Convert to mm, then to desired output
        return (value * from.getCoeff()) / to.getCoeff();
    };

    /**
     * Converts a measurement into specified units. NOTE: This uses casting, and may
     * behave unexpectedly
     *
     * @param value      The value of the measurement e.g. 10
     * @param units_from The unit type to convert from e.g. UNITS.MILLIMETRE
     * @param units_to   The unit type to convert to e.g. UNITS.INCH
     * @return Converted value
     */
    public static int convert(int value, Units from, Units to) {
        return (int) convert((double) value, from, to);
    }

    /**
     * Converts a measurement into specified units. NOTE: This uses casting, and may
     * behave unexpectedly
     *
     * @param value      The value of the measurement e.g. 10
     * @param units_from The unit type to convert from e.g. UNITS.MILLIMETRE
     * @param units_to   The unit type to convert to e.g. UNITS.INCH
     * @return Converted value
     */
    public static long convert(long value, Units from, Units to) {
        return (long) convert((double) value, from, to);
    }

    /**
     * Converts a measurement into specified units. NOTE: This uses casting, and may
     * behave unexpectedly
     *
     * @param value      The value of the measurement e.g. 10
     * @param units_from The unit type to convert from e.g. UNITS.MILLIMETRE
     * @param units_to   The unit type to convert to e.g. UNITS.INCH
     * @return Converted value
     */
    public static float convert(float value, Units from, Units to) {
        return (float) convert((double) value, from, to);
    }

}
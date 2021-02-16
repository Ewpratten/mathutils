package ca.retrylife.mathutils;

/**
 * Comparing numbers
 */
public class Comparison {

    // A very small number to be used for comparing casted values
    public static final double K_VERY_SMALL_NUMBER = 1e-12;

    /**
     * Check if two values are within a specified range of each other in either
     * direction
     * 
     * @param a       Value A
     * @param b       Value B
     * @param epsilon Epsilon (acceptable error)
     * @return Are near equal?
     */
    public static boolean epsilonEquals(int a, int b, int epsilon) {
        return (a - epsilon <= b) && (a + epsilon >= b);
    }

    /**
     * Check if two values are within a specified range of each other in either
     * direction
     * 
     * @param a       Value A
     * @param b       Value B
     * @param epsilon Epsilon (acceptable error)
     * @return Are near equal?
     */
    public static boolean epsilonEquals(long a, long b, long epsilon) {
        return (a - epsilon <= b) && (a + epsilon >= b);
    }

    /**
     * Check if two values are within a specified range of each other in either
     * direction
     * 
     * @param a       Value A
     * @param b       Value B
     * @param epsilon Epsilon (acceptable error)
     * @return Are near equal?
     */
    public static boolean epsilonEquals(double a, double b, double epsilon) {
        return (a - epsilon <= b) && (a + epsilon >= b);
    }

    /**
     * Check if two values are within a specified range of each other in either
     * direction
     * 
     * @param a       Value A
     * @param b       Value B
     * @param epsilon Epsilon (acceptable error)
     * @return Are near equal?
     */
    public static boolean epsilonEquals(float a, float b, float epsilon) {
        return (a - epsilon <= b) && (a + epsilon >= b);
    }

    /**
     * Check if two values are equal to each other within
     * {@link Comparison}.K_VERY_SMALL_NUMBER
     * 
     * @param a Value A
     * @param b Value B
     * @return Are near equal?
     */
    public static boolean epsilonEquals(double a, double b) {
        return epsilonEquals(a, b, (double) Comparison.K_VERY_SMALL_NUMBER);
    }

    /**
     * Check if two values are equal to each other within
     * {@link Comparison}.K_VERY_SMALL_NUMBER
     * 
     * @param a Value A
     * @param b Value B
     * @return Are near equal?
     */
    public static boolean epsilonEquals(float a, float b) {
        return epsilonEquals(a, b, (float) Comparison.K_VERY_SMALL_NUMBER);
    }

    /**
     * Check if a double is zero (accounting for fp errors)
     * 
     * @param value Value
     * @return Is zero?
     */
    public static boolean isZero(double value) {
        return epsilonEquals(value, 0.0);
    }

    /**
     * Check if a float is zero (accounting for fp errors)
     * 
     * @param value Value
     * @return Is zero?
     */
    public static boolean isZero(float value) {
        return epsilonEquals(value, 0.0f);
    }

    /**
     * Check if a value is within a range of values
     * 
     * @param value        Value
     * @param low          Low end of range
     * @param high         High end of range
     * @param includeEdges Should <code>low</code> and <code>high</code> be included
     *                     in the range?
     * @return Is value in range?
     */
    public static boolean within(int value, int low, int high, boolean includeEdges) {
        if (includeEdges) {
            return value >= low && value <= high;
        } else {
            return value > low && value < high;
        }
    }

    /**
     * Check if a value is within a range of values
     * 
     * @param value        Value
     * @param low          Low end of range
     * @param high         High end of range
     * @param includeEdges Should <code>low</code> and <code>high</code> be included
     *                     in the range?
     * @return Is value in range?
     */
    public static boolean within(long value, long low, long high, boolean includeEdges) {
        if (includeEdges) {
            return value >= low && value <= high;
        } else {
            return value > low && value < high;
        }
    }

    /**
     * Check if a value is within a range of values
     * 
     * @param value        Value
     * @param low          Low end of range
     * @param high         High end of range
     * @param includeEdges Should <code>low</code> and <code>high</code> be included
     *                     in the range?
     * @return Is value in range?
     */
    public static boolean within(double value, double low, double high, boolean includeEdges) {
        if (includeEdges) {
            return value >= low && value <= high;
        } else {
            return value > low && value < high;
        }
    }

    /**
     * Check if a value is within a range of values
     * 
     * @param value        Value
     * @param low          Low end of range
     * @param high         High end of range
     * @param includeEdges Should <code>low</code> and <code>high</code> be included
     *                     in the range?
     * @return Is value in range?
     */
    public static boolean within(float value, float low, float high, boolean includeEdges) {
        if (includeEdges) {
            return value >= low && value <= high;
        } else {
            return value > low && value < high;
        }
    }

}
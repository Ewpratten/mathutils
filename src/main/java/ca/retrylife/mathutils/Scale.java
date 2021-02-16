package ca.retrylife.mathutils;

/**
 * Utility functions for scaling numbers
 */
public class Scale {

    /**
     * Linear remap a value from one value range to another
     * 
     * @param value       Value to remap
     * @param input_low   Lowest value of source range
     * @param input_high  Highest value of source range
     * @param output_low  Lowest value of output range
     * @param output_high Highest value of output range
     * @return Remapped value
     */
    public static int map(int value, int input_low, int input_high, int output_low, int output_high) {
        return (value - input_low) * (output_high - output_low) / (input_high - input_low) + output_low;
    }

    /**
     * Linear remap a value from one value range to another
     * 
     * @param value       Value to remap
     * @param input_low   Lowest value of source range
     * @param input_high  Highest value of source range
     * @param output_low  Lowest value of output range
     * @param output_high Highest value of output range
     * @return Remapped value
     */
    public static long map(long value, long input_low, long input_high, long output_low, long output_high) {
        return (value - input_low) * (output_high - output_low) / (input_high - input_low) + output_low;
    }

    /**
     * Linear remap a value from one value range to another
     * 
     * @param value       Value to remap
     * @param input_low   Lowest value of source range
     * @param input_high  Highest value of source range
     * @param output_low  Lowest value of output range
     * @param output_high Highest value of output range
     * @return Remapped value
     */
    public static double map(double value, double input_low, double input_high, double output_low, double output_high) {
        return (value - input_low) * (output_high - output_low) / (input_high - input_low) + output_low;
    }

    /**
     * Linear remap a value from one value range to another
     * 
     * @param value       Value to remap
     * @param input_low   Lowest value of source range
     * @param input_high  Highest value of source range
     * @param output_low  Lowest value of output range
     * @param output_high Highest value of output range
     * @return Remapped value
     */
    public static float map(float value, float input_low, float input_high, float output_low, float output_high) {
        return (value - input_low) * (output_high - output_low) / (input_high - input_low) + output_low;
    }

    /**
     * Returns value clamped between low and high boundaries.
     *
     * @param value Value to clamp.
     * @param low   The lower boundary to which to clamp value.
     * @param high  The higher boundary to which to clamp value.
     */
    public static int clamp(int value, int low, int high) {
        return Math.max(low, Math.min(value, high));
    }

    /**
     * Returns value clamped between low and high boundaries.
     *
     * @param value Value to clamp.
     * @param low   The lower boundary to which to clamp value.
     * @param high  The higher boundary to which to clamp value.
     */
    public static long clamp(long value, long low, long high) {
        return Math.max(low, Math.min(value, high));
    }

    /**
     * Returns value clamped between low and high boundaries.
     *
     * @param value Value to clamp.
     * @param low   The lower boundary to which to clamp value.
     * @param high  The higher boundary to which to clamp value.
     */
    public static double clamp(double value, double low, double high) {
        return Math.max(low, Math.min(value, high));
    }

    /**
     * Returns value clamped between low and high boundaries.
     *
     * @param value Value to clamp.
     * @param low   The lower boundary to which to clamp value.
     * @param high  The higher boundary to which to clamp value.
     */
    public static float clamp(float value, float low, float high) {
        return Math.max(low, Math.min(value, high));
    }

}
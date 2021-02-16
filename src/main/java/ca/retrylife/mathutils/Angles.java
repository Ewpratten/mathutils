package ca.retrylife.mathutils;

public class Angles {

    /**
     * Get the smallest co-terminal angle to the difference between the
     * <code>start</code> and <code>end</code> angles (<code>end - start</code>)
     * 
     * @param start Start angle
     * @param end   End angle
     * @return Smallest co-terminal
     */
    public static double getSmallestCoTerminalDegrees(double start, double end) {
        return getSmallestCoTerminalDegrees(end - start);
    }

    /**
     * Get the smallest co-terminal to an angle
     * 
     * @param angle Angle
     * @return Smallest co-terminal
     */
    public static double getSmallestCoTerminalDegrees(double angle) {

        // 360-wrap the angle
        double phi = angle % 360;

        // Determine the distance
        double distance = phi > 180 ? 360 - phi : phi;

        // Determine the sign
        int sign = (angle >= 0 && angle <= 180) || (angle <= -180 && angle >= -360) ? 1 : -1;

        // Return the shortest co-terminal
        return distance * sign;

    }

    /**
     * Get the smallest co-terminal angle to the difference between the
     * <code>start</code> and <code>end</code> angles (<code>end - start</code>)
     * 
     * @param start Start angle
     * @param end   End angle
     * @return Smallest co-terminal
     */
    public static double getSmallestCoTerminalRadians(double start, double end) {
        return getSmallestCoTerminalRadians(end - start);
    }

    /**
     * Get the smallest co-terminal to an angle
     * 
     * @param angle Angle
     * @return Smallest co-terminal
     */
    public static double getSmallestCoTerminalRadians(double angle) {
        return Math.toRadians(getSmallestCoTerminalRadians(Math.toDegrees(angle)));
    }

    /**
     * Converts an angle expressed as a value from 0 to 360 to an angle expressed as
     * a value from -180 to 180
     * 
     * @param angle Angle
     * @return Remapped angle
     */
    public static double to180StyleAngleDegrees(double angle) {

        // Wrap the angle by 360 degrees
        angle %= 360.0;

        // Handle offsetting based on sign
        if (Math.abs(angle) > 180.0) {
            angle = (angle > 0) ? angle - 360 : angle + 360;
        }

        return angle;

    }

    /**
     * Converts an angle expressed as a value from 0 to 2pi to an angle expressed as
     * a value from -pi to pi
     * 
     * @param angle Angle
     * @return Remapped angle
     */
    public static double to180StyleAngleRadians(double angle) {
        return Math.toRadians(to180StyleAngleDegrees(Math.toDegrees(angle)));
    }

}
package patterns;

/**
 * Print the following pattern
 * *
 * **
 * ***
 * ****
 */
public class RightAngleTrianglePattern {

    /**
     *
     * @param n is an integer between 1 and 20
     */
    public void printRightAngledRectangularPattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

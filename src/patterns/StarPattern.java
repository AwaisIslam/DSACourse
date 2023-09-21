package patterns;

/**
 * Print the following pattern
 * *****
 * *****
 * *****
 * *****
 */
public class StarPattern {

    /**
     * @param n is an integer between 1 and 20
     */
    public void printRectangularStar(int n) {

        for (int i = 0; i < n; i++) {
            // This is the inner loop which here, loops for the columns
            // as we have to print a rectangular pattern.
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }

            // As soon as N stars are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }
}

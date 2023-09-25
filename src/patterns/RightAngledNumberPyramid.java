package patterns;

/**
 * Print the following pattern
 * 1
 * 12
 * 123
 * 1234
 * 12345
 */
public class RightAngledNumberPyramid {

    public void rightAngleNumberPyramid(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

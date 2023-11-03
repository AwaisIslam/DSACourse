package patterns;

public class InvertedRightPyramid {

    public void invertedRightPyramid(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

package patterns;

public class InvertedNumberedRightPyramid {

    public void invertedNumberRightPyramid(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(n-j+1+" ");
            }
            System.out.println();
        }
    }
}

package patterns;

public class RigthAngledNumberPyramid2 {

    public void rightAndgleNumberPyramid2(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}

package patterns;

public class DiamondStarPattern {

    public void starPyramid(int N) {
        for (int i = 0; i < N; i++) {

            // For printing the spaces before stars in each row
            for (int j =0; j<N-i-1; j++)
            {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for(int j=0;j< 2*i+1;j++){

                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for (int j =0; j<N-i-1; j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void printInvertedStar(int n) {
        for (int i = 0; i < n; i++) {

            //Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // star
            for(int j=0;j< 2*n -(2*i +1);j++){

                System.out.print("*");
            }
            // Space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

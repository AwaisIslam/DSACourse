package patterns;

public class InvertedStarPyramid {

    public static void main(String[] args) {
        printInvertedStar(5);
    }

    static void printInvertedStar(int n) {
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

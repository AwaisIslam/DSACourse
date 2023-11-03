package patterns;

public class AlphaTrianglePattern {

    public static void alphTrianglePattern(int n) {
        for (int i = 0; i < n; i++) {

            for (char ch = (char) ('E' - i); ch <= 'E'; ch++ ) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        alphTrianglePattern(5);
    }
}

package patterns;

public class AlphaHillPattern{

    public static void alphaHillPattern(int n) {
        for (int i = 0; i < n; i++) {
            
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // alphabets
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <=2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
            }
            
            // spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        alphaHillPattern(5);
    }
}

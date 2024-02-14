import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PthFactor {
    public static void main(String[] args) {
        int n = 20;
        int p = 4;
        int result = pthFactor(n, p);
        System.out.println(result);  // Output: 4
    }

    public static int pthFactor(long n, long p) {
        List<Integer> factors = findFactors(n);

        if (p > factors.size()) {
            return 0;
        }

        return factors.get((int) (p-1));
    }

    private static List<Integer> findFactors(long n) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
                if (i != n / i) {
                    factors.add((int) (n / i));
                }
            }
        }

        Collections.sort(factors);
        return factors;
    }
}

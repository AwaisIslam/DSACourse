package basicmaths;

public class DigitsCounter {

    public static void main(String[] args) {
        int n = 3456;
        System.out.println("The number of digits in " +n+ " is " +countDigits(n));
    }
    public static int countDigits(int n ){

        // Solution 1:
        int x = n;
        int counter = 0;
        while (x != 0) {
            x = x / 10;
            counter++;
        }
        return counter;

        /*
        * Solution 2
        String len = Integer.toString(n);
        System.out.println(len.length());
        return len.length();
        */
    }
}

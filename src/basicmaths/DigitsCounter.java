package basicmaths;

public class DigitsCounter {

    public static void main(String[] args) {
        countDigits(12345);
    }
    public static int countDigits(int n ){
        String len = Integer.toString(n);
        System.out.println(len.length());
        return len.length();
    }
}

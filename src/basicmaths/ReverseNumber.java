package basicmaths;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverseNumber(12));
    }
    public static int reverseNumber(int n) {
        int reverse = 0;
        while(n!= 0){
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }
        return reverse;
    }
}
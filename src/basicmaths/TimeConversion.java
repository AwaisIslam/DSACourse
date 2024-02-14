package basicmaths;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(timeConversion("5:05:45PM"));
    }

    public static String timeConversion(String s) {
        String hour = s.substring(0, s.indexOf(":"));

        System.out.println(hour);
        String min = s.substring(s.indexOf(":") + 1, s.length() - 2);
        System.out.println(min);

        String amOrPm = s.substring(s.length() - 2);
        System.out.println(amOrPm);

        int hourInt = Integer.parseInt(hour);


        if (hourInt < 12) {
            if (!amOrPm.equals("AM")) {
                hourInt += 12;
            }
        } else if (hourInt == 12) {
            if (amOrPm.equals("PM")) {
                hourInt = 12;
            }
            else {
                hourInt = 0;
            }

        }

        if (hourInt == 0 || amOrPm.equals("AM")) {
            return 0 +""+ hourInt + ":" + min;
        }
        else {
            return hourInt + ":" + min;
        }
    }
}

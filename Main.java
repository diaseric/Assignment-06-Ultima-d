import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int minutesPerYear = 1440*365;
        int minutesPerDay = 60*24;

        int trammelPhase = 9;

        int feluccaPhase = 14;



        System.out.println("Enter worldTime: " );
        double worldTime1 = sc.nextDouble();


        int year = (int)(worldTime1/minutesPerYear) + 1;

        double remainder1 = worldTime1%minutesPerYear;

        int day = (int)(remainder1/minutesPerDay) + 1;

        int remainder2 = (int)(remainder1)%minutesPerDay;

        int hour = remainder2/60;

        int minutes = remainder2%60;

        int totalDays = (int)(worldTime1)/1440;

        int trammelDay = totalDays%trammelPhase + 1;

        int feluccaDay = totalDays%feluccaPhase + 1;

        System.out.println("It is " + hour + ":" + minutes + " on day " + day + " of the year " + year + ".");

        System.out.println("Trammel is in day " + trammelDay + " of its 9 day phase.");

        System.out.println("Felucca is in day " + feluccaDay + " of its 14 day phase.");



        //
        System.out.println("Enter worldTime: " );
        double worldTime1A = sc.nextDouble();


        int yearA = (int)(worldTime1A/minutesPerYear) + 1;

        double remainder1A = worldTime1A%minutesPerYear;

        int dayA = (int)(remainder1A/minutesPerDay) + 1;

        int remainder2A = (int)(remainder1A)%minutesPerDay;

        int hourA = remainder2A/60;

        int minutesA = remainder2A%60;

        int totalDaysA = (int)(worldTime1A)/1440;

        int trammelDayA = totalDaysA%trammelPhase + 1;

        int feluccaDayA = totalDaysA%feluccaPhase + 1;

        System.out.println("It is " + hourA + ":" + minutesA + " on day " + dayA + " of the year " + yearA + ".");

        System.out.println("Trammel is in day " + trammelDayA + " of its 9 day phase.");

        System.out.println("Felucca is in day " + feluccaDayA + " of its 14 day phase.");

        //
        System.out.println("Enter worldTime: " );
        double worldTime1B = sc.nextDouble();


        int yearB = (int)(worldTime1B/minutesPerYear) + 1;

        double remainder1B = worldTime1B%minutesPerYear;

        int dayB = (int)(remainder1B/minutesPerDay) + 1;

        int remainder2B = (int)(remainder1B)%minutesPerDay;

        int hourB = remainder2B/60;

        int minutesB = remainder2B%60;

        int totalDaysB = (int)(worldTime1B)/1440;

        int trammelDayB = totalDaysB%trammelPhase + 1;

        int feluccaDayB = totalDaysB%feluccaPhase + 1;

        System.out.println("It is " + hourB + ":" + minutesB + " on day " + dayB + " of the year " + yearB + ".");

        System.out.println("Trammel is in day " + trammelDayB + " of its 9 day phase.");

        System.out.println("Felucca is in day " + feluccaDayB + " of its 14 day phase.");


    }
}

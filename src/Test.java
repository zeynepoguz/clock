import java.util.Scanner;

public class Test {

    //Based on the information;
    //Clock is a circle so it contains 360 degrees

    public static void main(String[] args) {

        double hour, minute;
        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Saati giriniz: ");
            hour = sc.nextDouble();

            System.out.println("Dakikayı giriniz: ");
            minute = sc.nextDouble();

            if ((hour < 1 | hour > 12) | (minute < 0 | minute > 59)) // Control hour and minute
            {
                throw new BoundException(); // throw exception
            }

            // if the constraints are satisfied
            double result = calculate(hour, minute);

            if (result > 180)
                System.out.println("Açı : " + (360 - result));
            else
                System.out.println("Açı : " + (result));


        } catch (BoundException b) {
            System.err.println(b.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } // try-catch


    }


    private static double calculate(double hour, double min) {

        double totalH = 0.5 * ((60 * hour) + min); // clock turns 360degrees in 12 hours(720minutes), so hour hand turns 0.5degrees per minute
        min = min * 6; // minute hand turns 360degree in 60 minutes so it turns 6degrees per minute

        return (Math.abs(totalH - min)); // absolute value

    }

}

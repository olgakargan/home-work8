public class Main {

    private static int currentYear;

    public static void main(String[] args) {
        doYear(2022);
        doDelivery(95);
        int clientOs = 0;


    }

    public static void doYear(int year) {
        System.out.println(" ");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0)))
            System.out.println(year + " is not a leap year.");
        else System.out.println(year + " is a leap year.");
    }

    public static void doDelivery(int deliveryDistance) {
        System.out.println(" ");
        if (deliveryDistance <= 20) {
            System.out.println(" deliveryDistance 1 day!");
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println(" deliveryDistance 2 day!");
        } else {
            System.out.println(" deliveryDistance 3 day!");
        }
    }

    public static void installVersion(int os, int Year) {

        if (os == 0 && currentYear >= 2015) {
            System.out.println("Install the iOS version of the app by following the link");
        } else if (os == 0 && Year < 2015) {
            System.out.println("Install the lite version of the iOS app by following the link");
        } else if (os == 1 && Year >= 2015) {
            System.out.println("Install the Anlroid version of the app by following the link");
        } else if (os == 1 && Year < 2015) {
            System.out.println("Install the lite version of the Anlroid app by following the link");
        } else {
            System.out.println("Your device is not supported");
        }


    }

}
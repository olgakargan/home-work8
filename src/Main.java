public class Main {
    public static void main(String[] args) {
        doYear(2022);
        doDelivery(95);
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
}



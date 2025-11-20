public class RickshawFare {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();
        System.out.print("Enter time (minutes): ");
        double time = sc.nextDouble();
        System.out.print("Are you a local? (yes/no): ");
        String local = sc.next();
        System.out.print("Is it night time? (yes/no): ");
        String night = sc.next();

        double fare = 50 + (distance * 20) + (time * 2);
        fare = (distance >= 10 && local.equals("yes")) ? fare * 0.9 : fare;
        fare = (night.equals("yes")) ? fare * 1.2 : fare;

        System.out.println("Final Fare: Rs. " + fare);
    }
}

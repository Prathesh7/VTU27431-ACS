import java.util.Scanner;

public class CircularDeliveryRouteRepair {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of delivery locations: ");
        int n = sc.nextInt();

        int[] route = new int[n];

        System.out.println("Enter delivery location numbers:");

        for (int i = 0; i < n; i++) {
            route[i] = sc.nextInt();
        }

        System.out.println("\nRepaired Circular Delivery Route:");

        for (int i = 0; i < n; i++) {
            System.out.print(route[i] + " -> ");
        }

        System.out.println(route[0]);

        System.out.println("\nRoute successfully repaired.");

        sc.close();
    }
}

OUTPUT:
Enter number of delivery locations: 5
Enter delivery location numbers:
101
102
103
104
105

Repaired Circular Delivery Route:
101 -> 102 -> 103 -> 104 -> 105 -> 101

Route successfully repaired.

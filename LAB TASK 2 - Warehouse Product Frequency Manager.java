import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WarehouseProductFrequencyManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        HashMap<String, Integer> frequency = new HashMap<>();

        System.out.println("Enter product names:");

        for (int i = 0; i < n; i++) {
            String product = sc.nextLine();

            frequency.put(product,
                    frequency.getOrDefault(product, 0) + 1);
        }

        System.out.println("\nProduct Frequency:");

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        sc.close();
    }
}

OUTPUT:
Enter number of products: 8
Enter product names:
Laptop
Mouse
Keyboard
Laptop
Mouse
Monitor
Laptop
Keyboard

Product Frequency:
Laptop : 3
Mouse : 2
Keyboard : 2
Monitor : 1

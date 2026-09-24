import java.util.Scanner;
public class TrafficSignalCongestionAnalyzer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of signals: ");
        int n = sc.nextInt();
        int[] vehicles = new int[n];
        System.out.println("Enter vehicles waiting at each signal:");
        for(int i=0;i<n;i++){
            System.out.println("Signal " + (i +1) + ":");
            vehicles[i] = sc.nextInt();
        }
        int max = vehicles[0];
        int signal = 1;
        for(int i =1;i<n;i++){
            if(vehicles[i] > max){
                max = vehicles[i];
                signal = i+1;
            }
        }
        System.out.println("\nHighest congestion is at Signal" + signal);
        System.out.println("vehicles waiting: "+max);
        sc.close();
    }
}

OUTPUT:
Enter number of signals: 4
Enter vehicles waiting at each signal:
Signal 1: 25
Signal 2: 40
Signal 3: 18
Signal 4: 32

Highest congestion is at Signal 2
Vehicles waiting: 40

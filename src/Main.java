import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        float sum = 0, durschnitt;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number of elements: ");
        int counter = scan.nextInt();
        System.out.println("The number of elements is:" + counter);
        System.out.println("Please enter the numbers: ");
        for (int i = 0; i < counter; i++) {
            sum += scan.nextInt();
        }
        scan.close();

        durschnitt = sum / counter;

        System.out.println("Average: " + durschnitt);
    }
}
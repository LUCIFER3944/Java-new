import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // outer loop is used to print spaces
            for (int j = 1; j <= i; j++) {
                // inner loop is used to print stars
                System.out.print("* ");
            }
            // move to the next line after each row
            System.out.println();
        }
    }
}

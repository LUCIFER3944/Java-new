import java.util.Scanner;

public class Studentmark {
    String name;
    int sub[] = new int[5];
    int total;
    float percent;

    public void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of student:");
        name = sc.nextLine();

        System.out.print("Enter marks in five subjects : ");
        for (int i = 0; i < 5; i++) {
            sub[i] = sc.nextInt();
            total += sub[i];
        }
        percent = total / 5;
    }

    public void show() {
        System.out.printf("%-15s%-15d%-15.2f", name, total, percent);
        if (percent >= 90) {
            System.out.println("A");
        } else if (percent >= 80) {
            System.out.println("B");
        } else if (percent >= 70) {
            System.out.println("C");
        } else if (percent >= 60) {
            System.out.println("D");
        } else if (percent >= 50) {
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }

    public static void main(String[] args) {

        Studentmark s1[] = new Studentmark[5];

        for (int i = 0; i < 5; i++) {
            s1[i] = new Studentmark();
            s1[i].getdata();
        }

        // Print header
        System.out.printf("%-15s%-15s%-15s%-15s\n", "Name", "Total Marks", "Percentage", "Grade");

        for (int i = 0; i < 5; i++) {
            s1[i].show();
        }
    }
}

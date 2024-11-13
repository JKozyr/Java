import java.util.Scanner;

public class Checking_numbers {
    Scanner scanner = new Scanner(System.in);

    void check_num() {
        System.out.print("Enter an number: ");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Number is negative");
        }
        if (number > 0) {
            System.out.println("Number is positive");
        }
        if (number == 0) {
            System.out.println("Number is 0");
        }
    }
}

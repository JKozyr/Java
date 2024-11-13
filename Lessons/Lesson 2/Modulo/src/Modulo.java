import java.util.Scanner;

public class Modulo {
    void Checking_Modulo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number1 = scanner.nextInt();
        if(number1 % 2 == 0){
            System.out.println("Number is even");
        }
        if(number1 % 2 == 1){
            System.out.println("Number is odd");
        }
    }
}

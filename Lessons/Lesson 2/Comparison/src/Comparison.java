import java.util.Scanner;

public class Comparison {
    void Copresing(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
        if(number1 > number2){
            System.out.println(number1 + " is bigger than " + number2);
        }
        if(number1 < number2){
            System.out.println(number1 + " is smaller than " + number2);
        }
        if(number1 == number2){
            System.out.println(number1 + " is equal to " + number2);
        }
    }
}

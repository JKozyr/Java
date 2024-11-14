import java.util.Scanner;

public class ArrayManimulation {
    Scanner scaner = new Scanner(System.in);

    int[] arr = {4,56,32,76,2};

    void printArr(){
        System.out.println("What index of arr you want to see 0 - 4");
        int anser = scaner.nextInt();
        System.out.println(arr[anser] + "\n\n");
    }

    void showArr(){
        System.out.println("All the elements in the array");
        for(int i = 0;i < arr.length;i++){
            System.out.println(i + " [" + arr[i] + "]");
        }
    }

    void arrSum(){
        System.out.println("\nSum of all the elements in the array");
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

    void updateArr(){
        System.out.println("\nHow many numbers do you want to update ?  :");
        int numberOfUpdates = scaner.nextInt();
        for(int i = 0;i < numberOfUpdates;i++){
            System.out.println("What index of arr you want to update 0 - 4|:   ");
            int updateIndex = scaner.nextInt();
            System.out.println("What number: ");
            int updateNumber = scaner.nextInt();
            arr[updateIndex] = updateNumber;
        }

        showArr();
    }

}

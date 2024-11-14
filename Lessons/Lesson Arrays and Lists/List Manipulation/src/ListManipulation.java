import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListManipulation {
    Scanner scanner = new Scanner(System.in);

    List<String> Students = new ArrayList<>();

    void addStudents(){
        System.out.print("How many students?  |:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = scanner.next();
            Students.add(name);
        }
    }

    void showList(){
        int studentNumber = 0;
        for(String studentsNames : Students){
            System.out.println("["+studentNumber + "] " + studentsNames);
            studentNumber++;
        }
    }

    void removeStudent(){
        showList();
        System.out.print("Index of student to remove: ");
        Students.remove(scanner.nextInt());

    }
}

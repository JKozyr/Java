
public class Main {
    public static void main(String[] args) {
    Student[] students = {
            new Student("Alice", 20, new int[]{3,4,3,6,3,2,3,3}),
            new Student("Bob", 22,new int[]{5,3,6,1,3,4,3,3}),
            new Student("Charlie", 19, new int[]{3,1,3,6,1,1,1,3}),
            new Student("Daisy", 21, new int[]{5,5,6,6,5,6,5,6}),
            new Student("Eve", 20, new int[]{3,6,6,6,4,5,1,3})
    };

    for (Student student : students) {
        student.introduce();
        student.calculateAvrageGrades();
    }

    }
}

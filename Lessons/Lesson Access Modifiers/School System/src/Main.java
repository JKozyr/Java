public class Main {
    public static void main(String[] args) {
        School school = new School(5);

        Student student1 = new Student("Mark Dulip",4.0);
        Student student2 = new Student("Annie Rose",2.2);
        Student student3 = new Student("Violette Juhan",6.0);
        Student student4 = new Student("John Dortin",4.3);
        Student student5 = new Student("Fin Hold",1.4);
        Student student6 = new Student("Asal Molen",1.2);

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);


        school.calculateAverageGrade();

    }
}
public class School {
    Student[]  students;
    int studentCount = 0;

    School(int maxStudents) {
        students = new Student[maxStudents];
    }

    public void addStudent(Student student) {
        if(studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
            System.out.println(studentCount + " added to the list");
        }
        else {
            System.out.println("Cannot add more students");
        }

    }

    protected double calculateAverageGrade() {
        double gradeOfAllStudents = 0;
        for (int i = 0; i < studentCount; i++) {
            gradeOfAllStudents += students[i].getGrade();
        }
        System.out.println("The average grade of all students is " + Math.round((gradeOfAllStudents/ studentCount) * 100.0) / 100.0);
        return  Math.round((gradeOfAllStudents/ studentCount) * 100.0) / 100.0;
    }
}

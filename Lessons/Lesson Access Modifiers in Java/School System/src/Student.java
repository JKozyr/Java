public class Student {
    private String name;
    private double grade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    Student(String name, double grade) {
        setName(name);
        setGrade(grade);
    }
}

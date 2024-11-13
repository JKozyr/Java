public class Student {
    String name;
    int age;
    int[] grades;
    double avrageGrade;

    Student(String name, int age, int[] grade) {
        this.name = name;
        this.age = age;
        this.grades = grade;
    }


    String[] objects = {"Math","Chemistry","English","Computer Science","Spanish","Physics","History","Geography"};
    void introduce() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        for(int i = 0; i < grades.length; i++) {
            System.out.println("Object: " +objects[i] + "  Grade: " + grades[i]);
        }
    }

    void calculateAvrageGrades() {
        for(int i = 0; i < grades.length; i++) {
            avrageGrade += grades[i];

        }
        avrageGrade = avrageGrade / grades.length;
        if(avrageGrade > 4.75){
            System.out.println("Exelent your avrage grade is: " + avrageGrade);
        }
        else if(avrageGrade > 3.75){
            System.out.println("Good your avrage grade is: " + avrageGrade);
        }
        else{
            System.out.println("Needs improvement! your avrage grade is: " + avrageGrade);
        }
        System.out.println("\n\n===========================================================\n\n");
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random randomMark = new Random();
        Student[] students = new Student[10];

        for (int i = 0; i < students.length; i++){
            students[i] = new Student("Вася", "Пупкин", "ПКС-419", randomMark.nextInt(1, 6));
        }

        for (int i = 0; i < students.length; i++){
            System.out.print(students[i].firstName + " " + students[i].lastName + " " + students[i].group + " " + students[i].averageMark + " " + students[i].getScholarship());
            System.out.println();
        }
    }
}


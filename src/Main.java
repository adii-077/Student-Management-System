import models.Student;
import models.Classroom;
import models.Subject;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Classroom classroom = new Classroom("Science Block", 30, true, true);

        Subject math = new Subject(1, "Mathematics", 100, 40, "Mr. Sharma");
        Subject physics = new Subject(2, "Physics", 100, 40, "Ms. Gupta");

        ArrayList<Subject> subjects = new ArrayList<>();
        subjects.add(math);
        subjects.add(physics);

        Student student = new Student(101, "Aditya", 12, "A", 12, classroom, subjects);

        System.out.println("Student Name: " + student.getName());
        System.out.println("Classroom: " + classroom.getName());
        System.out.println("Subjects: ");
        for (Subject subject : student.getSubject()) {
            System.out.println(subject.getName() + " taught by " + subject.getTeacher());
        }
    }
}

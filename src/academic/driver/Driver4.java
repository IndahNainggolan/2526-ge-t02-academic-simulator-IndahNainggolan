package academic.driver;

import java.util.Scanner;
import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;

public class Driver4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Course[] courses = new Course[100];
        Student[] students = new Student[100];
        Enrollment[] enrollments = new Enrollment[100];

        int courseCount = 0;
        int studentCount = 0;
        int enrollmentCount = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");

            if (parts[0].equals("course-add")) {

                courses[courseCount++] = new Course(
                    parts[1], parts[2],
                    Integer.parseInt(parts[3]), parts[4]
                );

            } else if (parts[0].equals("student-add")) {

                students[studentCount++] = new Student(
                    parts[1], parts[2],
                    Integer.parseInt(parts[3]), parts[4]
                );

            } else if (parts[0].equals("enrollment-add")) {

                enrollments[enrollmentCount++] = new Enrollment(
                    parts[1], parts[2],
                    parts[3], parts[4]
                );
            }
        }

        // Output urutan: Course → Student → Enrollment

        for (int i = 0; i < courseCount; i++) {
            System.out.println(
                courses[i].getCode() + "|" +
                courses[i].getName() + "|" +
                courses[i].getCredit() + "|" +
                courses[i].getGrade()
            );
        }

        for (int i = 0; i < studentCount; i++) {
            System.out.println(
                students[i].getNim() + "|" +
                students[i].getName() + "|" +
                students[i].getYear() + "|" +
                students[i].getStudyProgram()
            );
        }

        for (int i = 0; i < enrollmentCount; i++) {
            System.out.println(
                enrollments[i].getCourseCode() + "|" +
                enrollments[i].getStudentNim() + "|" +
                enrollments[i].getAcademicYear() + "|" +
                enrollments[i].getSemester() + "|" +
                enrollments[i].getGrade()
            );
        }

        scanner.close();
    }
}
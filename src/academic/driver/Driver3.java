package academic.driver;

import java.util.Scanner;
import academic.model.Enrollment;

public class Driver3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Enrollment[] enrollments = new Enrollment[100];
        int count = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("---")) {
                break;
            }

            String[] parts = input.split("#");

            enrollments[count] = new Enrollment(
                parts[0],
                parts[1],
                parts[2],
                parts[3]
            );

            count++;
        }

        for (int i = 0; i < count; i++) {
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
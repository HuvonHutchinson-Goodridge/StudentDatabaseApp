package StudentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        //how many new user we want to add

        //create n number of new students
        System.out.println("Enter number of new students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numStudents = in.nextInt();
        Student students[] = new Student[numStudents];

        for (int n = 0; n < numStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }


    }
}

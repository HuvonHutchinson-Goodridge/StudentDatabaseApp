package StudentDatabaseApp;


import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private static int costOfCourse = 600;
    private static int Id = 1000;

    //constructor prompts user to enter users name and year

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student's first name: ");
        this.firstName = in.nextLine();
        System.out.println("Enter student's last name: ");
        this.lastName = in.nextLine();
        System.out.println("1 - Freshman\n2- for sophomore\n3- Junior\n4- Senior\nEnter student's grade year: ");
        this.gradeYear = in.nextInt();
        setStudentID();



    }
    //generate a 5 unit ID

    private void setStudentID(){
        //Grade level + ID
        Id++;
        this.studentID = gradeYear + "" + Id;
    }
    //enroll in courses

    public void enroll(){
        //get inside a loop, user hits 0 when doen enrolling
        do {
            System.out.println("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses += "\n" + course;
                tuitionBalance += costOfCourse;
            }
            else
                break;

        }while (1 != 0);


    }
    //view balance and pay tuition

    public void viewBalance(){
        System.out.println("Your balance is: " + tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your payment: $");
        int payment = in.nextInt();
        if (payment > tuitionBalance)
            tuitionBalance = 0;
        else
            tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    //show status

    public String toString(){
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled:" + courses +
                "\nBalance: $" + tuitionBalance;
    }


}

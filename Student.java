import java.util.Scanner;

public class Student {
    
    private String firstName;
    private String lastName;
    private String studentID;
    private int gradeYear;
    private String courses = "";
    private int tutionBalance;
    private int costOfcourse = 600;
    private static int id = 1001;

    Student() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name : ");
        this.firstName = scanner.nextLine();

        System.out.print("Enter last name : ");
        this.lastName = scanner.nextLine();

        System.out.println("1.Freshman \n2.Sophmore \n3.Junior \n4.Senior");
        System.out.print("Enter class lavel : ");
        this.gradeYear = scanner.nextInt();

        setStudentID();

        //System.out.println(firstName+ " " +lastName+ " " +gradeYear+ " " +studentID);

    }

    public void setStudentID() {

        id++;
        studentID = gradeYear+ "" +id;
    }

    public void enroll() {

        do{

            System.out.print("Enter courses to enroll (Q to quit) : ");

            Scanner scanner = new Scanner(System.in);
            String course = scanner.nextLine();

            if(!course.equals("Q")) {

                tutionBalance += costOfcourse;
                courses = courses +"\n  "+ course;
            }
            else {

                break;
            }

        } while(1>0);

        //System.out.println("Enrolled in : " +courses);
        viewBalance();
    }

    public void viewBalance(){

        System.out.println("Balance : $" +tutionBalance);
    }

    public void pay() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount for Payment : $");
        int payment = scanner.nextInt();

        System.out.println("Thanks for the payment of $" +payment);

        tutionBalance -=payment;

        //viewBalance();
    }

    public void showInfo() {

        System.out.println("Name : " +firstName+ " " +lastName);
        System.out.println("ID : " +studentID);
        System.out.println("Courses enrolled : " +courses);
        System.out.println("Balance : " +tutionBalance);
    }
}

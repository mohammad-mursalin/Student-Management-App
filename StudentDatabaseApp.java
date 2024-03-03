import java.util.Scanner;

public class StudentDatabaseApp {

    public static void main(String[] args) {

        System.out.print("Enter the number of Students who wants to enroll : ");

        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        
        Student[] students = new Student[numOfStudents];

        for(int i = 0 ; i < numOfStudents ; i++){

            students[i] = new Student(); 
            students[i].enroll();
            students[i].pay();
            System.out.println();
            
        }

        for(Student student : students) {

            student.showInfo();
            System.out.println();
        }

    }
}
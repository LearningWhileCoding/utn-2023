import UTN.data.DAOStudent;
import UTN.domain.Student;

import java.util.Scanner;

public class StudentsApplication {
    public static void main(String[] args) {
        var exit = false;
        var scanner = new Scanner(System.in);

        // Service Class instance
        var daoStudent = new DAOStudent();

        while (!exit){
            try {
                displayMenu();
                exit = executeOptions(scanner, daoStudent);
            }catch (Exception e){
                System.out.println("An error has occurred while executing the operation.");
            }
        } // End of While
    } // End of Main

    private static void displayMenu(){
        System.out.println("""
                * * * * *  Students System  * * * * *
                1. Display Students
                2. Search Students
                3. Add Student
                4. Update Student
                5. Delete Student
                6. Exit
                Choose an option:
                """);
    }

    private static boolean executeOptions(Scanner scanner, DAOStudent daoStudent){
        var option = Integer.parseInt(scanner.nextLine());
        var exit  = false;
        switch (option){
            case 1 -> {
                System.out.println("····· Students ·····");
                var students = daoStudent.getStudents();
                students.forEach(System.out::println);
            } // End of case 1
            case 2 -> {
                System.out.println("Enter the ID of the student to search");
                var idStudent = Integer.parseInt(scanner.nextLine());
                var student = new Student(idStudent);
                var found = daoStudent.searchStudentById(student);
                if(found)
                    System.out.println("Student Found: " + student);
                else
                    System.out.println("The student has not been found.");
            } // End of case 2
            case 3 -> {
                System.out.println("Add a Student: ");
                System.out.println("Name: ");
                var name = scanner.nextLine();
                System.out.println("Lastname: ");
                var lastName = scanner.nextLine();
                System.out.println("Phone: ");
                var phone = scanner.nextLine();
                System.out.println("Email: ");
                var email = scanner.nextLine();

                var student = new Student(name, lastName, phone, email);
                var added = daoStudent.addStudent(student);
                if (added)
                    System.out.println("Student added: " + student);
                else
                    System.out.println("Student has not been added");
            }
            case 4 -> {
                System.out.println("Update Student: ");
                System.out.println("ID Student: ");
                var idStudent = Integer.parseInt(scanner.nextLine());
                System.out.println("Name: ");
                var name = scanner.nextLine();
                System.out.println("Lastname: ");
                var lastName = scanner.nextLine();
                System.out.println("Phone: ");
                var phone = scanner.nextLine();
                System.out.println("Email: ");
                var email = scanner.nextLine();

                var student = new Student(idStudent ,name, lastName, phone, email);
                var updated = daoStudent.updateStudent(student);
                if (updated)
                    System.out.println("Student updated: " + student);
                else
                    System.out.println("Student has not been updated.");
            }
            case 5 -> {
                System.out.println("Delete Student: ");
                System.out.println("ID Student: ");
                var idStudent = Integer.parseInt(scanner.nextLine());

                var student = new Student(idStudent);
                var deleted = daoStudent.deleteStudent(student);
                if (deleted)
                    System.out.println("Student deleted: " + student);
                else
                    System.out.println("Student has not been deleted");
            }
            case 6 -> {
                System.out.println("See you!");
                exit = true;
            }
            default -> System.out.println("Incorrect option. Please try again: ");
        }
        return exit;
    }
}



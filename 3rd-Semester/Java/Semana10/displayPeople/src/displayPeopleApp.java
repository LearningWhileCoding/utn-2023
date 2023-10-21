import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class displayPeopleApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Person> people = new ArrayList<>();

        var exit = false;

        while(!exit) {
            displayMenu();

            try {
                exit = executeOperation(sc, people);
            } catch (Exception e) {
                System.out.println("There was an error: " + e.getMessage());
            }
        }
    } // End of main method

    private static void displayMenu() {
        System.out.print("""
                ***** Display People *****
                1. Add
                2. Display
                3. Exit
                """);
        System.out.print    ("Enter an option: ");
    }

    private static boolean executeOperation(Scanner sc, List<Person> people) {
        var option = Integer.parseInt(sc.nextLine());
        var exit = false;

        //Check the option through a swtich
        switch (option) {

            // Add
            case 1 -> {
                System.out.print("Enter the name: ");
                var name = sc.nextLine();
                System.out.print("Enter the phone: ");
                var phone = sc.nextLine();
                System.out.print("Enter the email: ");
                var email = sc.nextLine();
                people.add(new Person(name, phone, email));
                System.out.println("The list has: " + people.size() + " elements.");
            }

            // Display People
            case 2 -> {
                System.out.println("Directory of People: ");
                // Lambda fn
                //people.forEach(person -> System.out.println(person));

                // Reference method
                people.forEach(System.out::println);
            }

            case 3 -> {
                System.out.println("***** Goodbye *****");
                exit = true;
            }

            default -> {
                System.out.println("Incorrect option.");
            }
        } // End of switch
        return exit;
    }

}

package utn.students;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.students.models.Students;
import utn.students.service.ServiceStudent;

import java.util.List;
import java.util.Scanner;


@SpringBootApplication
public class StudentsApplication implements CommandLineRunner {

	@Autowired
	private ServiceStudent serviceStudent;
	private static final Logger logger = LoggerFactory.getLogger(StudentsApplication.class);

	String nl = System.lineSeparator();

	public static void main(String[] args) {
		logger.info("Starting the App...");
		SpringApplication.run(StudentsApplication.class, args); // Spring Factory
		logger.info("App Stopped.");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info(nl + "Executing the run method of spring..." + nl);
		var exit = false;
		var scanner = new Scanner(System.in);
		while(!exit) {
			displayMenu();
			exit = executeOptions(scanner);
			logger.info(nl);
		} // End of While Loop
	}

	private void displayMenu() {
		logger.info(nl);
		logger.info("""
				* * * * * Students System * * * * *
				1. Display Students
				2.Search Student
				3.Add Student
				4. Update Student
				5. Delete Student
				6. Exit
				Input an option:	
				""");
	} // End of displayMenu method

	private boolean executeOptions(Scanner scanner) {
		var option = Integer.parseInt(scanner.nextLine());
		var exit = false;
		switch (option) {
			case 1 -> {
				logger.info(nl + "Students List" + nl);
				List<Students> students = serviceStudent.getStudents();
				students.forEach((student -> logger.info(student.toString() + nl)));
			}
			case 2 -> {
				logger.info(nl + "Input the ID of the Student" + nl);
				var idStudent = Integer.parseInt(scanner.nextLine());
				Students student = serviceStudent.searchStudentById(idStudent);
				if(student != null) {
					logger.info("Student Found: " + student + nl);
				} else {
					logger.info("Student not found!");
				}
			}
			case 3 -> {
				logger.info("Add Student" + nl);
				logger.info("Name: ");
				var name = scanner.nextLine();
				logger.info("Lastname: ");
				var lastname = scanner.nextLine();
				logger.info("Phone: ");
				var phone = scanner.nextLine();
				logger.info("Email: ");
				var email = scanner.nextLine();
				var student = new Students();
				student.setName(name);
				student.setLastname(lastname);
				student.setPhone(phone);
				student.setEmail(email);
				serviceStudent.saveStudent(student);
				logger.info("Student added: " + student + nl);
			}
			case 4 -> {
				logger.info("Update Student" + nl);
				logger.info("Input the ID: ");
				var idStudent = Integer.parseInt(scanner.nextLine());

				Students student = serviceStudent.searchStudentById(idStudent);

				if(student != null) {
					logger.info("Name: ");
					var name = scanner.nextLine();
					logger.info("Lastname: ");
					var lastname = scanner.nextLine();
					logger.info("Phone: ");
					var phone = scanner.nextLine();
					logger.info("Email: ");
					var email = scanner.nextLine();
					student.setName(name);
					student.setLastname(lastname);
					student.setPhone(phone);
					student.setEmail(email);
					serviceStudent.saveStudent(student);
					logger.info("Student updated: " + student + nl);
				} else {
					logger.info("Student not found with the ID: " + idStudent + nl);
				}

			}
			case 5 -> {
				logger.info("Delete Student" + nl);
				logger.info("Input the ID: ");
				var idStudent = Integer.parseInt(scanner.nextLine());

				Students student = serviceStudent.searchStudentById(idStudent);

				if(student != null) {
					serviceStudent.deleteStudent(student);
					logger.info("Student deleted: " + student + nl);
				} else {
					logger.info("Student not found with the ID: " + idStudent + nl);
				}
			}
			case 6 -> {
				logger.info("Bye Bye !");
				exit = true;
			}
		} // End of switch

		return exit;
	} // End of executeOptions method
}

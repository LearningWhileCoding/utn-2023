package utn.students;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import utn.students.service.ServiceStudent;


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
	}
}

package in.akashpatel.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.akashpatel.sms.entity.Student;
import in.akashpatel.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

//	@Autowired
//	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

	}

}

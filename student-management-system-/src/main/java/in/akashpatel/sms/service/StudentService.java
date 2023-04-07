package in.akashpatel.sms.service;

import java.util.List;

import in.akashpatel.sms.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student saveStudent(Student studentt);

	Student getStudentById(Long id);

	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}

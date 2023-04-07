package in.akashpatel.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.akashpatel.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}

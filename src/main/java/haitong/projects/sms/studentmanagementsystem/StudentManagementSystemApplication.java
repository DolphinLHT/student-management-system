package haitong.projects.sms.studentmanagementsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import haitong.projects.sms.studentmanagementsystem.entity.Student;
import haitong.projects.sms.studentmanagementsystem.repository.StudentRepository;



@SpringBootApplication
public class StudentManagementSystemApplication<Private> implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
		/*
		 * Student student1 = new Student("Haitong", "Liu","12345@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
		 * studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Tony", "Stark", "tony@gmail.com");
		 * studentRepository.save(student3);
		 */
    }


}

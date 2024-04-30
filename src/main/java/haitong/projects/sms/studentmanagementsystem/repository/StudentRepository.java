package haitong.projects.sms.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import haitong.projects.sms.studentmanagementsystem.entity.Student;


public interface StudentRepository extends JpaRepository<Student, Long>{
    
}

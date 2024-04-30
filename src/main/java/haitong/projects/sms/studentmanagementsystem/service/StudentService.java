package haitong.projects.sms.studentmanagementsystem.service;

import java.util.List;

import haitong.projects.sms.studentmanagementsystem.entity.Student;

public interface StudentService {

    List<Student> findAll();

    Student saveStudent(Student student);

    Student findStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}

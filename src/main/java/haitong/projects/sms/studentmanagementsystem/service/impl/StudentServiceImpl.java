package haitong.projects.sms.studentmanagementsystem.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import haitong.projects.sms.studentmanagementsystem.entity.Student;
import haitong.projects.sms.studentmanagementsystem.repository.StudentRepository;
import haitong.projects.sms.studentmanagementsystem.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);

    }

}

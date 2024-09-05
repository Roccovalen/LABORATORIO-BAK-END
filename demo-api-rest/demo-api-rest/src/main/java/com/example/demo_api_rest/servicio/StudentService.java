package com.example.demo_api_rest.servicio;

import com.example.demo_api_rest.entily.Student;
import com.example.demo_api_rest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    //findAll
    public List<Student> findAll(){
        return studentRepository.findAll();
    }

    //findById
    public Student findById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    //save
    public Student save(Student student){
        return studentRepository.save(student);
    }

    //update
    public Student studentUpdate(Long id, Student student){
        Student studentUpdate = findById(id);
        if (studentUpdate == null) {
            return null;
        }else {
            studentUpdate.setName(student.getName());
            studentUpdate.setCourse(student.getCourse());
            studentRepository.save(studentUpdate);
            return studentUpdate;
        }
    }

    //delete
    public void studentDelete(Long id){
        Student studentToDelete = findById(id);
        if (studentToDelete != null) {
            studentRepository.delete(studentToDelete);
        }
    }
}

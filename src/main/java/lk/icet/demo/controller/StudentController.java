package lk.icet.demo.controller;

import lk.icet.demo.entity.Student;
import lk.icet.demo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentRepo repo;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        Student save=repo.save(student);
        return save;
    }

    @GetMapping
    public List<Student> getStudent(){
        return repo.findAll();
    }
}

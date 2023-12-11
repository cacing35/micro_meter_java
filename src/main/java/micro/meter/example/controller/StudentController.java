package micro.meter.example.controller;

import io.micrometer.core.annotation.Timed;
import micro.meter.example.model.StudentResponse;
import micro.meter.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
@Timed
public class StudentController {

    @Autowired
    private StudentService studentService;



    @GetMapping("/getall")
    public List<StudentResponse> getAllStudent(){
        List<StudentResponse> responses = studentService.getAllStudent();
        if(responses.size() > 0){
            return responses;
        }
        studentService.seedingData();
        return studentService.getAllStudent();

    }

    @GetMapping("/geterror")
    public List<StudentResponse> getAllStudentError() throws Exception {
        if(true){
            throw new Exception("di paksa error nih bos");
        }
        return studentService.getAllStudent();
    }

    @PostMapping
    public String saveStudent(@RequestBody StudentResponse studentResponse){
         studentService.addStudent(studentResponse);
         return "Success";
    }
}

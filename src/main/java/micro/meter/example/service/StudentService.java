package micro.meter.example.service;

import micro.meter.example.model.StudentResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class StudentService {
    private static List<StudentResponse> listData = new ArrayList<>();

    public List<StudentResponse> getAllStudent(){
        return  listData;
    }

    public void seedingData(){
       listData.add(StudentResponse.builder().id(new Random().nextInt()).gender("M").firstName("seeding 1").lastName("last name 1").classRoom("assasin-1").build());
        listData.add(StudentResponse.builder().id(new Random().nextInt()).gender("W").firstName("seeding 2").lastName("last name 2").classRoom("priest-1").build());
        listData.add(StudentResponse.builder().id(new Random().nextInt()).gender("M").firstName("seeding 3").lastName("last name 3").classRoom("assasin-1").build());
    }

    public void addStudent(StudentResponse student){
        listData.add(student);
    }
}

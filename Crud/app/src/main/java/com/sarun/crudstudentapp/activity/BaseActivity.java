package com.sarun.crudstudentapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import com.sarun.crudstudentapp.models.Province;
import com.sarun.crudstudentapp.models.Student;

import java.util.ArrayList;
import java.util.List;


public class BaseActivity extends AppCompatActivity {
    protected List<Student> studentList = new ArrayList<>();
    protected List<Province> provinceList = new ArrayList<>();

    protected Student getStudentById(int id){
        Student student = new Student();
        for (Student data : studentList){
            if (data.getId()==id){
                student = data;
            }
        }
        return student;
    }

    protected  List<Student> getAllStudents(){
        if (studentList.isEmpty()){
            Student student = new Student();
            student.setId(studentList.size()+1);
            student.setFirstName("SaSa");
            student.setLastName("dara");
            student.setGender("Male");
            student.setProvince(String.valueOf(new Province(1,"")));
            student.setAddress("Phmom Penh");
            student.setPhoneNumber("0345678");
            studentList.add(student);
        }
        return studentList;
    }
}

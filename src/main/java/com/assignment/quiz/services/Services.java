package com.assignment.quiz.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.quiz.connect.coursedao;
import com.assignment.quiz.entity.courses;

@Service
public class Services {
    @Autowired
    private coursedao courseRepo;


    // to get all the courses
    public List<courses> getAll(){
        return courseRepo.findAll();
    }

    //to get a particular course by matching the Id
    public courses getById(long id){
        courses course = null;
        try {
            course = courseRepo.findById(id);    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return course;
    }
    //to delete a row
    public String delete(long id){
        try {
            courseRepo.deleteById(id);
            return "done";
        } catch (Exception e) {
            return "no such entity";
        }
        
    }
    // to add a row 
    public String add(courses course){
        try {
            this.courseRepo.save(course);
            return "row added";
        } catch (Exception e) {
            return e.toString();
        }
    }

    // to update an existing record
    public String update(long id, courses course){
        try {
            courses mycourse = courseRepo.findById(id);
            mycourse.setName(course.getName());
            mycourse.setAnswers(course.getAnswers());
            mycourse.setRightAnswer(course.getRightAnswer());
            mycourse.setQuestion(course.getQuestion());

            courseRepo.save(mycourse);
            return "updated";
        } catch (Exception e) {
            return e.toString();
        }
    }
}

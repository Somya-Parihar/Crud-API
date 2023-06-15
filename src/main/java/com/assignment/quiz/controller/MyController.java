package com.assignment.quiz.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.quiz.connect.coursedao;
import com.assignment.quiz.entity.courses;
import com.assignment.quiz.services.Services;


@RestController // to make this class a controller
public class MyController {
    @Autowired
    private Services service;
    @GetMapping("/home")
    public String home() {
        return "somya";
    }
    @GetMapping("/trial")
    public List<courses> getall(){
        return service.getAll();
        
    }
    @PostMapping("/add")
    public String add(@RequestBody courses course){
        return service.add(course);
    }
    @GetMapping("/trial/{id}")
    public courses search(@PathVariable("id") long id){
        return service.getById(id); 
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id){
        return service.delete(id);
    }
    @PutMapping("/update/{id}")
    public String update(@PathVariable("id") long id , @RequestBody courses course){
        
        return service.update(id , course);
    }
}

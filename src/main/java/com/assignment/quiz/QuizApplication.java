package com.assignment.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assignment.quiz.connect.coursedao;
import com.assignment.quiz.entity.courses;

@SpringBootApplication
public class QuizApplication
implements CommandLineRunner {
@Autowired coursedao ob;
public static void main(String[] args)
{
    SpringApplication.run(QuizApplication.class, args);
}

@Override
public void run(String... args) throws Exception
{
    // Inserting the data in the mysql table.
    courses first = new courses(1, "Aayush", null, "args", 0);
    // ob.save() method
    ob.save(first);
}
}

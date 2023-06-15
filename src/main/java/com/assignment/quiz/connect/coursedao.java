package com.assignment.quiz.connect;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.assignment.quiz.entity.*;


public interface coursedao extends CrudRepository<courses , Long> {
	courses findById(long id);
    List<courses> findAll();
}

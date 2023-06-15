package com.assignment.quiz.entity;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;

@Entity
@Table(name = "detail")
public class courses {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String question;
	private String name;
	private String answers;
	private long rightAnswer;
	public courses(long id, String question, String name, String args, long rightAnswer) {
		super();
		this.id = id;
		this.question = question;
		this.name = name;
		this.answers = args;
		this.rightAnswer = rightAnswer;
	}
	public courses() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public long getRightAnswer() {
		return rightAnswer;
	}
	public void setRightAnswer(long rightAnswer) {
		this.rightAnswer = rightAnswer;
	}
	
}

package com.course.tutorial.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class Example {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String input;
	private String output;
	private String howtorun;
	private String description;
	private String exampleTitle;
	private Integer subtopicID;
	/**
	 * @return the input
	 */
	public String getInput() {
		return input;
	}
	/**
	 * @param input the input to set
	 */
	public void setInput(String input) {
		this.input = input;
	}
	/**
	 * @return the output
	 */
	public String getOutput() {
		return output;
	}
	/**
	 * @param output the output to set
	 */
	public void setOutput(String output) {
		this.output = output;
	}
	/**
	 * @return the howtorun
	 */
	public String getHowtorun() {
		return howtorun;
	}
	/**
	 * @param howtorun the howtorun to set
	 */
	public void setHowtorun(String howtorun) {
		this.howtorun = howtorun;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the exampleTitle
	 */
	public String getExampleTitle() {
		return exampleTitle;
	}
	/**
	 * @param exampleTitle the exampleTitle to set
	 */
	public void setExampleTitle(String exampleTitle) {
		this.exampleTitle = exampleTitle;
	}
	/**
	 * @return the subtopicID
	 */
	public Integer getSubtopicID() {
		return subtopicID;
	}
	/**
	 * @param subtopicID the subtopicID to set
	 */
	public void setSubtopicID(Integer subtopicID) {
		this.subtopicID = subtopicID;
	}
	/**
	 * @param input
	 * @param output
	 * @param howtorun
	 * @param description
	 * @param exampleTitle
	 * @param subtopicID
	 */
	public Example(String input, String output, String howtorun, String description, String exampleTitle,
			Integer subtopicID) {
		super();
		this.input = input;
		this.output = output;
		this.howtorun = howtorun;
		this.description = description;
		this.exampleTitle = exampleTitle;
		this.subtopicID = subtopicID;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	
	
}

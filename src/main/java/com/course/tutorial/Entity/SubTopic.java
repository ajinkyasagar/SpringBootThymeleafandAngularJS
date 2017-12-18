package com.course.tutorial.Entity;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



public class SubTopic {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private String heading;
    private String title;
    private String preRequisite;
    @OneToMany
    @ElementCollection(targetClass=Example.class)
    private java.util.List<Example> examples;
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
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the heading
	 */
	public String getHeading() {
		return heading;
	}
	/**
	 * @param heading the heading to set
	 */
	public void setHeading(String heading) {
		this.heading = heading;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the preRequisite
	 */
	public String getPreRequisite() {
		return preRequisite;
	}
	/**
	 * @param preRequisite the preRequisite to set
	 */
	public void setPreRequisite(String preRequisite) {
		this.preRequisite = preRequisite;
	}
	/**
	 * @return the examples
	 */
	public java.util.List<Example> getExamples() {
		return examples;
	}
	/**
	 * @param examples the examples to set
	 */
	public void setExamples(java.util.List<Example> examples) {
		this.examples = examples;
	}
    
}

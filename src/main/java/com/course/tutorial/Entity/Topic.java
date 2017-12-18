package com.course.tutorial.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="topic")
public class Topic {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	 @Column(name="TOPIC_ID")
	private Long id;
    private String name;
    private String description;
    @ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="COURSE_ID")
    private Course course;
	/**
	 * @param name
	 * @param description
	 * @param course
	 */
	public Topic(String name, String description, Course course) {
		super();
		this.name = name;
		this.description = description;
		this.course = course;
	}
	/**
	 * 
	 */
	public Topic() {
		super();
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
	 * @return the course
	 */
	@ManyToOne
	@JoinColumn(name="COURSE_ID")
	public Course getCourse() {
		return course;
	}
	/**
	 * @param course the course to set
	 */
	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
    public String toString() {
        return String.format(
                "Topic[id=%d, name='%s', desc='%s']",
                id, name, description)+course.toString();
    }
    
    
}

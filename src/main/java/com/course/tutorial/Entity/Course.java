/**
 * 
 */
package com.course.tutorial.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author admin
 *
 */
@Entity
@Table(name="course")
public class Course {

	 	@Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
	 	 @Column(name="COURSE_ID")
	 	private Long id;
	    private String name;
	    private String description;
	    @ElementCollection(targetClass=Topic.class)
	    @OneToMany(mappedBy="course",cascade=CascadeType.ALL)
	    @Column(name="TOPIC_ID")
	    private Set<Topic> topics;
	    
	    
		/**
		 * @param id
		 */
		public Course(Long id) {
			super();
			this.id = id;
		}


		public Course() {
			super();
			// TODO Auto-generated constructor stub
		}


		/**
		 * @param name
		 * @param description
		 */
		public Course(String name, String description) {
			super();
			this.name = name;
			this.description = description;
		}

		

		/**
		 * @param id
		 * @param name
		 * @param description
		 * @param topics
		 */
		public Course(Long id, String name, String description, Set<Topic> topics) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.topics = topics;
		}

		
		

		/**
		 * @param id
		 * @param name
		 * @param description
		 */
		public Course(Long id, String name, String description) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
		}


		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return  String.format(
	                "Course[id=%d, name='%s', description='%s']",
	                id, name, description);
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getDescription() {
			return description;
		}


		public void setDescription(String description) {
			this.description = description;
		}


		/**
		 * @return the topics
		 */
		@OneToMany(mappedBy="course",cascade=CascadeType.ALL)
		public Set<Topic> getTopics() {
			return topics;
		}


		/**
		 * @param topics the topics to set
		 */
		public void setTopics(Set<Topic> topics) {
			this.topics = topics;
		}
	    

}

package com.bezkoder.spring.test.model;

import javax.persistence.*;

@Entity
@Table(name = "tutorials")
public class Tutorial {

  @Id
 // @GeneratedValue(strategy = GenerationType.AUTO)
  private String name;

  @Column(name = "title")
  private String title;

  @Column(name = "description")
  private String description;

  @Column(name = "published")
  private boolean published;

  public Tutorial() {

  }

  public Tutorial(String name,String title, String description, boolean published) {
    this.name=name;
	this.title = title;
    this.description = description;
    this.published = published;
  }


  public String getName() {
    return name;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isPublished() {
    return published;
  }

  public void setPublished(boolean isPublished) {
    this.published = isPublished;
  }

  @Override
  public String toString() {
    return "Tutorial [name=" + name + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
  }

}

package net.book_devcontainer.todolist.api.repository;

import java.time.ZonedDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity // This tells Hibernate to make a table out of this class
public class SNATTest {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private ZonedDateTime createdOn;

  private ZonedDateTime updatedOn;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public ZonedDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(ZonedDateTime createdOn) {
    this.createdOn = createdOn;
  }

  public ZonedDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(ZonedDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

}

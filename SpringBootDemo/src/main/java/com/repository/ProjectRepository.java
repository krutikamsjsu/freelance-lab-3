package com.repository;

import com.entity.Bid;
import com.entity.Project;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository

public interface ProjectRepository extends CrudRepository<Project, Long> {
	
	@Query("select p.project_id, p.description, u.name, p.employer_id, p.title, p.avg_bid, p.project_completion_date, p.status, p.skills  FROM freelancer_prototype_db.project p , freelancer_prototype_db.user u where p.employer_id = u.user_id and p.status = 'Open'") 
	public List<Object> getAllOpenProjects();
	
	@Query("select p.project_id, u.user_id, p.title, p.avg_bid, u.name, p.project_completion_date, p.status FROM freelancer_prototype_db.project p , freelancer_prototype_db.user u where p.employer_id = u.user_id and p.status = 'Open' and u.user_id = :user_id")
	public List<Object> listOfAllProjectsPostedByEmployer(@Param("user_id") Integer user_id);
	
	public Project findByProject_Id(Integer project_id);
	
	@Query("update project set user_id = : user_id where project_id = :project_id")
	public void hireFreelancer(@Param("user_id") Integer user_id, @Param("") Integer project_id);
}
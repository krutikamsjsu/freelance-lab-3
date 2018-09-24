package com.repository;

import com.entity.Bid;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository

public interface BidRepository extends CrudRepository<Bid, Long> {
    
	public List<Bid> findByUser_idAndProject_id(Integer user_id, Integer project_id);
	
	@Query("select u.user_id, b.project_id,  u.name, b.bid_price, b.period_in_days FROM user u, bid b where b.user_id = u.user_id and b.project_id = :project_id")
	public List<Object> getBids(@Param("project_id") Integer project_id);
	
	@Query("select count(*) as numberOfBids from bid b where b.project_id= :project_id")
	public Integer getBidsCount(@Param("project_id") Integer project_id);
	
	@Query("select u.user_id, b.project_id, u.profile_image, u.name, b.bid_price, b.period_in_days from freelancer_prototype_db.user u, freelancer_prototype_db.bid b where b.user_id = u.user_id and b.project_id = = :project_id")
	public List<Object> listOfAllBidsForProject(@Param("project_id") Integer project_id);
	
	@Query("select p.project_id, u.user_id, p.title, u.name, p.avg_bid, b.bid_price,p.status from freelancer_prototype_db.bid b, freelancer_prototype_db.project p, freelancer_prototype_db.user u where b.project_id = p.project_id and p.status = 'Open' and u.user_id = b.user_id and b.user_id = :user_id")
	public List<Object> listOfAllProjectUserHasBidOn(@Param("user_id") Integer user_id);
}
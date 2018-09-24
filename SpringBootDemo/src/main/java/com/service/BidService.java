package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Bid;
import com.repository.BidRepository;

@Service
public class BidService {
    @Autowired
    private BidRepository bidRepository;
    
    public void addBid(Bid bid){
    	List<Bid> list = bidRepository.findByUser_idAndProject_id(bid.getUser_id(), bid.getProject_id()); 	
        if (list.size() == 0 ) {           
        	bidRepository.save(bid);
        }
    }
}
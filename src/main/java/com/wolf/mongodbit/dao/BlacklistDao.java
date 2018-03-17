package com.wolf.mongodbit.dao;

import com.wolf.mongodbit.entity.mongodb.Blacklist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Repository方式
 */
public interface BlacklistDao extends MongoRepository<Blacklist,String>{
    Blacklist findByuserid(String userId);
}

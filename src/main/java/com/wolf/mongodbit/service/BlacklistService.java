package com.wolf.mongodbit.service;

import com.wolf.mongodbit.entity.mongodb.Blacklist;

public interface BlacklistService {
    Blacklist findByuserid(String userId);
}

package com.wolf.mongodbit.entity.mongodb;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection="blacklist")
@Data
public class Blacklist {
    private ObjectId objectId;
    private String username;
    private String userid;
    private String blacktype;
    private String status;
    private Date update;
    private Date indate;
    private Address address;
    private Comments comments;
}

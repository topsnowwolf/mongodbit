package com.wolf.mongodbit.entity.mongodb;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Comments {
    private String cause;
    private String desc;
    private BigDecimal money;
}

package com.wolf.mongodbit.customException;

import com.wolf.mongodbit.customenum.BlackEnum;
import lombok.Data;

//特别注意，spring框架只对抛出的异常是RuntimeException的异常才事物回滚，对应Exception是事物不回滚的
@Data
public class BlacklistExcepton extends RuntimeException {
    private String code;
    private String msg;
    public BlacklistExcepton(BlackEnum blackEnum){
        super(blackEnum.getMsg());
        this.code = blackEnum.getCode();
        this.msg = blackEnum.getMsg();
    }
}

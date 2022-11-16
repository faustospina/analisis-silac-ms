package com.italcol.silac.exception;

import com.italcol.silac.common.NotificationCode;

import java.io.Serializable;

public class ItalcolBusinessException extends Exception implements Serializable {

    private final NotificationCode errorCode;

    public ItalcolBusinessException(NotificationCode errorCode){
        super(errorCode.getDescription());
        this.errorCode= errorCode;
    }
}

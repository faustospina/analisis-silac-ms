package com.italcol.silac.common;

import org.springframework.http.HttpStatus;

public enum NotificationCode {
    NOT_DATA_MATCH("NOT DATA MATCH", HttpStatus.INTERNAL_SERVER_ERROR),
    ARRAY_ANALISIS_EMPTY("NOT DATA UPLOAD IN MEMORY",HttpStatus.INTERNAL_SERVER_ERROR);


    private String description;
    private HttpStatus httpStatus;

    NotificationCode(String description, HttpStatus httpStatus) {
        this.description = description;
        this.httpStatus = httpStatus;
    }

    public String getDescription() {
        return description;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}

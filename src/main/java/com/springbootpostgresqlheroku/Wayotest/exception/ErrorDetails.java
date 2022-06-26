package com.springbootpostgresqlheroku.Wayotest.exception;

import java.util.Date;

public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String etails;

    
    public ErrorDetails(Date timestamp, String message, String etails) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.etails = etails;
    }
    public Date getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getEtails() {
        return etails;
    }
    public void setEtails(String etails) {
        this.etails = etails;
    }
}

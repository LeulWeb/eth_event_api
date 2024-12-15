package com.bishu.eth_event.exceptions;

import java.util.Date;

public class ErrorResponse {
    private int statusCode;
    private String message;
    private Date timeStamp;

    public ErrorResponse(Date timeStamp, String message, int statusCode) {
        this.timeStamp = timeStamp;
        this.message = message;
        this.statusCode = statusCode;
    }

    public ErrorResponse() {
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

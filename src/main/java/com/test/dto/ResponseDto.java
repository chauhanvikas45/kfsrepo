package com.test.dto;

import java.util.Map;

public class ResponseDto {

    private int status;
    private String message;
    private Map data;

    public ResponseDto(int status, String message, Map data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Map getData() {
        return data;
    }

    public void setData(Map data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "status:" + status +
                ", message:'" + message + '\'' +
                ", data:" + data +
                '}';
    }
}

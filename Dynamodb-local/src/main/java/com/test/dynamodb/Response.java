package com.test.dynamodb;

import java.util.Map;

public class Response {
    private String body;
    private Map<String, String> headers;
    private int statusCode;

    private String getBody(){
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, String> headers) {
        this.headers = headers;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}

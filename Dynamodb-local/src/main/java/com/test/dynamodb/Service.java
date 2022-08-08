package com.test.dynamodb;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Service {
    public Response getResponse(Request req){
        Response response = new Response();
        ObjectMapper mapper = new ObjectMapper();
        try {
            BasicUserInfo basicUserInfo = mapper.readValue(req.getBody(), BasicUserInfo.class);
            response.setBody(basicUserInfo.toString());
            response.setStatusCode(200);
        }
        catch (Exception e){
            response.setBody(e.getMessage());
            response.setStatusCode(500);
        }
        return response;
    }
}

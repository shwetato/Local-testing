package com.test.dynamodb;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Request,Response> {

    @Override
    public Response handleRequest(Request input, Context context) {
        System.out.println("in call");
        System.err.println();
        return new Service().getResponse(input);
    }
}

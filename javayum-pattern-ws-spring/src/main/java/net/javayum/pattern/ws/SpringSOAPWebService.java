package net.javayum.pattern.ws;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

// https://spring.io/guides/gs/producing-web-service/
@Endpoint
public class SpringSOAPWebService<Object> implements WebService {

    @Override
    @ResponsePayload
    public java.lang.Object execute(@RequestPayload java.lang.Object request) {

        java.lang.Object response;

        response = request;

        return response;
    }
}

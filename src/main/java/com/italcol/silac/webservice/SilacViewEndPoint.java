package com.italcol.silac.webservice;

import com.italcol.silac.exception.ItalcolBusinessException;
import com.italcol.silac.service.SilacViewService;
import io.spring.guides.italcol.producing_web_service.SilacRequest;
import io.spring.guides.italcol.producing_web_service.SilacResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class SilacViewEndPoint {

    private static final String NAMESPACE_URI = "http://spring.io/guides/italcol/producing-web-service";

    @Autowired
    private SilacViewService silacViewService;


    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SilacRequest")
    @ResponsePayload
    public SilacResponse getAnalitycsView(@RequestPayload SilacRequest request) {
        try {
            return silacViewService.getAnalitycsView(request.getNumSilac());
        } catch (ItalcolBusinessException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
}

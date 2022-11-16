package com.italcol.silac.controller;

import com.italcol.silac.exception.ItalcolBusinessException;
import com.italcol.silac.service.SilacViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/italcol/get")
@RestController
public class SilacViewController {

    @Autowired
    private SilacViewService service;


    @GetMapping(path = "/view", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseEntity<?> getAnalisisSilac(@RequestParam Integer numSilac) {

        try {
            return new ResponseEntity<>(service.getAnalitycsView(numSilac), HttpStatus.OK);
        } catch (ItalcolBusinessException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }
}

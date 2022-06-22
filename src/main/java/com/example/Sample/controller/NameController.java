package com.example.Sample.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class NameController {

    @RequestMapping(value = "/saveConfigProperties", method = RequestMethod.POST)
    public @ResponseBody ResponseEntity<String> getName() {
        String status = "Hello";
        return new ResponseEntity<String>(status, HttpStatus.OK);
    }
}

package com.example.estudos.controller;

import com.example.estudos.annotation.AllowAnnonymous;
import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @AllowAnnonymous
    @GetMapping(value = "/healthcheck")
    public String getHealthCheck(){
        return "200 ok";
    }

}

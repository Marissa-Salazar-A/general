package com.classicmodels2.controllers;

import com.classicmodels2.utils.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(UrlConstants.CLIENTE)
public class ClientController {

    @GetMapping("")
    public String goClient(){
        return "cliente";
    }
}

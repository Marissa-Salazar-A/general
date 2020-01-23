package com.classicmodels2.controllers;

import com.classicmodels2.utils.UrlConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by autozoner on 1/20/2020. solo manejara la vista el restcontrollers sera el q manejara los datos
 */

@Controller
@RequestMapping(UrlConstants.INDEX)
public class IndexController {

    public static final String INDEX = "";
    @GetMapping(path="")
    public String goIndex(){
        return "index";
    }



}

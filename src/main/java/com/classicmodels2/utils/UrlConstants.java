package com.classicmodels2.utils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by autozoner on 1/20/2020.
 */
@Controller
@RequestMapping(UrlConstants.INDEX)
public class UrlConstants {
    public static final String INDEX = "";
    public static final String CUSTOMER = "/cumsomer";

    public String goIndex(){
        return "index";
    }
}

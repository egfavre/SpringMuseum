package com.egfavre.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by user on 6/24/16.
 */
@Controller
public class MuseumController {
    @RequestMapping (path="/", method= RequestMethod.GET)
    public String home (HttpSession session){
        return "home";
    }
}

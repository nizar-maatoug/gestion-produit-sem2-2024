package org.isetbizerte.gestionproduits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(path={"/","/home","/index"})
    public String home(){
        return "index";
    }
}

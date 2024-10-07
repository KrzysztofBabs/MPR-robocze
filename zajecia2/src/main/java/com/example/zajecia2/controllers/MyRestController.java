package com.example.zajecia2.controllers;

import com.example.zajecia2.model.Auto;
import com.example.zajecia2.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class MyRestController {
    @Autowired
    private AutoService autoService;


    public MyRestController(AutoService autoService) {
        this.autoService = autoService;
    }
    //    @RequestMapping(method = RequestMethod.GET, value = "auto/")

    //    public Auto getAuto(){
//    }
    @GetMapping("/auto/all")
    public List<Auto> getAll() {
        return autoService.getAll();
    }

    @PostMapping("/auto")
    public void addAuto(@RequestBody Auto auto) {
        autoService.add(auto);
    }


}

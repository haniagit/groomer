package com.example.groomer.controller;

import com.example.groomer.dao.GroomerDao;
import com.example.groomer.model.Groomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GroomerController {

    @Autowired
    private GroomerDao groomerDao;

    @GetMapping("/")
    public String homePage(){
        return "home";
    }

    @GetMapping("groomer/add")
    public String addGroomer(){
        return "groomer/add";
    }

    @PostMapping("groomer/add")
    public String createGroomer(@ModelAttribute Groomer groomer){
        groomerDao.save(groomer);
        return "success";
    }
}

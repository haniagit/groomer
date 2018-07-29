package com.example.groomer.controller;

import com.example.groomer.dao.ClientDao;
import com.example.groomer.dao.GroomerDao;
import com.example.groomer.model.Client;
import com.example.groomer.model.Groomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class AppController {

    @Autowired
    private GroomerDao groomerDao;

    @Autowired
    private ClientDao clientDao;

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("groomer/add")
    public String addGroomer(ModelMap modelMap) {
        modelMap.addAttribute("groomer", new Groomer());
        return "groomer/add";
    }

    @PostMapping("groomer/add")
    public String createGroomer(@ModelAttribute Groomer groomer) {
        groomerDao.save(groomer);
        return "success";
    }

    @GetMapping("client/add")
    public String addClient(ModelMap modelMap) {
        modelMap.put("client", new Client());
        modelMap.put("groomer", groomerDao.findAll());
        return "client/add";
    }

    @PostMapping("client/add")
    public String createClient(@ModelAttribute Client client, ModelMap modelMap) {
        clientDao.save(client);
        modelMap.put("clients", client);
        return "success";
    }

    @GetMapping("groomers")
    public String showAllGroomers(ModelMap modelMap){
        modelMap.addAttribute("groomers", groomerDao.findAll());
        return "groomers";
    }

}


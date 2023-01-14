package com.SpringApplication.SpringApp.controller;


import com.SpringApplication.SpringApp.model.FirstModel;
import com.SpringApplication.SpringApp.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/firstController")
public class FirstController {
    @Autowired
   private FirstService firstService;

    @GetMapping("/test")
    public String test()
    {
        return "Test method";
    }

    @PostMapping("/model")
    public String model(@RequestBody FirstModel model){
        this.firstService.saveData(model);
        return "success";
    }

}

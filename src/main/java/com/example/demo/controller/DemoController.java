package com.example.demo.controller;

import com.example.demo.sevice.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    DemoService demoService;

    @GetMapping
    public List<Integer> getDemos(){
        return demoService.getNumber();
    }
}

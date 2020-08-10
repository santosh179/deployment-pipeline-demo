package com.san.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/release")
public class PipelineDemoController {

    @RequestMapping("/greet")
    public String sayHello(){
        return "Hello, Santosh";
    }
}

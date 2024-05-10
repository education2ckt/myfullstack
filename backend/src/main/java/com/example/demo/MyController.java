package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MyController {


    @Value("${databasename}")
    private String userBucketPath;

    @RequestMapping("/")
    @ResponseBody    
    public String test() {        
        return
                "<h1>Hello[" + userBucketPath + "]</h1>";
    }
    
}

package org.itheima.springboot.firstspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @RequestMapping
    public String Hello() {
        return "Hello World Springboot 2.6.4";
    }
}
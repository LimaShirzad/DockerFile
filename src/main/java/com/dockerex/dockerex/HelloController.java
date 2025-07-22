package com.dockerex.dockerex;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public  String SayHello()
    {

        return "Hello from docker";

    }
    public  String TestCi()
    {
                return  "Hello i make khbla da err for practice to poha shm :)"
    }



}

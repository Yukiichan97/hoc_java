package org.example.hoc_java;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hichat")
    public String index(){
        return "asaas6768967978dadadasd";
    }
}

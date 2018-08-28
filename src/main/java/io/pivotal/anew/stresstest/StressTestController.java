package io.pivotal.anew.stresstest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StressTestController {

    @RequestMapping("/")
    public String hello(){
        return "Hello, World!";
    }

}

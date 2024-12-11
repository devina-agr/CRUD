package org.spring.web_springproject.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
//    @ResponseBody
    public String greet() {

       return "Hello, Its Devina here!";
    }

    @RequestMapping("/about")
    public String about() {
        return "Computer Science Engineering!";
    }
}

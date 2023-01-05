package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//git commit practice
@RestController
public class HelloController {

    //request mapping
    @RequestMapping("/hello")
    public String sayHi(){
        return "Hii";
    }

}

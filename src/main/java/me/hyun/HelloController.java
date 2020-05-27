package me.hyun;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello" + helloService.getName();
    }

    @GetMapping("/sample")
    public String sample(){ /*ResponseBody가 없으므로 view 요청*/
        return "sample";
    }
}

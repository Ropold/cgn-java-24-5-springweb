package ropold.cgnjava245springweb;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/hello")

public class HelloController {

//    @GetMapping
//    public String hello() {
//        return "huhu";
//    }

    @GetMapping
    public void hello(){
        System.out.println("hihi");
    }


}

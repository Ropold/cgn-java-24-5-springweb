package ropold.cgnjava245springweb;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")

public class HelloController {

    @GetMapping
    public void hello(){
        System.out.println("hihi");
    }

    @GetMapping("{name}")
    public String sayName(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

//    @GetMapping("/{name}")
//    public String sayName(@PathVariable String name, @RequestParam String search) {
//        System.out.println(name);
//        System.out.println(search);
//        return "Hallo: " + name + " search: " + search;
//    }
}

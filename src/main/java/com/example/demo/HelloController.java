package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

   /* @Value("${cupSize}")
    private String cupSize;

    @Value("${age}")
    private  Integer age;*/
    @Autowired
    private girllpl girllpl;

    //@RequestMapping(value = {"/hello","/hi"}, method = RequestMethod.GET)
    @GetMapping(value = {"/hello","/hi"})
    public String say(@RequestParam (value = "id",required = false,defaultValue = "0")Integer myid){
        //return girllpl.getCupSize();
        return "id:" + myid;
    }
}

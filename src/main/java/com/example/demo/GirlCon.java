package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GirlCon {
    @Autowired
    private Girlexe girlexe;


    @RequestMapping(value = "/girl")
    public List<Girl> girlList(){
        return girlexe.findAll();
    }

    @PostMapping(value = "/girl")
    public Girl girladd(@RequestParam("cupSize") String cupSize,
            @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlexe.save(girl);
    }

    @GetMapping(value = "/girl/{id}")
    public Optional<Girl> girlfind(@PathVariable("id") Integer id){
        return girlexe.findOne(id);
    }

    @PutMapping(value = "girl/{id}")
    public Girl girlput(@PathVariable("id") Integer id,
    @RequestParam("cupSize") String cupSize,@RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlexe.save(girl);
    }

   /* @DeleteMapping(value = "gril/{id}")
    public void grildelete(@PathVariable("id") Integer id){
       girlexe.delete(id);
    }*/
}

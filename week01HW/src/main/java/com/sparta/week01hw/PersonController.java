package com.sparta.week01hw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @GetMapping("/myinfo")
    public Person getPerson(){
        Person person = new Person();
        person.setName("zogak");
        person.setAge(24);
        person.setJob("developer");

        return person;
    }
}

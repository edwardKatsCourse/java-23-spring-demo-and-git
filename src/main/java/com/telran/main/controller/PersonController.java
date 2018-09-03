package com.telran.main.controller;

import com.telran.main.model.Person;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    private static List<Person> people = new ArrayList<>();


    //@PathVariable => /persons/{variable}
    //@RequestParams => /persons?first-name=Peter

    //http://10.0.0.23:8080
    //http://127.0.0.1:8080 - not sure?

    //http://localhost:8080/persons
    @GetMapping("/persons")
    public Person getPerson(@RequestParam("first-name") String firstName,
                            @RequestParam("last-name") String lastName) {

        Person person = new Person(people.size() + 1, firstName, lastName, LocalDateTime.now());
        people.add(person);

        return person;
    }

    /**
     * @RequestBody
     * {
     *     "firstName": "Ilya",
     *     "lastName": "Ivanov"
     * }
     */
    @PostMapping("/persons")
    public Person createPerson(@RequestBody Person person) {
        person.setCreatedOn(LocalDateTime.now());
        person.setId(people.size() + 1);
        people.add(person);

        return person;
    }

    @GetMapping("/persons/all")
    public List<Person> getAll() {
        return people;
    }
}

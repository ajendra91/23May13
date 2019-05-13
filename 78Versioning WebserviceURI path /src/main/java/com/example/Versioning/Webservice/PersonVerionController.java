package com.example.Versioning.Webservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PersonVerionController {

    // 1) URI versioning

    // v1
    @GetMapping("/person/v1")
    public PersonV1 getPersonV1() {
        return new PersonV1("Mohit");
    }

    // v2
    @GetMapping("/person/v2")
    public PersonV2 getPersonV2() {
        return new PersonV2("Mohit", "Malhotra");
    }

}

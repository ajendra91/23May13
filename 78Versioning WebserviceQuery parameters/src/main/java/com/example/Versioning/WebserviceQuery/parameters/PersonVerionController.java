package com.example.Versioning.WebserviceQuery.parameters;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PersonVerionController {

    // 2) Param versioning

    @GetMapping(value = "/person/param", params = "version=1")
    public PersonV1 getPersonParam1() {
        return new PersonV1("Mohit");
    }

    @GetMapping(value = "/person/param", params = "version=2")
    public PersonV2 getPersonParam2() {
        return new PersonV2("Mohit", "Malhotra");
    }

}

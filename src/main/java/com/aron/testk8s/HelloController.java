package com.aron.testk8s;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping
    public ResponseEntity<String> helloFlavius () {
        return ResponseEntity.ok("Hello Flavius!:)");
    }
}

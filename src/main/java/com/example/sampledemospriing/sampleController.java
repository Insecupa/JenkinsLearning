package com.example.sampledemospriing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sampleController {

    @GetMapping("/error")
    public String hello() {
        throw new sampleException();
    }

}

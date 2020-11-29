package com.episenscalbebackend.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScaController {


    @PostMapping("/reverse")
    public String reverse(@RequestBody String order) {
        //logger.info(order);
        //PrintWrite.write(order);
        return "ok";
    }
}

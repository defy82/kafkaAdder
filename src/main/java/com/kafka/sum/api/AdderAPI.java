package com.kafka.sum.api;

import com.kafka.sum.models.InputDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AdderAPI {

    @PostMapping("/adder")
    public void addNumbers(@RequestBody InputDTO inputDTO) {
        System.out.println("Input taken. a: " + inputDTO.getA() + ", b: " + inputDTO.getB() + ".");
    }

}

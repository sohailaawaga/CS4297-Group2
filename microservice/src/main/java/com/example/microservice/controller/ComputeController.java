package com.example.microservice.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ComputeController {

    @GetMapping("/")
    public Map<String, Object> health() {
        Map<String, Object> res = new HashMap<>();
        res.put("status", "ok");
        res.put("message", "Microservice is running!");
        res.put("endpoints", new String[]{"/", "/compute"});
        return res;
    }

    @GetMapping("/compute")
    public Map<String, Object> compute() {
        long result = 0;
        for (int i = 0; i < 100_000_000; i++) {
            result += i % 7;
        }
        Map<String, Object> res = new HashMap<>();
        res.put("status", "ok");
        res.put("message", "Computation complete");
        res.put("result", result);
        return res;
    }
}

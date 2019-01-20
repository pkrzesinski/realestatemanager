package com.manager.estate.feature.test;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping
    public String params(@RequestParam String first, @RequestParam String second) {
        return "Here are your params: " + first + " " + second;
    }

    @PostMapping
    public String body(@RequestBody String body) {
        return "Here is your request body: " + body;
    }

    @GetMapping("/{path}")
    public String pathParams(@PathVariable String path) {
        return "Here is your path param: " + path;
    }
}

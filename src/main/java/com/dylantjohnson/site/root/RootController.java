package com.dylantjohnson.site.root;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @RequestMapping
    public String index() {
        return "Welcome to Dylan's very basic website.";
    }
}

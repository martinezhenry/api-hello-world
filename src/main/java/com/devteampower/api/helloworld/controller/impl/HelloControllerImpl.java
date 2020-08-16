package com.devteampower.api.helloworld.controller.impl;

import com.devteampower.api.helloworld.controller.HelloController;
import com.devteampower.api.helloworld.service.HelloService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/${version}")
public class HelloControllerImpl implements HelloController {

    private HelloService helloService;

    public HelloControllerImpl(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    @GetMapping(value = {"/hello", "/hello/{somebody}"}, produces = MediaType.TEXT_PLAIN_VALUE)
    public String sayHello(@PathVariable Optional<String> somebody) {
        return helloService.sayHello(somebody);
    }
}

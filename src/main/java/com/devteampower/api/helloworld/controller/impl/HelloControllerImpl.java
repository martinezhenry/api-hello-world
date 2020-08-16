package com.devteampower.api.helloworld.controller.impl;

import com.devteampower.api.helloworld.controller.HelloController;
import com.devteampower.api.helloworld.service.HelloService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

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
    public Mono<String> sayHello(@PathVariable Optional<String> somebody) {
        return Mono.just(helloService.sayHello(somebody));
    }
}

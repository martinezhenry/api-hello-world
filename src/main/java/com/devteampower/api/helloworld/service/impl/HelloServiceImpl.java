package com.devteampower.api.helloworld.service.impl;

import com.devteampower.api.helloworld.service.HelloService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(Optional<String> name) {
        String response = String.format(TEMPLATE, name.orElse(DEFAULT_NAME));
        return response;
    }
}

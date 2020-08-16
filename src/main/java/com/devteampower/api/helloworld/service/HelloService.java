package com.devteampower.api.helloworld.service;

import java.util.Optional;

public interface HelloService {

    String TEMPLATE = "Hello, %s";
    String DEFAULT_NAME = "Somebody";

    String sayHello(Optional<String> somebody);

}

package com.devteampower.api.helloworld.controller;

import reactor.core.publisher.Mono;

import java.util.Optional;

public interface HelloController {

    Mono<String> sayHello(Optional<String> somebody);

}

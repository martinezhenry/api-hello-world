package com.devteampower.api.helloworld.controller;

import java.util.Optional;

public interface HelloController {

    String sayHello(Optional<String> somebody);

}

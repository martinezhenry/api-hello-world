package com.devteampower.api.helloworld.service.impl;

import com.devteampower.api.helloworld.service.HelloService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class HelloServiceImplTest {

    @Autowired
    private HelloService helloService;

    @Test
    void sayHello(){

        String expected = String.format(HelloService.TEMPLATE, HelloService.DEFAULT_NAME);
        String actual = helloService.sayHello(Optional.empty());
        String name = "User";
        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expected, actual);

        expected = String.format(HelloService.TEMPLATE, name);
        actual = helloService.sayHello(Optional.of(name));

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(expected, actual);

    }


}
package com.emerje.restapi;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class BusItinaryProcessor implements ItinaryProcessor {

    @Override
    public void processItinary(){
        System.out.println("Processing bus itinary...");
    };
}

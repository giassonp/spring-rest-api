package com.emerje.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NavigationSystem {

    @Autowired
    private ItinaryProcessor itinaryProcessor;

    public void getItinary(){
        itinaryProcessor.processItinary();
    }
}

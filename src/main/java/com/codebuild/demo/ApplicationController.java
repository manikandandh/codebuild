package com.codebuild.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {

    @RequestMapping(value="/", method = RequestMethod.GET, produces ="application/hal+json")
    public String sayHello() {
    	String response = "Code Build Test Version 2.0";
        return response;
    }

    @RequestMapping(value="/hello/{name}", method = RequestMethod.GET, produces ="application/hal+json")
    public String sayHelloName(@PathVariable(value="name") String name) {   	
    	String response = "Hello " + name;
        return response;
    }
}

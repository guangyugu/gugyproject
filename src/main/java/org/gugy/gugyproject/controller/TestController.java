package org.gugy.gugyproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author πºπ‚”Ó
 * 2021/1/14 18:04
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/demo")
    public String test(){
        return "1111111111111";
    }
}

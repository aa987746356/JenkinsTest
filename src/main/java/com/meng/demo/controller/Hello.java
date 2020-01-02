package com.meng.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author meng
 * @create 2019/12/31
 */
@RestController
public class Hello {

    @GetMapping("hello")
    public String hello(){
        return "hello!";
    }

}

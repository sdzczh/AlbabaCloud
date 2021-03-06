package com.zh.order.controller;

import entity.Users;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: CloudDemo
 * @description:
 * @author: zhaohe
 * @create: 2020-12-18 20:55
 **/
@RestController
public class MainController {

    @GetMapping("hi/{message}")
    public String main(@PathVariable String message){
        return "hello world" + " =======> " + message;
    }
    @GetMapping("hi1")
    public String main(){
        Users users = new Users();
        users.setId(1);
        users.setName("1");
        return "hello world" + " =======> hi1" + users.toString();
    }
}

package com.mawen.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: springboot-thin-jar
 * @description:
 * @author: Mw
 * @create: 2019-06-10 19:13
 **/
@RestController
public class TestController {

    @RequestMapping(value = "test", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
    public String test(){
        return "{\"code\":\"200\", \"message\":\"成功\"}";
    }
}

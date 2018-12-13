package com.git.b.controller;

import com.git.b.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: panbenxing
 * @Date: 2018/12/13
 * @Description:
 */
@RestController
@RequestMapping("b")
public class ControllerB {

    @Autowired
    private ServiceB serviceB;

    @RequestMapping("hi")
    @ResponseBody
    public String hi(){
        return serviceB.getHelloMessage();
    }
}

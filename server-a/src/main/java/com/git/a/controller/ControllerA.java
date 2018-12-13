package com.git.a.controller;

import com.git.a.service.ServiceA;
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
@RequestMapping("a")
public class ControllerA {

    @Autowired
    private ServiceA serviceA;

    @RequestMapping("hi")
    @ResponseBody
    public String hi(){
        return serviceA.getHelloMessage();
    }
}

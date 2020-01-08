package com.zxj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/info")
    @ResponseBody
    public String info(){
        return "Hello SpringBoot Info";
    }
    //项目经理
}

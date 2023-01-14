package com.zhouzhou.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 周万宁
 * @className TestController
 * @create 2023/1/15-0:39
 * @description
 */
@RestController

@CrossOrigin //处理跨域
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "hello";
    }

}

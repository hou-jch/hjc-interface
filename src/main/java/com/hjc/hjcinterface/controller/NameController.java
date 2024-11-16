package com.hjc.hjcinterface.controller;

/**
 * File Description: NameController
 * Author: hou-jch
 * Date: 2024/9/3
 */


import cn.hutool.crypto.digest.MD5;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.server.HttpServerRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * 名称 API
 *
 * @author yupi
 */
@RestController
@RequestMapping("/name")
public class NameController {
    @GetMapping("/get")
    public String getNameByGet(String name,HttpServletRequest request) {
        System.out.println(request.getHeader("hjc123123"));
        return "GET 你的名字是" + name;
    }

    @PostMapping("/names")
    public String getNameByPost(@RequestBody String name) {
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUserNameByPost(@RequestBody String name, HttpServletRequest request) {
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String sign = request.getHeader("sign");
//        String body = request.getHeader("body");
//        if(!"5f3fcad2098c9adfbd74cd2f6e24250f".equals(accessKey) ){
//            throw new RuntimeException("无权限");
//        }
//        if(Long.parseLong(nonce) >10000){
//            throw new RuntimeException("无权限");
//        }
//
//        String nowSign = SignUtils.getSion(body,"6131b2e69fdf5f5715ed7a43461a6727");
//        if(!nowSign.equals(sign)){
//            throw new RuntimeException("无权限");
//        }
        //校验时间戳与当前时间差距   待实现
      //  throw new RuntimeException("错误");
       return "POST 用户名字是" + name;

    }
}


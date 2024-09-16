package com.hjc.hjcinterface.test;

import com.hjc.hjjcclientsdk.client.HouApiClient;
import com.hjc.hjjcclientsdk.model.User;
import com.hjc.hjjcclientsdk.util.MD5Util;

/**
 * File Description: test
 * Author: hou-jch
 * Date: 2024/9/3
 */
public class test {
    public static void main(String[] args) {
        String accessKey = "hjc";

        String secretKey = "123";


        HouApiClient houApiClient = new HouApiClient(MD5Util.encrypt(secretKey),accessKey);
                String result1 = houApiClient.getNameByGet("鱼皮");
                String result2 = houApiClient.getNameByPost("鱼皮");
                User user = new User();
                user.setUsername("user31231");
                String result3 = houApiClient.getUserNameByPost(user);
                System.out.println(result1);
                System.out.println(result2);
                System.out.println(result3);


    }
}

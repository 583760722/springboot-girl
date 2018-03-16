package com.imooc.controller;

import com.imooc.properties.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhy
 * @version 1.0
 * @classDesc:
 * @date 2018/3/12
 * @copyright: 上海英和
 * @QQ: 583760722
 */
@RestController
public class HelloController {

//    @Value("${cupSize}")
//    private String cupSize;

//    @Value("${content}")
//    private String content;

    @GetMapping(value = "/hello")
    public String say() {
        return "Hello SpringBoot controller";
    }

//    @GetMapping(value = "size")
//    public String question() {
//        return cupSize;
//    }

//    @GetMapping(value = "/content")
//    public String content() {
//        return content;
//    }

    @Autowired
    private GirlProperties girlProperties;

    @GetMapping(value = "/one")
    public String getGirlCupSize() {
        return girlProperties.getCupSize();
    }


}

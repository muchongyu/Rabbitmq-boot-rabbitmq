package com.chongyu.bootrabbitmq.controller;

import com.chongyu.bootrabbitmq.producer.MsgProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestCon {

    @Autowired
    private MsgProducer msgProducer;

    @ResponseBody
    @RequestMapping(value = "test")
    public String test() {

        msgProducer.sendMsg("今天我要测试rabbitmq");
        return "okok";
    }
}

package com.yang.myspringbootstartersample.rest;

import com.yang.myspringbootstarter.service.MsgService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author: Yang
 * @date: 2019/2/13 14:40
 * @description:
 */
@RestController
@RequestMapping("/msg")
public class MsgController {

    @Resource
    private MsgService msgService;

    @GetMapping("/showMsg")
    public void showMsg() {
        this.msgService.outputMsg();
    }

}

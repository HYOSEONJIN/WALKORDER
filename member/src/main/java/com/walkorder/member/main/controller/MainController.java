package com.walkorder.member.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(value = "/")
    public String main() {
        return "index";
    }

    @RequestMapping(value = "/memberMain")
    public String memberMain() {
        return "member/member";
    }

}

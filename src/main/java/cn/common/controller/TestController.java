package cn.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class TestController {

    @RequestMapping("list")
    public String index() {
        return "login";
    }

}

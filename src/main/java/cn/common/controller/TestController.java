package cn.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class TestController {

    @RequestMapping("list")
    public String index() {
        return "login";
    }

    @RequestMapping("hello")
    public String helloPerson(ModelMap map){
        map.put("name","china");
        return "hello";
    }

}

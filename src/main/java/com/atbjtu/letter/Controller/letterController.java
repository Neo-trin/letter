package com.atbjtu.letter.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/*
 * @author lzy
 * @version 1.0
 * */
@Controller
public class letterController {
    @GetMapping("/")
    public String hello() {
        return "letter";
    }
}

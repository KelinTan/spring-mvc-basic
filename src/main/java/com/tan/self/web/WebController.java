package com.tan.self.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Mr.Tanzc on 2017/8/12.
 */
@Controller
@RequestMapping("web")
public class WebController {


    @RequestMapping("index")
    public String webTest() {
        return "index";
    }
}

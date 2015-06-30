package com.bigmoon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Probe {
    @RequestMapping("/Probe")
    @ResponseBody
    String probe() {
        return "Probe";
    }
}

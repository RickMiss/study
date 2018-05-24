package com.baidu.zhl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.zhl.service.ExA;


@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        int c = ExA.b;
        System.out.println("kakakak: " + c);
        model.addAttribute("msg", "Spring MVC Hello World");
        model.addAttribute("name", "zhaohongli");
        return "hello";
    }


    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String updateOutUrl(@RequestBody String requestbody, HttpServletRequest request) {
        System.out.println(requestbody);
        System.out.println("-----" + request);

        // 返回结果json对象
        return "sucess";
    }

}
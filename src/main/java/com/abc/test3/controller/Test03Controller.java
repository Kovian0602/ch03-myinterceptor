package com.abc.test3.controller;


import com.abc.test3.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Test03Controller {
    public static void main(String[] args) {
        System.out.println("HelloWord!");
        System.out.println("111111111111");
    }

    @RequestMapping("/toTest03")
    public ModelAndView toTest03(String name, Integer age) {
        System.out.println("---------开始执行Controller-------------");
        System.out.println("====执行MyController处理器方法=======");
        ModelAndView mv = new ModelAndView();

        mv.addObject("myname", name);
        mv.addObject("myage", age);
        mv.setViewName("test");
        return mv;
    }
}

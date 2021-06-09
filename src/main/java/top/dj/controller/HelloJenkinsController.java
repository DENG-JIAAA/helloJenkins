package top.dj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author DengJia
 * @Date 2021/6/9
 * @Description:
 */

@RestController
@RequestMapping("/jenkins")
public class HelloJenkinsController {
    @GetMapping("/hello")
    public String getHelloJenkins() {
        return "hello jenkins";
    }

}

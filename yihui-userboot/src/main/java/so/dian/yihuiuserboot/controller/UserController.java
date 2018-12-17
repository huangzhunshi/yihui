package so.dian.yihuiuserboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/userboot/getUserInfo")
    public String getUserInfo(String id,String name){
        return id+"-"+name;
    }

    @GetMapping("/getUserList")
    public String getUserList(String hi){
        return hi;

    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }
}

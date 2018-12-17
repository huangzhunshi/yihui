package so.dian.yihuigateway.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import so.dian.yihuigateway.service.UserBootService;
//import so.dian.yihuigateway.service.UserBootService;

@RestController
@RequestMapping("/combin")
public class CombinController {

    @GetMapping("/user")
   public String userCombin(){
       return "userCombin";
   }

   @Autowired
   UserBootService userBootService;
   @GetMapping("/test")
   public String test(){
       return userBootService.test();
   }

   @GetMapping("/test1")
   public String test1(){
       return "test1";
   }
}

package so.dian.yihuigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/combin")
public class CombinController {

    @GetMapping("/user")
   public String userCombin(){
       return "userCombin";
   }


}

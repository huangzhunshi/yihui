package so.dian.yihuigateway.service;

//import org.springframework.cloud.netflix.feign.FeignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

//@FeignClient(name="demo-feign-freeservice",fallback=DemoFeignFallback.class)
//@FeignClient(name="xxx")USERBOOT
@FeignClient(name = "userboot") //这里的name对应调用服务的spring.applicatoin.name
public interface UserBootService {
     @GetMapping("/test")
     String test();
}

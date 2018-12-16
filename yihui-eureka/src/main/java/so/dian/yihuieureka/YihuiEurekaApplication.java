package so.dian.yihuieureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YihuiEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(YihuiEurekaApplication.class, args);
	}
}

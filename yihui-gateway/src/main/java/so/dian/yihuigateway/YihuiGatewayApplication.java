package so.dian.yihuigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class YihuiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(YihuiGatewayApplication.class, args);
	}

//	@Bean
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//		return builder.routes()
//				.route(
//						r -> r.path("/getAll")
//								.uri("http://localhost:8762")
//				)
////                .route(
////                        r -> r.method("GET")
////                                .uri(hi)
////                )
//				.route(
//						r -> r.method("POST")
//								.uri("https://github.com")
//				)
//				.route(
//						r -> r.path("/zh")
//								.uri("https://www.zhihu.com")
//				)
//                .route(
//                        r -> r.path("/userboot/**").uri("lb://userboot").filters(f->f.)
//                )
//				.route(r->r.path("/s").uri("http://127.0.0.1:8081")
//				)
//				.build();
//	}

//	@Bean  //代码中手动配置route
//	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
//
//		return builder.routes()
//				.route(
//						r -> r.path("/getAll")
//								.uri("http://localhost:8762")
//				)
////                .route(
////                        r -> r.method("GET")
////                                .uri(hi)
////                )
//				.route(
//						r -> r.method("POST")
//								.uri("https://github.com")
//				)
//				.route(
//						r -> r.path("/zh")
//								.uri("https://www.zhihu.com")
//				)
////                .route(
////                        r -> r.path("/hi")
////                                .uri(hi)
////                )
//				.build();
//	}
}

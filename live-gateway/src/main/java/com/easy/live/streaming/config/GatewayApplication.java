package com.easy.live.streaming.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Description:网关服务
 * @Author: zhangliangfu
 * @Create on: 2019-06-12 19:02
 */

@SpringCloudApplication
@EnableZuulProxy
@EnableHystrix
@EnableFeignClients(basePackages={"com.easy"})
@ComponentScan(basePackages={"com.easy"})
public class GatewayApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayApplication.class).web(true).run(args);
    }
}

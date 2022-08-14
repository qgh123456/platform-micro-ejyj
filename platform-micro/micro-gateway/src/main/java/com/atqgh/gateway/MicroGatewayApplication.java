package com.atqgh.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 微服务网关.
 *
 * @author Mubai
 * @since 2022/8/14 3:30 下午
 **/
@SpringBootApplication
public class MicroGatewayApplication {

    /**
     * 系统启动类.
     * @param args 请求参数
     */
    public static void main(String[] args) {
        SpringApplication.run(MicroGatewayApplication.class, args);
    }
}

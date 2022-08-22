package com.example.apolloprovider;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableApolloConfig
public class ApolloProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(ApolloProviderApplication.class, args);

    }

}

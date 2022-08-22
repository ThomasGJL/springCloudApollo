package com.example.apolloprovider.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableApolloConfig(value = "application")
@ConfigurationProperties(prefix = "user")
@Data
public class User {

    private String nickname;
    private String age;
}

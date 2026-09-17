package com.real.springsecurity.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.web.SecurityFilterChain;


@Configuration

public class webSecurityConfig {

    @Bean

    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .headers(headerConfigure -> headerConfigure.frameOptions(HeadersConfigurer.FrameOptionsConfig::disable))

                .formLogin(formLoginConfigurer -> formLoginConfigurer
                        .loginPage("/login")
                ).build();
    }

}

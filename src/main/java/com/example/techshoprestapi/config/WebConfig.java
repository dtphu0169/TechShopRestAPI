//package com.example.techshoprestapi.config;
//
//import com.example.techshoprestapi.service.AccountServiceImpl;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.config.annotation.ObjectPostProcessor;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
////import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//
//@EnableWebSecurity
////@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
//@EnableMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
//
//// đây là config cho security ver-6.0 nhưng vì nhiều hạn chế chưa sử dụng được
//public class WebConfig extends AuthenticationManagerBuilder {
//    public WebConfig(ObjectPostProcessor<Object> objectPostProcessor) {
//        super(objectPostProcessor);
//    }
//
//
//    @Bean
//    public AuthenticationManager authenticationManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, AccountServiceImpl userDetailService)
//            throws Exception {
//        return http.getSharedObject(AuthenticationManagerBuilder.class)
//                .userDetailsService(userDetailService)
//                .passwordEncoder(bCryptPasswordEncoder)
//                .and()
//                .build();
//    }
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.csrf()
//                .disable()
//                .authorizeHttpRequests()
//                .requestMatchers(HttpMethod.DELETE)
//                .hasRole("ADMIN")
//                .requestMatchers("/admin/**")
//                .hasAnyRole("ADMIN")
//                .requestMatchers("/user/**")
//                .hasAnyRole("USER", "ADMIN")
//                .requestMatchers("/login/**")
//                .anonymous()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic()
//                .and()
//                .sessionManagement()
//                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//        return http.build();
//    }
//}

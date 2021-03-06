package com.kgc.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@MapperScan("com.kgc.study.studytravelcoach.mapper")
@SpringBootApplication
public class StudyTravelCoachApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyTravelCoachApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    };


}

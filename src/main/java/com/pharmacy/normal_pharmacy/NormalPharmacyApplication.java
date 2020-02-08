package com.pharmacy.normal_pharmacy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
@EnableAsync
@MapperScan(basePackages = {"com.pharmacy.normal_pharmacy.business.**.dao"})
public class NormalPharmacyApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(NormalPharmacyApplication.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(NormalPharmacyApplication.class, args);
    }

}

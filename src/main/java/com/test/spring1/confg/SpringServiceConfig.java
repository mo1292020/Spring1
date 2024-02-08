package com.test.spring1.confg;


import com.test.spring1.Spring1Application;
import com.test.spring1.mapper.CityMapper;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan(basePackageClasses = {Spring1Application.class,  CityMapper.class})
public class SpringServiceConfig {
}

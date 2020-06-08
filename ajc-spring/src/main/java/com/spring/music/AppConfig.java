package com.spring.music;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;;

@Configuration
@EnableAspectJAutoProxy
@ImportResource("classpath:application-context.xml")
public class AppConfig {

}

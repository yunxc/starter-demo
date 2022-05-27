package com.yun;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yl.z
 * @date 2022/4/22 19:46
 */
//@Configuration
//@ConditionalOnClass(StarterDemo.class)
//@EnableConfigurationProperties(MyDemoProperties.class)
//@ConditionalOnProperty(prefix = "spring", name = "enabled", havingValue = "true")
public class StarterDemoConfiguration {

    @Bean
    @ConditionalOnMissingBean(StarterDemo.class)
    public StarterDemo myStart(){
        System.out.println("myStart=====run");
        return new StarterDemo();
    }

}

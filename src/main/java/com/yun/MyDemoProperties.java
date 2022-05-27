package com.yun;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author yl.z
 * @date 2022/4/24 9:56
 */
@ConfigurationProperties(prefix = "my.pro")
public class MyDemoProperties {

    private String name = "123";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

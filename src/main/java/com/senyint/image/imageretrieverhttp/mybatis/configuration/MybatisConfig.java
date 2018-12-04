package com.senyint.image.imageretrieverhttp.mybatis.configuration;

import org.apache.ibatis.session.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class MybatisConfig {
    private Logger logger = LoggerFactory.getLogger(MybatisConfig.class);

    @Bean
    public Configuration configuration(){
        logger.info("配置MybatisConfig----");
        Configuration configuration = new Configuration();
        return configuration;
    }
}

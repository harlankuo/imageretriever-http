package com.senyint.image.imageretrieverhttp.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationHome;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.util.StringUtils;

import java.io.File;

/**
 * 实现CommandLineRunner接口或ApplicationListener接口都可以实现项目启动时初始化数据
 */
public class ApplicationStartupInit implements ApplicationListener<ContextRefreshedEvent> {
    private static Logger logger=LoggerFactory.getLogger(ApplicationStartupInit.class);

    public void onApplicationEvent(ContextRefreshedEvent event) {
//        DefaultConfig defaultConfig = (DefaultConfig) event.getApplicationContext().getBean("defaultConfig");
//
//        logger.info("加载可修改的properties数据");
//        PropertiesUtils.loadProps(getFilePath(defaultConfig.getConfigName()));
    }

    private boolean startsWith(String filename){
        return StringUtils.startsWithIgnoreCase(filename, File.pathSeparator);
    }

    private String getFilePath(String filename){
        String filePath = "";
        ApplicationHome applicationHome = new ApplicationHome();

        if(startsWith(filename)){
            filePath = applicationHome.toString() + filename;
        }else{
            filePath = applicationHome + File.separator + filename;
        }

        return filePath;
    }
}

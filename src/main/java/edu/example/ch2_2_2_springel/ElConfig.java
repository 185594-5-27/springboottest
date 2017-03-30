package edu.example.ch2_2_2_springel;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;

/**
 * Created by linzf on 2017/3/29.
 */
@Configuration
@ComponentScan("edu.example.ch2_2_2_springel")
@PropertySource("classpath:edu/example/ch2_2_2_springel/test.properties")
public class ElConfig {

    @Value("${book.name}")
    private String bookname;

    @Value("normal")
    private String normal;

    @Value("#{demoService.another}")
    private String fromAnother;

    @Value("http://www.baidu.com")
    private Resource testurl;

    @Autowired
    private Environment environment;

    /**
     * 功能描述：根据Property的类型来获取properties里的数据
     * @param name
     * @return
     */
    public String getProperty(String name){
        return environment.getProperty(name);
    }

    public void outPrintln() {
        System.out.println("bookname value is:"+bookname);
        System.out.println("normal value is:"+normal);
        System.out.println("getProperty value is:"+getProperty("book.name"));
        System.out.println("fromAnother value is:"+fromAnother);
        try {
            System.out.println("testurl value is:"+ IOUtils.toString(testurl.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.sanyue.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.print.Doc;
import java.util.ArrayList;

/**
 * @author BoLin
 * @create 2020-10-22 10:49
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket1() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("张三");
    }

    @Bean
    public Docket docket2() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("李四");
    }

    @Bean
    public Docket docket(Environment environment) {

        Profiles profiles = Profiles.of("dev", "test");

        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("张博林")
                //配置开关
                .enable(flag)
                .select()
                //配置要扫描接口的方式
                .apis(RequestHandlerSelectors.basePackage("com.sanyue.controller"))
                //过滤
//                .paths(PathSelectors.ant("/swag/**"))
                .build();
    }


    private ApiInfo apiInfo() {

        Contact contact = new Contact("Tommy", "http://wwww.baidu.com", "286322812@qq.com");

        return new ApiInfo("张博林",
                "即使再小的帆也能远航",
                "v1.0",
                "http://www.zbl.com",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }

}

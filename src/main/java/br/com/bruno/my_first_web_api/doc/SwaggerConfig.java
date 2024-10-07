package br.com.bruno.my_first_web_api.doc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;

//@Configuration
//@EnableSwagger2
public class SwaggerConfig {
//    private Contact contact() {
//        return new Contact("Bruno", "http://localhost:8080/users", "marbruge@gmail.com");
//    }
//
//    private ApiInfoBuilder apiInfo() {
//        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
//        apiInfoBuilder.title("Users - Rest API");
//        apiInfoBuilder.description("API exemplo de uso de Springboot REST API");
//        apiInfoBuilder.version("1.0");
//        apiInfoBuilder.termsOfServiceUrl("Termos de uso: Open Source");
//        apiInfoBuilder.license("Licença - Bruno's Company");
//        apiInfoBuilder.licenseUrl("http://localhost:8080/users");
//        apiInfoBuilder.contact(this.contact());
//
//        return apiInfoBuilder;
//    }
//
//    @Bean
//    public Docket apiDetail() {
//        Docket docket = new Docket(DocumentationType.SWAGGER_2);
//
//        docket
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("br.com.bruno.my_first_web_api.controller"))
//                .paths(PathSelectors.any())
//                .build()
//                .apiInfo(this.apiInfo().build())
//                .consumes(new HashSet<String>(Arrays.asList("application/json")))
//                .produces(new HashSet<String>(Arrays.asList("application/json")));
//
//        return docket;
//    }
}

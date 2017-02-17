package com.spring.naveen.controller;

import com.spring.naveen.Model.UssdRequest;
import com.spring.naveen.Model.UssdResponce;
import com.spring.naveen.UssdHandler;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created by naveen on 1/24/17.
 */

@RestController
public class UssdControler {

    @RequestMapping(value = "/ussd/receive/categories",method = RequestMethod.POST)
    public String getRequestCategories(@RequestBody UssdRequest ussdRequest){
        System.out.println(ussdRequest.getApplicationId());
        UssdHandler ussdHandler = new UssdHandler();
        UssdResponce ussdResponce = ussdHandler.getCategories(ussdRequest.getApplicationId());
        System.out.println("++++++++++++"+ussdResponce.getCategories().get(0).getName());

        return ussdRequest.getApplicationId();
    }

//    @RequestMapping(value = "/ussd/receive/category/products",method = RequestMethod.POST)
//    public String getRequestProducts(@RequestBody UssdRequest ussdRequest){
//        System.out.println(ussdRequest.getApplicationId());
//        UssdHandler ussdHandler = new UssdHandler();
//        ussdHandler.getProducts(ussdRequest.getApplicationId());
//        return ussdRequest.getApplicationId();
//    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }


}

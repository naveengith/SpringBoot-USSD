package com.spring.naveen;

import com.spring.naveen.Model.UssdResponce;
import org.springframework.web.client.RestTemplate;

/**
 * Created by naveen on 2/17/17.
 */
public class UssdHandler {


    public UssdResponce getCategories(String biz_ID) {

    RestTemplate restTemplate = new RestTemplate();
    UssdResponce ussdResponce = restTemplate.getForObject("http://dev.apptizer.io:9091/business/" +biz_ID+ "/categories", UssdResponce.class);

    for(int i=0;i<ussdResponce.getCategories().size();i++) {
        System.out.println(ussdResponce.getCategories().get(i).getName());
    }
    return ussdResponce;
}

//    public String getProducts(String biz_ID) {
//
//        RestTemplate restTemplate = new RestTemplate();
//        UssdResponce ussdResponce = restTemplate.getForObject("http://dev.apptizer.io:9091/business/" +biz_ID+ "/categories", UssdResponce.class);
//
//        for(int i=0;i<ussdResponce.getCategories().size();i++) {
//            System.out.println(ussdResponce.getCategories().get(i).getName());
//        }
//        return ussdResponce.toString();
//    }

}


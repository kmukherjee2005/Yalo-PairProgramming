package com.example.yalo.api;

import com.example.yalo.model.Recipient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.net.http.HttpHeaders;
import java.util.Collection;
import java.util.Collections;

@Controller
public class RestApi {

    RestTemplate restTemplate;

    public RestApi(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping(value = "POST")
    public  void getResponse(){
        HttpHeaders httpHeaders =  new HttpHeaders();
        httpHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);
        return restTemplate.exchange("https://jsonplaceholder.typicode.com/posts", HttpMethod.POST, entity, Recipient[].class).getBody();

    }
}

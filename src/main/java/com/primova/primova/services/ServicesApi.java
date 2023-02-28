package com.primova.primova.services;

import com.primova.primova.model.Predict;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ServicesApi {
    @GetMapping(value = "api")
    private Predict getUrl() {
        String url = "https://api.cittamobi.com.br/m3p/js/prediction/stop/5208036.5195544";
        RestTemplate restTemplate = new RestTemplate();
        Predict result = restTemplate.getForObject(url, Predict.class);
        return result;
    }

}

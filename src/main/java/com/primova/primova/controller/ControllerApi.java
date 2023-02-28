package com.primova.primova.controller;

import com.primova.primova.model.Predict;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerApi {
    @RequestMapping("api")
    public Predict GetDataPredict() {
        return null;
    }
}

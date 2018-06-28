package com.horoscope.prasid.Controller;

import com.horoscope.prasid.Domain.Data;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HoroscopeController {

    @RequestMapping(value = "/addData", method = RequestMethod.POST)
    public Data saveData(@RequestBody Data data){

        return null;
    }
}

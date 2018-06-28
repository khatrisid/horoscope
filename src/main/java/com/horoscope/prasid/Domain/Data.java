package com.horoscope.prasid.Domain;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "hor_data")
public class Data {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

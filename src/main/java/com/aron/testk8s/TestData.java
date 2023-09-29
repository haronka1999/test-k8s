package com.aron.testk8s;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "business_data")
public class TestData {
    @Id
    private String id;
    private String data;

    public TestData() {
    }

    public TestData(String data) {
        this.data = data;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public String getData() {
        return data;
    }
}

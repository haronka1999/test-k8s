package com.aron.testk8s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestDataController {

    @Autowired
    private  TestDataService testDataService;

    @PostMapping("/insertData")
    public TestData createBusinessData(@RequestBody TestData testData) {
        return testDataService.saveBusinessData(testData);
    }

    @GetMapping("getAll")
    public List<TestData> getAllBusinessData() {
        return testDataService.getAllBusinessData();
    }
}

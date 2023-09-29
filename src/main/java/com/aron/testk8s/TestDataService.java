package com.aron.testk8s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestDataService {
    @Autowired
    private  TestDataRepository testDataRepository;
    public TestData saveBusinessData(TestData businessData) {
        return testDataRepository.save(businessData);
    }

    public List<TestData> getAllBusinessData() {
        return testDataRepository.findAll();
    }
}

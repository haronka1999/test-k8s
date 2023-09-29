package com.aron.testk8s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestK8sApplication {

	@Autowired
	private static TestDataService testDataService;
	public static void main(String[] args) {
		SpringApplication.run(TestK8sApplication.class, args);
//		TestData testData1 = new TestData("data1");
//		TestData testData2 = new TestData("data2");
//		TestData testData3 = new TestData("data3");
//		testDataService.saveBusinessData(testData1);
//		testDataService.saveBusinessData(testData2);
//		testDataService.saveBusinessData(testData3);

	}

}

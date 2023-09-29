package com.aron.testk8s;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TestDataRepository extends MongoRepository<TestData,String> {
}

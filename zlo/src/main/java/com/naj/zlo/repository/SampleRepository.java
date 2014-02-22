package com.naj.zlo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.naj.zlo.model.Sample;

public interface SampleRepository extends MongoRepository<Sample, String> {

}

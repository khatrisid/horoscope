package com.horoscope.prasid.Repository;

import com.horoscope.prasid.Domain.Data;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface DataRepository extends MongoRepository<Data,String> {
}

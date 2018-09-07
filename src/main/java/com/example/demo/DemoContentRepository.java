package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DemoContentRepository extends PagingAndSortingRepository<DemoContent, String> {

}

package com.carledwinti.springboot.elastic.repository;

import com.carledwinti.springboot.elastic.model.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface CustomerElasticRepository extends ElasticsearchRepository<Customer, String> {
    List<Customer> findByFirstname(String firstname);
}

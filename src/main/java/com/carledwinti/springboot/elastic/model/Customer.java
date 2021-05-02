package com.carledwinti.springboot.elastic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "customer-index")
public class Customer {
    private String id;
    private String firstname;
    private String lastname;
    private int age;
}

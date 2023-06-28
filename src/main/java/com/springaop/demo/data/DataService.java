package com.springaop.demo.data;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class DataService {

    public List<String> retrieveData() {
        return Arrays.asList("data1", "data2");
    }
}

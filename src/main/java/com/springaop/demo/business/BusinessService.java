package com.springaop.demo.business;

import com.springaop.demo.annotations.TrackTime;
import com.springaop.demo.data.DataService;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    private DataService dataService;

    public BusinessService(DataService dataService) {
        this.dataService = dataService;
    }

    @TrackTime
    public String findData() throws InterruptedException {
        Thread.sleep(300);
        return dataService.retrieveData().get(0);
    }
}

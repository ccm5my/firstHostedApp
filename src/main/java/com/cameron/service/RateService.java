package com.cameron.service;

import com.cameron.interfaces.IMortgageAPIClient;
import com.cameron.interfaces.IRateService;
import com.cameron.models.RateResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateService implements IRateService {

    private IMortgageAPIClient client;

    @Autowired
    public RateService(IMortgageAPIClient client) {
        this.client = client;
    }

    @Override
    public RateResponse getRates() {
        return client.getRates();
    }
}

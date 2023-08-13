package com.cameron.client;

import com.cameron.models.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;

import com.cameron.interfaces.IMortgageAPIClient;

@Component
public class MortgageAPIClient implements IMortgageAPIClient {

    @Value("${partnerId}")
    private String partnerId;

    @Override
    public RateResponse getRates() {
        String apiUrl = "https://mortgageapi.zillow.com/getCurrentRates?partnerId=" + partnerId;
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, RateResponse.class);
    }

}

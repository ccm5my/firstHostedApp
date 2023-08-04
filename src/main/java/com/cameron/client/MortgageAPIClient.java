package com.cameron.client;

import com.cameron.models.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.cameron.interfaces.IMortgageAPIClient;

@Component
public class MortgageAPIClient implements IMortgageAPIClient {

    @Override
    public RateResponse getRates() {
        String apiUrl = "https://mortgageapi.zillow.com/getCurrentRates?partnerId=RD-ZJDYSFZ";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, RateResponse.class);
    }

}

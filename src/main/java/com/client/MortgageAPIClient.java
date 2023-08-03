package com.client;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.cameron.interfaces.IMortgageAPIClient;

@Component
public class MortgageAPIClient implements IMortgageAPIClient {

    @Override
    public String getRates() {
        String apiUrl = "https://mortgageapi.zillow.com/getCurrentRates?partnerId=RD-ZJDYSFZ";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, String.class);
    }
    
}

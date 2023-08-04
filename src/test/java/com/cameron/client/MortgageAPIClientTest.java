package com.cameron.client;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;

import com.cameron.interfaces.IMortgageAPIClient;
import com.cameron.models.RateResponse;

@RunWith(MockitoJUnitRunner.class)
public class MortgageAPIClientTest {

    private MortgageAPIClient client;

    public MortgageAPIClientTest() {
        client = new MortgageAPIClient();
    }

    @Test
    public void testGetRates() {
        RateResponse response = client.getRates();
        assertNotNull(response);
    }
}

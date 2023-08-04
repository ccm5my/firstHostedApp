package com.cameron.client;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.cameron.models.RateResponse;

@RunWith(MockitoJUnitRunner.class)
public class MortgageAPIClientTest {
    @Mock
    private RestTemplate restTemplateMock;

    @Autowired
    private MortgageAPIClient client;

    @Test
    public void testGetRates() {
        String apiUrl = "https://mortgageapi.zillow.com/getCurrentRates?partnerId=RD-ZJDYSFZ";
        RateResponse mockResponse = new RateResponse();
        when(restTemplateMock.getForObject(apiUrl, RateResponse.class)).thenReturn(mockResponse);
        RateResponse response = client.getRates();
        assertEquals(mockResponse, response);
        verify(restTemplateMock, times(1)).getForObject(apiUrl, RateResponse.class); // Verify that the RestTemplate
    }
}

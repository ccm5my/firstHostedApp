package com.cameron.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.cameron.interfaces.IMortgageAPIClient;
import com.cameron.models.RateResponse;

@RunWith(MockitoJUnitRunner.class)
public class RateServiceTest {
    @InjectMocks
    private RateService rateService;

    @Mock
    private IMortgageAPIClient client;

    @Test
    public void testGetRates() {
        RateResponse mockResponse = new RateResponse(); 
        when(client.getRates()).thenReturn(mockResponse);
        RateResponse response = rateService.getRates();
        assertNotNull(response);
        verify(client, times(1)).getRates(); // Verify that the client method was called exactly once
    }
}

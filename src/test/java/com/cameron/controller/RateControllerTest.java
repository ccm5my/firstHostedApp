package com.cameron.controller;

import com.cameron.interfaces.IRateService;
import com.cameron.models.RateResponse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class RateControllerTest {

    @Mock
    private IRateService rateService;

    public RateControllerTest() {
        rateService = mock(IRateService.class);
    }

    @Test
    public void testGetRatesEndpoint() {
        // Arrange
        RateController controller = new RateController(rateService);
        when(rateService.getRates()).thenReturn(new RateResponse());

        // Act
        RateResponse rs = controller.getRates();

        // Assert
        assertNotNull(rs);
        verify(rateService, times(1)).getRates();
    }
}

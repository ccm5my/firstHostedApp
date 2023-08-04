package com.cameron.controller;

import com.cameron.interfaces.IRateService;
import com.cameron.models.RateResponse;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

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
    }
}

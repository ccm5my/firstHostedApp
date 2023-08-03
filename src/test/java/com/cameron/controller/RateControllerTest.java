/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cameron.controller;

import com.cameron.interfaces.IRateService;
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
        //Arrange
        RateController controller = new RateController(rateService);
        when(rateService.getRates()).thenReturn("rate");

        //Act
        String rs = controller.getActors();

        //Assert
        assertNotNull(rs);
    }
}

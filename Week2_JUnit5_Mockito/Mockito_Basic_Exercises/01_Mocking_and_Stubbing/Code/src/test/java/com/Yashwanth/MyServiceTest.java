package com.Yashwanth;

import static org.mockito.Mockito.*;

import org.mockito.Mockito;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction(){
        ExternalAPI mockAPI = Mockito.mock(ExternalAPI.class);

        when(mockAPI.getData()).thenReturn("Hello Yash");

        MyService service = new MyService(mockAPI);

        assertEquals("Hello Yash", service.fetchData());
    }
}

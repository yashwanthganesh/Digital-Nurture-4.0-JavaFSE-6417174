import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.mockito.AdditionalMatchers.*;

class MyServiceTest {

    @Test
    public void testArgumentMatching(){
        ExternalAPI mockAPI = mock(ExternalAPI.class);

        MyService service = new MyService(mockAPI);

        service.setData("yash", 20);

        verify(mockAPI).send("yash", 20);
        verify(mockAPI).send(eq("yash"), anyInt());
        verify(mockAPI).send(anyString(), anyInt());
        verify(mockAPI).send(startsWith("yash"), anyInt());
        verify(mockAPI).send(endsWith("yash"), gt(15));

        System.out.println();
    }
}
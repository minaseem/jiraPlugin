package it.com.atlassian.flock.rest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import com.atlassian.flock.rest.MyRestResource;
import com.atlassian.flock.rest.MyRestResourceModel;
import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;

public class MyRestResourceFuncTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {

        String baseUrl = System.getProperty("baseurl");
        String resourceUrl = baseUrl + "/rest/myrestresource/1.0/flock";

        RestClient client = new RestClient();
        Resource resource = client.resource(resourceUrl);

        MyRestResourceModel message = resource.get(MyRestResourceModel.class);

        assertEquals("wrong message","Hello World",message.getMessage());
    }
}

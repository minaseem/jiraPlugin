package ut.com.atlassian.flock;

import org.junit.Test;
import com.atlassian.flock.api.MyPluginComponent;
import com.atlassian.flock.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}
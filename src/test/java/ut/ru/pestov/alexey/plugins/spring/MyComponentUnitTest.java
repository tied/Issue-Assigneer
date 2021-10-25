package ut.ru.pestov.alexey.plugins.spring;

import org.junit.Test;
import ru.pestov.alexey.plugins.spring.api.MyPluginComponent;
import ru.pestov.alexey.plugins.spring.impl.MyPluginComponentImpl;

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
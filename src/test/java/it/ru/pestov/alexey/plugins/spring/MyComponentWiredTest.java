package it.ru.pestov.alexey.plugins.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.atlassian.plugins.osgi.test.AtlassianPluginsTestRunner;
import ru.pestov.alexey.plugins.spring.api.MyPluginComponent;
//import com.atlassian.sal.api.ApplicationProperties;

import static org.junit.Assert.assertEquals;

@RunWith(AtlassianPluginsTestRunner.class)
public class MyComponentWiredTest
{
//    private final ApplicationProperties applicationProperties;
    private final MyPluginComponent myPluginComponent;

   public MyComponentWiredTest(MyPluginComponent myPluginComponent)
   {
//        this.applicationProperties = applicationProperties;
    this.myPluginComponent = myPluginComponent;
    }

    @Test
    public void testMyName()
    {
        assertEquals("names do not match!", "myComponent:", myPluginComponent.getName());
    }
}
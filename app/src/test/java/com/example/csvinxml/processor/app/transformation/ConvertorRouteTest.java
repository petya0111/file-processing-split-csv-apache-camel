package com.example.csvinxml.processor.app.transformation;

import com.example.csvinxml.processor.app.ConvertorRoute;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Petya Marinova
 */
public class ConvertorRouteTest {
    private ConvertorRoute convertorRoute;

    @Before
    public void setup(){
        convertorRoute = new ConvertorRoute();
    }
    @Test
    public void convert() throws Exception {
//      before run  copy  /TEST/.camel/input.csv /TEST/input.csv
        CamelContext context = new DefaultCamelContext();
        ConvertorRoute route = new ConvertorRoute();
        route.addRoutesToCamelContext(context);
        context.start();
        Thread.sleep(2000);
        context.stop();

    }
}

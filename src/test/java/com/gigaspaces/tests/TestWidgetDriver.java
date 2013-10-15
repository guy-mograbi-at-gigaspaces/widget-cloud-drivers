package com.gigaspaces.tests;

import com.gigaspaces.Machine;
import com.gigaspaces.WidgetDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: guym
 * Date: 10/15/13
 * Time: 4:20 PM
 */
@ContextConfiguration(locations={"classpath:/com/gigaspaces/tests/TestSoftlayerDriver-context.xml"})
public class TestWidgetDriver extends AbstractTestNGSpringContextTests {

    private static Logger logger = LoggerFactory.getLogger(TestWidgetDriver.class);

    @Autowired
    WidgetDriver driver;

    @Test
    public void testDriver(){
        logger.info("testing : " + driver);

//        List<Machine> machines = driver.listMachines();
//        Assert.assertEquals(machines.size(), 1);
    }

    public void setDriver(WidgetDriver driver) {
        this.driver = driver;
    }
}

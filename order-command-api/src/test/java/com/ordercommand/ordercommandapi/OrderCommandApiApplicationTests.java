package com.ordercommand.ordercommandapi;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@ActiveProfiles("test")
@SpringBootTest
@RunWith(SpringRunner.class)
public class OrderCommandApiApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void contextLoads() {
        assertNotNull(applicationContext);
    }

    @Test
    public void appRequiredConfigurationForSpringBoot() {
        assertTrue("Should be a SpringBootApplication",
                OrderCommandApiApplication.class.isAnnotationPresent(SpringBootApplication.class));
        assertTrue("Should enable Eureka Client",
                OrderCommandApiApplication.class.isAnnotationPresent(EnableEurekaClient.class));
    }

}

package com.own;

import burlap.client.FoodService;
import hessian.IHello;
import jmi_upload.client.FileUtilClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by bf50 on 2016/1/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mvc.xml")
public class RemoteInvokeTest {

    @Autowired
    private FileUtilClient fileUtilClient;

    @Resource(name="hessianServiceClient")
    private IHello iHello;

    @Resource(name="getFoodService")
    private FoodService foodService;

    @Test
    public void testRMI(){
        fileUtilClient.uploadFile();
    }

    @Test
    public void testHessian(){
        System.out.println(iHello.sayHello("YIN"));
    }

    @Test
    public void testBurlap(){
        System.out.println(foodService.getFoods());
    }
}

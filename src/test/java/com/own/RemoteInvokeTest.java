package com.own;

import jmi_upload.client.FileUtilClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by bf50 on 2016/1/7.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mvc.xml")
public class RemoteInvokeTest {

    @Autowired
    private FileUtilClient fileUtilClient;

    @Test
    public void testRMI(){
        fileUtilClient.uploadFile();
    }
}

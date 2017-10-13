package com.dubbox.consumer.service.impl;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.dubbox.consumer.service.TestService;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;


@Component("testService")
@Path("test")
@Produces({ContentType.APPLICATION_JSON_UTF_8})
public class TestServiceImpl implements TestService {
    @Override
    @GET
    @Path("say")
    public List sayHello() {
        List list = new ArrayList<>();
        list.add("I am a test service");
        return list;
    }
}
